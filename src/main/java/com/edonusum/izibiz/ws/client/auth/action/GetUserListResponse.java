package com.edonusum.izibiz.ws.client.auth.action;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetUserListResponse", namespace = "http://schemas.i2i.com/ei/wsdl")
public class GetUserListResponse {
	@XmlElement(name = "USER")
	List<USER> userlist;

	public List<USER> getUSER() {
		return userlist;
	}

	public void setUSER(List<USER> uSER) {
		userlist = uSER;
	}
}