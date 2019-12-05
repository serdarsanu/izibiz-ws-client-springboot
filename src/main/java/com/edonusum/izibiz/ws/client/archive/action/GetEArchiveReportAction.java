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
import com.izibiz.archive.ws.GetEArchiveReportRequest;
import com.izibiz.archive.ws.GetEArchiveReportResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class GetEArchiveReportAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* REQUIRED
	 * REPORTPERIOD -->Ex: May 2018 = 201805
	 */
	private static String reportPeriod = "201805";

	public String getEArchiveReport() {

		GetEArchiveReportRequest request = new GetEArchiveReportRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		request.setREPORTPERIOD(reportPeriod);

		/* NOT REQUIRED
		 * If the report status is requested Y, is not N
		 */
		request.setREPORTSTATUSFLAG(coreConfig.getReportStatusFlagY());

		JAXBElement<GetEArchiveReportRequest> jaxbRequest = new ObjectFactory().createGetEArchiveReportRequest(request);
		JAXBElement<GetEArchiveReportResponse> response = (JAXBElement<GetEArchiveReportResponse>) soapConnector
				.callArchiveWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetEArchiveReportResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
