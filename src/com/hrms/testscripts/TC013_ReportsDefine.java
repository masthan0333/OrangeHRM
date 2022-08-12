package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.DefineReportsPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;
public class TC013_ReportsDefine {
	@Test
	public static void definereport()throws Exception {
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		DefineReportsPage.reports();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
