package com.edonusum.izibiz.ws.client.irsaliye.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.irsaliye.ws.DESPATCHADVICEINFO;
import com.izibiz.irsaliye.ws.MarkDespatchAdviceRequest;
import com.izibiz.irsaliye.ws.MarkDespatchAdviceRequest.MARK;
import com.izibiz.irsaliye.ws.MarkDespatchAdviceResponse;
import com.izibiz.irsaliye.ws.ObjectFactory;
import com.izibiz.irsaliye.ws.REQUESTHEADERType;

@Component
public class MarkDespatchAdviceAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	public String markDespatchAdvice(String despatchID) {
		MarkDespatchAdviceRequest request = new MarkDespatchAdviceRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		DESPATCHADVICEINFO despatch = new DESPATCHADVICEINFO();
		MARK mark = new MARK();
		mark.setValue(coreConfig.getMarkRead());
		despatch.setID(despatchID);
		mark.getDESPATCHADVICEINFO().add(despatch);
		request.setMARK(mark);
		
		JAXBElement<MarkDespatchAdviceRequest> jaxbReuest = new ObjectFactory().createMarkDespatchAdviceRequest(request);
		JAXBElement<MarkDespatchAdviceResponse> response = (JAXBElement<MarkDespatchAdviceResponse>)
				soapConnector.callIrsaliyeWebService(jaxbReuest);
////	Console
//	try {
//		JAXBContext context = JAXBContext.newInstance(MarkDespatchAdviceResponse.class);
//		Marshaller m = context.createMarshaller();
//		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		m.marshal(response, System.out);
//	} catch (JAXBException e) {
//		System.out.println("Response Error : " + e);
//	}	
		return null;
	}
}