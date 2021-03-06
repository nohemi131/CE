
package com.gs.ce.ws.core.services.client.validasession;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Valida_sesionSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidaSesionSoap {


    /**
     * 
     * @param wcadenaoriginal
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecibePeticion", action = "http://tempuri.org/RecibePeticion")
    @WebResult(name = "RecibePeticionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RecibePeticion", targetNamespace = "http://tempuri.org/", className = "com.gs.ce.ws.core.services.client.validasession.RecibePeticion")
    @ResponseWrapper(localName = "RecibePeticionResponse", targetNamespace = "http://tempuri.org/", className = "com.gs.ce.ws.core.services.client.validasession.RecibePeticionResponse")
    public String recibePeticion(
        @WebParam(name = "wcadenaoriginal", targetNamespace = "http://tempuri.org/")
        String wcadenaoriginal);

}
