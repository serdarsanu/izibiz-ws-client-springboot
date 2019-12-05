package com.edonusum.izibiz.ws.client.auth.action;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.izibiz.auth.ws.LoginRequest;
import com.izibiz.auth.ws.LoginResponse;
import com.izibiz.auth.ws.ObjectFactory;
import com.izibiz.auth.ws.REQUESTHEADERType;

@Component
public class LoginAction {

	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	private CoreConfig coreConfig;
	public String session;
	
	public String login() {
		LoginRequest request = new LoginRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(coreConfig.getDefaultSession());
		request.setUSERNAME(coreConfig.getUsername());
		request.setPASSWORD(coreConfig.getPassword());
		request.setREQUESTHEADER(header);
		
		JAXBElement<LoginRequest> jaxbRequest = new ObjectFactory().createLoginRequest(request);
		JAXBElement<LoginResponse> response = (JAXBElement<LoginResponse>) soapConnector.callAuthWebService(jaxbRequest);
	
		session = response.getValue().getSESSIONID();
		System.out.println("SESSION ID : " + session);
		return response.getValue().getSESSIONID();
	}
}