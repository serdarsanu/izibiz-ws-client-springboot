//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:11 AM EET 
//


package com.izibiz.creditnote.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCreditNoteReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCreditNoteReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREDITNOTE_REPORT" type="{http://schemas.i2i.com/ei/wsdl}REPORT" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "GetCreditNoteReportResponse", propOrder = {
    "creditnotereport",
    "errortype"
})
public class GetCreditNoteReportResponse {

    @XmlElement(name = "CREDITNOTE_REPORT", required = true)
    protected List<REPORT> creditnotereport;
    @XmlElement(name = "ERROR_TYPE")
    protected REQUESTERRORType errortype;

    /**
     * Gets the value of the creditnotereport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditnotereport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCREDITNOTEREPORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REPORT }
     * 
     * 
     */
    public List<REPORT> getCREDITNOTEREPORT() {
        if (creditnotereport == null) {
            creditnotereport = new ArrayList<REPORT>();
        }
        return this.creditnotereport;
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
