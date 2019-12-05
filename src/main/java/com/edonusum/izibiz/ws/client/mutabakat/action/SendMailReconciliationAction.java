package com.edonusum.izibiz.ws.client.mutabakat.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.mutabakat.ws.ObjectFactory;
import com.izibiz.mutabakat.ws.REQUESTHEADERType;
import com.izibiz.mutabakat.ws.SendMailReconciliationRequest;
import com.izibiz.mutabakat.ws.SendMailReconciliationRequest.MAILSEARCHING;
import com.izibiz.smm.ws.GetSmmStatusResponse;
import com.izibiz.mutabakat.ws.SendMailReconciliationResponse;

@Component
public class SendMailReconciliationAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	/*
	 * REQUIRED Multiple can be added --> reconciliationUUID1,
	 * reconciliationUUID2,...
	 */
	private static String reconciliationUUID = "";
	
	public String sendMailReconciliation() {
		SendMailReconciliationRequest request = new SendMailReconciliationRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		MAILSEARCHING uuid = new MAILSEARCHING();
		uuid.getUUID().add(reconciliationUUID);
		request.setMAILSEARCHING(uuid);
		
		JAXBElement<SendMailReconciliationRequest> jaxbRequest = new ObjectFactory().createSendMailReconciliationRequest(request);
		JAXBElement<SendMailReconciliationResponse> response = (JAXBElement<SendMailReconciliationResponse>)
				soapConnector.callMutabakatWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(SendMailReconciliationResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}		
		return null;
	}
}
