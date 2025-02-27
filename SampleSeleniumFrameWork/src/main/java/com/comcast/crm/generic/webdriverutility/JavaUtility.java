package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	Date dateobj;
	SimpleDateFormat sim;
public int randomNumber() {
	Random ranDom=new Random();
	int randomNumber = ranDom.nextInt(5000);
	return randomNumber;
}
public String getSystemDateYYYYMMDD() {
	dateobj=new Date();
	 sim=new SimpleDateFormat("yyyy-MM-dd");
	String date = sim.format(dateobj);
	return date;
}
public String getRequireddateYYYYDDMM(int days) {
	
	 Calendar cal = sim.getCalendar();
	 cal.add(Calendar.DAY_OF_MONTH,days);
	 String requiredDate = sim.format(cal.getTime());
	 return requiredDate;
	 
}
}
