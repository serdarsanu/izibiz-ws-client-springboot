//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:09 AM EET 
//


package com.izibiz.auth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_HEADER" type="{http://schemas.i2i.com/ei/entity}REQUEST_HEADERType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUEST", namespace = "http://schemas.i2i.com/ei/entity", propOrder = {
    "requestheader"
})
@XmlSeeAlso({
    LoginRequest.class,
    LogoutRequest.class,
    GetGibUserListRequest.class,
    GetUserAuthorizationRequest.class,
    CheckUserRequest.class
})
public class REQUEST {

    @XmlElement(name = "REQUEST_HEADER", required = true)
    protected REQUESTHEADERType requestheader;

    /**
     * Gets the value of the requestheader property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTHEADERType }
     *     
     */
    public REQUESTHEADERType getREQUESTHEADER() {
        return requestheader;
    }

    /**
     * Sets the value of the requestheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTHEADERType }
     *     
     */
    public void setREQUESTHEADER(REQUESTHEADERType value) {
        this.requestheader = value;
    }

}
