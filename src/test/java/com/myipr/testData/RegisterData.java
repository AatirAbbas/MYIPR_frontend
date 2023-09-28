package com.myipr.testData;

public class RegisterData 
{
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
	
}
