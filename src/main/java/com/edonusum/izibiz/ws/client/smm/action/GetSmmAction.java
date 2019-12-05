package com.edonusum.izibiz.ws.client.smm.action;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.Util;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.smm.ws.Base64Binary;
import com.izibiz.smm.ws.CONTENTTYPE;
import com.izibiz.smm.ws.GetSmmRequest;
import com.izibiz.smm.ws.GetSmmRequest.SMMSEARCHKEY;
import com.izibiz.smm.ws.GetSmmResponse;
import com.izibiz.smm.ws.ObjectFactory;
import com.izibiz.smm.ws.REQUESTHEADERType;
import com.izibiz.smm.ws.SMM;

@Component
public class GetSmmAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;

	private static List<SMM> smmList;
	private static GetSmmRequest request = new GetSmmRequest();
	private static REQUESTHEADERType header = new REQUESTHEADERType();

	/*
	 * RECOMMENDED LIMIT --> If no value are sent, 10 records are returned, up to
	 * 100. Only when the abstract is taken, a maximum of 25,000 records are
	 * returned.
	 */
	private static int limit = 100;
	private static int startDay;
	private static int startMonth;
	private static int startYear;
	private static int endDay;
	private static int endMonth;
	private static int endYear;

	public String getSmm() {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		SMMSEARCHKEY searchKey = new SMMSEARCHKEY();
		searchKey.setLIMIT(limit);
		/*
		 * NOT REQUIRED searchKey.setID(null); searchKey.setUUID(null);
		 * searchKey.setFROM(null); searchKey.setTO(null);
		 * searchKey.setREADINCLUDED(FLAGVALUE.N);
		 * searchKey.setSTARTDATE(util.xmlGregorianCalendar(startDay, startMonth,
		 * startYear)); searchKey.setENDDATE(util.xmlGregorianCalendar(endDay, endMonth,
		 * endYear));
		 */
		request.setSMMSEARCHKEY(searchKey);

		/*
		 * REQUIRED CONTENTTYPE --> HTML || XML || PDF
		 */
		request.setCONTENTTYPE(CONTENTTYPE.XML);

		JAXBElement<GetSmmRequest> jaxbRequest = new ObjectFactory().createGetSmmRequest(request);
		JAXBElement<GetSmmResponse> response = (JAXBElement<GetSmmResponse>) soapConnector
				.callSmmWebService(jaxbRequest);

		smmList = response.getValue().getSMM();		
		for (SMM smm : smmList) {
			Base64Binary content = smm.getCONTENT();
			if (smm.getHEADER().getSTATUS().equals("LOAD NEW")) {
				util.saveFile(content.getValue(), new File(coreConfig.getPathSmmLoadNew() + smm.getID() + ".zip"));
			} else if (smm.getHEADER().getSTATUS().equals("LOAD SUCCEED")) {
				util.saveFile(content.getValue(), new File(coreConfig.getPathSmmLoadSucceed() + smm.getID() + ".zip"));
			} else if (smm.getHEADER().getSTATUS().equals("CANCEL CANCEL")) {
				util.saveFile(content.getValue(), new File(coreConfig.getPathSmmCancel() + smm.getID() + ".zip"));
			} else if (smm.getHEADER().getSTATUS().equals("LOAD DRAFT")
					|| smm.getHEADER().getSTATUS().equals("LOAD WAIT_ID_ASSIGN")) {
				util.saveFile(content.getValue(), new File(coreConfig.getPathSmmDraft() + smm.getID() + ".zip"));
			}
		}
		
		try {
			JAXBContext context = JAXBContext.newInstance(GetSmmResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}