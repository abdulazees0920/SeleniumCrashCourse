package org.qa.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementutill {

	private static WebDriver driver;

	public Elementutill(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	public void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	public String getAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementCount(By locator) {
		return driver.findElements(locator).size();

	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String eleText = e.getText();
			System.out.println(eleText);
			eleTextList.add(eleText);
		}
		return eleTextList;

	}

	public List<String> getElementsAttributeList(By locator, String attrvalue) {
		List<WebElement> attrList = getElements(locator);
		List<String> eleattrList = new ArrayList<String>();
		for (WebElement e : attrList) {
			String eleattr = e.getAttribute(attrvalue);
			System.out.println(eleattr);
			eleattrList.add(eleattr);
		}
		return eleattrList;

	}

	/********************************************************************
	 * Select
	 ********************************************************/

	public void selectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void selectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

	public void selectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public void selectDropDownByGetOptions(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String optionsText = e.getText();
			if (optionsText.contains(value)) {
				e.click();
				break;
			}

		}

	}

	/*
	 * If the dropDown has multiple value select If you want to select all the
	 * values enter "Select_All"
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

	// ********************************************* Actions
	// *****************************************************************//

	public void levelTwoMethodHandling(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		getElement(childMenu).click();

	}

	public void levelThreeMenuHandling(By parentMenu, String l1, String l2) throws InterruptedException {
		Actions act = new Actions(driver);

		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);

		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);

		driver.findElement(By.linkText(l2)).click();

	}

//	*************************************************** wait & Alert **********************************************************************************

	/*
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 */

	private static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	/*
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 */

	private static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	private static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	private static void acceptAlert(int timeout) {
		waitForAlert(timeout).accept();

	}

	private static void dismissAlert(int timeout) {
		waitForAlert(timeout).dismiss();

	}

	private static String doAlertGetText(int timeout) {
		return waitForAlert(timeout).getText();

	}

	private static void doAlertGetText(int timeout, String value) {
		waitForAlert(timeout).sendKeys(value);

	}

}
