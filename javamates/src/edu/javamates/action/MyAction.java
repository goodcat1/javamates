package edu.javamates.action;

import javax.inject.Inject;

import com.opensymphony.xwork2.ActionSupport;

import edu.javamates.MyService;

public class MyAction extends ActionSupport {
	private static final long serialVersionUID = 6543387980334362527L;

	private String name;

	@Inject
	private MyService service;

	@Override
	public String execute() throws Exception {

		name = service.message();

		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
