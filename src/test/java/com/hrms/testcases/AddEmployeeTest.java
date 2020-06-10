package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

	@Test(groups ="smoke")
	public void addEmployeePage() {

		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(7);

//		sendText(addEmp.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(addEmp.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(addEmp.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(addEmp.saveEmp);

		// add assertion to verify that employee has been added successfully

	}

}










//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.pages.DashboardPageElements;
//import com.pages.LoginPageElements;
//import com.utils.CommonMethods;
//import com.utils.ConfigsReader;
//
//public class AddEmployeeTest extends CommonMethods {
//
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}
//
//	@Test
//	public void addEmployeePage() {
//
//		LoginPageElements login = new LoginPageElements();
//
//		login.username.sendKeys(ConfigsReader.getProperty("username"));
//		login.password.sendKeys(ConfigsReader.getProperty("password"));
//		login.loginBtn.click();
//
//		DashboardPageElements board = new DashboardPageElements();
//
//		board.Pim.click();
//		jsClick(board.addEmployee);
//		
//		AddEmployeePageElements emp1 = new AddEmployeePageElements();
//		
//		sendText(emp1.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
//		sendText(emp1.empLastName, ConfigsReader.getProperty("employeeLastname"));
//		sendText(emp1.addPhoto, ConfigsReader.getProperty("filePath"));
//		waitAndClick(emp1.saveEmp);
//
//	}
//
//}
