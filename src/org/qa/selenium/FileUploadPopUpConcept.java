package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//1. getting webElement with madatory type = file
		//2. instead of using click we should use sendKeys("path of the desired file") 
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ajeesh\\Downloads\\marvel wallpaper.jpg");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
