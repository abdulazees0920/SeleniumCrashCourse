package org.qa.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();

		// to get the windowId of the parent window
//		String parentWindowId = driver.getWindowHandle();
//		System.out.println(parentWindowId);

		// to get the windowId of all the window presented
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println(parentWindowId);

		String childWindowId = it.next();
		System.out.println(childWindowId);

		driver.switchTo().window(childWindowId);
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.name("username")).sendKeys("Lokesh");
		
		

	}
}
