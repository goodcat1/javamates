package edu.javamates.mdb;

import java.io.Serializable;

/**
 * MDB notification
 * 
 * @author Leonid Shitov 16.05.2013
 * 
 */
public class Notification implements Serializable {
	private static final long serialVersionUID = 6513825295153253772L;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
