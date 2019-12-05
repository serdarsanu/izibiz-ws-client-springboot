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
 * Helper Entity; Contains information related to
 * 				either Creation or Modification
 * 			
 * 
 * <p>Java class for CHANGE_INFOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHANGE_INFOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CDATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CPOSITION_ID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CUSER_ID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="UPOSITION_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UUSER_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHANGE_INFOType", propOrder = {
    "cdate",
    "cpositionid",
    "cuserid",
    "udate",
    "upositionid",
    "uuserid"
})
public class CHANGEINFOType {

    @XmlElement(name = "CDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cdate;
    @XmlElement(name = "CPOSITION_ID")
    protected long cpositionid;
    @XmlElement(name = "CUSER_ID")
    protected long cuserid;
    @XmlElement(name = "UDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar udate;
    @XmlElement(name = "UPOSITION_ID")
    protected Long upositionid;
    @XmlElement(name = "UUSER_ID")
    protected Long uuserid;

    /**
     * Gets the value of the cdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCDATE() {
        return cdate;
    }

    /**
     * Sets the value of the cdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCDATE(XMLGregorianCalendar value) {
        this.cdate = value;
    }

    /**
     * Gets the value of the cpositionid property.
     * 
     */
    public long getCPOSITIONID() {
        return cpositionid;
    }

    /**
     * Sets the value of the cpositionid property.
     * 
     */
    public void setCPOSITIONID(long value) {
        this.cpositionid = value;
    }

    /**
     * Gets the value of the cuserid property.
     * 
     */
    public long getCUSERID() {
        return cuserid;
    }

    /**
     * Sets the value of the cuserid property.
     * 
     */
    public void setCUSERID(long value) {
        this.cuserid = value;
    }

    /**
     * Gets the value of the udate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUDATE() {
        return udate;
    }

    /**
     * Sets the value of the udate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUDATE(XMLGregorianCalendar value) {
        this.udate = value;
    }

    /**
     * Gets the value of the upositionid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUPOSITIONID() {
        return upositionid;
    }

    /**
     * Sets the value of the upositionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUPOSITIONID(Long value) {
        this.upositionid = value;
    }

    /**
     * Gets the value of the uuserid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUUSERID() {
        return uuserid;
    }

    /**
     * Sets the value of the uuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUUSERID(Long value) {
        this.uuserid = value;
    }

}
