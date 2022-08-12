package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class PayrollSchedulePage extends BaseClass{
	          //functions
	static By benifit=By.xpath("//*[@id='benefits']/a/span");
	static By payroll_schedule=By.xpath("//*[@id='benefits']/ul/li[2]/a/span");
	static By viewpayroll_schedule=By.xpath("/html/body/div[4]/ul/li[5]/ul/li[2]/ul/li[1]/a/span");
	static By choose_yeardrop=By.name("cmbYear");
	static By btn_view=By.id("btnView");
	static By btn_delete=By.xpath("//*[@id='frmMain']/div[2]/div[1]/input[2]");
			
	                 //functions
	public static void schedule()throws Exception{
		WebElement ele=driver.findElement(benifit);
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		
		WebElement element=driver.findElement(payroll_schedule);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(element).perform();
		driver.findElement(viewpayroll_schedule).click();
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(choose_yeardrop));
		st.selectByIndex(0);
		driver.findElement(btn_view).click();
		
		for(int i=1;i<10;i=i+2)
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
			Log.info("check box" +i);
			Reporter.log("checkbox number" +i);
			
		}
		Thread.sleep(3000);
		driver.findElement(btn_delete).click();
		driver.switchTo().defaultContent();
		Log.info("payroll schedule deleted");
		
	}

}
