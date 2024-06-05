package org.qa.seleniumtest;

import org.qa.selenium.BrowserUtil;

public class FlipkartTest {
	
	public static void main(String[] args) {
		
		BrowserUtil butil = new BrowserUtil();
		
		
		butil.Intialize_Driver("chrome");
		butil.launchUrl("https://www.flipkart.com/");
		butil.maximizePage();
		
		String pageTitle = butil.getPageTitle();
		System.out.println(pageTitle);
	
		String pageUrl = butil.getPageUrl();
		System.out.println(pageUrl);
		
		butil.quitBrowser();
		
	}
	
	
	
	
	
	
	
	
	

}
