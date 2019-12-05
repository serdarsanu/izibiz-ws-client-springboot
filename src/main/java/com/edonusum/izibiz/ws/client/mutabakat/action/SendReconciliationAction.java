package com.edonusum.izibiz.ws.client.mutabakat.action;

import java.math.BigDecimal;

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
import com.izibiz.mutabakat.ws.CMTYPE;
import com.izibiz.mutabakat.ws.CURRENCYCODE;
import com.izibiz.mutabakat.ws.ObjectFactory;
import com.izibiz.mutabakat.ws.RECONCILIATIONTYPE;
import com.izibiz.mutabakat.ws.REQUESTHEADERType;
import com.izibiz.mutabakat.ws.SendReconciliationRequest;
import com.izibiz.mutabakat.ws.SendReconciliationRequest.RECONCILIATION;
import com.izibiz.mutabakat.ws.SendReconciliationResponse;

@Component
public class SendReconciliationAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	Util util;

	/* REQUIRED 
	 * CMDATE --> YYYY-MM-DD
	 */
	private static String commercialName = "";
	private static String customerAddress = "";
	private static BigDecimal bigDecimal = new BigDecimal(0);
	private static String cmDate = "";

	public String sendReconciliation() {
		SendReconciliationRequest request = new SendReconciliationRequest();

		REQUESTHEADERType header = new REQUESTHEADERType();
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		request.setREQUESTHEADER(header);

		RECONCILIATION reconciliation = new RECONCILIATION();
		/* REQUIRED */
		reconciliation.setEMAIL(coreConfig.getMail());
		reconciliation.setCURRENCYCODE(CURRENCYCODE.TRY);
		reconciliation.setTYPE(RECONCILIATIONTYPE.CM);
		reconciliation.setCUSTOMERIDENTIFIER(coreConfig.getIzibizVKN());
		reconciliation.setCOMMERCIALNAME(commercialName);
		reconciliation.setCUSTOMERADDRESS(customerAddress);
		reconciliation.setCMAMOUNT(bigDecimal);
		reconciliation.setCMDATE(cmDate);
		reconciliation.setCMAMOUNTTYPE(CMTYPE.A);
		reconciliation.setUUID(util.createUUID());

		/* NOT REQUIRED */
		reconciliation.setTELEPHONENO(coreConfig.getPhone());
		reconciliation.setNOTE(coreConfig.getNote());

		request.getRECONCILIATION().add(reconciliation);

		JAXBElement<SendReconciliationRequest> jaxbRequest = new ObjectFactory()
				.createSendReconciliationRequest(request);
		JAXBElement<SendReconciliationResponse> response = (JAXBElement<SendReconciliationResponse>) soapConnector
				.callMutabakatWebService(jaxbRequest);

		try {
			JAXBContext context = JAXBContext.newInstance(SendReconciliationResponse.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(response, System.out);
		} catch (JAXBException e) {
			System.out.println("Response Error : " + e);
		}
		return null;
	}
}