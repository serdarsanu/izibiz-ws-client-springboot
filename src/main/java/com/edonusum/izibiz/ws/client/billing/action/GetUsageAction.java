package com.edonusum.izibiz.ws.client.billing.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.billing.ws.DIRECTION;
import com.izibiz.billing.ws.GetUsageRequest;
import com.izibiz.billing.ws.GetUsageResponse;
import com.izibiz.billing.ws.ObjectFactory;
import com.izibiz.billing.ws.PRODUCTTYPE;
import com.izibiz.billing.ws.REQUESTHEADERType;

@Component
public class GetUsageAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/* NOT REQUIRED */
	private static String period = "";

	public String getUsage() {
		GetUsageRequest request = new GetUsageRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.setPERIOD(period);
		request.setPRODUCTTYPE(PRODUCTTYPE.ALL);
		request.setDIRECTION(DIRECTION.ALL);

		JAXBElement<GetUsageRequest> jaxbRequest = new ObjectFactory().createGetUsageRequest(request);
		JAXBElement<GetUsageResponse> response = (JAXBElement<GetUsageResponse>) soapConnector
				.callBillingWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetUsageResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}