package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.billing.action.GetBalanceAction;
import com.edonusum.izibiz.ws.client.billing.action.GetCreditAction;
import com.edonusum.izibiz.ws.client.billing.action.GetUsageAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class BillingTest {

	@Autowired
	GetBalanceAction getBalanceAction;
	
	@Autowired
	GetCreditAction getCreditAction;
	
	@Autowired
	GetUsageAction getUsageAction;
	
	public void getBalanceTest() {
		assertEquals("", getBalanceAction.getBalance());
	}
	
	public void getCreditTest() {
		assertEquals("", getCreditAction.getCredit());
	}
	
	public void getUsageTest() {
		assertEquals("", getUsageAction.getUsage());
	}
	
}
