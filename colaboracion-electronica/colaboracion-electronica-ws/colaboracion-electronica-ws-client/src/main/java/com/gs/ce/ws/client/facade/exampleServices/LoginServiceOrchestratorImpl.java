package com.gs.ce.ws.client.facade.exampleServices;



import com.gs.ce.ws.client.invoke.ClientOrchestrator;
import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;
import com.gs.ce.ws.core.entities.services.example.ResponseExampleTO;


public class LoginServiceOrchestratorImpl extends ClientOrchestrator {

	
	public ResponseExampleTO serviceExample(RequestExampleTO requestExampleTO,String applicantName)throws Exception{
		return (ResponseExampleTO)response(requestExampleTO, getProperties().getProperty("example1"),ResponseExampleTO.class,applicantName);
	}
	
}
