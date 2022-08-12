package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.PayrollSchedulePage;
import com.hrms.utility.BaseClass;

public class TC009_PayrollschDelete {
    @Test
    public static void payrollsch()throws Exception{
    	BaseClass.openApplication();
    	LoginPage.login("nareshit","nareshit");
    	PayrollSchedulePage.schedule();
    	LogoutPage.logout();
    	BaseClass.closeApplication();
    }
}
