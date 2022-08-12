 package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class SalaryPage extends BaseClass {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By salary=By.xpath("//*[@id='paymentsLink']/span");
	static By paygradedrop=By.xpath("//*[@id='cmbSalaryGrade']");
	static By currencydrop=By.xpath("//*[@id='cmbCurrCode']");
	static By basicsalary=By.name("txtBasSal");
	static By payfrequencydrop=By.xpath("//*[@id='cmbPayPeriod']");
    static By btn_save=By.xpath("//*[@id='btnAddPayment']");
    static By save=By.xpath("//input[@value='Save'][@type='button']");
    
    
                  //Functions
    public static void salary(String empfir,String emplast) throws Exception {
      driver.switchTo().frame("rightMenu");
      driver.findElement(btn_add).click();
       driver.findElement(txt_empfirstname).sendKeys(empfir);
      driver.findElement(txt_emplastname).sendKeys(emplast);
      driver.findElement(save).click();
      Thread.sleep(2000);
      driver.findElement(salary).click();
           //Paygrade drop down
      Select st=new Select(driver.findElement(paygradedrop));
      st.selectByIndex(7);
         //Currency drop down
      Select sel=new Select(driver.findElement(currencydrop));
         sel.selectByIndex(0);
         driver.findElement(basicsalary).sendKeys("45000");
               //Pay frequency dropdown
         Select st1=new Select(driver.findElement(payfrequencydrop));
              st1.selectByIndex(4);
              driver.findElement(btn_save).click();
              driver.switchTo().defaultContent();
              Reporter.log("Salary details saved");
              Log.info("Salary details saved");
     
}
}