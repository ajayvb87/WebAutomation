package com.testcases1.common1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 {
	
	public WebDriver driver;
	
	public void init() throws IOException 
	{
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream(".\\src\\com\\Config\\Config.properties");
		p.load(f1);
		
		System.out.println(p.getProperty("browser"));
		
		
		if(p.getProperty("browser").equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ".//src//driverfiles//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(p.getProperty("browser").equals("mozilla"))
		{
			System.setProperty("webdriver.gecko.driver", ".//src//driverfiles//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(p.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
	}
	
	public void quit() 
	{
		driver.quit();
	}
	
	

}
