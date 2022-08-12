package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class AddPayPeriodPage extends BaseClass{
	            //objects
	static By benifit=By.xpath("/html/body/div[4]/ul/li[5]/a/span");
	static By payrollschedule=By.xpath("/html/body/div[4]/ul/li[5]/ul/li[2]/a/span");
	static By addpayperiod=By.xpath("//*[@id='benefits']/ul/li[2]/ul/li[2]/a/span");
	static By txt_payperiod=By.name("txtPayPeriodFromDate");
	static By txt_payperiodclose=By.name("txtPayPeriodCloseDate");
	static By txt_duedate=By.name("txtPayPeriodTimesheetDueDate");
	static By txt_checkdate=By.name("txtPayPeriodCheckDate");
	static By txt_to=By.name("txtPayPeriodToDate");
	static By save=By.xpath("//*[@id='saveBtn']");
	
	                  //functions
	public static void add_period()throws Exception {
		WebElement  ele=driver.findElement(benifit);
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement element=driver.findElement(payrollschedule);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(element).perform();
		driver.findElement(addpayperiod).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(txt_payperiod).sendKeys("2022-08-06");
		driver.findElement(txt_payperiodclose).sendKeys("2022-09-19");
		driver.findElement(txt_duedate).sendKeys("2022-10-10");
		driver.findElement(txt_checkdate).sendKeys("2022-10-01");
		driver.findElement(txt_to).sendKeys("2022-12-23");
		Thread.sleep(3000);
		driver.findElement(save);
		driver.switchTo().defaultContent();
		Reporter.log("Add period details added");
		Log.info("Add period details added");
		
	}

}
