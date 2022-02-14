package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement payment;

	public Payment(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getPayment() {
		return payment;
	}
	

}
