package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.JobVacanciesPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;

public class TC011_JobVacancies {
	@Test
	public static void jobvac()throws Exception{
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		JobVacanciesPage.job_vacancy();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
