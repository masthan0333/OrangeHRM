package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class HealthSavingPlanPage extends BaseClass {
	                 //objects
	static By benifit=By.xpath("//*[@id='benefits']/a/span");
	static By hsp=By.xpath("/html/body/div[4]/ul/li[5]/ul/li[1]/a/span");
	static By hspused=By.xpath("//*[@id='benefits']/ul/li[1]/ul/li[5]/a/span");
	static By yeardrop=By.name("year");
	static By employee=By.xpath("/html/body/div[1]/div/div[2]/form/input[4]");
	static By empname=By.xpath("/html/body/div[1]/div[2]/form/table/tbody/tr[6]/td[2]/a");
	static By btn_view=By.id("btnView");
	
	                     //functions
	public static void hspl()throws Exception {
		WebElement element=driver.findElement(benifit);
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
		WebElement ele=driver.findElement(hsp);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(ele).perform();
		driver.findElement(hspused).click();
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(yeardrop));
		st.selectByIndex(1);
		driver.findElement(employee).click();
		
		driver.findElement(btn_view).click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.quit();
		Log.info("HSP Used viewed");
			
		
	}

}
