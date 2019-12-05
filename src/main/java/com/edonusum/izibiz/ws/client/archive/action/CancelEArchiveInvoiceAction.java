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
import com.izibiz.archive.ws.CancelEArchiveInvoiceRequest;
import com.izibiz.archive.ws.CancelEArchiveInvoiceRequest.CancelEArsivInvoiceContent;
import com.izibiz.archive.ws.CancelEArchiveInvoiceResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class CancelEArchiveInvoiceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/*REQUIRED*/
	private static String faturaUUID = "";

	public String cancelEArchiveInvoice() {
		CancelEArchiveInvoiceRequest request = new CancelEArchiveInvoiceRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		CancelEArsivInvoiceContent content = new CancelEArsivInvoiceContent();
		/*
		 * DELETEFLAG --> Y to be reported to GIB, if not reported N
		 */
		content.setDELETEFLAG(coreConfig.getDraftFlagN());
		content.setFATURAUUID(faturaUUID);
		request.getCancelEArsivInvoiceContent().add(content);

		JAXBElement<CancelEArchiveInvoiceRequest> jaxbRequest = new ObjectFactory()
				.createCancelEArchiveInvoiceRequest(request);
		JAXBElement<CancelEArchiveInvoiceResponse> response = (JAXBElement<CancelEArchiveInvoiceResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(CancelEArchiveInvoiceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}