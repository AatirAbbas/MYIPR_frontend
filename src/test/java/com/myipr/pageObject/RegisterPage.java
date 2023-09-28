package com.myipr.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegisterPage 
{
	WebDriver rdriver;
//	public static int type;
//	Random rand=new Random();
//	type=rand.nextInt(1,2);
	public RegisterPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(linkText="Join now")
	@CacheLookup
	WebElement SignUp;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[1]/div")
	@CacheLookup
	WebElement Personal;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div")
	@CacheLookup
	WebElement Business;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/button")
	@CacheLookup
	WebElement typeselected;
	
	@FindBy(id="firstName")
	@CacheLookup
	WebElement Fname;
	
	@FindBy(id="lastName")
	@CacheLookup
	WebElement Lname;
	
	@FindBy(id="username")
	@CacheLookup
	WebElement Uname;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement Pass;
	
	@FindBy(id="confirmPassword")
	@CacheLookup
	WebElement confPass;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[8]/button")
	@CacheLookup
	WebElement RegisterSubmit;
	
	public void JoinNow() {
		SignUp.click();
	}
	
	public void personaltype() {
		Personal.click();
	}
	
	public void businesstype() {
		Business.click();
	}
	
	public void typeAccount() {
		typeselected.click();
	}
	
	public void FirstName(String firstname) {
		Fname.sendKeys(firstname);
	}
	
	public void LastName(String lastname) {
		Lname.sendKeys(lastname);
	}
	
	public void UserName(String username) {
		Uname.sendKeys(username);
	}
	
	public void Email(String email) {
		Email.sendKeys(email);
	}
	
	public void PassWord(String password) {
		Pass.sendKeys(password);
	}
	
	public void ConfPass(String confpass) {
		confPass.sendKeys(confpass);
	}
	
	public void registerSubmit() {
		RegisterSubmit.click();
	}
}
