//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.23 at 04:50:33 PM EEST 
//


package com.izibiz.auth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogoutResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogoutResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_RETURN" type="{http://schemas.i2i.com/ei/entity}REQUEST_RETURNType" minOccurs="0"/&gt;
 *         &lt;element name="ERROR_TYPE" type="{http://schemas.i2i.com/ei/entity}REQUEST_ERRORType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoutResponse", propOrder = {
    "requestreturn",
    "errortype"
})
public class LogoutResponse {

    @XmlElement(name = "REQUEST_RETURN")
    protected REQUESTRETURNType requestreturn;
    @XmlElement(name = "ERROR_TYPE")
    protected REQUESTERRORType errortype;

    /**
     * Gets the value of the requestreturn property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTRETURNType }
     *     
     */
    public REQUESTRETURNType getREQUESTRETURN() {
        return requestreturn;
    }

    /**
     * Sets the value of the requestreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTRETURNType }
     *     
     */
    public void setREQUESTRETURN(REQUESTRETURNType value) {
        this.requestreturn = value;
    }

    /**
     * Gets the value of the errortype property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTERRORType }
     *     
     */
    public REQUESTERRORType getERRORTYPE() {
        return errortype;
    }

    /**
     * Sets the value of the errortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTERRORType }
     *     
     */
    public void setERRORTYPE(REQUESTERRORType value) {
        this.errortype = value;
    }

}
