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
import com.izibiz.archive.ws.ArchiveGetInvoiceInfoRequest;
import com.izibiz.archive.ws.ArchiveGetInvoiceInfoResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class ArchiveGetInvoiceInfoAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* NOT REQUIREDc*/
	private static int pageSize;
	private static int pageNumber;

	public String archiveGetInvoiceInfo() {
		ArchiveGetInvoiceInfoRequest request = new ArchiveGetInvoiceInfoRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.setPAGESIZE(pageSize);
		request.setPAGENUMBER(pageNumber);

		JAXBElement<ArchiveGetInvoiceInfoRequest> jaxbRequest = new ObjectFactory()
				.createArchiveGetInvoiceInfoRequest(request);
		JAXBElement<ArchiveGetInvoiceInfoResponse> response = (JAXBElement<ArchiveGetInvoiceInfoResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(ArchiveGetInvoiceInfoResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}