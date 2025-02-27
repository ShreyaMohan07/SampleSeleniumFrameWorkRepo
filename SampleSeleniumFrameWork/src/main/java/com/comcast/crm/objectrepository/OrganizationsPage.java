package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	WebDriver driver;
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;
	@FindBy(name="search_text")
	private WebElement searchtextField;
	@FindBy(name="search_field")
	private WebElement inDD;
	@FindBy(name="submit")
	private WebElement searchnowBtn;
	
	public OrganizationsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}
	public WebElement getSearchtextField() {
		return searchtextField;
	}
	public WebElement getInDD() {
		return inDD;
	}
	public WebElement getSearchnowBtn() {
		return searchnowBtn;
	}
	
}
