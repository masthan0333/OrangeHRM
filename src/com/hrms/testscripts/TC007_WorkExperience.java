package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.Verify;
import com.hrms.pages.WorkExperiencePage;
import com.hrms.utility.BaseClass;

public class TC007_WorkExperience {
	@Test
	public static void wk_experience()throws Exception {
		BaseClass.openApplication();
		Verify.verifytitle("OrangeHRM");
		LoginPage.login("nareshit","nareshit");
		WorkExperiencePage.wk_experience("ms","sel");
		
	}

}
