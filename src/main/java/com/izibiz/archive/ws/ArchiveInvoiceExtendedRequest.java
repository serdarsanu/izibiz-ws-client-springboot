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
 * <p>Java class for ArchiveInvoiceExtendedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveInvoiceExtendedRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_HEADER" type="{http://schemas.i2i.com/ei/entity}REQUEST_HEADERType"/&gt;
 *         &lt;element name="ArchiveInvoiceExtendedContent" type="{http://schemas.i2i.com/ei/wsdl/archive}ArchiveInvoiceExtendedContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveInvoiceExtendedRequest", propOrder = {
    "requestheader",
    "archiveInvoiceExtendedContent"
})
public class ArchiveInvoiceExtendedRequest {

    @XmlElement(name = "REQUEST_HEADER", required = true)
    protected REQUESTHEADERType requestheader;
    @XmlElement(name = "ArchiveInvoiceExtendedContent", required = true)
    protected ArchiveInvoiceExtendedContent archiveInvoiceExtendedContent;

    /**
     * Gets the value of the requestheader property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTHEADERType }
     *     
     */
    public REQUESTHEADERType getREQUESTHEADER() {
        return requestheader;
    }

    /**
     * Sets the value of the requestheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTHEADERType }
     *     
     */
    public void setREQUESTHEADER(REQUESTHEADERType value) {
        this.requestheader = value;
    }

    /**
     * Gets the value of the archiveInvoiceExtendedContent property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveInvoiceExtendedContent }
     *     
     */
    public ArchiveInvoiceExtendedContent getArchiveInvoiceExtendedContent() {
        return archiveInvoiceExtendedContent;
    }

    /**
     * Sets the value of the archiveInvoiceExtendedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveInvoiceExtendedContent }
     *     
     */
    public void setArchiveInvoiceExtendedContent(ArchiveInvoiceExtendedContent value) {
        this.archiveInvoiceExtendedContent = value;
    }

}