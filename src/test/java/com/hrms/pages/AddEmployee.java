package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.testbase.BaseClass;

public class AddEmployee extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "photofile")
	public WebElement chosefile;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement userPuwd;
	
	@FindBy (id="re_password")
	public WebElement rePwd;
	
	@FindBy(id="status")
	public WebElement status;
	
	@FindBy(xpath="//input[@id='chkLogin']")
	public WebElement checkboxLoginDetails;
	public AddEmployee() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void addEmpInfo() {

		sendText(firstName, "Josephine2");
		sendText(lastName, "Smith");
		sendText(employeeId, "7777");
		sendText(chosefile, "C:\\\\Users\\\\Dell\\\\Downloads");

	}
	public void creatLoginCr() {
		checkboxLoginDetails.click();
		sendText(username, "Josephine7");
		sendText(userPuwd, "Sephine@Kjy123");
		sendText(rePwd, "Sephine@Kjy123");
		Select select = new Select(status);
		select.deselectByVisibleText("Enabled");
		wait(3);
		jsClick(saveBtn);
		
	}
}