package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	WebDriver driver;
@FindBy(xpath="//img[@alt='Create Contact...']")
private WebElement createContBtn;
public ContactsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public WebElement getCreateContBtn() {
	return createContBtn;
}
}
