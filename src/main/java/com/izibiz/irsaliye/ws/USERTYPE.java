//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:12 AM EET 
//


package com.izibiz.irsaliye.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USERTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USERTYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="ARCHIVE"/&gt;
 *     &lt;enumeration value="EARCHIVE"/&gt;
 *     &lt;enumeration value="EARCHIVE_ARCHIVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "USERTYPE")
@XmlEnum
public enum USERTYPE {

    USER,
    ARCHIVE,
    EARCHIVE,
    EARCHIVE_ARCHIVE;

    public String value() {
        return name();
    }

    public static USERTYPE fromValue(String v) {
        return valueOf(v);
    }

}
