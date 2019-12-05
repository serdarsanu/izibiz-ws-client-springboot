//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:06:10 AM EET 
//


package com.izibiz.archive.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GENERIC_CONTENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENERIC_CONTENT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAR_INDEX1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAR_INDEX2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAR_INDEX3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAR_INDEX4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAR_INDEX5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAR_INDEX6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIX_PAR6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_INDEX1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_INDEX2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_INDEX3" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ARCHIVE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ARCHIVE_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FILE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DIRECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARSE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CONTENT" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENERIC_CONTENT", propOrder = {
    "filename",
    "parindex1",
    "parindex2",
    "parindex3",
    "parindex4",
    "parindex5",
    "parindex6",
    "fixpar1",
    "fixpar2",
    "fixpar3",
    "fixpar4",
    "fixpar5",
    "fixpar6",
    "dateindex1",
    "dateindex2",
    "dateindex3",
    "archivetype",
    "archivesubtype",
    "filetype",
    "direction",
    "parseflag",
    "override",
    "content"
})
public class GENERICCONTENT {

    @XmlElement(name = "FILE_NAME", required = true)
    protected String filename;
    @XmlElement(name = "PAR_INDEX1")
    protected String parindex1;
    @XmlElement(name = "PAR_INDEX2")
    protected String parindex2;
    @XmlElement(name = "PAR_INDEX3")
    protected String parindex3;
    @XmlElement(name = "PAR_INDEX4")
    protected String parindex4;
    @XmlElement(name = "PAR_INDEX5")
    protected String parindex5;
    @XmlElement(name = "PAR_INDEX6")
    protected String parindex6;
    @XmlElement(name = "FIX_PAR1")
    protected String fixpar1;
    @XmlElement(name = "FIX_PAR2")
    protected String fixpar2;
    @XmlElement(name = "FIX_PAR3")
    protected String fixpar3;
    @XmlElement(name = "FIX_PAR4")
    protected String fixpar4;
    @XmlElement(name = "FIX_PAR5")
    protected String fixpar5;
    @XmlElement(name = "FIX_PAR6")
    protected String fixpar6;
    @XmlElement(name = "DATE_INDEX1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateindex1;
    @XmlElement(name = "DATE_INDEX2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateindex2;
    @XmlElement(name = "DATE_INDEX3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateindex3;
    @XmlElement(name = "ARCHIVE_TYPE", required = true)
    protected String archivetype;
    @XmlElement(name = "ARCHIVE_SUB_TYPE", defaultValue = "NORMAL")
    protected String archivesubtype;
    @XmlElement(name = "FILE_TYPE", required = true)
    protected String filetype;
    @XmlElement(name = "DIRECTION")
    protected String direction;
    @XmlElement(name = "PARSE_FLAG", required = true)
    protected String parseflag;
    @XmlElement(name = "OVERRIDE", required = true)
    protected String override;
    @XmlElement(name = "CONTENT", required = true)
    protected List<Base64Binary> content;

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
     * Gets the value of the parindex1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX1() {
        return parindex1;
    }

    /**
     * Sets the value of the parindex1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX1(String value) {
        this.parindex1 = value;
    }

    /**
     * Gets the value of the parindex2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX2() {
        return parindex2;
    }

    /**
     * Sets the value of the parindex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX2(String value) {
        this.parindex2 = value;
    }

    /**
     * Gets the value of the parindex3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX3() {
        return parindex3;
    }

    /**
     * Sets the value of the parindex3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX3(String value) {
        this.parindex3 = value;
    }

    /**
     * Gets the value of the parindex4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX4() {
        return parindex4;
    }

    /**
     * Sets the value of the parindex4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX4(String value) {
        this.parindex4 = value;
    }

    /**
     * Gets the value of the parindex5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX5() {
        return parindex5;
    }

    /**
     * Sets the value of the parindex5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX5(String value) {
        this.parindex5 = value;
    }

    /**
     * Gets the value of the parindex6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARINDEX6() {
        return parindex6;
    }

    /**
     * Sets the value of the parindex6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARINDEX6(String value) {
        this.parindex6 = value;
    }

    /**
     * Gets the value of the fixpar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR1() {
        return fixpar1;
    }

    /**
     * Sets the value of the fixpar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR1(String value) {
        this.fixpar1 = value;
    }

    /**
     * Gets the value of the fixpar2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR2() {
        return fixpar2;
    }

    /**
     * Sets the value of the fixpar2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR2(String value) {
        this.fixpar2 = value;
    }

    /**
     * Gets the value of the fixpar3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR3() {
        return fixpar3;
    }

    /**
     * Sets the value of the fixpar3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR3(String value) {
        this.fixpar3 = value;
    }

    /**
     * Gets the value of the fixpar4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR4() {
        return fixpar4;
    }

    /**
     * Sets the value of the fixpar4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR4(String value) {
        this.fixpar4 = value;
    }

    /**
     * Gets the value of the fixpar5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR5() {
        return fixpar5;
    }

    /**
     * Sets the value of the fixpar5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR5(String value) {
        this.fixpar5 = value;
    }

    /**
     * Gets the value of the fixpar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIXPAR6() {
        return fixpar6;
    }

    /**
     * Sets the value of the fixpar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIXPAR6(String value) {
        this.fixpar6 = value;
    }

    /**
     * Gets the value of the dateindex1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEINDEX1() {
        return dateindex1;
    }

    /**
     * Sets the value of the dateindex1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEINDEX1(XMLGregorianCalendar value) {
        this.dateindex1 = value;
    }

    /**
     * Gets the value of the dateindex2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEINDEX2() {
        return dateindex2;
    }

    /**
     * Sets the value of the dateindex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEINDEX2(XMLGregorianCalendar value) {
        this.dateindex2 = value;
    }

    /**
     * Gets the value of the dateindex3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEINDEX3() {
        return dateindex3;
    }

    /**
     * Sets the value of the dateindex3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEINDEX3(XMLGregorianCalendar value) {
        this.dateindex3 = value;
    }

    /**
     * Gets the value of the archivetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCHIVETYPE() {
        return archivetype;
    }

    /**
     * Sets the value of the archivetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCHIVETYPE(String value) {
        this.archivetype = value;
    }

    /**
     * Gets the value of the archivesubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCHIVESUBTYPE() {
        return archivesubtype;
    }

    /**
     * Sets the value of the archivesubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARCHIVESUBTYPE(String value) {
        this.archivesubtype = value;
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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTION(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the parseflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARSEFLAG() {
        return parseflag;
    }

    /**
     * Sets the value of the parseflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARSEFLAG(String value) {
        this.parseflag = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERRIDE() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERRIDE(String value) {
        this.override = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Base64Binary }
     * 
     * 
     */
    public List<Base64Binary> getCONTENT() {
        if (content == null) {
            content = new ArrayList<Base64Binary>();
        }
        return this.content;
    }

}