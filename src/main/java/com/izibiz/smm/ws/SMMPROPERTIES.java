//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.smm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMM_PROPERTIES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMM_PROPERTIES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SMS_FLAG" type="{http://schemas.i2i.com/ei/common}FLAG_VALUE" minOccurs="0"/&gt;
 *         &lt;element name="SMS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL_FLAG" type="{http://schemas.i2i.com/ei/common}FLAG_VALUE" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SENDING_TYPE" type="{http://schemas.i2i.com/ei/wsdl}SENDING_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMM_PROPERTIES", propOrder = {
    "smsflag",
    "smsnumber",
    "emailflag",
    "email",
    "sendingtype"
})
public class SMMPROPERTIES {

    @XmlElement(name = "SMS_FLAG")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE smsflag;
    @XmlElement(name = "SMS_NUMBER")
    protected List<String> smsnumber;
    @XmlElement(name = "EMAIL_FLAG")
    @XmlSchemaType(name = "string")
    protected FLAGVALUE emailflag;
    @XmlElement(name = "EMAIL")
    protected List<String> email;
    @XmlElement(name = "SENDING_TYPE")
    @XmlSchemaType(name = "string")
    protected SENDINGTYPE sendingtype;

    /**
     * Gets the value of the smsflag property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getSMSFLAG() {
        return smsflag;
    }

    /**
     * Sets the value of the smsflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setSMSFLAG(FLAGVALUE value) {
        this.smsflag = value;
    }

    /**
     * Gets the value of the smsnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMSNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSMSNUMBER() {
        if (smsnumber == null) {
            smsnumber = new ArrayList<String>();
        }
        return this.smsnumber;
    }

    /**
     * Gets the value of the emailflag property.
     * 
     * @return
     *     possible object is
     *     {@link FLAGVALUE }
     *     
     */
    public FLAGVALUE getEMAILFLAG() {
        return emailflag;
    }

    /**
     * Sets the value of the emailflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAGVALUE }
     *     
     */
    public void setEMAILFLAG(FLAGVALUE value) {
        this.emailflag = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEMAIL() {
        if (email == null) {
            email = new ArrayList<String>();
        }
        return this.email;
    }

    /**
     * Gets the value of the sendingtype property.
     * 
     * @return
     *     possible object is
     *     {@link SENDINGTYPE }
     *     
     */
    public SENDINGTYPE getSENDINGTYPE() {
        return sendingtype;
    }

    /**
     * Sets the value of the sendingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SENDINGTYPE }
     *     
     */
    public void setSENDINGTYPE(SENDINGTYPE value) {
        this.sendingtype = value;
    }

}
