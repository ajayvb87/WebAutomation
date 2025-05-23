package com.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pages1.common1.BasePage1;

public class LoginPage1 extends BasePage1{

	
	public LoginPage1(WebDriver driver) 
	{
		super(driver);
		System.out.println("Constructor called");
		
	}
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Forgot password?") WebElement furgot;
	@FindBy(how=How.ID,using="Email") WebElement emil;
	public void pwdRecovery() 
	{
		furgot.click();
		emil.sendKeys("ajay.vb87@gmail.com");
		System.out.println("yes");
		
	}
}
