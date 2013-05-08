package edu.javamates.mdb;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class MailNotificationsSenderBean implements
		MailNotificationsSenderLocal {
	private static final Logger log = LoggerFactory
			.getLogger(MailNotificationsSenderBean.class);

	@Resource(name = "cf/jm/JavamatesJmsResourceAdapter")
	private QueueConnectionFactory connectionFactory;

	@Resource(name = "queue/jm/JavamatesNotificationsQueue")
	private Queue notificationsQueue;

	@Override
	public void sendMessage(Notification notification) {
		send(notification);
	}

	private void send(Serializable message) {
		QueueConnection connection = null;
		QueueSession session = null;
		QueueSender sender = null;

		try {
			connection = connectionFactory.createQueueConnection();

			connection.start();

			session = connection.createQueueSession(true,
					Session.AUTO_ACKNOWLEDGE);

			sender = session.createSender(notificationsQueue);

			sender.setDeliveryMode(DeliveryMode.PERSISTENT);

			ObjectMessage objectMessage = session.createObjectMessage(message);

			sender.send(objectMessage);
		} catch (JMSException e) {
			log.error("Error sending JMS message", e);
		} finally {
			try {
				if (sender != null) {
					sender.close();
				}
			} catch (JMSException e) {
				log.error("Error closing JMS sender", e);
			}
			try {
				if (session != null) {
					session.close();
				}
			} catch (JMSException e) {
				log.error("Error closing JMS session", e);
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (JMSException e) {
				log.error("Error closing JMS connection", e);
			}
		}
	}

}
