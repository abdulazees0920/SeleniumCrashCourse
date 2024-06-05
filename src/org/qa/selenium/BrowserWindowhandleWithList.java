package org.qa.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandleWithList {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowId = handlesList.get(0);
		
		String childWindowId = handlesList.get(1);
		
		driver.switchTo().window(childWindowId);
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.name("username")).sendKeys("Lokesh");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
