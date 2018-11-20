package com.gs.ce.ws.core.entities.services.example;

import javax.xml.bind.annotation.XmlRootElement;

import com.gs.ce.ws.core.entities.services.RequestTO;

@XmlRootElement
public class RequestExampleTO extends RequestTO {

	private String user;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "RequestExampleTO [user=" + user + ", pass=" + pass + ", toString()=" + super.toString() + "]";
	}

	
	
}
