package com.hrms.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.util.List;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class JobVacanciesPage extends BaseClass{
	            //objects
	static By recruitment=By.xpath("//*[@id='recruit']/a/span");
	static By jobvacancies=By.xpath("/html/body/div[4]/ul/li[6]/ul/li[1]/a/span");
	static By btn_add=By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]");
	static By jobtitle_drop=By.id("cmbJobTitle");
	static By txt_hiring=By.className("yui-ac-input");
	static By txt_desc=By.name("txtDesc");
	static By active_chbox=By.id("active");
	static By btn_save=By.xpath("//*[@id='editBtn']");
	
	                    //functions
	public static void job_vacancy()throws Exception {
		WebElement element=driver.findElement(recruitment);
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		driver.findElement(jobvacancies).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		         //job title dropdown
		Select st=new Select(driver.findElement(jobtitle_drop));
		st.selectByIndex(2);
		List<WebElement> e=driver.findElements(txt_hiring);
		for(WebElement suggest:e) 
		{
			Reporter.log(suggest.getText());
		}
		
		driver.findElement(txt_desc).sendKeys("******************");
		driver.findElement(active_chbox).click();
		Thread.sleep(3000);
		driver.findElement(btn_save).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Reporter.log("job vacancy details added");
		Log.info("Job vacancy details added");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}