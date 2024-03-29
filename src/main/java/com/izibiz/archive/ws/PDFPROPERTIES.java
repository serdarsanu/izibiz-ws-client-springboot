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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDF_PROPERTIES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDF_PROPERTIES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EARSIV_PDF_FLAG" type="{http://schemas.i2i.com/ei/wsdl/archive}FLAG_VALUE" minOccurs="0"/&gt;
 *         &lt;element name="PDF_SIGNATURE_FLAG" type="{http://schemas.i2i.com/ei/wsdl/archive}FLAG_VALUE" minOccurs="0"/&gt;
 *         &lt;element name="PDF_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EARCHIVE_PDF_XSLT_FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDF_CONTENT" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="EARCHIVE_PDF_VISUALSIGN_FILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDF_PROPERTIES", propOrder = {
    "earsivpdfflag",
    "pdfsignatureflag",
    "pdfname",
    "earchivepdfxsltfilename",
    "pdfcontent",
    "earchivepdfvisualsignfile"
})
public class PDFPROPERTIES {

    @XmlElement(name = "EARSIV_PDF_FLAG", defaultValue = "N")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE earsivpdfflag;
    @XmlElement(name = "PDF_SIGNATURE_FLAG", defaultValue = "N")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE pdfsignatureflag;
    @XmlElement(name = "PDF_NAME")
    protected String pdfname;
    @XmlElement(name = "EARCHIVE_PDF_XSLT_FILENAME")
    protected String earchivepdfxsltfilename;
    @XmlElement(name = "PDF_CONTENT")
    protected Base64Binary pdfcontent;
    @XmlElement(name = "EARCHIVE_PDF_VISUALSIGN_FILE")
    protected String earchivepdfvisualsignfile;

    /**
     * Gets the value of the earsivpdfflag property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getEARSIVPDFFLAG() {
        return earsivpdfflag;
    }

    /**
     * Sets the value of the earsivpdfflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setEARSIVPDFFLAG(FLAGVALUE value) {
        this.earsivpdfflag = value;
    }

    /**
     * Gets the value of the pdfsignatureflag property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getPDFSIGNATUREFLAG() {
        return pdfsignatureflag;
    }

    /**
     * Sets the value of the pdfsignatureflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setPDFSIGNATUREFLAG(FLAGVALUE value) {
        this.pdfsignatureflag = value;
    }

    /**
     * Gets the value of the pdfname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFNAME() {
        return pdfname;
    }

    /**
     * Sets the value of the pdfname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFNAME(String value) {
        this.pdfname = value;
    }

    /**
     * Gets the value of the earchivepdfxsltfilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEARCHIVEPDFXSLTFILENAME() {
        return earchivepdfxsltfilename;
    }

    /**
     * Sets the value of the earchivepdfxsltfilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEARCHIVEPDFXSLTFILENAME(String value) {
        this.earchivepdfxsltfilename = value;
    }

    /**
     * Gets the value of the pdfcontent property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getPDFCONTENT() {
        return pdfcontent;
    }

    /**
     * Sets the value of the pdfcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setPDFCONTENT(Base64Binary value) {
        this.pdfcontent = value;
    }

    /**
     * Gets the value of the earchivepdfvisualsignfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEARCHIVEPDFVISUALSIGNFILE() {
        return earchivepdfvisualsignfile;
    }

    /**
     * Sets the value of the earchivepdfvisualsignfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEARCHIVEPDFVISUALSIGNFILE(String value) {
        this.earchivepdfvisualsignfile = value;
    }

}
