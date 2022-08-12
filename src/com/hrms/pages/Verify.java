package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class Verify  extends BaseClass {
	public static void verifytitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			Reporter.log("Title is matched");
		
	   }
		else 
		{
			Reporter.log("Title is not matched");
			Reporter.log(driver.getTitle());
			Log.info("verify completed");
		}
	}
	
	

}
