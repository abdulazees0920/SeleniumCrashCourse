package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

//		WebElement parentMenu = driver.findElement(By.xpath("//span[text()='Fashion']"));

//		WebElement childMenu1 = driver.findElement(By.linkText("Men Footwear"));
//		WebElement childMenu2 = driver.findElement(By.linkText("Men's Formal Shoes"));

//		Actions act = new Actions(driver);
//
////		1.
//		act.moveToElement(parentMenu).perform();
//
////		2.
//		act.moveToElement(driver.findElement(By.linkText("Men Footwear"))).perform();
//		Thread.sleep(4000);
//
////		3.
//		act.click(driver.findElement(By.linkText("Men's Formal Shoes"))).perform();
		
		By parentMenu = By.xpath("//span[text()='Fashion']");
		
		levelThreeMenuHandling(parentMenu, "Women Ethnic", "Women Sarees");
		
		

	}
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}
	
	public static void levelThreeMenuHandling(By parentMenu, String l1, String l2) throws InterruptedException {
		Actions act = new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);
		
	    driver.findElement(By.linkText(l2)).click();

		
	}
	
	public static void levelFourMenuHandling(By parentMenu, String l1, String l2, String l3) throws InterruptedException {
		Actions act = new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1500);
		
	    driver.findElement(By.linkText(l3)).click();

		
	}

}
