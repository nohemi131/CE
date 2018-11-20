package com.gs.ce.ws.core.data.interfaces.example;

import com.gs.ce.ws.core.entities.data.example.Example;
import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;

public interface ISpExampleDAO {

	public Example invokeSpExample(RequestExampleTO requestExampleTO) throws Exception;
}
