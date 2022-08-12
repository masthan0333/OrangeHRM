package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class PersonalDetailsPage extends BaseClass{
	       //objects
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By photoupload=By.name("photofile");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	static By btn_edit=By.xpath("//input[@value='Edit'][@type='button']");
	static By txt_empnickname=By.name("txtEmpNickName");
	static By txt_nicno=By.name("txtNICNo");
	static By txt_sinno=By.name("txtSINNo");
	static By drodown=By.name("cmbNation");
	static By dob=By.name("DOB");
	static By gender=By.id("gender1");
	static By license=By.name("txtLicenNo");
	static By licenseExpire=By.name("txtLicExpDate");
	       
	
	             //functions
	public static void personaldetails(String elstnm,String efstnm, String emnknm,String nicno)throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_emplastname).sendKeys(elstnm);
		driver.findElement(txt_empfirstname).sendKeys(efstnm);
		WebElement fileupload=driver.findElement(photoupload);
		fileupload.sendKeys("D:\\Evarest.jpg");
		Thread.sleep(3000);
		driver.findElement(btn_save).click();
		driver.findElement(btn_edit).click();
		driver.findElement(txt_empnickname).sendKeys(emnknm);
		driver.findElement(txt_nicno).sendKeys(nicno);
		driver.findElement(txt_sinno).sendKeys("78890");
		
		Select st=new Select(driver.findElement(drodown));
		   st.selectByIndex(2);
		   driver.findElement(dob).sendKeys("1995-10-01");
		   driver.findElement(gender).click();
		   driver.findElement(license).sendKeys("AP78961087");
		   driver.findElement(licenseExpire).sendKeys("2045-10-10");
		   driver.findElement(btn_save).click();
		   driver.switchTo().defaultContent();
		   Reporter.log("Personal details add completed");
		   Log.info("Personal details add completed");	
		
		
	}

}
