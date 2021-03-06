package com.gs.ce.ws.orchestrator.presentation.layer.services.example;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.ce.commons.utilities.time.TimeUtil;
import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;
import com.gs.ce.ws.core.entities.services.example.ResponseExampleTO;
import com.gs.ce.ws.orchestrator.business.interfaces.example.IExampleBusiness;


@Service
@Path(value="/exampleService")
public class ExampleOrchestratorService {

	private static Logger log= Logger.getLogger(ExampleOrchestratorService.class.getName());
	
	@Autowired
	private IExampleBusiness exampleBusinessImpl;
	
	@Path(value="/example1")
	@POST
	@Consumes(value= {MediaType.APPLICATION_JSON})
	@Produces(value= {MediaType.APPLICATION_JSON})
	public ResponseExampleTO autentifica(@Context HttpServletRequest httpRequest,RequestExampleTO requestExampleTO) {
		
		log.info("Request  Example Services: "+requestExampleTO.toString());
		double startTime = System.nanoTime();
		ResponseExampleTO responseExampleTO= new ResponseExampleTO(); 	 
    	 
    	try{    		
    		responseExampleTO=exampleBusinessImpl.exampleBusinessMethod(requestExampleTO);
    	}catch(Exception e){    	
    		
    		responseExampleTO.setMessage(new ArrayList<String>());
    		responseExampleTO.getMessage().add("ERROR Business Example");
    		responseExampleTO.setCode(-1);
    	}     	
    	log.info("Response Example Services:"+responseExampleTO.toString());
    	double elapsedTime = TimeUtil.getElapsedTime(startTime);
    	log.info("Service Execute:{ " +elapsedTime+ " ms");
    	return responseExampleTO;
	}
}
