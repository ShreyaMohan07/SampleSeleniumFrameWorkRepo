package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="Organizations")
	private WebElement orglnk;
	@FindBy(linkText="Contacts")
	private WebElement contlnk;
	@FindBy(linkText="Campaigns")
	private WebElement campaignlnk;
	@FindBy(linkText="Opportunities")
	private WebElement opplnk;
	@FindBy(linkText="Morelnk")
	private WebElement morelnk;
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement admin;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlnk;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getOrglnk() {
		return orglnk;
	}


	public WebElement getContlnk() {
		return contlnk;
	}


	public WebElement getCampaignlnk() {
		return campaignlnk;
	}


	public WebElement getMorelnk() {
		return morelnk;
	}

	public WebElement getAdmin() {
		return admin;
	}
	public WebElement getOpplnk() {
		return opplnk;
	}

	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
	public void navigateToCampaignPage() {
		Actions act=new Actions(driver);
		act.moveToElement(morelnk).perform();
		campaignlnk.click();
	}
	public void logout() {
		Actions act=new Actions(driver);
		  act.moveToElement(admin).perform();
		  act.click(signoutlnk).perform();
	}

	

	
}
