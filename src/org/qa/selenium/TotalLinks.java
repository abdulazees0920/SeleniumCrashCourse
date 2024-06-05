package org.qa.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

//		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		By link = By.tagName("a");

		Elementutill ref = new Elementutill(driver);

//		List<String> elementsTextList = ref.getElementsTextList(link);
//		System.out.println(elementsTextList);

		ref.getElementsAttributeList(link, "alt");

//		for (int i = 0; i < TotalLinks.size(); i++) {
//			String text = TotalLinks.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(text);
//			}
//
//		}

//		for (WebElement e : TotalLinks) {
//
//			String text = e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
//
//		By tagName = By.tagName("a");
//
//		Elementutill eleUtil = new Elementutill(driver);
//
//		List<WebElement> amazonList = eleUtil.getElements(tagName);
//
//		for (WebElement e : amazonList) {
//			String attrText = e.getAttribute("href");
//			System.out.println(attrText);
//
//		}
//		

	}

}
