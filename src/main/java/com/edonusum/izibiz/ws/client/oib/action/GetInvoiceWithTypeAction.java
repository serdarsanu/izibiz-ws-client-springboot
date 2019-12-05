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
import com.izibiz.oib.ws.GetInvoiceWithTypeRequest;
import com.izibiz.oib.ws.GetInvoiceWithTypeRequest.INVOICESEARCHKEY;
import com.izibiz.oib.ws.GetInvoiceWithTypeResponse;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;

@Component
public class GetInvoiceWithTypeAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	/*NOT REQUIRED*/
	private static String invoiceID = "";
	private static String invoiceUUID = "";
	
	public String getInvoiceWithType() {
		GetInvoiceWithTypeRequest request = new GetInvoiceWithTypeRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		INVOICESEARCHKEY invoice = new INVOICESEARCHKEY();
		/*
		 * TYPE --> Can be PDF, HTML, XML
		 * 
		 * DIRECTION --> IN can be sent for incoming invoices and OUT value can be sent for outgoing invoices.
		 * Default value is IN
		 */
		invoice.setTYPE(coreConfig.getTypeXml());
		invoice.setDIRECTION(coreConfig.getDirectionOut());
		
		/*
		 * NOT REQUIRED
		 * ID --> Ivoice ID
		 * UUID --> Invoice UUID
		 */
		invoice.setID(invoiceID);
		invoice.setUUID(invoiceUUID);
		request.setINVOICESEARCHKEY(invoice);
		
		/*
		 * NOT REQUIRED
		 * HEADERONLY --> N be sent to invoice image.
		 */
		request.setHEADERONLY(null);
		
		JAXBElement<GetInvoiceWithTypeRequest> jaxbRequest = new ObjectFactory().createGetInvoiceWithTypeRequest(request);
		JAXBElement<GetInvoiceWithTypeResponse> response = (JAXBElement<GetInvoiceWithTypeResponse>) soapConnector.callOibWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(GetInvoiceWithTypeResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}
				
		return null;
	}
	
}
