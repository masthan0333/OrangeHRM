package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.EducationPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;

public class TC006_Education {
	@Test
	public static void edu()throws Exception{
		BaseClass.openApplication();
		Verify.verifytitle("orangehrm");
		LoginPage.login("nareshit","nareshit");
		Verify.verifytitle("OrangeHRM");
		EducationPage.education_page("masthi","selenium");
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
