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
 * <p>Java class for ArchiveInvoiceWriteContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveInvoiceWriteContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Elements" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ElementCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="ElementList" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ArchiveInvoiceWriteContent", propOrder = {
    "elements"
})
public class ArchiveInvoiceWriteContent {

    @XmlElement(name = "Elements", required = true)
    protected List<ArchiveInvoiceWriteContent.Elements> elements;

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchiveInvoiceWriteContent.Elements }
     * 
     * 
     */
    public List<ArchiveInvoiceWriteContent.Elements> getElements() {
        if (elements == null) {
            elements = new ArrayList<ArchiveInvoiceWriteContent.Elements>();
        }
        return this.elements;
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
     *         &lt;element name="ElementType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ElementCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="ElementList" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" maxOccurs="unbounded"/&gt;
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
        "elementType",
        "elementCount",
        "elementList"
    })
    public static class Elements {

        @XmlElement(name = "ElementType", required = true)
        protected String elementType;
        @XmlElement(name = "ElementCount")
        protected int elementCount;
        @XmlElement(name = "ElementList", required = true)
        protected List<Base64Binary> elementList;

        /**
         * Gets the value of the elementType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementType() {
            return elementType;
        }

        /**
         * Sets the value of the elementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementType(String value) {
            this.elementType = value;
        }

        /**
         * Gets the value of the elementCount property.
         * 
         */
        public int getElementCount() {
            return elementCount;
        }

        /**
         * Sets the value of the elementCount property.
         * 
         */
        public void setElementCount(int value) {
            this.elementCount = value;
        }

        /**
         * Gets the value of the elementList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elementList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElementList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Base64Binary }
         * 
         * 
         */
        public List<Base64Binary> getElementList() {
            if (elementList == null) {
                elementList = new ArrayList<Base64Binary>();
            }
            return this.elementList;
        }

    }

}
