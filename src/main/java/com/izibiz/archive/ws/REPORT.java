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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REPORT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REPORT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REPORT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REPORT_PERIOD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REPORT_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REPORT_SUB_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REPORT", propOrder = {
    "reportno",
    "reportperiod",
    "reportstatus",
    "reportsubstatus"
})
public class REPORT {

    @XmlElement(name = "REPORT_NO", required = true)
    protected String reportno;
    @XmlElement(name = "REPORT_PERIOD", required = true)
    protected String reportperiod;
    @XmlElement(name = "REPORT_STATUS", required = true)
    protected String reportstatus;
    @XmlElement(name = "REPORT_SUB_STATUS", required = true)
    protected String reportsubstatus;

    /**
     * Gets the value of the reportno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTNO() {
        return reportno;
    }

    /**
     * Sets the value of the reportno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTNO(String value) {
        this.reportno = value;
    }

    /**
     * Gets the value of the reportperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTPERIOD() {
        return reportperiod;
    }

    /**
     * Sets the value of the reportperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTPERIOD(String value) {
        this.reportperiod = value;
    }

    /**
     * Gets the value of the reportstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTSTATUS() {
        return reportstatus;
    }

    /**
     * Sets the value of the reportstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTSTATUS(String value) {
        this.reportstatus = value;
    }

    /**
     * Gets the value of the reportsubstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTSUBSTATUS() {
        return reportsubstatus;
    }

    /**
     * Sets the value of the reportsubstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTSUBSTATUS(String value) {
        this.reportsubstatus = value;
    }

}
