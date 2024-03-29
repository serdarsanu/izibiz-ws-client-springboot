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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiveInvoiceExtendedContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveInvoiceExtendedContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INVOICE_PROPERTIES" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EARSIV_FLAG" type="{http://schemas.i2i.com/ei/wsdl/archive}FLAG_VALUE"/&gt;
 *                   &lt;element name="EARSIV_PROPERTIES" type="{http://schemas.i2i.com/ei/wsdl/archive}EARSIV_PROPERTIES"/&gt;
 *                   &lt;element name="PDF_PROPERTIES" type="{http://schemas.i2i.com/ei/wsdl/archive}PDF_PROPERTIES" minOccurs="0"/&gt;
 *                   &lt;element name="ARCHIVE_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INVOICE_CONTENT" type="{http://www.w3.org/2005/05/xmlmime}base64Binary"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveInvoiceExtendedContent", propOrder = {
    "invoiceproperties"
})
public class ArchiveInvoiceExtendedContent {

    @XmlElement(name = "INVOICE_PROPERTIES", required = true)
    protected List<ArchiveInvoiceExtendedContent.INVOICEPROPERTIES> invoiceproperties;

    /**
     * Gets the value of the invoiceproperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceproperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINVOICEPROPERTIES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiveInvoiceExtendedContent.INVOICEPROPERTIES }
     * 
     * 
     */
    public List<ArchiveInvoiceExtendedContent.INVOICEPROPERTIES> getINVOICEPROPERTIES() {
        if (invoiceproperties == null) {
            invoiceproperties = new ArrayList<ArchiveInvoiceExtendedContent.INVOICEPROPERTIES>();
        }
        return this.invoiceproperties;
    }


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
     *         &lt;element name="EARSIV_FLAG" type="{http://schemas.i2i.com/ei/wsdl/archive}FLAG_VALUE"/&gt;
     *         &lt;element name="EARSIV_PROPERTIES" type="{http://schemas.i2i.com/ei/wsdl/archive}EARSIV_PROPERTIES"/&gt;
     *         &lt;element name="PDF_PROPERTIES" type="{http://schemas.i2i.com/ei/wsdl/archive}PDF_PROPERTIES" minOccurs="0"/&gt;
     *         &lt;element name="ARCHIVE_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INVOICE_CONTENT" type="{http://www.w3.org/2005/05/xmlmime}base64Binary"/&gt;
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
        "earsivflag",
        "earsivproperties",
        "pdfproperties",
        "archivenote",
        "invoicecontent"
    })
    public static class INVOICEPROPERTIES {

        @XmlElement(name = "EARSIV_FLAG", required = true, defaultValue = "N")
        @XmlSchemaType(name = "string")
        protected FLAGVALUE earsivflag;
        @XmlElement(name = "EARSIV_PROPERTIES", required = true)
        protected EARSIVPROPERTIES earsivproperties;
        @XmlElement(name = "PDF_PROPERTIES")
        protected PDFPROPERTIES pdfproperties;
        @XmlElement(name = "ARCHIVE_NOTE")
        protected String archivenote;
        @XmlElement(name = "INVOICE_CONTENT", required = true)
        protected Base64Binary invoicecontent;

        /**
         * Gets the value of the earsivflag property.
         * 
         * @return
         *     possible object is
         *     {@link FLAGVALUE }
         *     
         */
        public FLAGVALUE getEARSIVFLAG() {
            return earsivflag;
        }

        /**
         * Sets the value of the earsivflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLAGVALUE }
         *     
         */
        public void setEARSIVFLAG(FLAGVALUE value) {
            this.earsivflag = value;
        }

        /**
         * Gets the value of the earsivproperties property.
         * 
         * @return
         *     possible object is
         *     {@link EARSIVPROPERTIES }
         *     
         */
        public EARSIVPROPERTIES getEARSIVPROPERTIES() {
            return earsivproperties;
        }

        /**
         * Sets the value of the earsivproperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link EARSIVPROPERTIES }
         *     
         */
        public void setEARSIVPROPERTIES(EARSIVPROPERTIES value) {
            this.earsivproperties = value;
        }

        /**
         * Gets the value of the pdfproperties property.
         * 
         * @return
         *     possible object is
         *     {@link PDFPROPERTIES }
         *     
         */
        public PDFPROPERTIES getPDFPROPERTIES() {
            return pdfproperties;
        }

        /**
         * Sets the value of the pdfproperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDFPROPERTIES }
         *     
         */
        public void setPDFPROPERTIES(PDFPROPERTIES value) {
            this.pdfproperties = value;
        }

        /**
         * Gets the value of the archivenote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARCHIVENOTE() {
            return archivenote;
        }

        /**
         * Sets the value of the archivenote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARCHIVENOTE(String value) {
            this.archivenote = value;
        }

        /**
         * Gets the value of the invoicecontent property.
         * 
         * @return
         *     possible object is
         *     {@link Base64Binary }
         *     
         */
        public Base64Binary getINVOICECONTENT() {
            return invoicecontent;
        }

        /**
         * Sets the value of the invoicecontent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Base64Binary }
         *     
         */
        public void setINVOICECONTENT(Base64Binary value) {
            this.invoicecontent = value;
        }

    }

}
