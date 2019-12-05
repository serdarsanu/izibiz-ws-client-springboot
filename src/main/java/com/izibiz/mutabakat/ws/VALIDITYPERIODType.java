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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Helper Entity; Contains validity period info for
 * 				related entity
 * 			
 * 
 * <p>Java class for VALIDITY_PERIODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VALIDITY_PERIODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SDATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALIDITY_PERIODType", propOrder = {
    "sdate",
    "edate"
})
public class VALIDITYPERIODType {

    @XmlElement(name = "SDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdate;
    @XmlElement(name = "EDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar edate;

    /**
     * Gets the value of the sdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSDATE() {
        return sdate;
    }

    /**
     * Sets the value of the sdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSDATE(XMLGregorianCalendar value) {
        this.sdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDATE(XMLGregorianCalendar value) {
        this.edate = value;
    }

}