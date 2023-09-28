package com.myipr.testCases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.myipr.pageObject.*;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseUrl);
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(Email);
		Thread.sleep(2000);
		lp.setPassword(Password);
		Thread.sleep(2000);
		
		lp.clickSubmit();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://qa-myipr.p2eppl.com/"))
		{
			Assert.assertTrue(true);
			lp.clickdropdown();
			Thread.sleep(2000);
			lp.clickLogout();
			Thread.sleep(2000);
			lp.Logoutcnfm();
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
		}else
		{
			captureScreen(driver, "loginTest"); 
			Assert.assertTrue(false);
		}
	}
}
