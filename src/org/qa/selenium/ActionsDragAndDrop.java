package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
//		WebElement angularSrc = driver.findElement(By.id("angular"));
//		WebElement mongoSrc = driver.findElement(By.id("mongo"));
//		WebElement target = driver.findElement(By.id("droparea"));
		
//		WebElement flipKartfashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		WebElement source = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement target = driver.findElement(By.id("trash"));
		
		
		Actions act = new Actions(driver);
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
//		act.dragAndDrop(mongoSrc, target).build().perform();
//		act.dragAndDrop(angularSrc, target).build().perform();
//		Thread.sleep(4000);
//		act.dragAndDrop(source, target).build().perform();
		
//		act.moveToElement(flipKartfashion).perform();
		
		
		
	}

}
