package com.edonusum.izibiz.ws.client.archive.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.archive.ws.GetEmailEarchiveInvoiceRequest;
import com.izibiz.archive.ws.GetEmailEarchiveInvoiceResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class GetEmailEArchiveInvoiceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* REQUIRED */
	private static String faturaUUID = "";

	public String getEmailEArchiveInvoice() {
		GetEmailEarchiveInvoiceRequest request = new GetEmailEarchiveInvoiceRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.setFATURAUUID(faturaUUID);
		request.setEMAIL(coreConfig.getMail());

		JAXBElement<GetEmailEarchiveInvoiceRequest> jaxbRequest = new ObjectFactory()
				.createGetEmailEarchiveInvoiceRequest(request);
		JAXBElement<GetEmailEarchiveInvoiceResponse> response = (JAXBElement<GetEmailEarchiveInvoiceResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetEmailEarchiveInvoiceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}