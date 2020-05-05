package com.testcases1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages1.RegPage1;
import com.testcases1.common1.BaseTest1;



public class RegTestCase1 extends BaseTest1 {


@BeforeClass

public void openBrowser() throws IOException
{
	init();
}
	
	@Test
	public void userRegistration() throws InterruptedException 
	{
		
		
		RegPage1 rp=PageFactory.initElements(driver,RegPage1.class);
		
		
		rp.getMenu().gotoRegPage();
		Thread.sleep(2000);
		rp.enterPersonalDetails();
		Thread.sleep(2000);
		rp.enterOrgDetails();
		Thread.sleep(2000);
		rp.enterPWD_Submit();
		Thread.sleep(2000);
		rp.verifyTitle();
		rp.takeScreenshot();
		Thread.sleep(2000);
		rp.getMenu().gotoLoginPage();
		Thread.sleep(2000);
		rp.getMenu().doLogin();
		Thread.sleep(2000);
		rp.getMenu().doLogout();
		Thread.sleep(2000);	
	}

	@AfterClass
	
	public void closeBrowser() 
	{
		quit();
	}
}
