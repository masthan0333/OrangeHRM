package com.hrms.pages;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

import org.testng.Reporter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EmpStatusDeletePage extends BaseClass{
	                  //objects
	static By admin=By.xpath("/html/body/div[4]/ul/li[1]/a/span");
	static By job=By.xpath("//*[@id='admin']/ul/li[2]/a/span");
	static By empstatus=By.xpath("//*[@id='admin']/ul/li[2]/ul/li[4]/a/span");
	static By btn_delete=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]");
	static By chkbox=By.xpath("/html/body/div/div[2]/form/table/tbody/tr[2]/td[1]/input");
	                   //functions
	  public static void empstatus()throws Exception{
		  WebElement ele=driver.findElement(admin);
		  Actions ac=new Actions(driver);
		  ac.moveToElement(ele).perform();
		  Actions ac1=new Actions(driver);
		  ac1.moveToElement(driver.findElement(job)).perform();
		  driver.findElement(empstatus).click();
		  driver.switchTo().frame("rightMenu");
		  for(int i=1;i<=6;i++)
		  {
			  driver.findElement(chkbox).click();
			  Reporter.log("checkbox" + i);
		  }
		  driver.findElement(btn_delete).click();
		  Alert at=driver.switchTo().alert();
		  at.accept();
		  driver.switchTo().defaultContent();
		  Thread.sleep(3000);
		  Log.info("employee staus records deleted");
		    
	  }

}
