package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceStatusAction;
import com.edonusum.izibiz.ws.client.oib.action.GetInvoiceWithTypeAction;
import com.edonusum.izibiz.ws.client.oib.action.LoadInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.SendInvoiceAction;
import com.edonusum.izibiz.ws.client.oib.action.SendInvoiceResponseWithServerSignAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class OibTest {

	@Autowired
	GetInvoiceAction getInvoiceAction;
	
	@Autowired
	GetInvoiceStatusAction getInvoiceStatusAction;
	
	@Autowired
	GetInvoiceWithTypeAction getInvoiceWithTypeAction;

	@Autowired
	LoadInvoiceAction loadInvoiceAction;
	
	@Autowired
	SendInvoiceAction sendInvoiceAction;
	
	@Autowired
	SendInvoiceResponseWithServerSignAction sendInvoiceResponseWithServerSignAction;
	
	@Test
	public void getInvoiceTest() throws DatatypeConfigurationException {
			assertEquals("", getInvoiceAction.getInvoice());
	}
	
	@Test
	public void getInvoiceWithTypeTest() {
		assertEquals("", getInvoiceWithTypeAction.getInvoiceWithType());
	}
	
	@Test
	public void loadInvoiceActionTest() {
		assertEquals("", loadInvoiceAction.loadInvoice());
	}
	
	
	
	@Test
	public void sendInvoiceActionTest() throws IOException {
		assertEquals("", sendInvoiceAction.sendInvoice());
	}
	
	@Test
	public void sendInvoiceResponseWithServerSignTest() {
		assertEquals("", sendInvoiceResponseWithServerSignAction.sendInvoiceResponseWithServerSign());
	}
}
