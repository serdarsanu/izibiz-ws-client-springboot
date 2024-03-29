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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadSmmRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadSmmRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.i2i.com/ei/entity}REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SMM" type="{http://schemas.i2i.com/ei/wsdl}SMM" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SMM_PROPERTIES" type="{http://schemas.i2i.com/ei/wsdl}SMM_PROPERTIES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadSmmRequest", propOrder = {
    "smm",
    "smmproperties"
})
public class LoadSmmRequest
    extends REQUEST
{

    @XmlElement(name = "SMM", required = true)
    protected List<SMM> smm;
    @XmlElement(name = "SMM_PROPERTIES")
    protected SMMPROPERTIES smmproperties;

    /**
     * Gets the value of the smm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMM }
     * 
     * 
     */
    public List<SMM> getSMM() {
        if (smm == null) {
            smm = new ArrayList<SMM>();
        }
        return this.smm;
    }

    /**
     * Gets the value of the smmproperties property.
     * 
     * @return
     *     possible object is
     *     {@link SMMPROPERTIES }
     *     
     */
    public SMMPROPERTIES getSMMPROPERTIES() {
        return smmproperties;
    }

    /**
     * Sets the value of the smmproperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMMPROPERTIES }
     *     
     */
    public void setSMMPROPERTIES(SMMPROPERTIES value) {
        this.smmproperties = value;
    }

}
