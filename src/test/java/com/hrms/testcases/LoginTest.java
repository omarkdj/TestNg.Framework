package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test()
	public void validAdminLogin() {
		// LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
 
		// DashboardPageElements dashboard = new DashboardPageElements();
		String expectedUser = "Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
	}

	@Test()
	public void invalidPasswordLogin() {
		// LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "uiuguig");
		click(login.loginBtn);

		String expected = "Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	@Test(enabled = true)
	public void emptyUsernameLogin() {
		// LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		String expected = "Username cannot be empty";

		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

}












//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.pages.DashboardPageElements;
//import com.pages.LoginPageElements;
//import com.utils.CommonMethods;
//import com.utils.ConfigsReader;
//
//public class LoginTest extends CommonMethods {
//
//	@BeforeMethod
//	public void openBrowser () {
//		setUp();
//	}
//	
//	@AfterMethod 
//	public void closeBrowser() {
//		tearDown();
//	}
//	
//	@Test
//	public void validAdminLogin() {
//		 LoginPageElements login = new LoginPageElements();
//		 sendText(login.username, ConfigsReader.getProperty("username"));
//		 sendText(login.password, ConfigsReader.getProperty("password"));
//		 click(login.loginBtn);
//		 
//		 DashboardPageElements  db= new DashboardPageElements ();
//		  String expectedUser = "Welcome Admin";
//		  String actualUser = db.welcome.getText();
//		  
//		 Assert.assertEquals(actualUser, expectedUser , "Admin is not Logged in ");
//		// Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
//	}
//	
//	@Test
//	public void emptyUnameLogin() {
//		LoginPageElements login = new LoginPageElements();
//		sendText(login.username, "");
//		sendText(login.password, "sdf1231s");
//		click(login.loginBtn);
//		
//		String expectedText="Username cannot be empty";
//		String actualText = login.errorMsg.getText();
//		Assert.assertEquals(actualText, expectedText);
//	}
//	
//	@Test 
//	public void emptyPwordLogin() {
//		LoginPageElements login = new LoginPageElements();
//		sendText(login.username, ConfigsReader.getProperty("username"));
//		sendText(login.password, "");
//		click(login.loginBtn);
//		
//		String expectedText = "Password cannot be empty";
//		String actualText = login.errorMsg.getText();
//	}
//	
//}
