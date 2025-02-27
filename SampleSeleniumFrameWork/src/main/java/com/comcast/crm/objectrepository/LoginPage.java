package com.comcast.crm.objectrepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
/**
 * @author Deepak
 * 
 * Contains Login page elements and business lib like login()
 * 
 */
public class LoginPage {
	WebDriverUtility wlib=new WebDriverUtility();
	FileUtility flib=new FileUtility();
	@FindBy(name="user_name")
	private WebElement usernametextField;
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	@FindBy(id="submitButton")
	private WebElement submitButton;
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsernametextField() {
		return usernametextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	/**
	 * login to application based on username,password,url arguments
	 * @param url
	 * @param username
	 * @param password
	 * @throws IOException
	 */
	public void loginToApp(String url,String username,String password) throws IOException {
		wlib.waitForPagetoLoad(driver);
		driver.get(url);
		usernametextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		submitButton.click();
		
	}
	public void closebrowser(WebDriver driver) {
		driver.quit();
	}
	
}
