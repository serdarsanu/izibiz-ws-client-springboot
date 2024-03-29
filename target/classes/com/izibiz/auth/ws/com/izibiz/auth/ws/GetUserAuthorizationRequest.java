//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.23 at 04:50:33 PM EEST 
//


package com.izibiz.auth.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserAuthorizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserAuthorizationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.i2i.com/ei/entity}REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRODUCT" type="{http://schemas.i2i.com/ei/wsdl}PRODUCT"/&gt;
 *         &lt;element name="PRODUCT_DETAIL_FLAG" type="{http://schemas.i2i.com/ei/wsdl}PRODUCT_DETAIL_FLAG"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserAuthorizationRequest", propOrder = {
    "product",
    "productdetailflag"
})
public class GetUserAuthorizationRequest
    extends REQUEST
{

    @XmlElement(name = "PRODUCT", required = true)
    @XmlSchemaType(name = "token")
    protected PRODUCT product;
    @XmlElement(name = "PRODUCT_DETAIL_FLAG", required = true)
    @XmlSchemaType(name = "token")
    protected PRODUCTDETAILFLAG productdetailflag;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCT }
     *     
     */
    public PRODUCT getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCT }
     *     
     */
    public void setPRODUCT(PRODUCT value) {
        this.product = value;
    }

    /**
     * Gets the value of the productdetailflag property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTDETAILFLAG }
     *     
     */
    public PRODUCTDETAILFLAG getPRODUCTDETAILFLAG() {
        return productdetailflag;
    }

    /**
     * Sets the value of the productdetailflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTDETAILFLAG }
     *     
     */
    public void setPRODUCTDETAILFLAG(PRODUCTDETAILFLAG value) {
        this.productdetailflag = value;
    }

}
