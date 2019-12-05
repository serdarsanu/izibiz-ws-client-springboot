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
 * <p>Java class for ArchiveInvoiceWriteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveInvoiceWriteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_HEADER" type="{http://schemas.i2i.com/ei/entity}REQUEST_HEADERType"/&gt;
 *         &lt;element name="ArchiveInvoiceWriteContent" type="{http://schemas.i2i.com/ei/wsdl/archive}ArchiveInvoiceWriteContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveInvoiceWriteRequest", propOrder = {
    "requestheader",
    "archiveInvoiceWriteContent"
})
public class ArchiveInvoiceWriteRequest {

    @XmlElement(name = "REQUEST_HEADER", required = true)
    protected REQUESTHEADERType requestheader;
    @XmlElement(name = "ArchiveInvoiceWriteContent", required = true)
    protected ArchiveInvoiceWriteContent archiveInvoiceWriteContent;

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
     * Gets the value of the archiveInvoiceWriteContent property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveInvoiceWriteContent }
     *     
     */
    public ArchiveInvoiceWriteContent getArchiveInvoiceWriteContent() {
        return archiveInvoiceWriteContent;
    }

    /**
     * Sets the value of the archiveInvoiceWriteContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveInvoiceWriteContent }
     *     
     */
    public void setArchiveInvoiceWriteContent(ArchiveInvoiceWriteContent value) {
        this.archiveInvoiceWriteContent = value;
    }

}