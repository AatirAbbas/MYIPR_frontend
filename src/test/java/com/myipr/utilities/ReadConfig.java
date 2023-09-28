package com.myipr.utilities;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		} catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}

	public String getEmail()
	{
		String email=pro.getProperty("Email");
		return email;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromePath");
		return chromepath;
	}
}
