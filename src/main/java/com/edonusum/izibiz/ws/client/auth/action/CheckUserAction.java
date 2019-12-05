package com.edonusum.izibiz.ws.client.auth.action;

import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.izibiz.auth.ws.CheckUserRequest;
import com.izibiz.auth.ws.CheckUserResponse;
import com.izibiz.auth.ws.GIBUSER;
import com.izibiz.auth.ws.ObjectFactory;
import com.izibiz.auth.ws.REQUESTHEADERType;

@Component
public class CheckUserAction {

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	LoginAction loginAction;

	private static List<GIBUSER> listUser;
	private static CheckUserRequest request = new CheckUserRequest();
	private static REQUESTHEADERType header = new REQUESTHEADERType();
	private static GIBUSER user = new GIBUSER();

	/*
	 * NOT REQUIRED If the information of a single company is requested, VKN must be
	 * entered. if VKN is not entered, the list of all registered companies is
	 * taken.
	 */
	private static String vkn = "";

	public String checkUser() {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		user.setIDENTIFIER(vkn);
		request.setUSER(user);

		/*
		 * NOT REQUIRED Fatura --> INVOICE || Irsaliye --> DESPATCHADVICE if no value is
		 * entered, all returns.
		 */
		request.setDOCUMENTTYPE(null);

		JAXBElement<CheckUserRequest> jaxbRequest = new ObjectFactory().createCheckUserRequest(request);
		JAXBElement<CheckUserResponse> response = (JAXBElement<CheckUserResponse>) soapConnector
				.callAuthWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(CheckUserResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}

	public String gibuserAlias(String vkn, String senderOrReceiver) {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		user.setIDENTIFIER(vkn);
		request.setUSER(user);
		request.setDOCUMENTTYPE(null);

		JAXBElement<CheckUserRequest> jaxbRequest = new ObjectFactory().createCheckUserRequest(request);
		JAXBElement<CheckUserResponse> response = (JAXBElement<CheckUserResponse>) soapConnector
				.callAuthWebService(jaxbRequest);

		listUser = response.getValue().getUSER();
		if (listUser.size() > 1) {
			System.out.println("Please " + senderOrReceiver + " Alias Select");
			for (int i = 0; i < listUser.size(); i++) {
				System.out.println(i + 1 + ". : " + listUser.get(i).getALIAS());
			}
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			return listUser.get(select - 1).getALIAS();
		} else if (listUser.size() == 1)
			return listUser.get(0).getALIAS();
		else if (listUser.size() == 0)
			System.err.println("Alias Not Found...");
		return null;

	}
}
