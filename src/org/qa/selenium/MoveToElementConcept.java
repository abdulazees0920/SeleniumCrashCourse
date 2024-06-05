package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

//		WebElement parentMenu = driver.findElement(By.xpath("//span[text()='Two Wheelers']"));
		By parentMenu = By.xpath("//span[text()='Two Wheelers']");
		By childmenu = By.linkText("Petrol Vehicles");
		By childMenu2 = By.linkText("Electric Vehicles");
		
		levelTwoMethodHandling(parentMenu, childMenu2);
		

//		Actions act = new Actions(driver);

//		act.moveToElement(parentMenu).perform();

		// 1.click
//		driver.findElement(By.linkText("Electric Vehicles")).click();

		// 2. action click
//		act.moveToElement(driver.findElement(By.linkText("Petrol Vehicles"))).click().perform();
		

	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}
	
	public static void levelTwoMethodHandling(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		getElement(childMenu).click();

	}

}
