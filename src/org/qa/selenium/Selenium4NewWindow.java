package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4NewWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		driver.switchTo().newWindow(WindowType.WINDOW); // selenium 4.x

		driver.navigate().to("https://google.com");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://amazon.com");

	}

}
