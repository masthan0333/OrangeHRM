package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.JobPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;

public class TC004_Job {
	 @Test
	 public static void job()throws Exception {
		 BaseClass.openApplication();
		 Verify.verifytitle("OrangeHRM");
		 LoginPage.login("nareshit","nareshit");
		 Verify.verifytitle("OrangeHRM");
		 JobPage.job("Selenium","Masthan");
		 LogoutPage.logout();
		 BaseClass.closeApplication();
		 
	 }

}
