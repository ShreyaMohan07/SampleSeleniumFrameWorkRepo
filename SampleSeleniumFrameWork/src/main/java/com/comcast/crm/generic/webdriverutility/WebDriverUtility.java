package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
public void waitForPagetoLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void waitForElementToBePresent(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void switchToNewBrowserTab(WebDriver driver,String partialurl) {
	Set<String> allwindowIds = driver.getWindowHandles();
	   for(String id:allwindowIds) {
		   driver.switchTo().window(id);
		   String url = driver.getCurrentUrl();
		   if(url.contains(partialurl)) {
			   break;
		   }
	   }
}
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(WebDriver driver,String nameID) {
	driver.switchTo().frame(nameID);
}
public void switchToFrame(WebDriver driver,WebElement element) {
	driver.switchTo().frame(element);
}
public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void switchToAlertAndCancel(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public void select(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public void select(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
public void mousehoverOnElement(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element);
}
public void doubleClick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element);
}


}
