package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	//private datatype refname
	//private WebElement refname
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign_in;

	public Home_Page(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSign_in() {
		return sign_in;
	}
	
	

}
