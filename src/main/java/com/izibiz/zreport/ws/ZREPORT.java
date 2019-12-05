//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.zreport.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZREPORT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZREPORT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SUBE_KODU" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *         &lt;element name="OKC_SICIL_NO" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *         &lt;element name="EKU_NO" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *         &lt;element name="ZRAPOR_NO" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *         &lt;element name="ZRAPOR_TARIH" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SATIS_TUTAR" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="VERGI" type="{http://schemas.i2i.com/ei/wsdl}VERGI_TUTAR_TYPE" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZREPORT", propOrder = {
    "subekodu",
    "okcsicilno",
    "ekuno",
    "zraporno",
    "zraportarih",
    "satistutar",
    "vergi"
})
@XmlSeeAlso({
    ZREPORTSTATUS.class
})
public class ZREPORT {

    @XmlElement(name = "SUBE_KODU", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subekodu;
    @XmlElement(name = "OKC_SICIL_NO", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String okcsicilno;
    @XmlElement(name = "EKU_NO", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ekuno;
    @XmlElement(name = "ZRAPOR_NO", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String zraporno;
    @XmlElement(name = "ZRAPOR_TARIH", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zraportarih;
    @XmlElement(name = "SATIS_TUTAR", required = true)
    protected BigDecimal satistutar;
    @XmlElement(name = "VERGI", required = true)
    protected List<VERGITUTARTYPE> vergi;

    /**
     * Gets the value of the subekodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBEKODU() {
        return subekodu;
    }

    /**
     * Sets the value of the subekodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBEKODU(String value) {
        this.subekodu = value;
    }

    /**
     * Gets the value of the okcsicilno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKCSICILNO() {
        return okcsicilno;
    }

    /**
     * Sets the value of the okcsicilno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKCSICILNO(String value) {
        this.okcsicilno = value;
    }

    /**
     * Gets the value of the ekuno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKUNO() {
        return ekuno;
    }

    /**
     * Sets the value of the ekuno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKUNO(String value) {
        this.ekuno = value;
    }

    /**
     * Gets the value of the zraporno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZRAPORNO() {
        return zraporno;
    }

    /**
     * Sets the value of the zraporno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZRAPORNO(String value) {
        this.zraporno = value;
    }

    /**
     * Gets the value of the zraportarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZRAPORTARIH() {
        return zraportarih;
    }

    /**
     * Sets the value of the zraportarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZRAPORTARIH(XMLGregorianCalendar value) {
        this.zraportarih = value;
    }

    /**
     * Gets the value of the satistutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSATISTUTAR() {
        return satistutar;
    }

    /**
     * Sets the value of the satistutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSATISTUTAR(BigDecimal value) {
        this.satistutar = value;
    }

    /**
     * Gets the value of the vergi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vergi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVERGI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VERGITUTARTYPE }
     * 
     * 
     */
    public List<VERGITUTARTYPE> getVERGI() {
        if (vergi == null) {
            vergi = new ArrayList<VERGITUTARTYPE>();
        }
        return this.vergi;
    }

}