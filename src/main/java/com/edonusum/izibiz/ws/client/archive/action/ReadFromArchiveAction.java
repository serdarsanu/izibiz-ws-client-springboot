package com.edonusum.izibiz.ws.client.archive.action;

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
import com.izibiz.archive.ws.ArchiveInvoiceReadRequest;
import com.izibiz.archive.ws.ArchiveInvoiceReadResponse;
import com.izibiz.archive.ws.ObjectFactory;
import com.izibiz.archive.ws.REQUESTHEADERType;

@Component
public class ReadFromArchiveAction {

	@Autowired
	LoginAction loginAction;
	
	@Autowired
	SOAPConnector soapConnector;
	
	@Autowired
	CoreConfig coreConfig;
	
	@Autowired
	Util util;
	
	private String archiveInvoiceUUID = "";
	
	public String readFromArchive() {
		ArchiveInvoiceReadRequest request = new ArchiveInvoiceReadRequest();
		
		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setCOMPRESSED(coreConfig.getCompressedN());
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);
		
		request.setINVOICEID(archiveInvoiceUUID);
//		request.setPORTALDIRECTION(coreConfig.getTypeHTML());
		request.setPORTALDIRECTION(coreConfig.getDirectionOut());
		
		JAXBElement<ArchiveInvoiceReadRequest> jaxbRequest = new ObjectFactory().createArchiveInvoiceReadRequest(request);
		JAXBElement<ArchiveInvoiceReadResponse> response = (JAXBElement<ArchiveInvoiceReadResponse>) 
				soapConnector.callArchiveWebService(jaxbRequest);
		
		try {
			JAXBContext context = JAXBContext.newInstance(ArchiveInvoiceReadResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + response.getValue().getERRORTYPE().getERRORSHORTDES());
		}
		
		return null;
	}
}