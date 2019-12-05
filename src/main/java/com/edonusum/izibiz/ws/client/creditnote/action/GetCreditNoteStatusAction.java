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
import com.izibiz.creditnote.ws.GetCreditNoteStatusRequest;
import com.izibiz.creditnote.ws.GetCreditNoteStatusResponse;
import com.izibiz.creditnote.ws.ObjectFactory;
import com.izibiz.creditnote.ws.REQUESTHEADERType;

@Component
public class GetCreditNoteStatusAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* REQUIRED */
	private static String uuid = "";

	public String getCreditNoteStatus() {
		GetCreditNoteStatusRequest request = new GetCreditNoteStatusRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.getUUID().add(uuid);

		JAXBElement<GetCreditNoteStatusRequest> jaxbRequest = new ObjectFactory()
				.createGetCreditNoteStatusRequest(request);
		JAXBElement<GetCreditNoteStatusResponse> response = (JAXBElement<GetCreditNoteStatusResponse>) soapConnector
				.callCreditNoteWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetCreditNoteStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
