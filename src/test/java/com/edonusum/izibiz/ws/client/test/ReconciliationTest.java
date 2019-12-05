package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.mutabakat.action.GetReconciliationStatusAction;
import com.edonusum.izibiz.ws.client.mutabakat.action.SendMailReconciliationAction;
import com.edonusum.izibiz.ws.client.mutabakat.action.SendReconciliationAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class ReconciliationTest {

	@Autowired
	GetReconciliationStatusAction getReconciliationStatusAction;
	
	@Autowired
	SendMailReconciliationAction sendMailReconciliationAction;
	
	@Autowired
	SendReconciliationAction sendReconciliationAction;
	
	@Test
	public void getReconciliationStatusTest() {
		assertEquals("", getReconciliationStatusAction.getReconciliationStatus());
	}
	
	@Test
	public void sendMailReconciliationTest() {
		assertEquals("", sendMailReconciliationAction.sendMailReconciliation());
	}
	
	@Test
	public void sendReconciliationTest() {
		assertEquals("", sendReconciliationAction.sendReconciliation());
	}
}
