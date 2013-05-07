package edu.javamates.listener;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.javamates.dao.BootstrapBeanLocal;

public class DbBootStrapListener implements ServletContextListener {
	private static final Logger log = LoggerFactory
			.getLogger(DbBootStrapListener.class);

	@Inject
	BootstrapBeanLocal bootstrapBean;

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		log.info("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		log.info("-> contextInitialized");

		bootstrapBean.init();

		log.info("contextInitialized -> OK");
	}

}
