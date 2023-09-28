package com.myipr.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import com.myipr.utilities.XLUtils;
import org.testng.annotations.Test;
import com.myipr.pageObject.LoginPage;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(user);
		Thread.sleep(2000);
		lp.setPassword(pwd);
		Thread.sleep(2000);
		lp.clickSubmit();
		
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
	
//	public boolean isAlertPresent()
//	{
//		
//	}

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/myipr/testData/TestingData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		System.out.println(rownum);
		System.out.println(colcount);
		System.out.println(path);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); //1 0
				System.out.println(logindata[i-1][j]);
			}
			
		}
		return logindata;
	}
}
