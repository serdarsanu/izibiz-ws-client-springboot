package com.edonusum.izibiz.ws.client.creditnote.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.creditnote.ws.CancelCreditNoteRequest;
import com.izibiz.creditnote.ws.CancelCreditNoteResponse;
import com.izibiz.creditnote.ws.ObjectFactory;
import com.izibiz.creditnote.ws.REQUESTHEADERType;

@Component
public class CancelCreditNoteAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* REQUIRED */
	private static String uuid = "";

	public String cancelCreditNote() {
		CancelCreditNoteRequest request = new CancelCreditNoteRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.getUUID().add(uuid);

		JAXBElement<CancelCreditNoteRequest> jaxbRequest = new ObjectFactory().createCancelCreditNoteRequest(request);
		JAXBElement<CancelCreditNoteResponse> response = (JAXBElement<CancelCreditNoteResponse>) soapConnector
				.callCreditNoteWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(CancelCreditNoteResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
