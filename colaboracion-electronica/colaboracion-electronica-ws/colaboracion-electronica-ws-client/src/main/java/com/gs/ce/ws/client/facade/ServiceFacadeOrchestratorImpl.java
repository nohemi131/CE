package com.gs.ce.ws.client.facade;

import org.springframework.stereotype.Repository;

import com.gs.ce.ws.client.facade.exampleServices.LoginServiceOrchestratorImpl;

@Repository
public class ServiceFacadeOrchestratorImpl {

	private LoginServiceOrchestratorImpl loginServiceOrchestratorImpl;
	

	public ServiceFacadeOrchestratorImpl(){
		loginServiceOrchestratorImpl= new LoginServiceOrchestratorImpl();
	
	}


	public LoginServiceOrchestratorImpl getLoginServiceOrchestratorImpl() {
		return loginServiceOrchestratorImpl;
	}

	

	
	
}
