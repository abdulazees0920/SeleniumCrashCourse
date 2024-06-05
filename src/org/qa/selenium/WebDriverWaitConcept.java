package org.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/contact-sales/");
//
//		WebElement name = driver.findElement(By.id("Form_getForm_FullName"));
//		WebElement phone = driver.findElement(By.id("Form_getForm_Contact"));
//		WebElement email = driver.findElement(By.id("Form_getForm_Email"));

//		name.sendKeys("Lokesh");
//		phone.sendKeys("69521521");
//		email.sendKeys("lokesh12@gmail.com");

		By name = By.id("Form_getForm_FullName");
		By phone = By.id("Form_getForm_Contact");
		By email = By.id("Form_getForm_Email");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele_name = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		ele_name.sendKeys("Lokesh");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele_name = wait.until(ExpectedConditions.visibilityOfElementLocated(name));
//		ele_name.sendKeys("Lokesh");
//		
//		driver.findElement(email).sendKeys("Lokjesh@gmail.com");
//		driver.findElement(phone).sendKeys("645815161");

		waitForElementVisible(name, 10).sendKeys("Lokesh");
		waitForElementPresence(email, 5).sendKeys("lokesh@gmail.com");

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	private static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	private static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

}
