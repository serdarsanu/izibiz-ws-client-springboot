package com.edonusum.izibiz.ws.client.oib.action;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edonusum.izibiz.ws.client.CoreConfig;
import com.edonusum.izibiz.ws.client.SOAPConnector;
import com.edonusum.izibiz.ws.client.Util;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.izibiz.oib.ws.Base64Binary;
import com.izibiz.oib.ws.GetInvoiceRequest;
import com.izibiz.oib.ws.GetInvoiceRequest.INVOICESEARCHKEY;
import com.izibiz.oib.ws.GetInvoiceResponse;
import com.izibiz.oib.ws.INVOICE;
import com.izibiz.oib.ws.ObjectFactory;
import com.izibiz.oib.ws.REQUESTHEADERType;

@Component
public class GetInvoiceAction {

	@Autowired
	LoginAction loginAction;

	@Autowired
	CoreConfig coreConfig;

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	MarkInvoiceAction markInvoiceAction;

	@Autowired
	Util util;

	private static List<INVOICE> invoiceList;

	private static GetInvoiceRequest request = new GetInvoiceRequest();
	private static REQUESTHEADERType header = new REQUESTHEADERType();
	private static INVOICESEARCHKEY invoiceSearchKey = new INVOICESEARCHKEY();

	public String getInvoice() throws DatatypeConfigurationException {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);

		// NOT REQUIRED
		invoiceSearchKey.setLIMIT(100);
		invoiceSearchKey.setREADINCLUDED(false);
		invoiceSearchKey.setSTARTDATE(null);
		invoiceSearchKey.setDIRECTION(null);
		invoiceSearchKey.setDRAFTFLAG(null);
		invoiceSearchKey.setENDDATE(null);
		invoiceSearchKey.setFROM(null);
		invoiceSearchKey.setID(null);
		invoiceSearchKey.setRECEIVER(null);
		invoiceSearchKey.setSENDER(null);
		invoiceSearchKey.setTO(null);
		invoiceSearchKey.setUUID(null);

		/*
		 * NOT REQUIRED If the value is not sent or N is sent, invoices are returned
		 * with XML. If Y value is sent, summary of invoices is returned.
		 */
		request.setHEADERONLY(coreConfig.getHeaderOnlyN());

		getInvoiceInbox();

		return null;
	}

	private String getInvoiceInbox() {
		invoiceSearchKey.setDIRECTION(coreConfig.getDirectionIn());
		request.setINVOICESEARCHKEY(invoiceSearchKey);

		JAXBElement<GetInvoiceRequest> jaxbRequest = new ObjectFactory().createGetInvoiceRequest(request);
		JAXBElement<GetInvoiceResponse> response = (JAXBElement<GetInvoiceResponse>) soapConnector
				.callOibWebService(jaxbRequest);

		invoiceList = response.getValue().getINVOICE();
		for (INVOICE invoice : invoiceList) {
			Base64Binary content = invoice.getCONTENT();
			util.saveFile(content.getValue(), new File(coreConfig.getPathInvoiceIncoming() + invoice.getID() + ".zip"));
			markInvoiceAction.markInvoice(invoice.getID());
		}
		if (invoiceList.size() == 100) {
			invoiceList.clear();
			getInvoiceInbox();
		}
		return null;
	}

	public String getInvoiceDraftBoxLoadSucceed(String invoiceID) {
		header.setSESSIONID(loginAction.session);
		header.setAPPLICATIONNAME(coreConfig.getApplicationname());
		header.setCOMPRESSED(coreConfig.getCompressedY());
		request.setREQUESTHEADER(header);
		invoiceSearchKey.setID(invoiceID);
		invoiceSearchKey.setDRAFTFLAG(coreConfig.getDraftFlagY());
		invoiceSearchKey.setLIMIT(100);
		invoiceSearchKey.setREADINCLUDED(true);
		invoiceSearchKey.setDIRECTION(coreConfig.getDirectionOut());
		request.setINVOICESEARCHKEY(invoiceSearchKey);
		request.setHEADERONLY(coreConfig.getHeaderOnlyN());

		JAXBElement<GetInvoiceRequest> jaxbRequest = new ObjectFactory().createGetInvoiceRequest(request);
		JAXBElement<GetInvoiceResponse> response = (JAXBElement<GetInvoiceResponse>) soapConnector
				.callOibWebService(jaxbRequest);

		invoiceList = response.getValue().getINVOICE();
		for (INVOICE invoice : invoiceList) {
			Base64Binary content = invoice.getCONTENT();
			if (invoice.getHEADER().getSTATUS().equals("LOAD - SUCCEED")) {
				util.saveFile(content.getValue(),
						new File(coreConfig.getPathInvoiceLoadSucceed() + invoice.getID() + ".zip"));
			}
		}
		return null;
	}

////SendBox
////DraftBoxLoadIdAssignedAndFaild
// private String getInvoiceSendBox() throws DatatypeConfigurationException {
//	invoiceSearchKey.setDIRECTION(coreConfig.getDirectionOut());
//	request.setINVOICESEARCHKEY(invoiceSearchKey);
//
//	JAXBElement<GetInvoiceRequest> jaxbRequest = new ObjectFactory().createGetInvoiceRequest(request);
//	JAXBElement<GetInvoiceResponse> response = (JAXBElement<GetInvoiceResponse>) soapConnector
//			.callOibWebService(jaxbRequest);
//
//	
//	invoiceList = response.getValue().getINVOICE();
//	for (INVOICE invoice : invoiceList) {
//		Base64Binary content = invoice.getCONTENT();
//		util.saveFile(content.getValue(), new File(coreConfig.getPathInvoiceSend() + invoice.getID() + ".zip"));
//	}
//	return null;
//}
//
//	private String getInvoiceDraftBoxLoadIdAssignedAndFaild() {
//		invoiceSearchKey.setDRAFTFLAG(coreConfig.getDraftFlagY());
//		request.setINVOICESEARCHKEY(invoiceSearchKey);
//
//		JAXBElement<GetInvoiceRequest> jaxbRequest = new ObjectFactory().createGetInvoiceRequest(request);
//		JAXBElement<GetInvoiceResponse> response = (JAXBElement<GetInvoiceResponse>) soapConnector
//				.callOibWebService(jaxbRequest);
//
//		invoiceList = response.getValue().getINVOICE();
//		for (INVOICE invoice : invoiceList) {
//			Base64Binary content = invoice.getCONTENT();
//				if (invoice.getHEADER().getSTATUS().equals("LOAD - ID_ASSIGNED")) {
//					util.saveFile(content.getValue(),
//							new File(coreConfig.getPathInvoiceLoadIdAssigned() + invoice.getID() + ".zip"));
//					markInvoiceAction.markInvoice(invoice.getID());
//					System.out.println("ID : " + invoice.getID());
//				} else if (invoice.getHEADER().getSTATUS().equals("LOAD - FAILED")) {
//					util.saveFile(content.getValue(),
//							new File(coreConfig.getPathInvoiceLoadFailed() + invoice.getID() + ".zip"));
//					markInvoiceAction.markInvoice(invoice.getID());
//					System.out.println("ID : " + invoice.getID());
//				}
//		}
//		return null;
//	}

}