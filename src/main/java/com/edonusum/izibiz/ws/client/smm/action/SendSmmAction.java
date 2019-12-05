package com.edonusum.izibiz.ws.client.smm.action;

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
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.smm.ws.Base64Binary;
import com.izibiz.smm.ws.FLAGVALUE;
import com.izibiz.smm.ws.ObjectFactory;
import com.izibiz.smm.ws.REQUESTHEADERType;
import com.izibiz.smm.ws.SENDINGTYPE;
import com.izibiz.smm.ws.SMM;
import com.izibiz.smm.ws.SMMPROPERTIES;
import com.izibiz.smm.ws.SendSmmRequest;
import com.izibiz.smm.ws.SendSmmResponse;

@Component
public class SendSmmAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	Util util;
	
	private static String smmID = "";
	private static String newSmmID = "";
	
	public String sendSmm() throws IOException {
		SendSmmRequest request = new SendSmmRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);
		
		SMMPROPERTIES smmProperties = new SMMPROPERTIES();

		/* REQUIRED
		 * SENDINGTYPE --> ELEKTRONIK || KAGIT
		 */
		smmProperties.setSENDINGTYPE(SENDINGTYPE.ELEKTRONIK);
		/*
		 * REQUIRED - if the choice is ELEKTRONIK
		 * Must get SMS or e-mail address
		 * smmProperties.getSMSNUMBER().add(coreConfig.getPhone());
		 */
		smmProperties.setEMAILFLAG(FLAGVALUE.Y);
		smmProperties.getEMAIL().add(coreConfig.getMail());
		request.setSMMPROPERTIES(smmProperties);
		
		String zipPath = coreConfig.getPathSmmDraft() + smmID + ".zip";
		String xmlPath = util.zipExport(zipPath, coreConfig.getPathSmmDraft());
		
		Base64Binary base64 = new Base64Binary();
		base64.setValue(util.xmlToByteArray(xmlPath, smmID));
		base64.setValue(util.changeXmlValue(new String(base64.getValue()), newSmmID, smmID, "ID", coreConfig.getPathSmmDraft()));
		base64.setValue(util.xmlToByteArray(xmlPath, smmID));
		base64.setValue(util.changeXmlValue(new String(base64.getValue()), smmID, newSmmID, "UUID", coreConfig.getPathSmmLoadSucceed()));
		
		SMM smm = new SMM();
		byte[] fileToByteArray1 = FileUtils.readFileToByteArray (new File(coreConfig.getPathSmmLoadSucceed()+ newSmmID+ ".zip"));
		Base64Binary base641 = new Base64Binary();
		base641.setValue(fileToByteArray1);
		smm.setCONTENT(base641);
		smm.setID(newSmmID);
		smm.setUUID(util.uuidChangeXml());
		request.getSMM().add(smm);
		
		JAXBElement<SendSmmRequest> jaxbRequest = new ObjectFactory().createSendSmmRequest(request);
		JAXBElement<SendSmmResponse> response = (JAXBElement<SendSmmResponse>) soapConnector.callSmmWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(SendSmmResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		if (response.getValue().getREQUESTRETURN().getRETURNCODE() == 0) {
			util.fileMove(coreConfig.getPathSmmDraft()+ smmID+ ".zip",
					coreConfig.getPathSmmLoadNew()+ newSmmID+ ".zip");
			util.deleteFile(coreConfig.getPathSmmDraft()+ smmID+ ".zip");
			util.deleteFile(coreConfig.getPathSmmDraft()+ smmID+ ".xml");
			
		}else
			System.out.println("SendSMM NOT WORK");
		return null;
	}
}