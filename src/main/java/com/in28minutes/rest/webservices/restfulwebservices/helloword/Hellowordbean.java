package com.in28minutes.rest.webservices.restfulwebservices.helloword;

public class Hellowordbean {

	private String msg;

	public Hellowordbean(String msg) {
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Hellowordbean [msg=" + msg + "]";
	}
	

}
