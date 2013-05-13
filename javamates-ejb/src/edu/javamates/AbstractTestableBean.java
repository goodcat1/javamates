package edu.javamates;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.javamates.dao.TestableBeanLocal;

/**
 * Parent class for testing EJBs with transaction rollback
 * 
 * @author shitov
 * 
 */
public class AbstractTestableBean implements TestableBeanLocal {

	@PersistenceContext(unitName = "javamates-model")
	protected EntityManager entityManager;

	@Resource
	private SessionContext sessionContext;

	@Override
	public void rollbackOnly() {
		sessionContext.setRollbackOnly();
	}

}
