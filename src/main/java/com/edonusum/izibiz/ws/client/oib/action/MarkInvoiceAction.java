package com.edonusum.izibiz.ws.client.oib.action;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.oib.ws.INVOICE;
import com.izibiz.oib.ws.MarkInvoiceRequest;
import com.izibiz.oib.ws.MarkInvoiceRequest.MARK;
import com.izibiz.oib.ws.MarkInvoiceResponse;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;

@Component
public class MarkInvoiceAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	CoreConfig coreConfig;
	
	public String markInvoice(String invoiceID) {
		MarkInvoiceRequest request = new MarkInvoiceRequest();
		REQUESTHEADERType header = new REQUESTHEADERType();
		
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		INVOICE invoice = new INVOICE();
		/*
		 * ID or UUID must be entered.
		 * invoice.setUUID(invoiceUUID);
		 */
		invoice.setID(invoiceID);
		
		MARK mark = new MARK();
		/*
		 * Value --> READ or UNREAD must be entered.
		 */
		mark.setValue(coreConfig.getMarkRead());
		
		mark.getINVOICE().add(invoice);
		request.setMARK(mark);
		
		JAXBElement<MarkInvoiceRequest> jaxbRequest = new ObjectFactory().createMarkInvoiceRequest(request);
		JAXBElement<MarkInvoiceResponse> response = (JAXBElement<MarkInvoiceResponse>) soapConnector.callOibWebService(jaxbRequest);
		
////		Console
//		try {
//			JAXBContext context = JAXBContext.newInstance(MarkInvoiceResponse.class);
//			Marshaller m = context.createMarshaller();
//			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//			m.marshal(response, System.out);
//		} catch (JAXBException e) {
//			System.out.println("Response Error : " + e);
//		}		
		return null;
	}
	
}
