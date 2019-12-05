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
 * Detailed Information about the status of a request
 * 			
 * 
 * <p>Java class for REQUEST_INFOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST_INFOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_HEADER" type="{http://schemas.i2i.com/ei/entity}REQUEST_HEADERType"/&gt;
 *         &lt;element name="REQUEST_RETURN" type="{http://schemas.i2i.com/ei/entity}REQUEST_RETURNType" minOccurs="0"/&gt;
 *         &lt;element name="REQUEST_ERROR" type="{http://schemas.i2i.com/ei/entity}REQUEST_ERRORType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUEST_INFOType", namespace = "http://schemas.i2i.com/ei/entity", propOrder = {
    "requestheader",
    "requestreturn",
    "requesterror"
})
public class REQUESTINFOType {

    @XmlElement(name = "REQUEST_HEADER", required = true)
    protected REQUESTHEADERType requestheader;
    @XmlElement(name = "REQUEST_RETURN")
    protected REQUESTRETURNType requestreturn;
    @XmlElement(name = "REQUEST_ERROR")
    protected REQUESTERRORType requesterror;

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
     * Gets the value of the requesterror property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTERRORType }
     *     
     */
    public REQUESTERRORType getREQUESTERROR() {
        return requesterror;
    }

    /**
     * Sets the value of the requesterror property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTERRORType }
     *     
     */
    public void setREQUESTERROR(REQUESTERRORType value) {
        this.requesterror = value;
    }

}
