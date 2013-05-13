package edu.javamates.dao;

/**
 * Parent interface for testable EJBs
 * 
 * @author shitov
 * 
 */
public interface TestableBeanLocal {
	/**
	 * Transaction rollback in tests
	 */
	void rollbackOnly();
}
