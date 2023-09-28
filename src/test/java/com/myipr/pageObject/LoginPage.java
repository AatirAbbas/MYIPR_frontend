package com.myipr.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement txtPass;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[3]/button")
	@CacheLookup
	WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]")
	@CacheLookup
	WebElement profiledropdown;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div[3]/div[2]/div/a[4]")
	@CacheLookup
	WebElement LogoutButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div[3]/div[3]/div[2]/div[2]/button")
	@CacheLookup
	WebElement LogoutCnfm;
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}

	public void setPassword(String Pass) {
		txtPass.sendKeys(Pass);
	}

	public void clickSubmit() {
		LoginButton.click();
	}
	
	public void clickdropdown() {
		profiledropdown.click();
	}
	
	public void clickLogout() {
		LogoutButton.click();
	}
	
	public void Logoutcnfm() {
		LogoutCnfm.click();
	}
	
	
	
}
