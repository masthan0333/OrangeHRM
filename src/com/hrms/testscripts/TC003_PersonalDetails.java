package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.PersonalDetailsPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;

public class TC003_PersonalDetails {
	 @Test
	 public static void personal() throws Exception {
		 BaseClass.openApplication();
		 Verify.verifytitle("OrangeHRM");
		 LoginPage.login("nareshit","nareshit");
		 Verify.verifytitle("OrangeHRM");
		 PersonalDetailsPage.personaldetails("Masthan","selenium","Masthi","60480");
		 LogoutPage.logout();
		 BaseClass.closeApplication();
		 
		 
	 }

}
