package com.testcases1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages1.LoginPage1;
import com.testcases1.common1.BaseTest1;

public class LoginTestCase1 extends BaseTest1 {
	

	
	@BeforeClass
	
	public void openBrowser() throws IOException 
	{
		init();
	}
	

	
	@Test
	
	public void userLogin() throws InterruptedException 
	{
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage1 lp=PageFactory.initElements(driver, LoginPage1.class);
		//lp.gotoLoginPage();
		lp.getMenu().gotoLoginPage();
		Thread.sleep(3000);
		lp.getMenu().doLogin();
		
		Thread.sleep(3000);
		//lp.logOut();
		lp.getMenu().doLogout();
		Thread.sleep(3000);
		lp.getMenu().gotoRegPage();
		Thread.sleep(3000);
		lp.verifyTitle();
	}
	
	@Test
	public void PWDRecovery() throws InterruptedException 
	{
		
		
		LoginPage1 lp=PageFactory.initElements(driver, LoginPage1.class);
		//lp.gotoLoginPage();
		lp.getMenu().gotoLoginPage();
		Thread.sleep(3000);
		lp.pwdRecovery();
		Thread.sleep(3000);
		lp.verifyErromsg();
		lp.takeScreenshot();
		lp.getMenu().doSearch();
		lp.isElementPresent();
		
	}

	@AfterClass
	public void closeBroswer() 
	{
		quit();
	}
}
