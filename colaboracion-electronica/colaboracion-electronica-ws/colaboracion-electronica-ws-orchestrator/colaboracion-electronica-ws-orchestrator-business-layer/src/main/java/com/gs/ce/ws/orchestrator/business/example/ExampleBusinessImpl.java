package com.gs.ce.ws.orchestrator.business.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gs.ce.ws.client.facade.ServiceFacadeCoreImpl;
import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;
import com.gs.ce.ws.core.entities.services.example.ResponseExampleTO;
import com.gs.ce.ws.orchestrator.business.interfaces.example.IExampleBusiness;

@Component
public class ExampleBusinessImpl implements IExampleBusiness{

	private static Logger log= Logger.getLogger(ExampleBusinessImpl.class.getName());
	
	@Autowired
	private ServiceFacadeCoreImpl ServiceFacadeCoreImpl;
	  	
	public ResponseExampleTO exampleBusinessMethod(RequestExampleTO requestExampleTO) throws Exception {
		log.info("ExampleBusinessImpl.exampleBusinessMethod()");
		ResponseExampleTO responseExample = ServiceFacadeCoreImpl.getLoginServiceImpl().serviceExample(requestExampleTO, "CGT");
		return responseExample;
	}
}
