
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
 *         &lt;element name="wcadenaoriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "wcadenaoriginal"
})
@XmlRootElement(name = "recibepeticion")
public class Recibepeticion {

    protected String wcadenaoriginal;

    /**
     * Obtiene el valor de la propiedad wcadenaoriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWcadenaoriginal() {
        return wcadenaoriginal;
    }

    /**
     * Define el valor de la propiedad wcadenaoriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWcadenaoriginal(String value) {
        this.wcadenaoriginal = value;
    }

}
