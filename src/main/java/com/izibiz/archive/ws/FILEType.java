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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Holds File Info
 * 
 * <p>Java class for FILEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FILEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.i2i.com/ei/common}ENTITYBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATE_USER_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FIRST_NAME"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;maxLength value="256"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LAST_NAME"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FILENAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FILETYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPERATION_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;maxLength value="32"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONTENT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="INTL_TXN_ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILEType", namespace = "http://schemas.i2i.com/ei/common", propOrder = {
    "createuserinfo",
    "filename",
    "filetype",
    "operationcode",
    "content",
    "intltxnid"
})
public class FILEType
    extends ENTITYBaseType
{

    @XmlElement(name = "CREATE_USER_INFO")
    protected FILEType.CREATEUSERINFO createuserinfo;
    @XmlElement(name = "FILENAME", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String filename;
    @XmlElement(name = "FILETYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String filetype;
    @XmlElement(name = "OPERATION_CODE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operationcode;
    @XmlElement(name = "CONTENT")
    protected Object content;
    @XmlElement(name = "INTL_TXN_ID")
    protected Long intltxnid;

    /**
     * Gets the value of the createuserinfo property.
     * 
     * @return
     *     possible object is
     *     {@link FILEType.CREATEUSERINFO }
     *     
     */
    public FILEType.CREATEUSERINFO getCREATEUSERINFO() {
        return createuserinfo;
    }

    /**
     * Sets the value of the createuserinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FILEType.CREATEUSERINFO }
     *     
     */
    public void setCREATEUSERINFO(FILEType.CREATEUSERINFO value) {
        this.createuserinfo = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the filetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILETYPE() {
        return filetype;
    }

    /**
     * Sets the value of the filetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILETYPE(String value) {
        this.filetype = value;
    }

    /**
     * Gets the value of the operationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATIONCODE() {
        return operationcode;
    }

    /**
     * Sets the value of the operationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATIONCODE(String value) {
        this.operationcode = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCONTENT() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCONTENT(Object value) {
        this.content = value;
    }

    /**
     * Gets the value of the intltxnid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getINTLTXNID() {
        return intltxnid;
    }

    /**
     * Sets the value of the intltxnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setINTLTXNID(Long value) {
        this.intltxnid = value;
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
     *         &lt;element name="FIRST_NAME"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;maxLength value="256"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LAST_NAME"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = {
        "firstname",
        "lastname"
    })
    public static class CREATEUSERINFO {

        @XmlElement(name = "FIRST_NAME", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String firstname;
        @XmlElement(name = "LAST_NAME", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String lastname;

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

    }

}
