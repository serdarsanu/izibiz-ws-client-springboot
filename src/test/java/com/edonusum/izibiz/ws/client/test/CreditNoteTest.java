package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.creditnote.action.CancelCreditNoteAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteReportAction;
import com.edonusum.izibiz.ws.client.creditnote.action.GetCreditNoteStatusAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class CreditNoteTest {

	@Autowired
	CancelCreditNoteAction cancelCreditNoteAction;
	
	@Autowired
	GetCreditNoteAction getCreditNoteAction;
	
	@Autowired
	GetCreditNoteReportAction getCreditNoteReportAction;
	
	@Autowired
	GetCreditNoteStatusAction getCreditNoteStatusAction;
	
	@Test
	public void cancelCreditNoteTest() {
		assertEquals("", cancelCreditNoteAction.cancelCreditNote());
	}
	
	@Test
	public void getCreditNoteTest() throws IOException {
		assertEquals("", getCreditNoteAction.getCreditNote());
	}
	
	@Test
	public void getCreditNoteReportTest() {
		assertEquals("", getCreditNoteReportAction.getCreditNoteReport());
	}
	
	@Test
	public void getCreditNoteStatusTest() {
		assertEquals("", getCreditNoteStatusAction.getCreditNoteStatus());
	}
}
