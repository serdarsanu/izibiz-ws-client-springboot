//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:13 AM EET 
//


package com.izibiz.billing.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DIRECTION.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DIRECTION"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="INBOX"/&gt;
 *     &lt;enumeration value="OUTBOX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DIRECTION")
@XmlEnum
public enum DIRECTION {

    ALL,
    INBOX,
    OUTBOX;

    public String value() {
        return name();
    }

    public static DIRECTION fromValue(String v) {
        return valueOf(v);
    }

}