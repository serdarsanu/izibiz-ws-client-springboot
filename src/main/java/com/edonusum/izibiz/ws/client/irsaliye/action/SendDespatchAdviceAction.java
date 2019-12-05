package com.edonusum.izibiz.ws.client.irsaliye.action;

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
import com.edonusum.izibiz.ws.client.auth.action.CheckUserAction;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.irsaliye.ws.Base64Binary;
import com.izibiz.irsaliye.ws.DESPATCHADVICE;
import com.izibiz.irsaliye.ws.ObjectFactory;
import com.izibiz.irsaliye.ws.REQUESTHEADERType;
import com.izibiz.irsaliye.ws.SendDespatchAdviceRequest;
import com.izibiz.irsaliye.ws.SendDespatchAdviceRequest.RECEIVER;
import com.izibiz.irsaliye.ws.SendDespatchAdviceRequest.SENDER;
import com.izibiz.irsaliye.ws.SendDespatchAdviceResponse;

@Component
public class SendDespatchAdviceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;

	@Autowired
	CheckUserAction checkUserAction;

	/*
	 * REQUIRED Value must be entered.
	 */
	private static String despatchID = "";
	private static String senderVKN = "";
	private static String receiverVKN = "";

	public String sendDespatchAdvice() {
		SendDespatchAdviceRequest request = new SendDespatchAdviceRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		SENDER sender = new SENDER();
		sender.setVkn(senderVKN);
		sender.setAlias(checkUserAction.gibuserAlias(senderVKN, "Sender"));
		request.setSENDER(sender);

		RECEIVER receiver = new RECEIVER();
		receiver.setVkn(receiverVKN);
		receiver.setAlias(checkUserAction.gibuserAlias(receiverVKN, "Receiver"));
		request.setRECEIVER(receiver);

		DESPATCHADVICE despatchadive = new DESPATCHADVICE();
		try {
			byte[] fileToByteArray1 = FileUtils
					.readFileToByteArray(new File(coreConfig.getPathDespatchLoadSucceed() + despatchID + ".zip"));
			Base64Binary base641 = new Base64Binary();
			base641.setValue(fileToByteArray1);
			despatchadive.setCONTENT(base641);
		} catch (Exception e) {
			System.out.println("SendDespatch readFileToByteArray hatası : " + e);
		}
		request.getDESPATCHADVICE().add(despatchadive);

		JAXBElement<SendDespatchAdviceRequest> jaxbRequest = new ObjectFactory()
				.createSendDespatchAdviceRequest(request);
		JAXBElement<SendDespatchAdviceResponse> response = (JAXBElement<SendDespatchAdviceResponse>) soapConnector
				.callIrsaliyeWebService(jaxbRequest);

		if (response.getValue().getREQUESTRETURN().getRETURNCODE() == 0) {
			util.fileMove(coreConfig.getPathDespatchLoadSucceed() + despatchID + ".zip",
					coreConfig.getPathDespatchSend() + despatchID + ".zip");
			util.deleteFile(coreConfig.getPathDespatchLoadSucceed() + despatchID + ".zip");

		} else
			System.out.println("sendDespatch Not Work!");
		try {
			JAXBContext context = JAXBContext.newInstance(SendDespatchAdviceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}