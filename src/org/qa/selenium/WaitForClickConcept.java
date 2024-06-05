package org.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForClickConcept  {

	 public static WebDriver  driver;
	
	public static void main(String[] args) {

		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		By loginBtn = By.xpath("//button[@type='submit']");

	    waitForElementToBeClickable(loginBtn, 5);

	}
	
	private static void waitForElementToBeClickable(By locator ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

	}

}
