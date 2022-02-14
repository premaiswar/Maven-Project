package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_D {
	
	public WebDriver driver;
	
	@FindBy(name="processCarrier")
	private WebElement proceed4;

	public Proceed_D(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getProceed4() {
		return proceed4;
	}

}
