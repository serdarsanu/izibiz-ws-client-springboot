package com.edonusum.izibiz.ws.client.oib.action;

import java.io.File;
import java.io.IOException;

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
import com.edonusum.izibiz.ws.client.auth.action.CheckUserAction;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.oib.ws.Base64Binary;
import com.izibiz.oib.ws.INVOICE;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;
import com.izibiz.oib.ws.SendInvoiceRequest;
import com.izibiz.oib.ws.SendInvoiceRequest.RECEIVER;
import com.izibiz.oib.ws.SendInvoiceRequest.SENDER;
import com.izibiz.oib.ws.SendInvoiceResponse;

@Component
public class SendInvoiceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	Util util;

	@Autowired
	CheckUserAction checkUserAction;
	
	@Autowired
	GetInvoiceStatusAction getInvoiceStatusAction;
	
	@Autowired
	GetInvoiceAction getInvoiceAction;

	/*
	 * REQUIRED Value must be entered.
	 */
	private static String invoiceID = "";
	private static String newInvoiceID = "";
	private static String senderVKN = "";
	private static String receiverVKN = "";

	private static SendInvoiceRequest request = new SendInvoiceRequest();
	private static REQUESTHEADERType header = new REQUESTHEADERType();

	public String sendInvoice() throws IOException {
		request = new SendInvoiceRequest();
		header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		if (invoiceID.length() == 17)
			sendSucceed();
		else if (invoiceID.length() == 16)
			sendIdAssigned();
		else
			System.out.println("Invalid invoiceID...");
		return null;
	}

	private void sendSucceed() throws IOException {
		getInvoiceAction.getInvoiceDraftBoxLoadSucceed(invoiceID);
		String zipPath = coreConfig.getPathInvoiceLoadSucceed() + invoiceID + ".zip";
		String xmlPath = util.zipExport(zipPath, coreConfig.getPathInvoiceLoadSucceed());

		Base64Binary base64 = new Base64Binary();
		base64.setValue(util.xmlToByteArray(xmlPath, invoiceID));
		base64.setValue(util.changeXmlValue(new String(base64.getValue()), newInvoiceID, invoiceID, "ID",
				coreConfig.getPathInvoiceLoadSucceed()));
		base64.setValue(util.xmlToByteArray(xmlPath, invoiceID));
		base64.setValue(util.changeXmlValue(new String(base64.getValue()), invoiceID, newInvoiceID, "UUID",
				coreConfig.getPathInvoiceLoadIdAssigned()));

		INVOICE invoice = new INVOICE();
		byte[] fileToByteArray = FileUtils
				.readFileToByteArray(new File(coreConfig.getPathInvoiceLoadIdAssigned() + newInvoiceID + ".zip"));
		Base64Binary base641 = new Base64Binary();
		base641.setValue(fileToByteArray);
		invoice.setCONTENT(base641);
		request.getINVOICE().add(invoice);
		
		SENDER sender = new SENDER();
		sender.setVkn(senderVKN);
		sender.setAlias(checkUserAction.gibuserAlias(senderVKN,"Sender"));
		request.setSENDER(sender);

		RECEIVER receiver = new RECEIVER();
		receiver.setVkn(receiverVKN);
		receiver.setAlias(checkUserAction.gibuserAlias(receiverVKN,"Receiver"));
		request.setRECEIVER(receiver);

		JAXBElement<SendInvoiceRequest> jaxbRequest = new ObjectFactory().createSendInvoiceRequest(request);
		JAXBElement<SendInvoiceResponse> response = (JAXBElement<SendInvoiceResponse>) soapConnector
				.callOibWebService(jaxbRequest);
		
		if(response.getValue().getREQUESTRETURN().getRETURNCODE() == 0) {
			util.deleteFile(coreConfig.getPathInvoiceLoadSucceed() + invoiceID + ".zip");
			util.deleteFile(coreConfig.getPathInvoiceLoadSucceed() + invoiceID + ".xml");
			util.fileMove(coreConfig.getPathInvoiceLoadIdAssigned() + newInvoiceID + ".zip", 
					coreConfig.getPathInvoiceSend() + newInvoiceID + ".zip");
			util.deleteFile(coreConfig.getPathInvoiceLoadIdAssigned() + newInvoiceID + ".zip");
		}
		
		try {
			JAXBContext context = JAXBContext.newInstance(SendInvoiceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
			getInvoiceStatusAction.getInvoiceStatus(newInvoiceID);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getREQUESTRETURN().getRETURNCODE());
		}
	}

	private void sendIdAssigned() throws IOException {
		SENDER sender = new SENDER();
		sender.setVkn(senderVKN);
		sender.setAlias(checkUserAction.gibuserAlias(senderVKN,"Sender"));
		request.setSENDER(sender);

		RECEIVER receiver = new RECEIVER();
		receiver.setVkn(receiverVKN);
		receiver.setAlias(checkUserAction.gibuserAlias(receiverVKN,"Receiver"));
		request.setRECEIVER(receiver);

		INVOICE invoice = new INVOICE();
		invoice.setID(invoiceID);
		request.getINVOICE().add(invoice);

		JAXBElement<SendInvoiceRequest> jaxbRequest = new ObjectFactory().createSendInvoiceRequest(request);
		JAXBElement<SendInvoiceResponse> response = (JAXBElement<SendInvoiceResponse>) soapConnector
				.callOibWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(SendInvoiceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
			getInvoiceStatusAction.getInvoiceStatus(invoiceID);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getREQUESTRETURN().getRETURNCODE());
		}
	}
}