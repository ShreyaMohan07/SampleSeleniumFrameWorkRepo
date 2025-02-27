package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesInformationPage {
        WebDriver driver;
		// TODO Auto-generated method stub
		@FindBy(id="mouseArea_Opportunity Name")
		private WebElement oppnameInfo;
		@FindBy(className="dvtCellInfo")
		private WebElement relateToInfo;
		public OpportunitiesInformationPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public WebElement getOppnameInfo() {
			return oppnameInfo;
		}
		public WebElement getRelateToInfo() {
			return relateToInfo;
		}
		


}
