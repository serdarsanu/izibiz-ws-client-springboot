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
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;
import com.izibiz.archive.ws.ReadEArchiveReportRequest;
import com.izibiz.archive.ws.ReadEArchiveReportResponse;

@Component
public class ReadEArchiveReportAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	CoreConfig coreConfig;

	/* REQUIRED*/
	private static String raporNO = "";

	public String readEArchiveReport() {
		ReadEArchiveReportRequest request = new ReadEArchiveReportRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.setRAPORNO(raporNO);

		JAXBElement<ReadEArchiveReportRequest> jaxbRequest = new ObjectFactory()
				.createReadEArchiveReportRequest(request);
		JAXBElement<ReadEArchiveReportResponse> response = (JAXBElement<ReadEArchiveReportResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(ReadEArchiveReportResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
