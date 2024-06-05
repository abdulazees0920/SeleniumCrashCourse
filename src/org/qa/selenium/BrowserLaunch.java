package org.qa.selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajeesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//1. automation steps
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");//--> get a webpage
		
		 String title = driver.getTitle();// to get a webpage tittle
		 System.out.println("title of the webpage  " + title);
		 
		 String currentUrl = driver.getCurrentUrl();// to get the webpage current url
		 System.out.println(currentUrl);
		 
		 //2. validation --> actual vs expectected
		
		 
		 if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}
		
		 
//		 driver.close();

		 driver.quit();
	}

}
