package edu.javamates;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.naming.NamingException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

import edu.javamates.dao.TestableBeanLocal;

/**
 * Parent class for EJB tests
 * 
 * @author shitov
 * 
 */
public abstract class AbstractBeanTest<T extends Serializable> {
	private static final Logger log = LoggerFactory
			.getLogger(AbstractBeanTest.class);

	@Resource
	protected UserTransaction userTransaction;

	public AbstractBeanTest() {
		try {
			MainSuite.getEJBContainer().getContext().bind("inject", this);
		} catch (NamingException e) {
			log.error(e.getMessage(), e);
		}
	}

	@BeforeClass
	public static void setUp() throws NamingException {
		MainSuite.initContainer();
	}

	@AfterClass
	public static void tearDown() {
		MainSuite.destroyContainer();
	}

	@Before
	public void beforeTestMethod() throws SystemException,
			NotSupportedException {
		userTransaction.begin();
	}

	@After
	public void afterTestMethod() throws Exception {
		TestableBeanLocal beanLocal = createBeanForTest();

		if (beanLocal == null) {
			log.warn("Standard testable EJB is not initialized");

			return;
		}

		beanLocal.rollbackOnly();

		try {
			userTransaction.commit();
			fail();
		} catch (HeuristicMixedException e) {
			log.error(e.getMessage(), e);

			throw e;
		} catch (HeuristicRollbackException e) {
			log.error(e.getMessage(), e);

			throw e;
		} catch (RollbackException e) {
			log.info("Test transaction rolled back");
		} catch (SystemException e) {
			log.error(e.getMessage(), e);

			throw e;
		}
	}

	public abstract TestableBeanLocal createBeanForTest();
}
