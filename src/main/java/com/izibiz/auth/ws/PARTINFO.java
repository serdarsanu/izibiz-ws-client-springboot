//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:09 AM EET 
//


package com.izibiz.auth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PARTINFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARTINFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="VKN" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARTINFO", namespace = "http://schemas.i2i.com/ei/common")
public class PARTINFO {

    @XmlAttribute(name = "VKN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vkn;
    @XmlAttribute(name = "IDENTIFIER")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifier;

    /**
     * Gets the value of the vkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKN() {
        return vkn;
    }

    /**
     * Sets the value of the vkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKN(String value) {
        this.vkn = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
    }

}
