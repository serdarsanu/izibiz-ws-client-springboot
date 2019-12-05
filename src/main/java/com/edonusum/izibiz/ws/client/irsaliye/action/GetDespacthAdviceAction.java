package com.edonusum.izibiz.ws.client.irsaliye.action;

import java.io.File;
import java.util.ArrayList;
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
import com.izibiz.irsaliye.ws.Base64Binary;
import com.izibiz.irsaliye.ws.DESPATCHADVICE;
import com.izibiz.irsaliye.ws.GetDespatchAdviceRequest;
import com.izibiz.irsaliye.ws.GetDespatchAdviceRequest.SEARCHKEY;
import com.izibiz.irsaliye.ws.GetDespatchAdviceResponse;
import com.izibiz.irsaliye.ws.ObjectFactory;
import com.izibiz.irsaliye.ws.REQUESTHEADERType;

@Component
public class GetDespacthAdviceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	MarkDespatchAdviceAction markDespatchAdviceAction;

	@Autowired
	Util util;

	private static List<DESPATCHADVICE> despatchadviceList = new ArrayList<>();
	private REQUESTHEADERType header = new REQUESTHEADERType();
	private GetDespatchAdviceRequest request = new GetDespatchAdviceRequest();
	private SEARCHKEY searchKey = new SEARCHKEY();
	private static int limit = 100;

	public String getDespacthAdvice() {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);
		
		/*NOT REQUIRED*/
		searchKey.setLIMIT(limit);
		searchKey.setFROM(null);
		searchKey.setTO(null);
		searchKey.setID(null);
		searchKey.setUUID(null);
		searchKey.setSENDER(null);
		searchKey.setRECEIVER(null);
		searchKey.setSTARTDATE(null);
		searchKey.setENDDATE(null);
		searchKey.setREADINCLUDED(null);
		searchKey.setDIRECTION(null);
		// Y for despatch summary || N
		request.setHEADERONLY(coreConfig.getHeaderOnlyY());
		
		despatchInbox();
		return null;
	}

	private void despatchInbox() {
		searchKey.setDIRECTION(coreConfig.getDirectionIn());
		request.setSEARCHKEY(searchKey);

		JAXBElement<GetDespatchAdviceRequest> jaxbRequest = new ObjectFactory().createGetDespatchAdviceRequest(request);
		JAXBElement<GetDespatchAdviceResponse> response = (JAXBElement<GetDespatchAdviceResponse>) soapConnector
				.callIrsaliyeWebService(jaxbRequest);

		despatchadviceList.addAll(response.getValue().getDESPATCHADVICE());
		for (DESPATCHADVICE despatchadvice : despatchadviceList) {
			Base64Binary content = despatchadvice.getCONTENT();
			markDespatchAdviceAction.markDespatchAdvice(despatchadvice.getID());
			util.saveFile(content.getValue(),
					new File(coreConfig.getPathDespatchIncoming() + despatchadvice.getID() + ".zip"));
		}
		
		if(despatchadviceList.size() == 100) {
			despatchadviceList.clear();
			getDespacthAdvice();
		}
		try {
			JAXBContext context = JAXBContext.newInstance(GetDespatchAdviceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
	}
}
