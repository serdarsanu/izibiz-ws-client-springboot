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
 * Helper Entity; Holds LOV Value Type
 * 			
 * 
 * <p>Java class for LOV_VALUEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_VALUEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOV_ID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LOV_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_VALUEType", namespace = "http://schemas.i2i.com/ei/common", propOrder = {
    "lovid",
    "lovcode"
})
@XmlSeeAlso({
    ISOCURRENCYCODEType.class
})
public class LOVVALUEType {

    @XmlElement(name = "LOV_ID")
    protected long lovid;
    @XmlElement(name = "LOV_CODE", defaultValue = "'N'")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lovcode;

    /**
     * Gets the value of the lovid property.
     * 
     */
    public long getLOVID() {
        return lovid;
    }

    /**
     * Sets the value of the lovid property.
     * 
     */
    public void setLOVID(long value) {
        this.lovid = value;
    }

    /**
     * Gets the value of the lovcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVCODE() {
        return lovcode;
    }

    /**
     * Sets the value of the lovcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVCODE(String value) {
        this.lovcode = value;
    }

}
