package com.pages1.common1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage1 {
	MenuPage1 mp;
	public BasePage1(WebDriver driver) 
	{
		mp=PageFactory.initElements(driver, MenuPage1.class);
	}
	
	public MenuPage1 getMenu() 
	{
		return mp;
	}
	public void verifyTitle() 
	{
	
	}

	public void isElementPresent() 
	{
	
	}
	
	public void takeScreenshot() 
	{
	
	}
	
	public void verifyErromsg() 
	{
	
	}

}
