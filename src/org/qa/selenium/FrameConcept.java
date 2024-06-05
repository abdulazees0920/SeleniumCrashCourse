package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		//frame
		//iframe
		
		
		// Index
//		driver.switchTo().frame(3);  
//		// String or name
//		driver.switchTo().frame("main");
		// WebElement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();
		
		
		//selenium 4.x 
		driver.switchTo().parentFrame();
		
		
	
	}

}
