package com.edonusum.izibiz.ws.client.irsaliye.action;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.irsaliye.ws.GetDespatchAdviceStatusRequest;
import com.izibiz.irsaliye.ws.GetDespatchAdviceStatusResponse;
import com.izibiz.irsaliye.ws.ObjectFactory;
import com.izibiz.irsaliye.ws.REQUESTHEADERType;

@Component
public class GetDespatchAdviceStatusAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	private static List<String> uuidList = new ArrayList<>();
	/* REQUIRED
	 * Multiple can be added --> uuid1, uuid2,...
	*/
	private static String uuid = "";
	
	public String getDespatchAdviceStatus() {
		GetDespatchAdviceStatusRequest request = new GetDespatchAdviceStatusRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		uuidList.add(uuid);
		
		request.getUUID().addAll(uuidList);
		
		JAXBElement<GetDespatchAdviceStatusRequest> jaxbRequest = new ObjectFactory().createGetDespatchAdviceStatusRequest(request);
		JAXBElement<GetDespatchAdviceStatusResponse> response = (JAXBElement<GetDespatchAdviceStatusResponse>)
				soapConnector.callIrsaliyeWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(GetDespatchAdviceStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}