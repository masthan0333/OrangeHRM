package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.EmpStatusAddPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;

public class TC015_EmpstatusAdd {
	@Test
	public static void empadd()throws Exception{
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		EmpStatusAddPage.empstatusadd();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
