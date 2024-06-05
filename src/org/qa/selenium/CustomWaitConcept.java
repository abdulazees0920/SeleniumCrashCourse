package org.qa.selenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// static wait ---> dynamic wait

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		WebElement button = driver.findElement(By.xpath("//a[text()='Continue']"));
		By clickbtn = By.xpath("//a[text()='Continue']");
		
//		customRetryElement(clickbtn, 10, 1000);
		retryingElement(clickbtn, 10, 1000).click();
		
		

	}

	public static WebElement retryingElement(By locator, int timeOut, int pollingTime) {

		WebElement element = null;

		int attempts = 0;
		while (attempts < timeOut) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + " for : " + locator);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}

		return element;
	}
	
	
	private static WebElement customRetryElement(By locator, int timeout, int pollingtime) {
		
		WebElement element = null;
		
		int attempts = 0;
		
		while (attempts < timeout) {
			try {
			element = driver.findElement(locator);
			break;
			}catch(NoSuchElementException e){
				System.out.println("element not found in attempt : " + attempts +" for : " + locator);
				try {
					Thread.sleep(pollingtime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		
		if (element == null) {
			try {
			throw new Exception("ELEMENTNOTFOUND");
			}
			catch(Exception e) {
				System.out.println("element is not found.... tried for : " + timeout + "secs" + "with the interval of : " + pollingtime + "ms");
			}
			
		}
		return element;
		

		
	}
}
