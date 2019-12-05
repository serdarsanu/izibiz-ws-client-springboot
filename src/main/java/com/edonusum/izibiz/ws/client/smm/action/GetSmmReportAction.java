package com.edonusum.izibiz.ws.client.smm.action;

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
import com.izibiz.smm.ws.FLAGVALUE;
import com.izibiz.smm.ws.GetSmmReportRequest;
import com.izibiz.smm.ws.GetSmmReportResponse;
import com.izibiz.smm.ws.GetSmmStatusResponse;
import com.izibiz.smm.ws.ObjectFactory;
import com.izibiz.smm.ws.REQUESTHEADERType;

@Component
public class GetSmmReportAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	Util util;
	
	private static int startDay;
	private static int startMonth;
	private static int startYear;
	private static int endDay;
	private static int endMonth;
	private static int endYear;
	
	public String getSmmReport() {
		GetSmmReportRequest request = new GetSmmReportRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);
		
		/*NOT REQURID*/
		request.setSTARTDATE(util.xmlGregorianCalendar(startDay, startMonth, startYear));
		request.setENDDATE(util.xmlGregorianCalendar(endDay, endMonth, endYear));
//		request.setHEADERONLY(FLAGVALUE.Y);
		
		JAXBElement<GetSmmReportRequest> jaxbRequest = new ObjectFactory().createGetSmmReportRequest(request);
		JAXBElement<GetSmmReportResponse> response = (JAXBElement<GetSmmReportResponse>)
				soapConnector.callSmmWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(GetSmmReportResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
