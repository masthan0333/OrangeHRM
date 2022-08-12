package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.SalaryPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;


public class TC005_Salary {
	@Test
	public static void salary()throws Exception {
		BaseClass.openApplication();
		Verify.verifytitle("OrangeHRM");
		LoginPage.login("nareshit","nareshit");
		Verify.verifytitle("OrangeHRM");
		SalaryPage.salary("Roshini","selenium");
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
