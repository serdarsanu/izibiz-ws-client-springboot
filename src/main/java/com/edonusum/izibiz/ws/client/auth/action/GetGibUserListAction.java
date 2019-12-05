package com.edonusum.izibiz.ws.client.auth.action;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.Util;
import com.izibiz.auth.ws.GetGibUserListRequest;
import com.izibiz.auth.ws.GetGibUserListResponse;
import com.izibiz.auth.ws.ObjectFactory;
import com.izibiz.auth.ws.REQUESTHEADERType;

@Component
public class GetGibUserListAction {

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	LoginAction loginAction;

	@Autowired
	Util util;

	private static int day;
	private static int mounth;
	private static int year;

	public String getGibUserList() throws Exception {
		GetGibUserListRequest request = new GetGibUserListRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setSESSIONID(loginAction.session);
		request.setREQUESTHEADER(header);

		/*
		 * NOT REQUIRED TypeXml --> XML || CSV
		 * 
		 * DOCUMENTTYPE --> Fatura => INVOICE || Irsaliye => DESPATCHADVICE || All =>
		 * ALL If the parameter is not sent or sent blank, the entire list will be
		 * returned.
		 * 
		 * REGISTERTIMESTART --> Used to attract taxpayers who have joined the system
		 * after a certain date
		 */
		request.setTYPE(coreConfig.getTypeXml());
		request.setDOCUMENTTYPE(coreConfig.getDocumenttypeDespatchadvice());
		request.setREGISTERTIMESTART(util.xmlGregorianCalendar(day, mounth, year));

		JAXBElement<GetGibUserListRequest> jaxbRequest = new ObjectFactory().createGetGibUserListRequest(request);
		JAXBElement<GetGibUserListResponse> response = (JAXBElement<GetGibUserListResponse>) soapConnector
				.callAuthWebService(jaxbRequest);

		GetUserListResponse unZipAuth = util.unZipAuth(response.getValue().getCONTENT());
		List<USER> userList = new ArrayList<>(unZipAuth.getUSER());
		userList.forEach(user -> System.out.println(user.getAlias()));
		
		return null;
	}
}