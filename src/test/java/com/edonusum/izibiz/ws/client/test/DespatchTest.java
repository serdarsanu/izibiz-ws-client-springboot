package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.irsaliye.action.GetDespacthAdviceAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.GetDespatchAdviceStatusAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.LoadDespatchAdviceAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.MarkDespatchAdviceAction;
import com.edonusum.izibiz.ws.client.irsaliye.action.SendDespatchAdviceAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class DespatchTest {

	@Autowired
	GetDespacthAdviceAction getDespacthAdviceAction;
	
	@Autowired
	GetDespatchAdviceStatusAction getDespatchAdviceStatusAction;
	
	@Autowired
	LoadDespatchAdviceAction loadDespatchAdviceAction;
	
	@Autowired
	MarkDespatchAdviceAction markDespatchAdviceAction;
	
	@Autowired
	SendDespatchAdviceAction sendDespatchAdviceAction;
	
	@Test
	public void getDespacthAdviceTest() {
		assertEquals("", getDespacthAdviceAction.getDespacthAdvice());
	}
	
	@Test
	public void getDespatchAdviceStatusTest() {
		assertEquals("", getDespatchAdviceStatusAction.getDespatchAdviceStatus());
	}
	
	@Test
	public void loadDespatchAdviceTest() {
		assertEquals("", loadDespatchAdviceAction.loadDespatchAdvice());
	}
	
	@Test
	public void sendDespatchAdviceTest() {
		assertEquals("", sendDespatchAdviceAction.sendDespatchAdvice());
	}
}
