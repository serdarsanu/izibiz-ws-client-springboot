package com.edonusum.izibiz.ws.client.oib.action;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.Util;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.oib.ws.Base64Binary;
import com.izibiz.oib.ws.INVOICE;
import com.izibiz.oib.ws.LoadInvoiceRequest;
import com.izibiz.oib.ws.LoadInvoiceResponse;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;

@Component
public class LoadInvoiceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	Util util;

	/* REQUIRED
	 * Load Invoice ID
	 */
	private static String invoiceID = "";

	public String loadInvoice() {
		LoadInvoiceRequest request = new LoadInvoiceRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setCOMPRESSED(coreConfig.getCompressedY());
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		INVOICE invoice = new INVOICE();
		try {
			byte[] fileToByteArray = FileUtils
					.readFileToByteArray(new File(coreConfig.getPathInvoiceLoad() + invoiceID + ".zip"));
			Base64Binary base64 = new Base64Binary();
			base64.setValue(fileToByteArray);
			invoice.setCONTENT(base64);
		} catch (Exception e) {
			System.out.println("LoadInvoice readFileToByteArray Error : " + e);
		}
		request.getINVOICE().add(invoice);

		JAXBElement<LoadInvoiceRequest> jaxbRequest = new ObjectFactory().createLoadInvoiceRequest(request);
		JAXBElement<LoadInvoiceResponse> response = (JAXBElement<LoadInvoiceResponse>) soapConnector
				.callOibWebService(jaxbRequest);
		
		if(response.getValue().getREQUESTRETURN().getRETURNCODE() == 0) {
			util.fileMove(coreConfig.getPathInvoiceLoad()+ invoiceID+ ".zip",
					coreConfig.getPathInvoiceSend()+ invoiceID+ ".zip");
			util.deleteFile(coreConfig.getPathInvoiceLoad()+ invoiceID+ ".zip");
		}else
			System.out.println("loadInvoice not work!");
		
		try {
			JAXBContext context = JAXBContext.newInstance(LoadInvoiceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getREQUESTRETURN().getRETURNCODE());
		}
		return null;
	}
}
