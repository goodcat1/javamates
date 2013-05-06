package edu.javamates;

import javax.ejb.Local;

@Local
public interface MyService {
	public String message();
}
