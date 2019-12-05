//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:10 AM EET 
//


package com.izibiz.archive.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baslik" type="{http://earsiv.efatura.gov.tr}baslikType"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="fatura" type="{http://earsiv.efatura.gov.tr}faturaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="faturaIptal" type="{http://earsiv.efatura.gov.tr}faturaIptalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baslik",
    "faturaOrFaturaIptal"
})
@XmlRootElement(name = "eArsivRaporu", namespace = "http://earsiv.efatura.gov.tr")
public class EArsivRaporu {

    @XmlElement(namespace = "http://earsiv.efatura.gov.tr", required = true)
    protected BaslikType baslik;
    @XmlElements({
        @XmlElement(name = "fatura", namespace = "http://earsiv.efatura.gov.tr", type = FaturaType.class),
        @XmlElement(name = "faturaIptal", namespace = "http://earsiv.efatura.gov.tr", type = FaturaIptalType.class)
    })
    protected List<Object> faturaOrFaturaIptal;

    /**
     * Gets the value of the baslik property.
     * 
     * @return
     *     possible object is
     *     {@link BaslikType }
     *     
     */
    public BaslikType getBaslik() {
        return baslik;
    }

    /**
     * Sets the value of the baslik property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaslikType }
     *     
     */
    public void setBaslik(BaslikType value) {
        this.baslik = value;
    }

    /**
     * Gets the value of the faturaOrFaturaIptal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faturaOrFaturaIptal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaturaOrFaturaIptal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaturaType }
     * {@link FaturaIptalType }
     * 
     * 
     */
    public List<Object> getFaturaOrFaturaIptal() {
        if (faturaOrFaturaIptal == null) {
            faturaOrFaturaIptal = new ArrayList<Object>();
        }
        return this.faturaOrFaturaIptal;
    }

}