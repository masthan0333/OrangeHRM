package com.hrms.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

import org.openqa.selenium.support.ui.Select;

public class PerformanceKPIListPage extends BaseClass {
	        //objects
	static By performance=By.xpath("/html/body/div[4]/ul/li[7]/a/span");
	static By kpilist=By.xpath("//*[@id='perform']/ul/li[1]/a/span");
	static By jobtitle_drop=By.name("txtJobTitle");
	static By search=By.id("searchBtn");
	static By btn_add=By.id("addKpiBut");
	static By jobtitle=By.name("txtJobTitle");
	static By indicator=By.id("txtDescription");
	static By minrate=By.name("txtMinRate");
	static By maxrate=By.name("txtMaxRate");
	static By makescalechek=By.name("chkDefaultScale");
	static By save=By.xpath("/html/body/div/div/div/div[2]/div[2]/form/div[2]/input[1]");

	
	                     //functions
	public static void kpilist()throws Exception {
		WebElement ele=driver.findElement(performance);
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).perform();
		driver.findElement(kpilist).click();
		driver.switchTo().frame("rightMenu");
		       //job title drop down
		Select st=new Select(driver.findElement(jobtitle_drop));
		st.selectByIndex(13);
		driver.findElement(search).click();
		Thread.sleep(2000);
		driver.findElement(btn_add).click();
		        //jobtitel2 drop down
		Select st1=new Select(driver.findElement(jobtitle));
		st1.selectByIndex(4);
		driver.findElement(indicator).sendKeys("Better performnace");
		driver.findElement(minrate).sendKeys("2");
		driver.findElement(maxrate).sendKeys("4");
		driver.findElement(makescalechek).click();
		driver.findElement(save).click();
		driver.switchTo().defaultContent();
		Log.info("KPI list added");		
		
	}
}
