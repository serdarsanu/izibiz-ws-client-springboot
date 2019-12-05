package com.edonusum.izibiz.ws.client.archive.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.Util;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.archive.ws.GetEArchiveInvoiceListRequest;
import com.izibiz.archive.ws.GetEArchiveInvoiceListResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class GetEArchiveInvoiceListAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;

	public String getEArchiveInvoiceList() {
		GetEArchiveInvoiceListRequest request = new GetEArchiveInvoiceListRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		JAXBElement<GetEArchiveInvoiceListRequest> jaxbRequest = new ObjectFactory()
				.createGetEArchiveInvoiceListRequest(request);
		JAXBElement<GetEArchiveInvoiceListResponse> response = (JAXBElement<GetEArchiveInvoiceListResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetEArchiveInvoiceListResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}