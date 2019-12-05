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
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.irsaliye.ws.Base64Binary;
import com.izibiz.irsaliye.ws.DESPATCHADVICE;
import com.izibiz.irsaliye.ws.LoadDespatchAdviceRequest;
import com.izibiz.irsaliye.ws.LoadDespatchAdviceResponse;
import com.izibiz.irsaliye.ws.ObjectFactory;
import com.izibiz.irsaliye.ws.REQUESTHEADERType;

@Component
public class LoadDespatchAdviceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	Util util;

	/*REQUIRED*/
	private static String despatchUUID = "";
	private static String despatchID = "";
	
	public String loadDespatchAdvice() {
		LoadDespatchAdviceRequest request = new LoadDespatchAdviceRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);
		
		DESPATCHADVICE despatchadvice = new DESPATCHADVICE();
		despatchadvice.setUUID(despatchUUID);
		despatchadvice.setID(despatchID);
		try {
			byte[] fileToByteArray = FileUtils.readFileToByteArray
					(new File(coreConfig.getPathDespatchLoad() + despatchadvice.getID() + ".zip"));
			Base64Binary base64 = new Base64Binary();
			base64.setValue(fileToByteArray);
			despatchadvice.setCONTENT(base64);
		} catch (Exception e) {
			System.out.println("LoadDespatch readFileToByteArray Hatası : " + e);
		}
		request.getDESPATCHADVICE().add(despatchadvice);
		
		JAXBElement<LoadDespatchAdviceRequest> jaxbRequst = new ObjectFactory().createLoadDespatchAdviceRequest(request);
		JAXBElement<LoadDespatchAdviceResponse> response = (JAXBElement<LoadDespatchAdviceResponse>) 
				soapConnector.callIrsaliyeWebService(jaxbRequst);
		
		if(response.getValue().getREQUESTRETURN().getRETURNCODE() == 0) {
			util.fileMove(coreConfig.getPathDespatchLoad() + despatchID+ ".zip",
					coreConfig.getPathDespatchLoadSucceed()+ despatchID+ ".zip");
			util.deleteFile(coreConfig.getPathDespatchLoad()+ despatchID+ ".zip");
		}else
			System.out.println("loadInvoice not work!");
		
		try {
			JAXBContext context = JAXBContext.newInstance(LoadDespatchAdviceResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		return null;
	}
}