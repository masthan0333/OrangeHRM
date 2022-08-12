package com.hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;
public class JobtitlesAddPage extends BaseClass{
	               //objects
	static By admin=By.xpath("/html/body/div[4]/ul/li[1]/a/span");
	static By job=By.xpath("/html/body/div[4]/ul/li[1]/ul/li[2]/a/span");
	static By jobtitles=By.xpath("//*[@id='admin']/ul/li[2]/ul/li[1]/a/span");
	static By btn_add=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]");
	static By jobtitlename=By.id("txtJobTitleName");
	static By jobdesc=By.id("txtJobTitleDesc");
	static By comments=By.id("txtJobTitleComments");
	static By jobspecification_drop=By.xpath("//*[@id='cmbJobSpecId']");
	static By paygrade_drop=By.xpath("/html/body/div[2]/div[2]/div[2]/form/select[2]");
	static By btn_addpaygrade=By.xpath("//*[@id='frmJobTitle']/div[1]/input[1]");
	static By txt_name=By.id("txtSalGrdDesc");
	static By btn_save=By.xpath("/html/body/div/div[2]/div[2]/form/div/input[1]");
	static By currency_drop=By.xpath("//*[@id='cmbUnAssCurrency']");
	static By min_salary=By.id("txtMinSal");
	static By max_salary=By.id("txtMaxSal");
	static By stepincrease=By.id("txtStepSal");
	static By save2=By.xpath("/html/body/div/div[2]/div[2]/form[2]/div[2]/input");
	

	           //function
	public static void addjob()throws Exception {
		WebElement ele=driver.findElement(admin);
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		    //mouse over to job
		WebElement el=driver.findElement(job);
		Actions act=new Actions(driver);
		act.moveToElement(el).perform();
		driver.findElement(jobtitles).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(jobtitlename).sendKeys("Sam");
		driver.findElement(jobdesc).sendKeys("Java Developer");
		driver.findElement(comments).sendKeys("Highly Recommended");
		          //job specification drop down
		Select st=new Select(driver.findElement(jobspecification_drop));
		st.selectByIndex(2);
		           //paygrade drop down
		Select sel=new Select(driver.findElement(paygrade_drop));
		sel.selectByIndex(10);
		driver.findElement(btn_addpaygrade).click();
		Thread.sleep(2000);
		driver.findElement(txt_name).sendKeys("Rajesh");
		driver.findElement(btn_save).click();
		Thread.sleep(3000);
             //currency dropdown
		Select sele=new Select(driver.findElement(currency_drop));
		sele.selectByIndex(62);
		driver.findElement(min_salary).sendKeys("21000");
		driver.findElement(max_salary).sendKeys("54000");
		driver.findElement(stepincrease).sendKeys("5500");
		driver.findElement(save2).click();
		driver.switchTo().defaultContent();
		Log.info("jobtitle added");
		
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	

