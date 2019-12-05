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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ENTITYBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENTITYBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EL_ACTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;pattern value="[CRUDScruds]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY_PERIOD" type="{http://schemas.i2i.com/ei/common}VALIDITY_PERIODType" minOccurs="0"/&gt;
 *         &lt;element name="CHANGE_INFO" type="{http://schemas.i2i.com/ei/common}CHANGE_INFOType" minOccurs="0"/&gt;
 *         &lt;element name="ACCESS_CONTROL_INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTITYBaseType", namespace = "http://schemas.i2i.com/ei/common", propOrder = {
    "elaction",
    "validityperiod",
    "changeinfo",
    "accesscontrolinfo"
})
@XmlSeeAlso({
    ENTITYType.class,
    FILEType.class,
    FILESETType.class,
    COMMENTType.class,
    COMMENTSETType.class
})
public class ENTITYBaseType {

    @XmlElement(name = "EL_ACTION")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elaction;
    @XmlElement(name = "VALIDITY_PERIOD")
    protected VALIDITYPERIODType validityperiod;
    @XmlElement(name = "CHANGE_INFO")
    protected CHANGEINFOType changeinfo;
    @XmlElement(name = "ACCESS_CONTROL_INFO")
    protected String accesscontrolinfo;

    /**
     * Gets the value of the elaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELACTION() {
        return elaction;
    }

    /**
     * Sets the value of the elaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELACTION(String value) {
        this.elaction = value;
    }

    /**
     * Gets the value of the validityperiod property.
     * 
     * @return
     *     possible object is
     *     {@link VALIDITYPERIODType }
     *     
     */
    public VALIDITYPERIODType getVALIDITYPERIOD() {
        return validityperiod;
    }

    /**
     * Sets the value of the validityperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VALIDITYPERIODType }
     *     
     */
    public void setVALIDITYPERIOD(VALIDITYPERIODType value) {
        this.validityperiod = value;
    }

    /**
     * Gets the value of the changeinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CHANGEINFOType }
     *     
     */
    public CHANGEINFOType getCHANGEINFO() {
        return changeinfo;
    }

    /**
     * Sets the value of the changeinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHANGEINFOType }
     *     
     */
    public void setCHANGEINFO(CHANGEINFOType value) {
        this.changeinfo = value;
    }

    /**
     * Gets the value of the accesscontrolinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSCONTROLINFO() {
        return accesscontrolinfo;
    }

    /**
     * Sets the value of the accesscontrolinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSCONTROLINFO(String value) {
        this.accesscontrolinfo = value;
    }

}
