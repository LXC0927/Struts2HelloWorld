package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	public String add(){
		return "add";
		
	}
	public String update(){
		return "update";
		
	}
	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐAction");
		return SUCCESS;
	}

	private static final long serialVersionUID = 1L;

}
