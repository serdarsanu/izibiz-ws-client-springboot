//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:10 AM EET 
//


package com.izibiz.archive.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EArchiveInvoiceCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EArchiveInvoiceCountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PORTAL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "EArchiveInvoiceCountResponse", propOrder = {
    "portal",
    "ws",
    "errortype"
})
public class EArchiveInvoiceCountResponse {

    @XmlElement(name = "PORTAL")
    protected Integer portal;
    @XmlElement(name = "WS")
    protected Integer ws;
    @XmlElement(name = "ERROR_TYPE")
    protected REQUESTERRORType errortype;

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPORTAL() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPORTAL(Integer value) {
        this.portal = value;
    }

    /**
     * Gets the value of the ws property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWS() {
        return ws;
    }

    /**
     * Sets the value of the ws property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWS(Integer value) {
        this.ws = value;
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
