//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.mutabakat.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestFaultResponse" type="{http://schemas.i2i.com/ei/entity}REQUEST_ERRORType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestFaultType", namespace = "http://schemas.izibiz.com/ei/wsdl/reconciliation", propOrder = {
    "requestFaultResponse"
})
public class RequestFaultType {

    @XmlElement(name = "RequestFaultResponse", required = true)
    protected REQUESTERRORType requestFaultResponse;

    /**
     * Gets the value of the requestFaultResponse property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTERRORType }
     *     
     */
    public REQUESTERRORType getRequestFaultResponse() {
        return requestFaultResponse;
    }

    /**
     * Sets the value of the requestFaultResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTERRORType }
     *     
     */
    public void setRequestFaultResponse(REQUESTERRORType value) {
        this.requestFaultResponse = value;
    }

}
