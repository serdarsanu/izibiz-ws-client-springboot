//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:10 AM EET 
//


package com.izibiz.archive.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odemeTipEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="odemeTipEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KREDIKARTI/BANKAKARTI"/&gt;
 *     &lt;enumeration value="EFT/HAVALE"/&gt;
 *     &lt;enumeration value="KAPIDAODEME"/&gt;
 *     &lt;enumeration value="ODEMEARACISI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "odemeTipEnum", namespace = "http://earsiv.efatura.gov.tr")
@XmlEnum
public enum OdemeTipEnum {

    @XmlEnumValue("KREDIKARTI/BANKAKARTI")
    KREDIKARTI_BANKAKARTI("KREDIKARTI/BANKAKARTI"),
    @XmlEnumValue("EFT/HAVALE")
    EFT_HAVALE("EFT/HAVALE"),
    KAPIDAODEME("KAPIDAODEME"),
    ODEMEARACISI("ODEMEARACISI");
    private final String value;

    OdemeTipEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OdemeTipEnum fromValue(String v) {
        for (OdemeTipEnum c: OdemeTipEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
