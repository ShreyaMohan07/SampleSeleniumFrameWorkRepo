package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOpportunityPage {
	WebDriver driver;
@FindBy(name="potentialname")
private WebElement oppNameTextField;
@FindBy(id="related_to_type")
private WebElement relatedToDD;
@FindBy(id="(//img[@alt='Select'])[1]")
private WebElement opplookupBtn;
@FindBy(xpath="//input[contains(@value,'Save')]")
private WebElement saveBtn;
public CreateNewOpportunityPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	// TODO Auto-generated constructor stub
}
public WebElement getOppNameTextField() {
	return oppNameTextField;
}
public WebElement getRelatedToDD() {
	return relatedToDD;
}
public WebElement getOpplookupBtn() {
	return opplookupBtn;
}
public WebElement getSaveBtn() {
	return saveBtn;
}
}
