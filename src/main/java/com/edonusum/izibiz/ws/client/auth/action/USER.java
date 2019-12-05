package com.edonusum.izibiz.ws.client.auth.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder = {"identifier","alias","title","type","registertime","unit","documenttype","aliascreationtime"})
public class USER {
	
     String identifier;
   
     String alias;
    
     String title;
   
     String type;
    
     String registertime;
    
     String unit;
   
     String aliascreationtime;
    
     String documenttype;
    
    @XmlElement(name = "IDENTIFIER")
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	 @XmlElement(name = "ALIAS")
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	@XmlElement(name = "TITLE")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	 @XmlElement(name = "TYPE")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@XmlElement(name = "REGISTER_TIME")
	public String getRegistertime() {
		return registertime;
	}
	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}
	@XmlElement(name = "UNIT")
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	 @XmlElement(name = "ALIAS_CREATION_TIME")
	public String getAliascreationtime() {
		return aliascreationtime;
	}
	public void setAliascreationtime(String aliascreationtime) {
		this.aliascreationtime = aliascreationtime;
	}
	@XmlElement(name = "DOCUMENT_TYPE")
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}

    
}
