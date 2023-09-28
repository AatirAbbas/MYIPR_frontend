package com.myipr.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.TakesScreenshot;

import com.myipr.testData.RegisterData;
import com.myipr.utilities.ReadConfig;

public class BaseClass extends RegisterData
{
	ReadConfig readconfig=new ReadConfig();
	
	public String baseUrl=readconfig.getApplicationURL();                               //"https://qa-myipr.p2eppl.com/login";
	public String Email=readconfig.getEmail();											//"sharmila217@yopmail.com";
	public String Password=readconfig.getPassword();									//"Admin@1234";
	public static WebDriver driver;
	
	
	public static String firstname;
	public static String lastname;
	public static String email;
	public static String username;
	public static String password;
	public static String confpass;
	
	public static String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		RegisterData.firstname = firstname;
	}
	public static String getLastname() {
		return lastname;
	}
	public static void setLastname(String lastname) {
		RegisterData.lastname = lastname;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		RegisterData.email = email;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		RegisterData.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		RegisterData.password = password;
	}
	public static String getConfpass() {
		return confpass;
	}
	public static void setConfpass(String confpass) {
		RegisterData.confpass = confpass;
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());       //System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		//Logger logger=Logger.getLogger("MYIPR Frontend");
		//PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
