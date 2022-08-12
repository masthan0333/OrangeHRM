package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.PerformanceKPIListPage;
import com.hrms.utility.BaseClass;

public class TC012_PerformanceKPI {
	@Test
	public static void kpi()throws Exception {
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		PerformanceKPIListPage.kpilist();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
