package edu.javamates.mdb;

import javax.ejb.Local;

@Local
public interface MailNotificationsSenderLocal {
	public void sendMessage(Notification notification);
}
