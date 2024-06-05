package org.qa.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForElementsocated {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/contact-sales/");

		// Normal Way of creating List
//		List<WebElement> footerList = driver.findElements(By.xpath("//nav[@class='sc-662dedcb-0 fMAcTI']/div//span"));

		By footerList = By.xpath("//nav[@class='sc-662dedcb-0 fMAcTI']/div//span");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerList));
		
		List<WebElement> waitForElementsVisible = waitForElementsVisible(footerList,10);

	}

	private static List<WebElement> waitForElementsVisible(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	private static List<WebElement> waitForElementsPresence(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

}
