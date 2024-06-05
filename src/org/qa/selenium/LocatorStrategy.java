package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {

	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		// > create a webelement(By using locator) + action(click, sendkeys, dblclick,

//		
//		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Lokesh");
//		driver.findElement(By.id("Form_getForm_Email")).sendKeys("lokesh9840@gmail.com");
//		

		// 2.

//		WebElement name = driver.findElement(By.id("Form_getForm_FullName"));
//		WebElement email = driver.findElement(By.id("Form_getForm_Email"));
//		
//		name.sendKeys("Lokesh");
//		email.sendKeys("lokesh9840@gmail.com");

//		3. By 

//		By name = By.id("Form_getForm_FullName");
//		By email = By.id("Form_getForm_Email");
//		
//		
//		driver.findElement(name).sendKeys("Lokesh");
//		driver.findElement(email).sendKeys("lokesh9840@gmail.com");
//		

//		4. By locator with ElementUtil class having generic method

//		By name = By.id("Form_getForm_FullName");
//		By email = By.id("Form_getForm_Email");
//
//		WebElement firstName = getElement(name);
//		WebElement email1 = getElement(email);
//
//		firstName.sendKeys("lokesh");
//		email1.sendKeys("lokesh9840@gmail.com");
		
		
//		5. By locator with ElementUtil class having generic method
		
		By name = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		
		doSendKeys(name, "Lokesh");
		doSendKeys(email, "lokesh9840@gmail.com");
		
		
		
		
		

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}
	
	public static void doSendKeys(By locator , String value) {

		getElement(locator).sendKeys(value);
//		driver.findElement(locator).sendKeys(value);
		
		
	}

}
