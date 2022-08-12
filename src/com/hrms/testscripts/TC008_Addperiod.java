package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.AddPayPeriodPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;

public class TC008_Addperiod {
	@Test
	public static void addperiod()throws Exception {
		BaseClass.openApplication();
		Verify.verifytitle("orangeHrm");
		LoginPage.login("nareshit","nareshit");
		Verify.verifytitle("OrangeHRM");
		AddPayPeriodPage.add_period();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
