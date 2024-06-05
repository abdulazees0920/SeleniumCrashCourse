package org.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

//		By name = By.name("proceed");
		driver.findElement(By.name("proceed")).click();

//		Alert alert = driver.switchTo().alert();
//
//		// to get the text from the alert
//		String alertText = alert.getText();
//		System.out.println(alertText);
//
//		// to accept the alert
//		alert.accept();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();

	    waitForAlert(10).accept();
		
		
	}
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	private static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	private static void acceptAlert(int timeout) {
		waitForAlert(timeout).accept();

	}

	private static void dismissAlert(int timeout) {
		waitForAlert(timeout).dismiss();

	}

	private static String doAlertGetText(int timeout) {
		return waitForAlert(timeout).getText();

	}

	private static void doAlertGetText(int timeout, String value) {
		waitForAlert(timeout).sendKeys(value);

	}

}
