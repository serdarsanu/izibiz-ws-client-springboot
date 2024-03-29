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
 * <p>Java class for GenericReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericReadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_HEADER" type="{http://schemas.i2i.com/ei/entity}REQUEST_HEADERType"/&gt;
 *         &lt;element name="DOCUMENT" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DONEM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DOC_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DOC_TYPE" type="{http://schemas.i2i.com/ei/wsdl/archive}DOC_TYPE"/&gt;
 *                   &lt;element name="SUBE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GenericReadRequest", propOrder = {
    "requestheader",
    "document"
})
public class GenericReadRequest {

    @XmlElement(name = "REQUEST_HEADER", required = true)
    protected REQUESTHEADERType requestheader;
    @XmlElement(name = "DOCUMENT", required = true)
    protected List<GenericReadRequest.DOCUMENT> document;

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
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericReadRequest.DOCUMENT }
     * 
     * 
     */
    public List<GenericReadRequest.DOCUMENT> getDOCUMENT() {
        if (document == null) {
            document = new ArrayList<GenericReadRequest.DOCUMENT>();
        }
        return this.document;
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
     *         &lt;element name="DONEM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DOC_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DOC_TYPE" type="{http://schemas.i2i.com/ei/wsdl/archive}DOC_TYPE"/&gt;
     *         &lt;element name="SUBE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "donem",
        "docname",
        "doctype",
        "subeno"
    })
    public static class DOCUMENT {

        @XmlElement(name = "DONEM", required = true)
        protected String donem;
        @XmlElement(name = "DOC_NAME", required = true)
        protected String docname;
        @XmlElement(name = "DOC_TYPE", required = true)
        @XmlSchemaType(name = "string")
        protected DOCTYPE doctype;
        @XmlElement(name = "SUBE_NO")
        protected String subeno;

        /**
         * Gets the value of the donem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDONEM() {
            return donem;
        }

        /**
         * Sets the value of the donem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDONEM(String value) {
            this.donem = value;
        }

        /**
         * Gets the value of the docname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCNAME() {
            return docname;
        }

        /**
         * Sets the value of the docname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCNAME(String value) {
            this.docname = value;
        }

        /**
         * Gets the value of the doctype property.
         * 
         * @return
         *     possible object is
         *     {@link DOCTYPE }
         *     
         */
        public DOCTYPE getDOCTYPE() {
            return doctype;
        }

        /**
         * Sets the value of the doctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOCTYPE }
         *     
         */
        public void setDOCTYPE(DOCTYPE value) {
            this.doctype = value;
        }

        /**
         * Gets the value of the subeno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBENO() {
            return subeno;
        }

        /**
         * Sets the value of the subeno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBENO(String value) {
            this.subeno = value;
        }

    }

}
