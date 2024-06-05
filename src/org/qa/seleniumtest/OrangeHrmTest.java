package org.qa.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.qa.selenium.BrowserUtil;
import org.qa.selenium.Elementutill;

public class OrangeHrmTest {
	public static void main(String[] args) {

		BrowserUtil butil = new BrowserUtil();
		
		WebDriver driver = butil.Intialize_Driver("chrome");
		butil.launchUrl("https://www.orangehrm.com/en/contact-sales/");
		
		By name = By.id("Form_getForm_FullName");
		By phone = By.id("Form_getForm_Contact");
		By email = By.id("Form_getForm_Email");
	
		
		Elementutill eleutil = new Elementutill(driver);
		
		eleutil.doSendKeys(name, "Lokesh");
		eleutil.doSendKeys(email, "lokesh123@gmail.com");
		eleutil.doSendKeys(phone, "6380184878");
		
		
		
		
	}

}
