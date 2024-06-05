package org.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugAndSessionId {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
//		ChromeDriver: chrome on windows (70b452b18e49a80ea31de54ce130bb34)

		driver.get("https://www.google.com/");
//		ChromeDriver: chrome on windows (70b452b18e49a80ea31de54ce130bb34)

		String title = driver.getTitle();
		System.out.println(title);

//		ChromeDriver: chrome on windows (70b452b18e49a80ea31de54ce130bb34)
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.quit();
//		ChromeDriver: chrome on windows (NULL)
//		Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
//		ChromeDriver: chrome on windows (70b452b18e49a80ea31de54ce130bb34)
//		Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	}

}
