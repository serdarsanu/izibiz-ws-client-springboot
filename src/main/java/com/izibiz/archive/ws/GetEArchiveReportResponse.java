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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEArchiveReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEArchiveReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REPORT" type="{http://schemas.i2i.com/ei/wsdl/archive}REPORT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INVOICE" type="{http://schemas.i2i.com/ei/wsdl/archive}REPORT_INVOICE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REQUEST_RETURN" type="{http://schemas.i2i.com/ei/entity}REQUEST_RETURNType" minOccurs="0"/&gt;
 *         &lt;element name="ERROR_TYPE" type="{http://schemas.i2i.com/ei/entity}REQUEST_ERRORType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEArchiveReportResponse", propOrder = {
    "report",
    "invoice",
    "requestreturn",
    "errortype"
})
public class GetEArchiveReportResponse {

    @XmlElement(name = "REPORT")
    protected List<REPORT> report;
    @XmlElement(name = "INVOICE")
    protected List<REPORTINVOICE> invoice;
    @XmlElement(name = "REQUEST_RETURN")
    protected REQUESTRETURNType requestreturn;
    @XmlElement(name = "ERROR_TYPE")
    protected REQUESTERRORType errortype;

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREPORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORT }
     * 
     * 
     */
    public List<REPORT> getREPORT() {
        if (report == null) {
            report = new ArrayList<REPORT>();
        }
        return this.report;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVOICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORTINVOICE }
     * 
     * 
     */
    public List<REPORTINVOICE> getINVOICE() {
        if (invoice == null) {
            invoice = new ArrayList<REPORTINVOICE>();
        }
        return this.invoice;
    }

    /**
     * Gets the value of the requestreturn property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTRETURNType }
     *     
     */
    public REQUESTRETURNType getREQUESTRETURN() {
        return requestreturn;
    }

    /**
     * Sets the value of the requestreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTRETURNType }
     *     
     */
    public void setREQUESTRETURN(REQUESTRETURNType value) {
        this.requestreturn = value;
    }

    /**
     * Gets the value of the errortype property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTERRORType }
     *     
     */
    public REQUESTERRORType getERRORTYPE() {
        return errortype;
    }

    /**
     * Sets the value of the errortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTERRORType }
     *     
     */
    public void setERRORTYPE(REQUESTERRORType value) {
        this.errortype = value;
    }

}
