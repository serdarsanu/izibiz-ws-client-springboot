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
import com.izibiz.smm.ws.GetSmmStatusRequest;
import com.izibiz.smm.ws.GetSmmStatusResponse;
import com.izibiz.smm.ws.ObjectFactory;
import com.izibiz.smm.ws.REQUESTHEADERType;

@Component
public class GetSmmStatusAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;
	
	/*
	 * REQUIRED
	 * Multiple can be added --> uuid1, uuid2,...
	 */
	private static String uuid = "";

	public String getSmmStatus() {
		GetSmmStatusRequest request = new GetSmmStatusRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		request.getUUID().add(uuid);

		JAXBElement<GetSmmStatusRequest> jaxbRequest = new ObjectFactory().createGetSmmStatusRequest(request);
		JAXBElement<GetSmmStatusResponse> response = (JAXBElement<GetSmmStatusResponse>) soapConnector
				.callSmmWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(GetSmmStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}