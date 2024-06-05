package org.qa.selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickConcept {

//	1. ---> Context Click ---> Right click 

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		List<WebElement> rightClickMenu = driver.findElements(By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

//		Actions actions = new Actions(driver);
//
//		actions.contextClick(rightClick).perform();

//		quit.click();
//		driver.findElement(By.xpath("//span[text()='Quit']")).click();

//		for (WebElement e : rightClickMenu) {
//			String menuText = e.getText();
//			   if (menuText.equals("Copy")) {
//				   e.click();
//				break;
//			}
//			
//		}

		By rightClick = By.xpath("//span[text()='right click me']");
		By quit = By.xpath("//span[text()='Quit']");

		selectRightClickMenu(rightClick, quit);
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	private static void selectRightClickMenu(By rightClickElementLocator, By rightMenuItem) {
		Actions actions = new Actions(driver);
		actions.contextClick(getElement(rightClickElementLocator)).perform();
		getElement(rightMenuItem).click();

	}

}
