package com.testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	
	@BeforeSuite
	public void set_property() {

		System.out.println("Set Property");
	}
	@BeforeTest
	public void browser_launch() {
		
		System.out.println("Browser Launch");

	}
	@BeforeClass
	public void url_launch() {
		
		System.out.println("Url Launch");

	}
	@BeforeMethod
	public void login() {
		
		System.out.println("login");

	}
	@Test
	public void kids() {
		
		System.out.println("kids");
		
	}
	@Test(invocationCount = 4)
	public void girls() {

		System.out.println("girls");
		
	}
	@Test
	public void boys() {
		
		System.out.println("boys");

	}
	@AfterMethod
	public void logout() {
		
		System.out.println("Logout");

	}
	@AfterClass
	public void homepage() {

		System.out.println("Homepage");
	}
	@AfterTest
	public void clearCookies() {

		System.out.println("Delete Cookies");
	}
	@AfterSuite
	public void quitBrowser() {
		
		System.out.println("Quit Browser");

	}

}
