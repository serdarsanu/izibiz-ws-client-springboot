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
 * <p>Java class for ArchiveGetInvoiceInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveGetInvoiceInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAGE_SIZE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PAGE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_INVOICE_COUNT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="INVOICE" type="{http://schemas.i2i.com/ei/wsdl/archive}INVOICE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ArchiveGetInvoiceInfoResponse", propOrder = {
    "pagesize",
    "pagenumber",
    "totalinvoicecount",
    "invoice",
    "requestreturn",
    "errortype"
})
public class ArchiveGetInvoiceInfoResponse {

    @XmlElement(name = "PAGE_SIZE")
    protected Integer pagesize;
    @XmlElement(name = "PAGE_NUMBER")
    protected Integer pagenumber;
    @XmlElement(name = "TOTAL_INVOICE_COUNT")
    protected Integer totalinvoicecount;
    @XmlElement(name = "INVOICE")
    protected List<INVOICE> invoice;
    @XmlElement(name = "REQUEST_RETURN")
    protected REQUESTRETURNType requestreturn;
    @XmlElement(name = "ERROR_TYPE")
    protected REQUESTERRORType errortype;

    /**
     * Gets the value of the pagesize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAGESIZE() {
        return pagesize;
    }

    /**
     * Sets the value of the pagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAGESIZE(Integer value) {
        this.pagesize = value;
    }

    /**
     * Gets the value of the pagenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAGENUMBER() {
        return pagenumber;
    }

    /**
     * Sets the value of the pagenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAGENUMBER(Integer value) {
        this.pagenumber = value;
    }

    /**
     * Gets the value of the totalinvoicecount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTALINVOICECOUNT() {
        return totalinvoicecount;
    }

    /**
     * Sets the value of the totalinvoicecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTALINVOICECOUNT(Integer value) {
        this.totalinvoicecount = value;
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
     * {@link INVOICE }
     * 
     * 
     */
    public List<INVOICE> getINVOICE() {
        if (invoice == null) {
            invoice = new ArrayList<INVOICE>();
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
