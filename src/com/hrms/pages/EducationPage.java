package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class EducationPage extends BaseClass {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photouload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	static By education=By.xpath("//*[@id='educationLink']/span");
	static By edu_drop=By.xpath("//*[@id='addPaneEducation']/table/tbody/tr[1]/td[2]/select");
	static By specialisation=By.name("txtEmpEduMajor");
	static By year=By.name("txtEmpEduYear");
	static By gpa=By.name("txtEmpEduGPA");
	static By startdate=By.name("txtEmpEduStartDate");
	static By enddate=By.name("txtEmpEduEndDate");
	static By save=By.xpath("//*[@id='btnAddEducation']");
	  
	                 //functions
	public static void education_page(String empfst,String emplst)throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_empfirstname).sendKeys(empfst);
		driver.findElement(txt_emplastname).sendKeys(emplst);
		WebElement file=driver.findElement(photouload);
		file.sendKeys("D:\\Evarest.jpg");
		driver.findElement(btn_save).click();
		Thread.sleep(2000);
		driver.findElement(education).click();
		    //education drop down
		Select st=new Select(driver.findElement(edu_drop));
		st.selectByIndex(4);
		driver.findElement(specialisation).sendKeys("Selenium");
		driver.findElement(year).sendKeys("2022");
		driver.findElement(gpa).sendKeys("8.3");
		driver.findElement(startdate).sendKeys("2022-05-17");
		driver.findElement(enddate).sendKeys("2022-08-26");
		Thread.sleep(2000);
		driver.findElement(save).click();
		driver.switchTo().defaultContent();	
		Reporter.log("Education details added");
		Log.info("Education details added");
		
	}
		

}
