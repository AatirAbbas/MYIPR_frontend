package com.myipr.testCases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.myipr.utilities.ReadConfig;
public class BaseClass2 
{
	ReadConfig readconfig=new ReadConfig();
	
	public String baseUrl="https://qa-myipr.p2eppl.com/login";
	public String Email= "sharmila217@yopmail.com";
	public String Password= "Admin@1234";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		//Logger logger=Logger.getLogger("MYIPR Frontend");
		//PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
