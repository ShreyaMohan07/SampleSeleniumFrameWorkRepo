package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformationPage {
	WebDriver driver;
@FindBy(id="dtlview_Last Name")
private WebElement lastnameInfo;
@FindBy(className="dvHeaderText")
private WebElement headerInfo;
@FindBy(id="mouseArea_Organization Name")
private WebElement orgNameInfo;
@FindBy(id="dtlview_Support Start Date")
private WebElement startDateInfo;
@FindBy(id="dtlview_Support End Date")
private WebElement endDateInfo;


public ContactsInformationPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getLastnameInfo() {
	return lastnameInfo;
}
public WebElement getOrgNameInfo() {
	return orgNameInfo;
}
public WebElement getStartDateInfo() {
	return startDateInfo;
}

public WebElement getEndDateInfo() {
	return endDateInfo;
}
public WebElement getHeaderInfo() {
	return headerInfo;
}
}
