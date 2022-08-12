package com.hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;
public class JobPage extends BaseClass {
	static By btn_add=By.xpath("//input[@value='Add'][@type='button']");
	static By txt_emplastname=By.name("txtEmpLastName");
	static By txt_empfirstname=By.name("txtEmpFirstName");
	static By btn_save=By.xpath("//input[@value='Save'][@type='button']");
	static By job=By.xpath("//*[@id='jobLink']/span");
	static By btn_edit=By.xpath("//*[@id='btnEditJob']");
	static By jobtitledrop=By.name("cmbJobTitle");
	static By empstatusdrop=By.xpath("/html/body/form/div[3]/div[1]/div[2]/div[2]/div/select");
	static By eeodrop=By.name("cmbEEOCat");
	static By joindate=By.name("txtJoinedDate");
	static By terminationreason=By.xpath("//*[@id='cmbType']");
	static By newlocation=By.xpath("//*[@id='cmbNewLocationId']");
	static By btn_assign=By.xpath("//*[@id='assignLocationButton']");
	static By save2=By.xpath("//*[@id='btnEditJob']");
	
	
	
	               //functions
	      
	public static void job (String empfir,String emplast) throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_empfirstname).sendKeys(empfir);
		driver.findElement(txt_emplastname).sendKeys(emplast);
		driver.findElement(btn_save).click();
		driver.findElement(job).click();
		driver.findElement(btn_edit).click();
		      //drop down for job title
		 Select st=new Select(driver.findElement(jobtitledrop));
		 st.selectByIndex(3);
		         
		      //EEO category drop down
		 Select st1=new Select(driver.findElement(eeodrop));
		 st1.selectByIndex(6);
		driver.findElement(joindate).sendKeys("2022-11-11");
		    //new location drop down
		Select st2=new Select(driver.findElement(newlocation));
		st2.selectByIndex(9);
		Thread.sleep(3000);
		driver.findElement(btn_assign).click();
		driver.findElement(save2).click();
		driver.switchTo().defaultContent();
		Reporter.log("Job details added complted");
		Log.info("Job details added completed");
		
	}
}
