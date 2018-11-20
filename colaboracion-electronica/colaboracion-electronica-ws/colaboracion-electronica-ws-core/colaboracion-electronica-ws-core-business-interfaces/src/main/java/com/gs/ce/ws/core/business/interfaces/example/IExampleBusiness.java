package com.gs.ce.ws.core.business.interfaces.example;

import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;
import com.gs.ce.ws.core.entities.services.example.ResponseExampleTO;

public interface IExampleBusiness {

	public ResponseExampleTO exampleBusinessMethod(RequestExampleTO requestExampleTO) throws Exception;
}
