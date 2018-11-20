package com.gs.ce.ws.client.facade;

import org.springframework.stereotype.Repository;

import com.gs.ce.ws.client.facade.exampleServices.LoginServiceImpl;

@Repository
public class ServiceFacadeCoreImpl {

	private LoginServiceImpl loginServiceImpl;
	
	

	public ServiceFacadeCoreImpl(){
		loginServiceImpl= new LoginServiceImpl();
	
	}

	public LoginServiceImpl getLoginServiceImpl() {
		return loginServiceImpl;
	}

	
	
}
