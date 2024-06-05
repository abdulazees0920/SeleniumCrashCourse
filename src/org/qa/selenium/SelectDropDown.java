package org.qa.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
//
//		By country = By.id("Form_getForm_Country");
//
//		Elementutill eleUtil = new Elementutill(driver);
//		
//		eleUtil.selectDropDownByGetOptions(country,"India");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		Select select = new Select(country);
		
		select.selectByVisibleText("India");

//		List<WebElement> countryList = select.getOptions();
//		
//		for(WebElement e : countryList) {
//			String countryText = e.getText();
//			if (countryText.contains("India")) {
//				e.click();
//				break;
//			}

		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id=\"Form_getForm_Country\"]//option"));

		for (WebElement e : countryList) {
			String countryText = e.getAttribute("value");
			if (countryText.contains("Algeria")) {

				e.click();
				break;
			}

		}

	}

}

//		// 1. Select By Index
//		select.selectByIndex(6);
//
////
////		Thread.sleep(4000);
//
////		2. Select By value
//		select.selectByValue("India");
//
////		3. Select By Visible text
//		select.selectByVisibleText("Greece");

//	}

//}
