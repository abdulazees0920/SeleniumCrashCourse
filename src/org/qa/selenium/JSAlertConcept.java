package org.qa.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		// to get the text from the alert
		String alertText = alert.getText();
		System.out.println(alertText);

		// to accept the alert
		alert.accept();
		
		//to dismiss the alert
		alert.dismiss();
		
		// when we get prompt alert
		alert.sendKeys("Lokesh");
		
		

	}

}
