package edu.javamates;

import javax.ejb.Stateless;

@Stateless
public class MyServiceImpl implements MyService {

	@Override
	public String message() {
		return "Hello from My Service";
	}

}
