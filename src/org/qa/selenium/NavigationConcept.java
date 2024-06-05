package org.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

		//1. automation steps
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		 driver.navigate().to("https://www.google.com/");
		 
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().to("https://www.amazon.com/");
		 
		 System.out.println(driver.getTitle()); 
		 
		 driver.navigate().refresh();
		 
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		
		 System.out.println(driver.getTitle()); 

		 
 
		 
	}

}
