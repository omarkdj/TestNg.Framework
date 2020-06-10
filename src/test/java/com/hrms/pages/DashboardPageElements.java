package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;
import com.testbase.BaseClass;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id="welcome")
	public WebElement welcome;
	

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="btnAdd")
	public WebElement addEmp;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
}
