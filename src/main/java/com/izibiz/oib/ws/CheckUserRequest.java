//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:09 AM EET 
//


package com.izibiz.oib.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckUserRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckUserRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.i2i.com/ei/entity}REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="USER" type="{http://schemas.i2i.com/ei/wsdl}GIBUSER"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckUserRequest", propOrder = {
    "user"
})
public class CheckUserRequest
    extends REQUEST
{

    @XmlElement(name = "USER", required = true)
    protected GIBUSER user;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link GIBUSER }
     *     
     */
    public GIBUSER getUSER() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIBUSER }
     *     
     */
    public void setUSER(GIBUSER value) {
        this.user = value;
    }

}
