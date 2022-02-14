package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_C {
	
	public WebDriver driver;
	
	@FindBy(name="processAddress")
    private WebElement proceed3;

	public Proceed_C(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getProceed3() {
		return proceed3;
	}
	
}
