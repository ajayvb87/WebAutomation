package com.pages1.common1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPage1 {
	
	
	public MenuPage1(WebDriver driver) 
	{
		
	}

	@FindBy(how=How.XPATH,using="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") WebElement Regbutton;
	public void gotoRegPage() 
	{
		Regbutton.click();
	}

	
	@FindBy(how=How.LINK_TEXT,using="Log in") WebElement regLink;
	public void gotoLoginPage() 
	{
		regLink.click();
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Log out") WebElement logOut;
	public void doLogout() 
	{
		logOut.click();
	}
	
	@FindBy(how=How.ID,using="Email") WebElement emid;
	@FindBy(how=How.ID,using="Password") WebElement pswd;
	@FindBy(how=How.XPATH,using="//input[@class='button-1 login-button']") WebElement lugIn;
	public void doLogin() 
	{
		emid.sendKeys("ajay.vb87@gmail.com");
		pswd.sendKeys("Poorna@123");
		lugIn.click();
	}
	
	public void doSearch() 
	{
		
	}
	
	
}
