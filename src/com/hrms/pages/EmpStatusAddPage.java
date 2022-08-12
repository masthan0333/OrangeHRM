package com.hrms.pages;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class EmpStatusAddPage extends BaseClass {
	           //objects
	static By admin=By.xpath("//*[@id='admin']/a/span");
	static By job=By.xpath("/html/body/div[4]/ul/li[1]/ul/li[2]/a/span");
	static By empstatus=By.xpath("//*[@id='admin']/ul/li[2]/ul/li[4]/a/span");
	static By btn_add=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]");
	static By txt_name=By.name("txtEmpStatDesc");
	static By save2=By.xpath("//*[@id='editBtn']");
	
	           //functions
	public static void empstatusadd()throws Exception {
		WebElement ele=driver.findElement(admin);
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement elem=driver.findElement(job);
		Actions act=new Actions(driver);
		act.moveToElement(elem).perform();
		driver.findElement(empstatus).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_add).click();
		driver.findElement(txt_name).sendKeys("Ramesh");
		Thread.sleep(2000);
		driver.findElement(save2).click();
		driver.switchTo().defaultContent();
		Log.info("Emp status added");
	}

}
