
package com.gs.ce.ws.core.services.client.datosauxlogin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DatosAuxiliaresNombresResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "datosAuxiliaresNombresResult"
})
@XmlRootElement(name = "DatosAuxiliaresNombresResponse")
public class DatosAuxiliaresNombresResponse {

    @XmlElement(name = "DatosAuxiliaresNombresResult")
    protected String datosAuxiliaresNombresResult;

    /**
     * Obtiene el valor de la propiedad datosAuxiliaresNombresResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosAuxiliaresNombresResult() {
        return datosAuxiliaresNombresResult;
    }

    /**
     * Define el valor de la propiedad datosAuxiliaresNombresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosAuxiliaresNombresResult(String value) {
        this.datosAuxiliaresNombresResult = value;
    }

}
