package edu.javamates.dao;

import javax.ejb.Local;

@Local
public interface BootstrapBeanLocal {
	void init();
}
