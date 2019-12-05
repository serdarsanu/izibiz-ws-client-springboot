package com.edonusum.izibiz.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class SOAPConnector extends WebServiceGatewaySupport {

	@Autowired
	private CoreConfig config;

	// Jaxb2Marshaller
	private static Jaxb2Marshaller marshallerArchive;
	private static Jaxb2Marshaller marshallerAuth;
	private static Jaxb2Marshaller marshallerBilling;
	private static Jaxb2Marshaller marshallerCreditNote;
	private static Jaxb2Marshaller marshallerIrsaliye;
	private static Jaxb2Marshaller marshallerMutabakat;
	private static Jaxb2Marshaller marshallerOib;
	private static Jaxb2Marshaller marshallerSmm;
	private static Jaxb2Marshaller marshallerZreport;

	// ARCHIVE
	public Object callArchiveWebService(Object request) {
		getWebServiceTemplate().setMarshaller(archiveMarshaller());
		getWebServiceTemplate().setUnmarshaller(archiveMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getArchiveWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller archiveMarshaller() {
		marshallerArchive = new Jaxb2Marshaller();
		marshallerArchive.setContextPaths("com.izibiz.archive.ws");
		return marshallerArchive;
	}

	// AUTH
	public Object callAuthWebService(Object request) {
		getWebServiceTemplate().setMarshaller(authMarshaller());
		getWebServiceTemplate().setUnmarshaller(authMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getAuthWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller authMarshaller() {
		marshallerAuth = new Jaxb2Marshaller();
		marshallerAuth.setContextPaths("com.izibiz.auth.ws");
		return marshallerAuth;
	}

	// BILLING
	public Object callBillingWebService(Object request) {
		getWebServiceTemplate().setMarshaller(billingMarshaller());
		getWebServiceTemplate().setUnmarshaller(billingMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getBillingWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller billingMarshaller() {
		marshallerBilling = new Jaxb2Marshaller();
		marshallerBilling.setContextPaths("com.izibiz.billing.ws");
		return marshallerBilling;
	}

	// CREDITNOTE
	public Object callCreditNoteWebService(Object request) {
		getWebServiceTemplate().setMarshaller(creditNoteMarshaller());
		getWebServiceTemplate().setUnmarshaller(creditNoteMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getCreditNoteWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller creditNoteMarshaller() {
		marshallerCreditNote = new Jaxb2Marshaller();
		marshallerCreditNote.setContextPaths("com.izibiz.creditnote.ws");
		return marshallerCreditNote;
	}

	// IRSALIYE
	public Object callIrsaliyeWebService(Object request) {
		getWebServiceTemplate().setMarshaller(irsaliyeMarshaller());
		getWebServiceTemplate().setUnmarshaller(irsaliyeMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getIrsaliyeWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller irsaliyeMarshaller() {
		marshallerIrsaliye = new Jaxb2Marshaller();
		marshallerIrsaliye.setContextPaths("com.izibiz.irsaliye.ws");
		return marshallerIrsaliye;
	}

	// MUTABAKAT
	public Object callMutabakatWebService(Object request) {
		getWebServiceTemplate().setMarshaller(mutabakatMarshaller());
		getWebServiceTemplate().setUnmarshaller(mutabakatMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getMutabakatWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller mutabakatMarshaller() {
		marshallerMutabakat = new Jaxb2Marshaller();
		marshallerMutabakat.setContextPaths("com.izibiz.mutabakat.ws");
		return marshallerMutabakat;
	}

	// OIB
	public Object callOibWebService(Object request) {
		getWebServiceTemplate().setMarshaller(jaxOibMarshaller());
		getWebServiceTemplate().setUnmarshaller(jaxOibMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getOibWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller jaxOibMarshaller() {
		marshallerOib = new Jaxb2Marshaller();
		marshallerOib.setContextPaths("com.izibiz.oib.ws");
		return marshallerOib;
	}

	// SMM
	public Object callSmmWebService(Object request) {
		getWebServiceTemplate().setMarshaller(jaxSmmMarshaller());
		getWebServiceTemplate().setUnmarshaller(jaxSmmMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getSmmWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller jaxSmmMarshaller() {
		marshallerSmm = new Jaxb2Marshaller();
		marshallerSmm.setContextPaths("com.izibiz.smm.ws");
		return marshallerSmm;
	}

	// ZREPORT
	public Object callZreportWebService(Object request) {
		getWebServiceTemplate().setMarshaller(jaxZreportMarshaller());
		getWebServiceTemplate().setUnmarshaller(jaxZreportMarshaller());
		getWebServiceTemplate().setDefaultUri(config.getZreportWSAddress());
		return getWebServiceTemplate().marshalSendAndReceive(request);
	}

	public Jaxb2Marshaller jaxZreportMarshaller() {
		marshallerZreport = new Jaxb2Marshaller();
		marshallerZreport.setContextPaths("com.izibiz.zreport.ws");
		return marshallerZreport;
	}
}
