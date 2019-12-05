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
import com.izibiz.billing.ws.FLAGVALUE;
import com.izibiz.billing.ws.GetCreditRequest;
import com.izibiz.billing.ws.GetCreditResponse;
import com.izibiz.billing.ws.ObjectFactory;
import com.izibiz.billing.ws.REQUESTHEADERType;

@Component
public class GetCreditAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	public String getCredit() {
		GetCreditRequest request = new GetCreditRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		/* NOT REQUIRED
		 * Requesting or not requesting details on credit information
		*/
		request.setCREDITDETAILFLAG(FLAGVALUE.N);

		JAXBElement<GetCreditRequest> jaxbRequest = new ObjectFactory().createGetCreditRequest(request);
		JAXBElement<GetCreditResponse> response = (JAXBElement<GetCreditResponse>) soapConnector
				.callBillingWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetCreditResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}