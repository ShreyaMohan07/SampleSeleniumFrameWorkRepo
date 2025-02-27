package com.comcast.crm.basetest;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.LoginPage;

public class BaseClass {
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	public ExcelUtility elib=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public DataBaseUtility dlib=new DataBaseUtility();
	public FileUtility flib=new FileUtility();

	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS() throws SQLException {
		dlib.getDbconnection();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() throws SQLException {
		dlib.closeDbconnection();
		
	}
	@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void configBC(@Optional("chrome") String browser) throws IOException {
		String browsername = browser;
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		UtilityClassObject.setdriver(driver);

	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		LoginPage lp=new LoginPage(driver);
		lp.closebrowser(driver);
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"}, alwaysRun = true)
	 public void configBM() throws IOException {
		String URL = flib.getDataFromPropertiesFile("url");
		String Username = flib.getDataFromPropertiesFile("username");
		String Password = flib.getDataFromPropertiesFile("password");
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(URL, Username, Password);
		
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM() {
		HomePage hp=new HomePage(driver);
		hp.logout();
	}
}
