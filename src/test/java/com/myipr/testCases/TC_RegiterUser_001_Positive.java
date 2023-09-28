package com.myipr.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.myipr.pageObject.*;
import com.myipr.testData.RegisterData;

import java.io.IOException;
import java.util.Random;

public class TC_RegiterUser_001_Positive extends BaseClass
{
	RegisterData register=new RegisterData(); 
	public String random_username=RandomStringUtils.random(4, "0123456789abcdefghijkl");
	Random rand=new Random();
	int type=rand.nextInt(1,2);
	
	@BeforeClass
	public void setData()
	{
		register.setFirstname("TestQA");
		register.setLastname("QATest");
		register.setUsername("User"+random_username);
		register.setEmail("random"+random_username+"@gmail.com");
		register.setPassword("P@ssw0rd");
		register.setConfpass("P@ssw0rd");
	}
	@Test
	public void registerUser() throws IOException, InterruptedException
	{
		driver.get(baseUrl);
		Thread.sleep(2000);
		RegisterPage rp=new RegisterPage(driver);
		rp.JoinNow();
		Thread.sleep(2000);
		
		if(type==1)
		{
		rp.personaltype();
		}else {
			rp.businesstype();
		}
		//System.out.println();
		Thread.sleep(2000);
		rp.typeAccount();
		Thread.sleep(2000);
		rp.FirstName(register.getFirstname());
		Thread.sleep(2000);
		rp.LastName(register.getLastname());
		Thread.sleep(2000);
		rp.UserName(register.getUsername());
		Thread.sleep(2000);
		rp.Email(register.getEmail());
		Thread.sleep(2000);
		rp.PassWord(register.getPassword());
		Thread.sleep(2000);
		rp.ConfPass(register.getConfpass());
		Thread.sleep(2000);
		rp.registerSubmit();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://qa-myipr.p2eppl.com/verify"))
		{
			Assert.assertTrue(true);
			driver.switchTo().defaultContent();
		}else {
			captureScreen(driver, "Register User");
			Assert.assertTrue(false);
		}
	}
	
	

}
