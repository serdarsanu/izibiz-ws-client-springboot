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
import com.izibiz.archive.ws.GetEArchiveInvoiceStatusRequest;
import com.izibiz.archive.ws.GetEArchiveInvoiceStatusResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class GetEArchiveInvoiceStatusAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* REQUIRED */
	private static String uuid = "";

	public String getEArchiveInvoiceStatus() {
		GetEArchiveInvoiceStatusRequest request = new GetEArchiveInvoiceStatusRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.getUUID().add(uuid);

		JAXBElement<GetEArchiveInvoiceStatusRequest> jaxbRequest = new ObjectFactory()
				.createGetEArchiveInvoiceStatusRequest(request);
		JAXBElement<GetEArchiveInvoiceStatusResponse> response = (JAXBElement<GetEArchiveInvoiceStatusResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);
		try {
			JAXBContext context = JAXBContext.newInstance(GetEArchiveInvoiceStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}