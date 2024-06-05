package org.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//1st login
		WebElement name = driver.findElement(By.id("Form_getForm_FullName"));
		WebElement phone = driver.findElement(By.id("Form_getForm_Contact"));
		WebElement email = driver.findElement(By.id("Form_getForm_Email"));
		
		
		//2nd page accounts page:
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ele4 - 2
		//ele5- 0
		//ele6- 2
		
		//3rd page payment page:
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ele7- 0
        //ele8- 0
		//ele9- 0
		
	}

}
