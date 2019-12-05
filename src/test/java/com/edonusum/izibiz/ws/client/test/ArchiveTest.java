package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.archive.action.ArchiveGetInvoiceInfoAction;
import com.edonusum.izibiz.ws.client.archive.action.CancelEArchiveInvoiceAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveInvoiceListAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveInvoiceStatusAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEArchiveReportAction;
import com.edonusum.izibiz.ws.client.archive.action.GetEmailEArchiveInvoiceAction;
import com.edonusum.izibiz.ws.client.archive.action.ReadEArchiveReportAction;
import com.edonusum.izibiz.ws.client.archive.action.ReadFromArchiveAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class ArchiveTest {

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
	ReadFromArchiveAction readFromArchiveAction;
	
	@Autowired
	ReadEArchiveReportAction readEArchiveReportAction;
	
	@Test
	public void getEArchiveReportTest() {
		assertEquals("", getEArchiveReportAction.getEArchiveReport());
	}
	
	@Test
	public void cancelEArchiveInvoiceTest() {
		assertEquals("", cancelEArchiveInvoiceAction.cancelEArchiveInvoice());
	}
	
	@Test
	public void getEArchiveInvoistListTest() {
		assertEquals("", getEArchiveInvoistListAction.getEArchiveInvoiceList());
	}
	
	@Test
	public void getEArchiveInvoiceStatusTest() {
		assertEquals("", getEArchiveInvoiceStatusAction.getEArchiveInvoiceStatus());
	}
	
	@Test
	public void getEmailEArchiveInvoiceTest() {
		assertEquals("", getEmailEArchiveInvoiceAction.getEmailEArchiveInvoice());
	}
	
	@Test
	public void archiveGetInvoiceInfoTest() {
		assertEquals("", archiveGetInvoiceInfoAction.archiveGetInvoiceInfo());
	}
	
	@Test
	public void readFromArchiveTest() {
		assertEquals("", readFromArchiveAction.readFromArchive());
	}
	
	@Test
	public void readEArchiveReportTest() {
		assertEquals("", readEArchiveReportAction.readEArchiveReport());
	}
	
}
