//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:09 AM EET 
//


package com.izibiz.oib.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USERCONTENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USERCONTENT"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2005/05/xmlmime&gt;base64Binary"&gt;
 *       &lt;attribute name="USERID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="USERTYPE" type="{http://schemas.i2i.com/ei/wsdl}USERTYPE" default="USER" /&gt;
 *       &lt;attribute name="SIGNTYPE" type="{http://schemas.i2i.com/ei/wsdl}SIGNTYPE" /&gt;
 *       &lt;attribute name="TYPE" type="{http://schemas.i2i.com/ei/wsdl}USERCONTENTTYPE" /&gt;
 *       &lt;attribute name="ALIAS_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USERCONTENT")
public class USERCONTENT
    extends Base64Binary
{

    @XmlAttribute(name = "USERID")
    protected String userid;
    @XmlAttribute(name = "USERTYPE")
    protected USERTYPE usertype;
    @XmlAttribute(name = "SIGNTYPE")
    protected SIGNTYPE signtype;
    @XmlAttribute(name = "TYPE")
    protected USERCONTENTTYPE type;
    @XmlAttribute(name = "ALIAS_TYPE")
    protected String aliastype;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the usertype property.
     * 
     * @return
     *     possible object is
     *     {@link USERTYPE }
     *     
     */
    public USERTYPE getUSERTYPE() {
        if (usertype == null) {
            return USERTYPE.USER;
        } else {
            return usertype;
        }
    }

    /**
     * Sets the value of the usertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERTYPE }
     *     
     */
    public void setUSERTYPE(USERTYPE value) {
        this.usertype = value;
    }

    /**
     * Gets the value of the signtype property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNTYPE }
     *     
     */
    public SIGNTYPE getSIGNTYPE() {
        return signtype;
    }

    /**
     * Sets the value of the signtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNTYPE }
     *     
     */
    public void setSIGNTYPE(SIGNTYPE value) {
        this.signtype = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link USERCONTENTTYPE }
     *     
     */
    public USERCONTENTTYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERCONTENTTYPE }
     *     
     */
    public void setTYPE(USERCONTENTTYPE value) {
        this.type = value;
    }

    /**
     * Gets the value of the aliastype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIASTYPE() {
        return aliastype;
    }

    /**
     * Sets the value of the aliastype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIASTYPE(String value) {
        this.aliastype = value;
    }

}
