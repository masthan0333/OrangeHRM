package com.hrms.testscripts;
import com.hrms.pages.EmpStatusDeletePage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;
import org.testng.annotations.Test;
public class TC016_EmpstatusDelete {
	@Test
	public void status_delete()throws Exception{
		BaseClass.openApplication();
		LoginPage.login("nareshit","nareshit");
		EmpStatusDeletePage.empstatus();
		LogoutPage.logout();
		BaseClass.closeApplication();
	}

}
