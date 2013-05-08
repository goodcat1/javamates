package edu.javamates.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MessageDriven(name = "MailNotificationsListenerBean", messageListenerInterface = MessageListener.class, activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/jm/JavamatesNotificationsQueue") })
public class MailNotificationsListenerBean implements MessageListener {
	private static final Logger log = LoggerFactory
			.getLogger(MailNotificationsListenerBean.class);

	@Override
	public void onMessage(Message message) {
		log.info("-> Get notification");

		try {
			if (message instanceof ObjectMessage) {
				ObjectMessage objectMessage = (ObjectMessage) message;

				if (objectMessage.getObject() instanceof Notification) {
					Notification notification = (Notification) objectMessage
							.getObject();

					log.info("Get message: [{}]", notification.getMessage());
				} else {
					log.warn("Get unknown message: [{}]",
							String.valueOf(message));
				}
			}
		} catch (JMSException e) {
			log.error("", e);
		}
	}

}
