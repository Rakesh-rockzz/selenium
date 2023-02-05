package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;



public class General extends Global {
	//To Provide All Re-usable Fun:/Methods For Whole Application
	public void openApplication() {
		//Test Steps
//Launch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
//Enter URL
	driver.navigate().to(url);
	}
	public void login() {
//Enter UserName
		driver.findElement(By.name(txt_username)).sendKeys(username);
//Enter Password
		driver.findElement(By.name(txt_passwod)).sendKeys(password);
//Click On Login Button
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");           //Console
		Reporter.log("Login Completed");                 //html Report
		Log.info("Login Completed");             //logFile
	}
	public void logout() {
//Click On Logout option
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Competed");	
		Log.info("Logout Completed");
		}
	public void closeApplication() {
//Close Application
		driver.close();
	}
 
  public void addNewEmp() {
//Adding New Emp Details
	  driver.findElement(By.xpath(btn_add)).click();
	  driver.findElement(By.name(txt_firstname)).sendKeys(firstname);
	  driver.findElement(By.name(txt_lastname)).sendKeys(lastname);
	  driver.findElement(By.id(btn_save)).click();
	  System.out.println("New Emp Added");
	  Log.info("New Emp Added");
  }
  public void entframe() {
//Entering in to Frames
	  driver.switchTo().frame(0);
  }
  public void extframe() {
//Exit from Frame
	  driver.switchTo().defaultContent();
  }
  public void deleteEmp () {
//DropDown of Search BY
	  Select st = new Select(driver.findElement(By.name(dropdown_searchBy)));
	  st.selectByVisibleText(Emp_Id);

//Enter EmpID
	  driver.findElement(By.name(txt_searchfor)).sendKeys(searchfor);
//Click on Search Button
	  driver.findElement(By.xpath(btn_search)).click();
//Click on CheckBox
	  driver.findElement(By.name(checkbox_1)).click();
//Click On Delete Button
	  driver.findElement(By.xpath(btn_delete)).click();
	  System.out.println("Emp Info Deleted");
	  Log.info("Emp INfo Deleted");
  }
  public void mouseover() {
	 Actions ac = new Actions(driver);
	 ac.moveToElement(driver.findElement(By.linkText(lt_mouseover_PIM))).perform();
	 System.out.println("Mouse Over Completed");
	 driver.findElement(By.linkText(lt_addemp)).click();
	 System.out.println("New Emp Added");
	 Log.info("New Emp Added");
  }
	}