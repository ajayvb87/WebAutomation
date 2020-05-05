package com.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pages1.common1.BasePage1;

public class RegPage1 extends BasePage1 {
	
	public RegPage1(WebDriver driver) 
	{
		super(driver);
		System.out.println("Constructor called");	
	}

	
	@FindBy(how=How.ID,using="gender-male") WebElement genderClick;
	@FindBy(how=How.ID,using="FirstName") WebElement firstName;
	@FindBy(how=How.ID,using="LastName") WebElement lastName;
	@FindBy(how=How.NAME,using="DateOfBirthDay") WebElement birthDate;
	@FindBy(how=How.NAME,using="DateOfBirthMonth") WebElement birthMonth;
	@FindBy(how=How.NAME,using="DateOfBirthYear") WebElement birthYear;
	

	public void enterPersonalDetails() 
	{
		genderClick.click();
		firstName.sendKeys("Ajay");
		lastName.sendKeys("Bharadwaj");
		birthDate.sendKeys("27");
		birthMonth.sendKeys("June");
		birthYear.sendKeys("1987");
	}
	@FindBy(how=How.ID,using="Company") WebElement companyName;
	public void enterOrgDetails() 
	{
		companyName.sendKeys("Lnt");
	}

	@FindBy(how=How.ID,using="Password") WebElement pswrd;
	@FindBy(how=How.ID,using="ConfirmPassword") WebElement confpswd;
	@FindBy(how=How.ID,using="register-button") WebElement regClick;
	public void enterPWD_Submit() 
	{
		pswrd.sendKeys("Poorna@123");
		confpswd.sendKeys("Poorna@123");
		regClick.click();
		
		
	}

	
	

}
