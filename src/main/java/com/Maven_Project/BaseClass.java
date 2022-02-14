package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String name) {

    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe ");		
		
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static void launchUrl( String Url) {
		
		driver.get(Url);
		
	}
	
	public static void inputValues(WebElement element,String input) {

		element.sendKeys(input);
		
	}
	
	public static void clickOnElement(WebElement element) {

		element.click();
		
	}
	
	public static void screenshot(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
		
	}
	
	public static void close() {
		
		driver.close();

	}
	
	public static void quit() {
		
		driver.quit();

	}
	
	public static void navigateto(String url) {

		driver.navigate().to(url);
		
	}
	
	public static void navigateforward() {
		
		driver.navigate().forward();

	}
	
	public static void navigateback() {

		driver.navigate().back();
	}
	
	public static void refersh() {

		driver.navigate().refresh();
	}
	
	public static void getcurrenturl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("currenturl" + " " + currentUrl);
			
	}
	
	public static void gettitle() {

		String title = driver.getTitle();
		System.out.println("Title"+ " "+ title);
			
	}
	
	public static void selectbyvalue_Dd(WebElement element,String Values) {

		Select s = new Select(element);
		s.selectByValue(Values);
	}
	
	public static void selectbyindex_Dd(WebElement element, int Index) {

		Select s = new Select(element);
		s.selectByIndex(Index);

	}
	
	public static void selectbyvisibletext_Dd(WebElement element, String Text) {

		Select s = new Select(element);
		s.selectByVisibleText(Text);
	}
	
	public static void simplealert() {

		Alert simplealert = driver.switchTo().alert();
        simplealert.accept();		
	
	}
	
	public static void confirmalert() {

		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		
	}
	
	public static void confirmalertdismiss() {

		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
	}
	
	public static void promptalert() {
		
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();

	}
	
	public static void promptalertsendkeys(String input) {

		Alert promptalertsendkeys = driver.switchTo().alert();
		promptalertsendkeys.sendKeys(input);
		
	}
	
	public static void promptalertgettext() {
		
		Alert promptalertgettext = driver.switchTo().alert();
		promptalertgettext.getText();

	}
	
	public static void singleframe(int value) {

		driver.switchTo().frame(value);
	}
	
	public static void innerframe(WebElement element) {

		driver.switchTo().frame(element);
	}
	
	public static void outerframe(WebElement element) {
		
		driver.switchTo().frame(element);

	}
	
	public static void Action_Click(WebElement element) {

		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}
	
	public static void Action_Rightclick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}
	
	public static void Action_Doubleclick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}
	
	public static void draganddrop(WebElement drag, WebElement drop) {
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();

	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
