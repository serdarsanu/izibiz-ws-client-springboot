package com.edonusum.izibiz.ws.client.smm.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.smm.ws.CancelSmmRequest;
import com.izibiz.smm.ws.CancelSmmResponse;
import com.izibiz.smm.ws.ObjectFactory;
import com.izibiz.smm.ws.REQUESTHEADERType;

@Component
public class CancelSmmAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	/*REQUIRED*/
	private static String uuid = "";
	
	public String cancelSmm() {
		CancelSmmRequest request = new CancelSmmRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		request.getUUID().add(uuid);
		
		JAXBElement<CancelSmmRequest> jaxbRequest = new ObjectFactory().createCancelSmmRequest(request);
		JAXBElement<CancelSmmResponse> response = (JAXBElement<CancelSmmResponse>) 
				soapConnector.callSmmWebService(jaxbRequest);
		try {
			JAXBContext context = JAXBContext.newInstance(CancelSmmResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
