package com.edonusum.izibiz.ws.client.creditnote.action;

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
import com.izibiz.creditnote.ws.FLAGVALUE;
import com.izibiz.creditnote.ws.GetCreditNoteReportRequest;
import com.izibiz.creditnote.ws.GetCreditNoteReportResponse;
import com.izibiz.creditnote.ws.ObjectFactory;
import com.izibiz.creditnote.ws.REQUESTHEADERType;

@Component
public class GetCreditNoteReportAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;

	/* NOT REQUIRED */
	private static int startDay;
	private static int startMounth;
	private static int startYear;
	private static int endDay;
	private static int endMounth;
	private static int endYear;

	public String getCreditNoteReport() {
		GetCreditNoteReportRequest request = new GetCreditNoteReportRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		request.setSTARTDATE(util.xmlGregorianCalendar(startDay, startMounth, startYear));
		request.setENDDATE(util.xmlGregorianCalendar(endDay, endMounth, endYear));
		/* NOT REQUIRED 
		 * FLAGVALUE --> N || Y
		*/
		request.setHEADERONLY(FLAGVALUE.N);

		JAXBElement<GetCreditNoteReportRequest> jaxbRequest = new ObjectFactory()
				.createGetCreditNoteReportRequest(request);
		JAXBElement<GetCreditNoteReportResponse> response = (JAXBElement<GetCreditNoteReportResponse>) soapConnector
				.callCreditNoteWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetCreditNoteReportResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
