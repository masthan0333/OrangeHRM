package com.hrms.pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class DefineReportsPage extends BaseClass {
	                  //objects
	static By reports=By.xpath("/html/body/div[4]/ul/li[8]/a/span");
	static By define=By.xpath("//*[@id='report']/ul/li[2]/a/span");
    static By btn_add=By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]");
    static By txt_reportername=By.name("txtRepName");
    static By emp_check=By.xpath("//*[@id='EMPNO']");
    static By emp_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[1]");
    static By age_check=By.xpath("//*[@id='AgeGroup']");
    static By age_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[2]");
    static By txt_age=By.name("txtEmpAge1");
    static By paygrade_check=By.xpath("//*[@id='PayGrade']");
    static By paygrade_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[3]");
    static By education_check=By.xpath("//*[@id='QualType']");
    static By eduction_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[4]");
    static By empstatus_check=By.xpath("//*[@id='EmpType']");
    static By empstatus_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[5]");
    static By serviiceperiod_chk=By.xpath("//*[@id='SerPeriod']");
    static By serviceperiod_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[6]");
    static By servicep1_txt=By.id("Service1");
    static By joindate_chk=By.xpath("//*[@id='JoinedDate']");
    static By joindate_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[7]");
    static By joindate_txt=By.name("Join1");
    static By jobtitle_chk=By.xpath("//*[@id='JobTitle']");
    static By jobtitle_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[8]");
    static By language_chk=By.xpath("//*[@id='Language']");
    static By language_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[9]");
    static By skill_chk=By.xpath("//*[@id='Skill']");
    static By skill_drop=By.xpath("//*[@id='frmEmpRepTo']/div[3]/select[10]");
    static By save=By.xpath("//*[@id='frmEmpRepTo']/div[4]/input[1]");
    static By usergroup=By.xpath("//*[@id='cmbUserGroup']");
    static By assign=By.xpath("//*[@id='assignBtn']");
    
                     //functions
    public static void reports()throws Exception {
    	WebElement element=driver.findElement(reports);
    	Actions ac=new Actions(driver);
    	ac.moveToElement(element).perform();
    	driver.findElement(define).click();
    	driver.switchTo().frame("rightMenu");
    	driver.findElement(btn_add).click();
    	driver.findElement(txt_reportername).sendKeys("Roshini");
    	driver.findElement(emp_check).click();
    	           //employee dropdown
    	Select st=new Select(driver.findElement(emp_drop));
    	st.selectByIndex(0);
    	Thread.sleep(3000);
    	driver.findElement(age_check).click();
    	           //age group drop down
    	Select sel=new Select(driver.findElement(age_drop));
    	   sel.selectByIndex(1);
    	   driver.findElement(txt_age).sendKeys("30");
    	   Thread.sleep(2000);
    	   driver.findElement(paygrade_check).click();
    	          //paygrade drop down
    	   Select sl=new Select(driver.findElement(paygrade_drop));
    	   sl.selectByVisibleText("Rs");
    	   Thread.sleep(3000);
    	   driver.findElement(education_check).click();
    	              //education drop down
    	   Select se=new Select(driver.findElement(eduction_drop));
    	   se.selectByIndex(4);
    	   driver.findElement(empstatus_check).click();
    	               //Emp status drop down
    	   Select sc=new Select(driver.findElement(empstatus_drop));
    	   sc.selectByIndex(7);
    	   driver.findElement(serviiceperiod_chk).click();
    	            //service drop down
    	   Select st3=new Select(driver.findElement(serviceperiod_drop));
    	   st3.selectByIndex(1);
    	   driver.findElement(servicep1_txt).sendKeys("3");
    	   Thread.sleep(2000);
    	   driver.findElement(joindate_chk).click();
    	            //join date drop down
    	   Select sc2=new Select(driver.findElement(joindate_drop));
    	   sc2.selectByIndex(1);
    	   driver.findElement(joindate_txt).sendKeys("2019-10-12");
    	   Thread.sleep(3000);
    	   driver.findElement(jobtitle_chk).click();
    	             //jobtitle drop down
    	   Select ss=new Select(driver.findElement(jobtitle_drop));
    	   ss.selectByIndex(4);
    	   Thread.sleep(2000);
    	   driver.findElement(language_chk).click();
    	            //language drop down
    	   Select ms=new Select(driver.findElement(language_drop));
    	   ms.selectByIndex(7);
    	   driver.findElement(skill_chk).click();
    	             //skill drop down
    	   Select md=new Select(driver.findElement(skill_drop));
    	   md.selectByIndex(2);
    	   Thread.sleep(4000);
    	   driver.findElement(save).click();
    	   Alert ac9=driver.switchTo().alert();
    	   System.out.println(ac9.getText());
    	   ac9.accept();
    	   driver.findElement(servicep1_txt).clear();
    	   driver.findElement(servicep1_txt).sendKeys("3");
    	   driver.findElement(save).click();
    	      //user group drop down
    	   Select df=new Select(driver.findElement(usergroup));
    	   df.selectByVisibleText("nareshit");
    	   Thread.sleep(3000);
    	   driver.findElement(assign).click();
    	   driver.switchTo().defaultContent();
    	   Log.info("report defined");
    
    	
    }  
    
}
