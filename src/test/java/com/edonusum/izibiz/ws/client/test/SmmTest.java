package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.smm.action.CancelSmmAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmReportAction;
import com.edonusum.izibiz.ws.client.smm.action.GetSmmStatusAction;
import com.edonusum.izibiz.ws.client.smm.action.SendSmmAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class SmmTest {

	@Autowired
	CancelSmmAction cancelSmmAction;
	
	@Autowired
	GetSmmAction getSmmAction;
	
	@Autowired
	GetSmmReportAction getSmmReportAction;
	
	@Autowired
	GetSmmStatusAction getSmmStatusAction;
	
	@Autowired
	SendSmmAction sendSmmAction;
	
	@Test
	public void cancelSmmTest() {
		assertEquals("", cancelSmmAction.cancelSmm());
	}
	
	@Test
	public void getSmmTest() {
		assertEquals("", getSmmAction.getSmm());
	}
	
	@Test
	public void getSmmReportTest() {
		assertEquals("", getSmmReportAction.getSmmReport());
	}
	
	@Test
	public void getSmmStatusTest() {
		assertEquals("", getSmmStatusAction.getSmmStatus());
	}
	
	@Test
	public void sendSmmActionTest() throws IOException {
		assertEquals("", sendSmmAction.sendSmm());
	}
}
