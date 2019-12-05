package com.edonusum.izibiz.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edonusum.izibiz.ws.client.archive.action.ArchiveGetInvoiceInfoAction;
import com.edonusum.izibiz.ws.client.archive.action.CancelEArchiveInvoiceAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveInvoiceListAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveInvoiceStatusAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveReportAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEmailEArchiveInvoiceAction;
import com.edonusum.izibiz.ws.client.archive.action.ReadEArchiveReportAction;
import com.edonusum.izibiz.ws.client.archive.action.ReadFromArchiveAction;
import com.edonusum.izibiz.ws.client.auth.action.CheckUserAction;
import com.edonusum.izibiz.ws.client.auth.action.GetGibUserListAction;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.edonusum.izibiz.ws.client.auth.action.LogoutAction;
import com.edonusum.izibiz.ws.client.billing.action.GetBalanceAction;
import com.edonusum.izibiz.ws.client.billing.action.GetCreditAction;
import com.edonusum.izibiz.ws.client.billing.action.GetUsageAction;
import com.edonusum.izibiz.ws.client.creditnote.action.CancelCreditNoteAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteReportAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteStatusAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.GetDespacthAdviceAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.GetDespatchAdviceStatusAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.LoadDespatchAdviceAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.SendDespatchAdviceAction;
//import com.edonusum.izibiz.ws.client.irsaliye.action.LoadDespatchAdviceAction;
//import com.edonusum.izibiz.ws.client.irsaliye.action.SendDespatchAdviceAction;
import com.edonusum.izibiz.ws.client.mutabakat.action.GetReconciliationStatusAction;
import com.edonusum.izibiz.ws.client.mutabakat.action.SendMailReconciliationAction;
import com.edonusum.izibiz.ws.client.mutabakat.action.SendReconciliationAction;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceStatusAction;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceWithTypeAction;
import com.edonusum.izibiz.ws.client.oib.action.LoadInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.MarkInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.SendInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.SendInvoiceResponseWithServerSignAction;
import com.edonusum.izibiz.ws.client.smm.action.CancelSmmAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmReportAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmStatusAction;
import com.edonusum.izibiz.ws.client.smm.action.SendSmmAction;

@SpringBootApplication
public class IzibizClientApplication implements CommandLineRunner {

	@Autowired
	LoginAction loginAction;

	@Autowired
	LogoutAction logoutAction;

	@Autowired
	CheckUserAction checkUserAction;

	@Autowired
	GetGibUserListAction getGibUserListAction;

	@Autowired
	GetInvoiceAction getInvoiceAction;

	@Autowired
	GetInvoiceWithTypeAction getInvoiceWithTypeAction;

	@Autowired
	MarkInvoiceAction markInvoiceAction;

	@Autowired
	GetInvoiceStatusAction getInvoiceStatusAction;

	@Autowired
	SendInvoiceAction sendInvoiceAction;

	@Autowired
	LoadInvoiceAction loadInvoiceAction;

	@Autowired
	GetEArchiveReportAction getEArchiveReportAction;

	@Autowired
	CancelEArchiveInvoiceAction cancelEArchiveInvoiceAction;

	@Autowired
	GetEArchiveInvoiceListAction getEArchiveInvoistListAction;

	@Autowired
	GetEArchiveInvoiceStatusAction getEArchiveInvoiceStatusAction;

	@Autowired
	GetEmailEArchiveInvoiceAction getEmailEArchiveInvoiceAction;

	@Autowired
	ArchiveGetInvoiceInfoAction archiveGetInvoiceInfoAction;

	@Autowired
	GetCreditNoteAction getCreditNoteAction;

	@Autowired
	GetCreditNoteStatusAction getCreditNoteStatusAction;

	@Autowired
	GetCreditNoteReportAction getCreditNoteReportAction;

	@Autowired
	CancelCreditNoteAction cancelCreditNoteAction;

	@Autowired
	GetSmmAction getSmmAction;
	
	@Autowired
	SendSmmAction sendSmmAction;
	
	@Autowired
	GetDespacthAdviceAction getDespacthAdviceAction;
	
	@Autowired
	GetDespatchAdviceStatusAction getDespatchAdviceStatusAction;
	
	@Autowired
	SendReconciliationAction sendReconciliationAction;
	
	@Autowired
	GetReconciliationStatusAction getReconciliationStatusAction;
	
	@Autowired
	SendMailReconciliationAction sendMailReconciliationAction;
	
	@Autowired
	GetBalanceAction getBalanceAction;
	
	@Autowired
	GetCreditAction getCreditAction;
	
	@Autowired
	GetUsageAction getUsageAction;
	
	@Autowired
	GetSmmStatusAction getSmmStatusAction;
	
	@Autowired
	GetSmmReportAction getSmmReportAction;
	
	@Autowired
	SendDespatchAdviceAction sendDespatchAdviceAction;
	
	@Autowired
	CancelSmmAction cancelSMMAction;
	
	@Autowired
	LoadDespatchAdviceAction loadDespatchAdviceAction;

	@Autowired
	SendInvoiceResponseWithServerSignAction sendInvoiceResponseWithServerSignAction;
	
	@Autowired
	ReadEArchiveReportAction readEArchiveReportAction;
	
	@Autowired
	ReadFromArchiveAction readFromArchiveAction;
	
	
	public static void main(String[] args) {
		SpringApplication.run(IzibizClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loginAction.login();
		
	
	}
}