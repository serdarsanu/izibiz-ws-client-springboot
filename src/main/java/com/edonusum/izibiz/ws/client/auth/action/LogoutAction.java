package com.edonusum.izibiz.ws.client.auth.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.izibiz.auth.ws.LogoutRequest;
import com.izibiz.auth.ws.LogoutResponse;
import com.izibiz.auth.ws.ObjectFactory;
import com.izibiz.auth.ws.REQUESTHEADERType;

@Component
public class LogoutAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	SOAPConnector soapConnector;
	
	public String logout() {
		LogoutRequest request = new LogoutRequest();
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		request.setREQUESTHEADER(header);
		
		JAXBElement<LogoutRequest> jaxbRequest = new ObjectFactory().createLogoutRequest(request);
		JAXBElement<LogoutResponse> response = (JAXBElement<LogoutResponse>) soapConnector.callAuthWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(LogoutResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}