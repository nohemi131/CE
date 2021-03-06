
package com.gs.ce.ws.core.services.client.token;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recibepeticionResult" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recibepeticionResult"
})
@XmlRootElement(name = "recibepeticionResponse")
public class RecibepeticionResponse {

    protected ArrayOfString recibepeticionResult;

    /**
     * Obtiene el valor de la propiedad recibepeticionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRecibepeticionResult() {
        return recibepeticionResult;
    }

    /**
     * Define el valor de la propiedad recibepeticionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRecibepeticionResult(ArrayOfString value) {
        this.recibepeticionResult = value;
    }

}
