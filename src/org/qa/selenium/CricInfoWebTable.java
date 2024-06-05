package org.qa.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/national-t20-cricket-tournament-nepal-2024-1429206/madhesh-province-vs-sudur-paschim-province-19th-match-1429226/full-scorecard");

//		List<WebElement> scoreCardList = driver.findElements(By.xpath("(//span[text()='Rahul Mandal'])[1]//ancestor::td/parent::tr/td"));

		List<WebElement> PlayerScoreList = selectUser("Bishal Patel");

		for (WebElement e : PlayerScoreList) {

			String text = e.getText();
			System.out.println(text);

		}

	}

	public static List<WebElement> selectUser(String userName) {
		return driver.findElements(By.xpath("(//span[text()='" + userName + "'])[1]//ancestor::td/parent::tr/td"));

	}

}
