package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Add to cart']")
    private WebElement addcart;

	public Add_Cart(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	
	
	
	}

	public WebElement getAddcart() {
		return addcart;
	}
}
