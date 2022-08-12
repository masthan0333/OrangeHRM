package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.Verify;
import com.hrms.utility.BaseClass;

public class TC001LoginLogout_VerifyTitle {
	@Test
	public static void tc001()
	{
		BaseClass.openApplication();
		Verify.verifytitle("OrangeHRM");
		LoginPage.login("nareshit", "nareshit");
		Verify.verifytitle("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApplication();
		
	}
	

}
