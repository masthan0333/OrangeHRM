package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class LogoutPage extends BaseClass{
	   //objects
	static By link_logout=By.linkText("Logout");
	   //functions
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}

}
