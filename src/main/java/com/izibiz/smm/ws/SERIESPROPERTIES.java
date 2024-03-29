//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.smm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERIES_PROPERTIES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERIES_PROPERTIES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERIES_FLAG" type="{http://schemas.i2i.com/ei/common}FLAG_VALUE" minOccurs="0"/&gt;
 *         &lt;element name="SERIES_PREFIX" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERIES_PROPERTIES", propOrder = {
    "seriesflag",
    "seriesprefix"
})
public class SERIESPROPERTIES {

    @XmlElement(name = "SERIES_FLAG")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE seriesflag;
    @XmlElement(name = "SERIES_PREFIX")
    protected List<String> seriesprefix;

    /**
     * Gets the value of the seriesflag property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getSERIESFLAG() {
        return seriesflag;
    }

    /**
     * Sets the value of the seriesflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setSERIESFLAG(FLAGVALUE value) {
        this.seriesflag = value;
    }

    /**
     * Gets the value of the seriesprefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesprefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERIESPREFIX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSERIESPREFIX() {
        if (seriesprefix == null) {
            seriesprefix = new ArrayList<String>();
        }
        return this.seriesprefix;
    }

}
