package org.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		By contactSales = By.xpath("(//button[text()='Contact Saless'])[2]");
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(2000));
//		wait.withMessage("Exception Element Not Found").withTimeout(null)
//		wait.until(ExpectedConditions.elementToBeClickable(contactSales)).click();
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.withMessage("Element is not visible").ignoring(ElementNotInteractableException.class)
//				.pollingEvery(Duration.ofMillis(2000));

//		wait.until(ExpectedConditions.elementToBeClickable(contactSales)).click();

	}

}
