package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_A {

	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed1;

	public Proceed_A(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getProceed1() {
		return proceed1;
	}
	

}
