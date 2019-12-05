package com.edonusum.izibiz.ws.client.creditnote.action;

import java.io.File;
import java.io.IOException;
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
import com.izibiz.creditnote.ws.Base64Binary;
import com.izibiz.creditnote.ws.CONTENTTYPE;
import com.izibiz.creditnote.ws.CREDITNOTE;
import com.izibiz.creditnote.ws.FLAGVALUE;
import com.izibiz.creditnote.ws.GetCreditNoteRequest;
import com.izibiz.creditnote.ws.GetCreditNoteRequest.CREDITNOTESEARCHKEY;
import com.izibiz.creditnote.ws.GetCreditNoteResponse;
import com.izibiz.creditnote.ws.ObjectFactory;
import com.izibiz.creditnote.ws.REQUESTHEADERType;

@Component
public class GetCreditNoteAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	Util util;

	private static List<CREDITNOTE> responseList;
	/*
	 * RECOMMENDED LIMIT --> If no value are sent, 10 records are returned, up to
	 * 100. Only when the abstract is taken, a maximum of 25,000 records are
	 * returned.
	 */
	private static int limit = 100;

	public String getCreditNote() throws IOException {
		GetCreditNoteRequest request = new GetCreditNoteRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		/* NOT REQUIRED */
		CREDITNOTESEARCHKEY searchKey = new CREDITNOTESEARCHKEY();
		searchKey.setLIMIT(limit);
		searchKey.setID(null);
		searchKey.setUUID(null);
		searchKey.setFROM(null);
		searchKey.setTO(null);
		searchKey.setSTARTDATE(null);
		searchKey.setENDDATE(null);
		searchKey.setREADINCLUDED(null);
		request.setCREDITNOTESEARCHKEY(searchKey);

		/*
		 * NOT REQUIRED FLAGVALUE --> N || Y
		 */
		request.setHEADERONLY(FLAGVALUE.N);

		/*
		 * REQUIRED CONTENTTYPE --> PDF || XML
		 */
		request.setCONTENTTYPE(CONTENTTYPE.PDF);

		JAXBElement<GetCreditNoteRequest> jaxbRequest = new ObjectFactory().createGetCreditNoteRequest(request);
		JAXBElement<GetCreditNoteResponse> response = (JAXBElement<GetCreditNoteResponse>) soapConnector
				.callCreditNoteWebService(jaxbRequest);

		responseList = response.getValue().getCREDITNOTE();
		for (CREDITNOTE creditnote : responseList) {
			Base64Binary content = creditnote.getCONTENT();
			if (creditnote.getHEADER().getSTATUS().equals("CANCEL - CANCEL"))
				util.saveFile(content.getValue(),
						new File(coreConfig.getPathCreditNoteCancel() + creditnote.getID() + ".zip"));
			else if (creditnote.getHEADER().getSTATUS().equals("LOAD - DRAFT"))
				util.saveFile(content.getValue(),
						new File(coreConfig.getPathCreditNoteDraft() + creditnote.getID() + ".zip"));
			else if (creditnote.getHEADER().getSTATUS().equals("LOAD - SUCCEED"))
				util.saveFile(content.getValue(),
						new File(coreConfig.getPathCreditNoteSucceed() + creditnote.getID() + ".zip"));
			else
				System.out.println(creditnote.getID() + " : Credit Note's status was not found");
		}
		try {
			JAXBContext context = JAXBContext.newInstance(GetCreditNoteResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}
