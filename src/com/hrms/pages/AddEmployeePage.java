package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class AddEmployeePage extends BaseClass{
	      //objects
	
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photouload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	
	       //functions
	public static void addemp(String empfir,String emplast) {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_empfirstname).sendKeys(empfir);
		driver.findElement(txt_emplastname).sendKeys(emplast);
		WebElement file=driver.findElement(photouload);
		file.sendKeys("D:\\Evarest.jpg");
		driver.findElement(btn_save).click();
		driver.switchTo().defaultContent();
		Reporter.log("Add employee completed");
		Log.info("Add employee completed");
	}
	

}
