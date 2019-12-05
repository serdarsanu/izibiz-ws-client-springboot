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
import com.izibiz.oib.ws.GetInvoiceStatusRequest;
import com.izibiz.oib.ws.GetInvoiceStatusResponse;
import com.izibiz.oib.ws.INVOICE;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;

@Component
public class GetInvoiceStatusAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	public String getInvoiceStatus(String invoiceID) {
		
		GetInvoiceStatusRequest request = new GetInvoiceStatusRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		INVOICE invoice = new INVOICE();
		invoice.setID(invoiceID);	
		request.setINVOICE(invoice);
		
		JAXBElement<GetInvoiceStatusRequest> jaxbRequest = new ObjectFactory().createGetInvoiceStatusRequest(request);
		JAXBElement<GetInvoiceStatusResponse> response = (JAXBElement<GetInvoiceStatusResponse>) soapConnector.callOibWebService(jaxbRequest);
			
		try {
			JAXBContext context = JAXBContext.newInstance(GetInvoiceStatusResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}		
		return null;
	}
	
}
