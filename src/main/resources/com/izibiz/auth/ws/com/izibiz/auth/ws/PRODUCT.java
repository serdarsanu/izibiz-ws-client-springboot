//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.23 at 04:50:33 PM EEST 
//


package com.izibiz.auth.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRODUCT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PRODUCT"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EINVOICE"/&gt;
 *     &lt;enumeration value="EARCHIVE"/&gt;
 *     &lt;enumeration value="EDESPATCH"/&gt;
 *     &lt;enumeration value="CREDITNOTE"/&gt;
 *     &lt;enumeration value="RECONCILIATION"/&gt;
 *     &lt;enumeration value="CONNECTOR"/&gt;
 *     &lt;enumeration value="ELEDGER"/&gt;
 *     &lt;enumeration value="ELEDGERARCHIVE"/&gt;
 *     &lt;enumeration value="EINVOICEARCHIVE"/&gt;
 *     &lt;enumeration value="EINVOICEARCHIVE"/&gt;
 *     &lt;enumeration value="ESMM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PRODUCT")
@XmlEnum
public enum PRODUCT {

    EINVOICE,
    EARCHIVE,
    EDESPATCH,
    CREDITNOTE,
    RECONCILIATION,
    CONNECTOR,
    ELEDGER,
    ELEDGERARCHIVE,
    EINVOICEARCHIVE,
    ESMM;

    public String value() {
        return name();
    }

    public static PRODUCT fromValue(String v) {
        return valueOf(v);
    }

}