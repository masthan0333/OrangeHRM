package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.JobtitlesAddPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;
public class TC014_JobtitleAdd {
	@Test
	public static void job()throws Exception{
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		JobtitlesAddPage.addjob();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
