package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.HealthSavingPlanPage;
import com.hrms.pages.LoginPage;
import com.hrms.utility.BaseClass;

public class TC010_HspUsed {
	@Test
	public static void healthused()throws Exception {
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		HealthSavingPlanPage.hspl();
	}

}
