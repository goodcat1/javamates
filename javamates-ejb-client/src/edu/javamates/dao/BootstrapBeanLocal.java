package edu.javamates.dao;

import javax.ejb.Local;

/**
 * Interface for EJB initializing database
 * 
 * @author Leonid Shitov 16.05.2013
 * 
 */
@Local
public interface BootstrapBeanLocal {
	/**
	 * Logic for initializing database
	 */
	void init();
}
