package com.edonusum.izibiz.ws.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoreConfig {

	//LOGIN CONFIG
	@Value("${app.izibiz.username}")
	private String defaultSession;

	@Value("${app.izibiz.username}")
	private String username;

	@Value("${app.izibiz.user.password}")
	private String password;

	
	//WSDL ADSRESS
	@Value("${app.izibiz.client.archive.ws.address}")
	private String archiveWSAddress;

	@Value("${app.izibiz.client.auth.ws.address}")
	private String authWSAddress;
	
	@Value("${app.izibiz.client.billing.ws.address}")
	private String billingWSAddress;

	@Value("${app.izibiz.client.creditnote.ws.address}")
	private String creditNoteWSAddress;

	@Value("${app.izibiz.client.irsaliye.ws.address}")
	private String irsaliyeWSAddress;
	
	@Value("${app.izibiz.client.mutabakat.ws.address}")
	private String mutabakatWSAddress;

	@Value("${app.izibiz.client.oib.ws.address}")
	private String oibWSAddress;

	@Value("${app.izibiz.client.smm.ws.address}")
	private String smmWSAddress;
	
	@Value("${app.izibiz.client.zreport.ws.address}")
	private String zreportWSAddress;

	
	//APP CONFIG
	@Value("${app.izibiz.applicationname}")
	private String applicationname;

	@Value("${app.izibiz.compressedN}")
	private String compressedN;

	@Value("${app.izibiz.compressedY}")
	private String compressedY;

	@Value("${app.izibiz.directionIn}")
	private String directionIn;

	@Value("${app.izibiz.directionOut}")
	private String directionOut;
	
	@Value("${app.izibiz.documenttypeDespatchadvice}")
	private String documenttypeDespatchadvice;
	
	@Value("${app.izibiz.documenttypeInvoice}")
	private String documenttypeInvoice;

	@Value("${app.izibiz.draftFlagN}")
	private String draftFlagN;

	@Value("${app.izibiz.draftFlagY}")
	private String draftFlagY;

	@Value("${app.izibiz.headerOnlyN}")
	private String headerOnlyN;

	@Value("${app.izibiz.headerOnlyY}")
	private String headerOnlyY;
	
	@Value("${app.izibiz.izibizReceiverMail}")
	private String izibizReceiverMail;
	
	@Value("${app.izibiz.izibizSenderMail}")
	private String izibizSenderMail;
	
	@Value("${app.izibiz.izibizVKN}")
	private String izibizVKN;

	@Value("${app.izibiz.mail}")
	private String mail;
	
	@Value("${app.izibiz.markRead}")
	private String markRead;

	@Value("${app.izibiz.markUnread}")
	private String markUnread;

	@Value("${app.izibiz.note}")
	private String note;
	
	@Value("${app.izibiz.phone}")
	private String phone;
	
	@Value("${app.izibiz.reportstatusflagY}")
	private String reportStatusFlagY;
	
	@Value("${app.izibiz.reportstatusflagN}")
	private String reportStatusFlagN;
	
	@Value("${app.izibiz.statusKabul}")
	private String statusKabul;

	@Value("${app.izibiz.statusRed}")
	private String statusRed;

	@Value("${app.izibiz.typeHTML}")
	private String typeHTML;

	@Value("${app.izibiz.typePDF}")
	private String typePDF;

	@Value("${app.izibiz.typeXml}")
	private String typeXml;

	
	// FILEPATH
	@Value("${app.izibiz.pathCreditNoteCancel}")
	private String pathCreditNoteCancel;
	
	@Value("${app.izibiz.pathCreditNoteDraft}")
	private String pathCreditNoteDraft;
	
	@Value("${app.izibiz.pathCreditNoteSucceed}")
	private String pathCreditNoteSucceed;

	@Value("${app.izibiz.pathEArchive}")
	private String pathEArchive;

	@Value("${app.izibiz.pathDespatchIncoming}")
	private String pathDespatchIncoming;

	@Value("${app.izibiz.pathDespatchLoad}")
	private String pathDespatchLoad;

	@Value("${app.izibiz.pathDespatchLoadFailed}")
	private String pathDespatchLoadFailed;

	@Value("${app.izibiz.pathDespatchLoadSucceed}")
	private String pathDespatchLoadSucceed;

	@Value("${app.izibiz.pathDespatchLoadWaitIdAssign}")
	private String pathDespatchLoadWaitIdAssign;
	
	@Value("${app.izibiz.pathDespatchSend}")
	private String pathDespatchSend;

	@Value("${app.izibiz.pathInvoiceIncoming}")
	private String pathInvoiceIncoming;

	@Value("${app.izibiz.pathInvoiceLoadIdAssigned}")
	private String pathInvoiceLoadIdAssigned;

	@Value("${app.izibiz.pathInvoiceLoadFailed}")
	private String pathInvoiceLoadFailed;

	@Value("${app.izibiz.pathInvoiceLoadSucceed}")
	private String pathInvoiceLoadSucceed;

	@Value("${app.izibiz.pathInvoiceLoad}")
	private String pathInvoiceLoad;
	
	@Value("${app.izibiz.pathInvoiceSend}")
	private String pathInvoiceSend;

	@Value("${app.izibiz.pathSmmCancel}")
	private String pathSmmCancel;

	@Value("${app.izibiz.pathSmmDraft}")
	private String pathSmmDraft;

	@Value("${app.izibiz.pathSmmLoadNew}")
	private String pathSmmLoadNew;

	@Value("${app.izibiz.pathSmmLoadSucceed}")
	private String pathSmmLoadSucceed;
	
	
	//GETTER SETTER
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getArchiveWSAddress() {
		return archiveWSAddress;
	}

	public void setArchiveWSAddress(String archiveWSAddress) {
		this.archiveWSAddress = archiveWSAddress;
	}

	public String getAuthWSAddress() {
		return authWSAddress;
	}

	public void setAuthWSAddress(String authWSAddress) {
		this.authWSAddress = authWSAddress;
	}

	public String getBillingWSAddress() {
		return billingWSAddress;
	}

	public void setBillingWSAddress(String billingWSAddress) {
		this.billingWSAddress = billingWSAddress;
	}

	public String getCreditNoteWSAddress() {
		return creditNoteWSAddress;
	}

	public void setCreditNoteWSAddress(String creditNoteWSAddress) {
		this.creditNoteWSAddress = creditNoteWSAddress;
	}

	public String getIrsaliyeWSAddress() {
		return irsaliyeWSAddress;
	}

	public void setIrsaliyeWSAddress(String irsaliyeWSAddress) {
		this.irsaliyeWSAddress = irsaliyeWSAddress;
	}

	public String getMutabakatWSAddress() {
		return mutabakatWSAddress;
	}

	public void setMutabakatWSAddress(String mutabakatWSAddress) {
		this.mutabakatWSAddress = mutabakatWSAddress;
	}

	public String getOibWSAddress() {
		return oibWSAddress;
	}

	public void setOibWSAddress(String oibWSAddress) {
		this.oibWSAddress = oibWSAddress;
	}

	public String getSmmWSAddress() {
		return smmWSAddress;
	}

	public void setSmmWSAddress(String smmWSAddress) {
		this.smmWSAddress = smmWSAddress;
	}

	public String getZreportWSAddress() {
		return zreportWSAddress;
	}

	public void setZreportWSAddress(String zreportWSAddress) {
		this.zreportWSAddress = zreportWSAddress;
	}

	public String getDefaultSession() {
		return defaultSession;
	}

	public void setDefaultSession(String defaultSession) {
		this.defaultSession = defaultSession;
	}

	public String getApplicationname() {
		return applicationname;
	}

	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
	}

	public String getCompressedN() {
		return compressedN;
	}

	public void setCompressedN(String compressedN) {
		this.compressedN = compressedN;
	}

	public String getCompressedY() {
		return compressedY;
	}

	public void setCompressedY(String compressedY) {
		this.compressedY = compressedY;
	}

	public String getDirectionIn() {
		return directionIn;
	}

	public void setDirectionIn(String directionIn) {
		this.directionIn = directionIn;
	}

	public String getDirectionOut() {
		return directionOut;
	}

	public void setDirectionOut(String directionOut) {
		this.directionOut = directionOut;
	}

	public String getDraftFlagN() {
		return draftFlagN;
	}

	public void setDraftFlagN(String draftFlagN) {
		this.draftFlagN = draftFlagN;
	}

	public String getDraftFlagY() {
		return draftFlagY;
	}

	public void setDraftFlagY(String draftFlagY) {
		this.draftFlagY = draftFlagY;
	}

	public String getHeaderOnlyN() {
		return headerOnlyN;
	}

	public void setHeaderOnlyN(String headerOnlyN) {
		this.headerOnlyN = headerOnlyN;
	}

	public String getHeaderOnlyY() {
		return headerOnlyY;
	}

	public void setHeaderOnlyY(String headerOnlyY) {
		this.headerOnlyY = headerOnlyY;
	}

	public String getMarkRead() {
		return markRead;
	}

	public void setMarkRead(String markRead) {
		this.markRead = markRead;
	}

	public String getMarkUnread() {
		return markUnread;
	}

	public void setMarkUnread(String markUnread) {
		this.markUnread = markUnread;
	}

	public String getStatusKabul() {
		return statusKabul;
	}

	public void setStatusKabul(String statusKabul) {
		this.statusKabul = statusKabul;
	}

	public String getStatusRed() {
		return statusRed;
	}

	public void setStatusRed(String statusRed) {
		this.statusRed = statusRed;
	}

	public String getTypeHTML() {
		return typeHTML;
	}

	public void setTypeHTML(String typeHTML) {
		this.typeHTML = typeHTML;
	}

	public String getTypePDF() {
		return typePDF;
	}

	public void setTypePDF(String typePDF) {
		this.typePDF = typePDF;
	}

	public String getTypeXml() {
		return typeXml;
	}

	public void setTypeXml(String typeXml) {
		this.typeXml = typeXml;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPathCreditNoteCancel() {
		return pathCreditNoteCancel;
	}

	public void setPathCreditNoteCancel(String pathCreditNoteCancel) {
		this.pathCreditNoteCancel = pathCreditNoteCancel;
	}

	public String getPathCreditNoteDraft() {
		return pathCreditNoteDraft;
	}

	public void setPathCreditNoteDraft(String pathCreditNoteDraft) {
		this.pathCreditNoteDraft = pathCreditNoteDraft;
	}

	public String getPathCreditNoteSucceed() {
		return pathCreditNoteSucceed;
	}

	public void setPathCreditNoteSucceed(String pathCreditNoteSucceed) {
		this.pathCreditNoteSucceed = pathCreditNoteSucceed;
	}

	public String getPathEArchive() {
		return pathEArchive;
	}

	public void setPathEArchive(String pathEArchive) {
		this.pathEArchive = pathEArchive;
	}

	public String getPathSmmCancel() {
		return pathSmmCancel;
	}

	public void setPathSmmCancel(String pathSmmCancel) {
		this.pathSmmCancel = pathSmmCancel;
	}

	public String getPathSmmDraft() {
		return pathSmmDraft;
	}

	public void setPathSmmDraft(String pathSmmDraft) {
		this.pathSmmDraft = pathSmmDraft;
	}

	public String getPathSmmLoadNew() {
		return pathSmmLoadNew;
	}

	public void setPathSmmLoadNew(String pathSmmLoadNew) {
		this.pathSmmLoadNew = pathSmmLoadNew;
	}

	public String getPathSmmLoadSucceed() {
		return pathSmmLoadSucceed;
	}

	public void setPathSmmLoadSucceed(String pathSmmLoadSucceed) {
		this.pathSmmLoadSucceed = pathSmmLoadSucceed;
	}

	public String getIzibizVKN() {
		return izibizVKN;
	}

	public void setIzibizVKN(String izibizVKN) {
		this.izibizVKN = izibizVKN;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReportStatusFlagY() {
		return reportStatusFlagY;
	}

	public void setReportStatusFlagY(String reportStatusFlagY) {
		this.reportStatusFlagY = reportStatusFlagY;
	}

	public String getReportStatusFlagN() {
		return reportStatusFlagN;
	}

	public void setReportStatusFlagN(String reportStatusFlagN) {
		this.reportStatusFlagN = reportStatusFlagN;
	}

	public String getDocumenttypeDespatchadvice() {
		return documenttypeDespatchadvice;
	}

	public void setDocumenttypeDespatchadvice(String documenttypeDespatchadvice) {
		this.documenttypeDespatchadvice = documenttypeDespatchadvice;
	}

	public String getDocumenttypeInvoice() {
		return documenttypeInvoice;
	}

	public void setDocumenttypeInvoice(String documenttypeInvoice) {
		this.documenttypeInvoice = documenttypeInvoice;
	}

	public String getPathDespatchIncoming() {
		return pathDespatchIncoming;
	}

	public void setPathDespatchIncoming(String pathDespatchIncoming) {
		this.pathDespatchIncoming = pathDespatchIncoming;
	}

	public String getPathDespatchLoad() {
		return pathDespatchLoad;
	}

	public void setPathDespatchLoad(String pathDespatchLoad) {
		this.pathDespatchLoad = pathDespatchLoad;
	}

	public String getPathDespatchLoadFailed() {
		return pathDespatchLoadFailed;
	}

	public void setPathDespatchLoadFailed(String pathDespatchLoadFailed) {
		this.pathDespatchLoadFailed = pathDespatchLoadFailed;
	}

	public String getPathDespatchLoadSucceed() {
		return pathDespatchLoadSucceed;
	}

	public void setPathDespatchLoadSucceed(String pathDespatchLoadSucceed) {
		this.pathDespatchLoadSucceed = pathDespatchLoadSucceed;
	}

	public String getPathDespatchLoadWaitIdAssign() {
		return pathDespatchLoadWaitIdAssign;
	}

	public void setPathDespatchLoadWaitIdAssign(String pathDespatchLoadWaitIdAssign) {
		this.pathDespatchLoadWaitIdAssign = pathDespatchLoadWaitIdAssign;
	}

	public String getPathInvoiceIncoming() {
		return pathInvoiceIncoming;
	}

	public void setPathInvoiceIncoming(String pathInvoiceIncoming) {
		this.pathInvoiceIncoming = pathInvoiceIncoming;
	}

	public String getPathInvoiceLoadIdAssigned() {
		return pathInvoiceLoadIdAssigned;
	}

	public void setPathInvoiceLoadIdAssigned(String pathInvoiceLoadIdAssigned) {
		this.pathInvoiceLoadIdAssigned = pathInvoiceLoadIdAssigned;
	}

	public String getPathInvoiceLoadFailed() {
		return pathInvoiceLoadFailed;
	}

	public void setPathInvoiceLoadFailed(String pathInvoiceLoadFailed) {
		this.pathInvoiceLoadFailed = pathInvoiceLoadFailed;
	}

	public String getPathInvoiceLoadSucceed() {
		return pathInvoiceLoadSucceed;
	}

	public void setPathInvoiceLoadSucceed(String pathInvoiceLoadSucceed) {
		this.pathInvoiceLoadSucceed = pathInvoiceLoadSucceed;
	}

	public String getPathInvoiceLoad() {
		return pathInvoiceLoad;
	}

	public void setPathInvoiceLoad(String pathInvoiceLoad) {
		this.pathInvoiceLoad = pathInvoiceLoad;
	}

	public String getPathInvoiceSend() {
		return pathInvoiceSend;
	}

	public void setPathInvoiceSend(String pathInvoiceSend) {
		this.pathInvoiceSend = pathInvoiceSend;
	}

	public String getPathDespatchSend() {
		return pathDespatchSend;
	}

	public void setPathDespatchSend(String pathDespatchSend) {
		this.pathDespatchSend = pathDespatchSend;
	}

	public String getIzibizReceiverMail() {
		return izibizReceiverMail;
	}

	public void setIzibizReceiverMail(String izibizReceiverMail) {
		this.izibizReceiverMail = izibizReceiverMail;
	}

	public String getIzibizSenderMail() {
		return izibizSenderMail;
	}

	public void setIzibizSenderMail(String izibizSenderMail) {
		this.izibizSenderMail = izibizSenderMail;
	}

	
	
}
