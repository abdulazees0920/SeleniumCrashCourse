package org.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

//		boolean radioBtn = driver.findElement(By.name("radiooptions")).isDisplayed();
//		System.out.println(radioBtn);

//		String attribute = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"))
//				.getAttribute("class");
//		System.out.println(attribute);
		
		By name = By.xpath("//*[id=\"basicBootstrapForm\"]/div[1]/div[1]/input");		
		Elementutill eleUtil = new Elementutill(driver);
		
//		String attribute = eleUtil.getAttribute(name, "placeholder");
//		System.out.println(attribute);
		
		boolean enabled = eleUtil.getElement(name).isEnabled();
		System.out.println(enabled);
		
		
		
		
		

	}
	
	
	

}
