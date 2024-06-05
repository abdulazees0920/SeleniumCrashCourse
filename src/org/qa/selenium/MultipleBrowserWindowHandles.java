package org.qa.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent Window Id is : " + parentWindowId);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			if (!parentWindowId.equals(windowId)) {
				driver.switchTo().window(windowId);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}

		}

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is : " + driver.getTitle());
		System.out.println(parentWindowId);

	}
}
