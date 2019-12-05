package com.edonusum.izibiz.ws.client.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edonusum.izibiz.ws.client.IzibizClientApplication;
import com.edonusum.izibiz.ws.client.auth.action.CheckUserAction;
import com.edonusum.izibiz.ws.client.auth.action.LoginAction;
import com.edonusum.izibiz.ws.client.auth.action.LogoutAction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IzibizClientApplication.class)
public class AuthTest {

	@Autowired
	CheckUserAction checkUserAction;
	
	@Autowired
	LoginAction loginAction;
	
	@Autowired
	LogoutAction logoutAction;
	
	@Test
	public void checkUserTest() {
		assertEquals("", checkUserAction.checkUser());
	}
	
	@Test
	public void loginTest() {
		assertEquals("", loginAction.login());
	}
	
	@Test
	public void logoutTest() {
		assertEquals("", logoutAction.logout());
	}
}
