package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class CreateNewContactPage {
	WebDriver driver;
	WebDriverUtility wlib=new WebDriverUtility();
	@FindBy(name="lastname")
	private WebElement lastnameTextField;
	@FindBy(xpath="//input[contains(@value,'Save')]")
	private WebElement saveBtn;
	@FindBy(xpath="(//img[@alt='Select'])[1]")
	private WebElement orglookupBtn;
	@FindBy(id="search_txt")
	private WebElement searchText;
	@FindBy(name="search")
	private WebElement searchBtn;
	@FindBy(xpath="(//a[contains(text(),'faceBook_')])[1]")
	private WebElement searchOrgName;
	@FindBy(name="support_start_date")
	private WebElement startDate;
	@FindBy(name="support_end_date")
	private WebElement endDate;
	
	public CreateNewContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getOrglookupBtn() {
		return orglookupBtn;
	}
	public WebElement getSearchText() {
		return searchText;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getSearchOrgName() {
		return searchOrgName;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getEndDate() {
		return endDate;
	}

	public void createcontact(String lastname) {
		lastnameTextField.sendKeys(lastname);
		saveBtn.click();
	}
	public void createcontact(String contactlastname,String orgname) {
		lastnameTextField.sendKeys(contactlastname);
		orglookupBtn.click();
		wlib.switchToNewBrowserTab(driver,"module=Accounts&action=Popup");
		searchText.sendKeys(orgname);
		searchBtn.click();
		searchOrgName.click();
		wlib.switchToNewBrowserTab(driver,"module=Contacts");
		saveBtn.click();
	}
	
}
