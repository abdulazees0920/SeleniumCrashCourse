package org.qa.selenium;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver Intialize_Driver(String BrowserName) {

		System.out.println("Running on......" + BrowserName);

		if (BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BrowserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter valid browser name");
		}
		

		return driver;

	}

	public void launchUrl(String url) {

		if (url == null) {
			System.out.println("url is null.....");
		}

		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {

			try {
				throw new InvalidArgumentException("http is missing......");
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

		driver.get(url);

	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();

	}
	
	public void quitBrowser() {
		driver.quit();

	}
	
	public void maximizePage() {
		driver.manage().window().maximize();

	}

}
