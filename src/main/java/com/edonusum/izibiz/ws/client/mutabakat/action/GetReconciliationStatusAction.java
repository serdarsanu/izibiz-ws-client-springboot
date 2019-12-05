package com.edonusum.izibiz.ws.client.mutabakat.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.mutabakat.ws.GetReconciliationStatusRequest;
import com.izibiz.mutabakat.ws.GetReconciliationStatusRequest.RECONCILIATIONSEARCHING;
import com.izibiz.mutabakat.ws.GetReconciliationStatusResponse;
import com.izibiz.mutabakat.ws.ObjectFactory;
import com.izibiz.mutabakat.ws.REQUESTHEADERType;

@Component
public class GetReconciliationStatusAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	/*
	 * REQUIRED Multiple can be added --> reconciliationUUID1,
	 * reconciliationUUID2,...
	 */
	private static String reconciliationUUID = "";

	public String getReconciliationStatus() {
		GetReconciliationStatusRequest request = new GetReconciliationStatusRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		RECONCILIATIONSEARCHING uuid = new RECONCILIATIONSEARCHING();
		uuid.getUUID().add(reconciliationUUID);
		request.setRECONCILIATIONSEARCHING(uuid);

		JAXBElement<GetReconciliationStatusRequest> jaxbRequest = new ObjectFactory()
				.createGetReconciliationStatusRequest(request);
		JAXBElement<GetReconciliationStatusResponse> response = (JAXBElement<GetReconciliationStatusResponse>) soapConnector
				.callMutabakatWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetReconciliationStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}

		return null;
	}
}
