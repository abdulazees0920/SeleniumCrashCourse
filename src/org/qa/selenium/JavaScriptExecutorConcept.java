package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		WebElement Btn = driver.findElement(By.linkText("Continue"));
		
		
		//1. Selenium or WebElement Click
//		Btn.click();
		
		//2. Actions Click
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Btn).click().build().perform();
		
//		3. JavaScript Click
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		WebElement userName = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
		
		WebElement userName = driver.findElement(By.id("input-email"));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(false)", contactUs);
//		js.executeScript("arguments[0].setAttribute('value','Lokesh')", contactUs);
//		js.executeScript("arguments[0]. setAttribute('style', 'background: green; border: 9px solid red;');", userName);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
