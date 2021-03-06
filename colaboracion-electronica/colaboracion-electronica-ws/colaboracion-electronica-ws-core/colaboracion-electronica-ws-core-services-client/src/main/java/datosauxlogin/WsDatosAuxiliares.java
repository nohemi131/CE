
package com.gs.ce.ws.core.services.client.datosauxlogin;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsDatosAuxiliares", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/ServiciosLogin5/wsdl/portal.socio.gs/wsDatosAuxLogin5/wsDatosAuxiliares.asmx.wsdl")
public class WsDatosAuxiliares
    extends Service
{

    private final static URL WSDATOSAUXILIARES_WSDL_LOCATION;
    private final static WebServiceException WSDATOSAUXILIARES_EXCEPTION;
    private final static QName WSDATOSAUXILIARES_QNAME = new QName("http://tempuri.org/", "wsDatosAuxiliares");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/ServiciosLogin5/wsdl/portal.socio.gs/wsDatosAuxLogin5/wsDatosAuxiliares.asmx.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSDATOSAUXILIARES_WSDL_LOCATION = url;
        WSDATOSAUXILIARES_EXCEPTION = e;
    }

    public WsDatosAuxiliares() {
        super(__getWsdlLocation(), WSDATOSAUXILIARES_QNAME);
    }

    public WsDatosAuxiliares(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSDATOSAUXILIARES_QNAME, features);
    }

    public WsDatosAuxiliares(URL wsdlLocation) {
        super(wsdlLocation, WSDATOSAUXILIARES_QNAME);
    }

    public WsDatosAuxiliares(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSDATOSAUXILIARES_QNAME, features);
    }

    public WsDatosAuxiliares(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsDatosAuxiliares(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsDatosAuxiliaresSoap
     */
    @WebEndpoint(name = "wsDatosAuxiliaresSoap")
    public WsDatosAuxiliaresSoap getWsDatosAuxiliaresSoap() {
        return super.getPort(new QName("http://tempuri.org/", "wsDatosAuxiliaresSoap"), WsDatosAuxiliaresSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsDatosAuxiliaresSoap
     */
    @WebEndpoint(name = "wsDatosAuxiliaresSoap")
    public WsDatosAuxiliaresSoap getWsDatosAuxiliaresSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "wsDatosAuxiliaresSoap"), WsDatosAuxiliaresSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSDATOSAUXILIARES_EXCEPTION!= null) {
            throw WSDATOSAUXILIARES_EXCEPTION;
        }
        return WSDATOSAUXILIARES_WSDL_LOCATION;
    }

}
