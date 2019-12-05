//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.mutabakat.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RECONCILIATION_STATUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RECONCILIATION_STATUS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RECONCILIATION" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://schemas.izibiz.com/ei/wsdl/reconciliation}RECONCILIATION_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="CUSTOMER_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="COMMERCIAL_NAME" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="BABS_ACCOUNTING_PERIOD" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *                   &lt;element name="CM_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="CM_AMOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="CREATE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="EMAIL" type="{http://schemas.izibiz.com/ei/wsdl/reconciliation}EMAIL" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RECONCILIATION_STATUS", namespace = "http://schemas.izibiz.com/ei/wsdl/reconciliation", propOrder = {
    "reconciliation"
})
public class RECONCILIATIONSTATUS {

    @XmlElement(name = "RECONCILIATION", required = true)
    protected List<RECONCILIATIONSTATUS.RECONCILIATION> reconciliation;

    /**
     * Gets the value of the reconciliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reconciliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECONCILIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECONCILIATIONSTATUS.RECONCILIATION }
     * 
     * 
     */
    public List<RECONCILIATIONSTATUS.RECONCILIATION> getRECONCILIATION() {
        if (reconciliation == null) {
            reconciliation = new ArrayList<RECONCILIATIONSTATUS.RECONCILIATION>();
        }
        return this.reconciliation;
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
     *         &lt;element name="TYPE" type="{http://schemas.izibiz.com/ei/wsdl/reconciliation}RECONCILIATION_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="CUSTOMER_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="COMMERCIAL_NAME" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="BABS_ACCOUNTING_PERIOD" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
     *         &lt;element name="CM_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="CM_AMOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="CREATE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="EMAIL" type="{http://schemas.izibiz.com/ei/wsdl/reconciliation}EMAIL" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "type",
        "uuid",
        "customeridentifier",
        "commercialname",
        "babsaccountingperiod",
        "cmdate",
        "cmamounttype",
        "status",
        "statuscode",
        "createdate",
        "email"
    })
    public static class RECONCILIATION {

        @XmlElement(name = "TYPE")
        @XmlSchemaType(name = "string")
        protected RECONCILIATIONTYPE type;
        @XmlElement(name = "UUID", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String uuid;
        @XmlElement(name = "CUSTOMER_IDENTIFIER", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String customeridentifier;
        @XmlElement(name = "COMMERCIAL_NAME", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String commercialname;
        @XmlElement(name = "BABS_ACCOUNTING_PERIOD")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String babsaccountingperiod;
        @XmlElement(name = "CM_DATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cmdate;
        @XmlElement(name = "CM_AMOUNT_TYPE")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String cmamounttype;
        @XmlElement(name = "STATUS", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String status;
        @XmlElement(name = "STATUS_CODE", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String statuscode;
        @XmlElement(name = "CREATE_DATE", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdate;
        @XmlElement(name = "EMAIL")
        protected List<EMAIL> email;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link RECONCILIATIONTYPE }
         *     
         */
        public RECONCILIATIONTYPE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link RECONCILIATIONTYPE }
         *     
         */
        public void setTYPE(RECONCILIATIONTYPE value) {
            this.type = value;
        }

        /**
         * Gets the value of the uuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUUID() {
            return uuid;
        }

        /**
         * Sets the value of the uuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUUID(String value) {
            this.uuid = value;
        }

        /**
         * Gets the value of the customeridentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERIDENTIFIER() {
            return customeridentifier;
        }

        /**
         * Sets the value of the customeridentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERIDENTIFIER(String value) {
            this.customeridentifier = value;
        }

        /**
         * Gets the value of the commercialname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMERCIALNAME() {
            return commercialname;
        }

        /**
         * Sets the value of the commercialname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMERCIALNAME(String value) {
            this.commercialname = value;
        }

        /**
         * Gets the value of the babsaccountingperiod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBABSACCOUNTINGPERIOD() {
            return babsaccountingperiod;
        }

        /**
         * Sets the value of the babsaccountingperiod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBABSACCOUNTINGPERIOD(String value) {
            this.babsaccountingperiod = value;
        }

        /**
         * Gets the value of the cmdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCMDATE() {
            return cmdate;
        }

        /**
         * Sets the value of the cmdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCMDATE(XMLGregorianCalendar value) {
            this.cmdate = value;
        }

        /**
         * Gets the value of the cmamounttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMAMOUNTTYPE() {
            return cmamounttype;
        }

        /**
         * Sets the value of the cmamounttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMAMOUNTTYPE(String value) {
            this.cmamounttype = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the statuscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUSCODE() {
            return statuscode;
        }

        /**
         * Sets the value of the statuscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUSCODE(String value) {
            this.statuscode = value;
        }

        /**
         * Gets the value of the createdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATEDATE() {
            return createdate;
        }

        /**
         * Sets the value of the createdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATEDATE(XMLGregorianCalendar value) {
            this.createdate = value;
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
         * {@link EMAIL }
         * 
         * 
         */
        public List<EMAIL> getEMAIL() {
            if (email == null) {
                email = new ArrayList<EMAIL>();
            }
            return this.email;
        }

    }

}