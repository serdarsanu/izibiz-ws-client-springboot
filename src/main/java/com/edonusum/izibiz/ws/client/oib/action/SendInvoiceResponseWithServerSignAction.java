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
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;
import com.izibiz.oib.ws.SendInvoiceResponseWithServerSignRequest;
import com.izibiz.oib.ws.SendInvoiceResponseWithServerSignResponse;

@Component
public class SendInvoiceResponseWithServerSignAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	/*REQUIRED*/
	private static String invoiceID = "";
	private static String invoiceUUID = "";
	private static String description = "";
	
	public String sendInvoiceResponseWithServerSign() {
		SendInvoiceResponseWithServerSignRequest request = new SendInvoiceResponseWithServerSignRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		INVOICE invoice = new INVOICE();
		/*
		 * ID and UUID must be entered.
		 */
		invoice.setID(invoiceID);
		invoice.setUUID(invoiceUUID);
		request.getINVOICE().add(invoice);
		
		/*
		 * STATUS --> KABUL or RED must be entered.
		 */
		request.setSTATUS(coreConfig.getStatusKabul());
		
		/*
		 * The message to be sent with the reply.
		 */
		request.getDESCRIPTION().add(description);
		
		JAXBElement<SendInvoiceResponseWithServerSignRequest> jaxbRequest = new ObjectFactory().createSendInvoiceResponseWithServerSignRequest(request);
		JAXBElement<SendInvoiceResponseWithServerSignResponse> response = (JAXBElement<SendInvoiceResponseWithServerSignResponse>)
				soapConnector.callOibWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(SendInvoiceResponseWithServerSignResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}
		return null;
	}
}
