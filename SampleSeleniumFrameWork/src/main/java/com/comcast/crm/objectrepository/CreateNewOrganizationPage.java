package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {
	WebDriver driver;
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnameTextField;
	@FindBy(xpath="//input[contains(@value,'Save')]")
	private WebElement saveBtn;
	@FindBy(name="industry")
	private WebElement industryDB;
	@FindBy(name="accounttype")
	private WebElement typeDD;
	@FindBy(id="phone")
	private WebElement phNo;
	public CreateNewOrganizationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrgnameTextField() {
		return orgnameTextField;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getPhNo() {
		return phNo;
	}
	public void createorg(String orgname) {
		orgnameTextField.sendKeys(orgname);
		saveBtn.click();
		
	}
	public void createorg(String orgname,String pindustry,String type) {
		orgnameTextField.sendKeys(orgname);
		Select sel=new Select(industryDB);
		sel.selectByVisibleText(pindustry);
		Select sel1=new Select(typeDD);
		sel1.selectByVisibleText(type);
		saveBtn.click();
		
	}
	public void createorg(String orgname,String phone) {
		orgnameTextField.sendKeys(orgname);
		phNo.sendKeys(phone);
		saveBtn.click();
		
	}
	
}
