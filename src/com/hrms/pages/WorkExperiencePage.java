package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class WorkExperiencePage extends BaseClass {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photouload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	static By experience=By.xpath("//*[@id='work_experienceLink']/span");
	static By employer=By.name("txtEmpExpEmployer");
	static By jobtitle=By.name("txtEmpExpJobTitle");
	static By comments=By.name("txtEmpExpComments");
	static By startdate=By.name("txtEmpExpFromDate");
	static By enddate=By.name("txtEmpExpToDate");
	static By internal=By.name("chkEmpExpInternal");
	static By save=By.xpath("/html/body/form/div[16]/div[1]/div[2]/div[2]/div/div/input[1]");
	static By chkbox=By.xpath("/html/body/form/div[16]/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/input");
	static By ad=By.xpath("//*[@id='parentPaneWorkExperience']/div[3]/div/input[1]");
	
	
	
	                     //functions
	public static void wk_experience(String empfst,String emplst)throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_empfirstname).sendKeys(empfst);
		driver.findElement(txt_emplastname).sendKeys(emplst);
		WebElement file=driver.findElement(photouload);
		file.sendKeys("D:\\Evarest.jpg");
		driver.findElement(btn_save).click();
		Thread.sleep(2000);
		driver.findElement(experience).click();
		driver.findElement(employer).sendKeys("Suresh");
		driver.findElement(jobtitle).sendKeys("Tester");
		driver.findElement(comments).sendKeys("**********");
		driver.findElement(startdate).sendKeys("2019-11-11");
		driver.findElement(enddate).sendKeys("2022-09-12");
		driver.findElement(internal).click();
		Thread.sleep(3000);
		driver.findElement(save).click();
		Thread.sleep(2000);
		driver.quit();
		
		Reporter.log("work experience details added");
		Log.info("work experience details added");
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
