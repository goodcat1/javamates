package edu.javamates;

import java.util.Properties;

import javax.ejb.embeddable.EJBContainer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.javamates.dao.ClaimDaoBeanTest;

/**
 * JUnit Suite for running EJB tests
 * 
 * @author shitov
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(ClaimDaoBeanTest.class)
public class MainSuite {
	private static final Logger log = LoggerFactory.getLogger(MainSuite.class);

	private static EJBContainer ejbContainer;

	@BeforeClass
	public static void setUp() {
		log.info("MainSuite setup");
		initContainer();
	}

	@AfterClass
	public static void tearDown() {
		log.info("MainSuit tearDown");
		destroyContainer();
	}

	public static void initContainer() {
		if (ejbContainer != null) {
			return;
		}
		Properties properties = new Properties();

		properties.put("jdbc/jm/Javamates", "new://Resource?type=DataSource");
		properties.put("jdbc/jm/Javamates.JdbcDriver",
				"org.apache.derby.jdbc.EmbeddedDriver");
		properties.put("jdbc/jm/Javamates.JdbcUrl",
				"jdbc:derby:memory:javamates-junit;create=true");
		properties.put("jdbc/jm/Javamates.JtaManaged", "true");

		properties.put("ra/jm/JavamatesJmsResourceAdapter",
				"new://Resource?type=ActiveMQResourceAdapter");
		properties.put("ra/jm/JavamatesJmsResourceAdapter.BrokerXmlConfig",
				"broker:(tcp://localhost:61616)?useJmx=false");
		properties.put("ra/jm/JavamatesJmsResourceAdapter.dataSource",
				"Default Unmanaged JDBC Database");
		properties.put("ra/jm/JavamatesJmsResourceAdapter.ServerUrl",
				"vm://localhost?waitForStart=20000");
		properties.put("ra/jm/JavamatesJmsResourceAdapter.startupTimeout",
				"10 seconds");

		properties.put("cf/jm/JavamatesJmsConnectionFactory",
				"new://Resource?type=javax.jms.ConnectionFactory");
		properties.put("cf/jm/JavamatesJmsConnectionFactory.ResourceAdapter",
				"ra/jm/JavamatesJmsResourceAdapter");

		properties.put("JavamatesJmsMdbContainer",
				"new://Container?type=MESSAGE");
		properties.put("JavamatesJmsMdbContainer.ResourceAdapter",
				"ra/jm/JavamatesJmsResourceAdapter");

		properties.put("JavamatesStatelessContainer",
				"new://Container?type=STATELESS");

		// These two debug levels will get you the basic log information
		// on the deployment of applications. Good first step in
		// troubleshooting.
		properties.put("log4j.category.OpenEJB.startup", "debug");
		properties.put("log4j.category.OpenEJB.startuproperties.config",
				"debug");

		// This log category is a good way to see what "openejb.foo" options
		// and flags are available and what their default values are
		properties.put("log4j.category.OpenEJB.options", "debug");

		// This will output the full configuration of all containers
		// resources and other openejb.xml configurable items. A good
		// way to see what the final configuration looks like after all
		// overriding has been applied.
		properties.put("log4j.category.OpenEJB.startuproperties.service",
				"debug");

		// Will output a generated ejb-jar.xml file that represents
		// 100% of the annotations used in the code. This is a great
		// way to figure out how to do something in xml for overriding
		// or just to "see" all your application meta-data in one place.
		// Look for log lines like this "Dumping Generated ejb-jar.xml to"
		properties.put("openejb.descriptors.output", "true");

		// Setting the validation output level to verbose results in
		// validation messages that attempt to provide explanations
		// and information on what steps can be taken to remedy failures.
		// A great tool for those learning EJB.
		properties.put("openejb.validation.output.level", "verbose");

		ejbContainer = EJBContainer.createEJBContainer(properties);

	}

	public static void destroyContainer() {
		if (ejbContainer != null) {
			ejbContainer.close();
		}
	}

	public static EJBContainer getEJBContainer() {
		return ejbContainer;
	}
}
