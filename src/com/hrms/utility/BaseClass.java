package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class BaseClass {
	public static WebDriver driver;    //related to whole applications
	
	     //open application
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application opened");     //print statement in html report
		Log.info("Application opened");         // print statement in logfile
	}
	
      //close application
	public static void closeApplication() 
	{
		driver.close();
		Reporter.log("Close application");
		Log.info("Close application");
	}
	
}
