package com.comcast.crm.basetest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	@BeforeSuite
	public void configBS(){
		System.out.println("execute Before Suite");
		
	}
@BeforeClass
public void configBC() {
	System.out.println("execute BeforeClass");
}
@AfterSuite
public void configAS(){
	System.out.println("execute After Suite");
	
}
@AfterClass
public void configAC() {
	System.out.println("execute After Class");
}
@BeforeMethod
public void configBM() {
	System.out.println("execute Before Method");
}
@AfterMethod
public void configAM() {
	System.out.println("execute After Method");
}
}
