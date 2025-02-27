package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	WebDriver driver;
	@FindBy(className="dvHeaderText")
	private WebElement headerInfo;
	@FindBy(id="dtlview_Organization Name")
	private WebElement orgnameInfo;
	@FindBy(id="dtlview_Industry")
	private WebElement industryInfo;
	@FindBy(id="dtlview_Type")
	private WebElement typeInfo;
	@FindBy(id="dtlview_Phone")
	private WebElement phoneInfo;
	
	
	public OrganizationInformationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getHeaderInfo() {
		return headerInfo;
	}
	public WebElement getOrgnameInfo() {
		return orgnameInfo;
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIndustryInfo() {
		return industryInfo;
	}
	public WebElement getTypeInfo() {
		return typeInfo;
	}
	public WebElement getPhooneInfo() {
		return phoneInfo;
	}
}
