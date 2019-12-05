//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.smm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetSmmReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmmReportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.i2i.com/ei/entity}REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="HEADER_ONLY" type="{http://schemas.i2i.com/ei/common}FLAG_VALUE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmmReportRequest", propOrder = {
    "startdate",
    "enddate",
    "headeronly"
})
public class GetSmmReportRequest
    extends REQUEST
{

    @XmlElement(name = "START_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlElement(name = "END_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddate;
    @XmlElement(name = "HEADER_ONLY")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE headeronly;

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTDATE(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDDATE(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the headeronly property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getHEADERONLY() {
        return headeronly;
    }

    /**
     * Sets the value of the headeronly property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setHEADERONLY(FLAGVALUE value) {
        this.headeronly = value;
    }

}
