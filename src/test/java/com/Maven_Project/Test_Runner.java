package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Singleton_Design_Pattern.Page_Object_Manager;
import com.helper.File_Reader_Manager;
import com.pomclass.Add_Cart;
import com.pomclass.Confirm;
import com.pomclass.Dress_Cat;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.Payment;
import com.pomclass.Proceed_A;
import com.pomclass.Proceed_B;
import com.pomclass.Proceed_C;
import com.pomclass.Proceed_D;
import com.pomclass.Terms;

public class Test_Runner extends BaseClass {
	
	public static WebDriver driver = browserlaunch("chrome");
	
	public static Page_Object_Manager q = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
				
		
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		
		clickOnElement(q.getInstanceHp().getSign_in());
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		inputValues(q.getInstanceLp().getMail(),email);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValues(q.getInstanceLp().getPassword(),password);
		
		clickOnElement(q.getInstanceLp().getLogin());
					
		clickOnElement(q.getInstanceDress().getTshirt());
		
//		//WebElement qview = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
//     	//qview.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
        clickOnElement(q.getInstanceCart().getAddcart());
		
		clickOnElement(q.getInstanceProceed().getProceed1());		
		
		clickOnElement(q.getInstanceProceed1().getProceed2());
			
		clickOnElement(q.getInstanceProceed2().getProceed3());
		
		clickOnElement(q.getInstanceTerms().getT_c());
		
		clickOnElement(q.getInstanceProceed3().getProceed4());
		
		clickOnElement(q.getInstancePayment().getPayment());
		
		clickOnElement(q.getInstanceConfirm().getConfirm());
		
		
		
		
		
		
	}

	
	

}
