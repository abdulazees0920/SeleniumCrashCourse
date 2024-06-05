package org.qa.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By choiceLocator = By
				.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class='comboTreeItemTitle']");

		selectChoices(choiceLocator, "choice 1", "choice 2", "choice 2 1");
//		selectChoices(choiceLocator, "choice 2");
//		selectChoices(choiceLocator, "choice 9");

	}

	/*
	 * If you want to select all the values enter "Select_All"
	 */

	private static void selectChoices(By locator, String... value) {

		List<WebElement> choicesList = driver.findElements(locator);
		System.out.println(choicesList.size());

		boolean flag = false;

		if (value[0].trim().equalsIgnoreCase("select_All")) {
			for (WebElement e : choicesList) {
				flag = true;
				e.click();

			}

		} else {
			for (WebElement e : choicesList) {
				String choiceText = e.getText();
//				System.out.println(choiceText);

				for (int i = 0; i < value.length; i++) {
					if (choiceText.equals(value[i])) {
						flag = true;
						e.click();
						break;

					}

				}

			}

		}
		if (flag == false) {
			System.out.println("Please enter the valid choice " + value[0] + " is Invalid");
		}

	}
}
