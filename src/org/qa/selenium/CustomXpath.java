package org.qa.selenium;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		// xpath:

//		1. Absolute Xpath
//		/html/body/main/div[2]/div/div/form/div/div[2]/div/div/form/div[1]/input

//		2. Relative Xpath
//		1.) xpath by Attribute:-

		//input[@id='input-email']

//	    2.) Xpath By Text (Full text Value):-

		//label[text()='E-Mail Address']
		
//		3.) Xpath by text ():-
		
//		Partially text value
		//label[contains(text(),'Address')]
		
//		using Attribute Value
		//input[contains(@id,'input-email')]
		
		//use-Case
//		1. id = test_123
//		2. id = test_564
//		3. id = test_789
		
		//input[contains(@id,'test_')]
		
//		4.) Xpath using Position:-

		//div[@class='list-group mb-3']/a[7]
		
		
//		5.) Xpath by Multiple Attributes:-
		
		
//		1. attr wit attr
		//input[@id='input-email' and @name='email']
		
//		2. text() and attr
		//label[text()='E-Mail Address' and @class ='col-form-label' ]
		
		
		
//		Xpath axes:
		
//		parent to child ---> Allowed
//		child to parent ---> Allowed (BackWard traversing)
		
		
		
		
//		By name = By.xpath("//label[text()='E-Mail Address' and @class ='col-form-label' ]");
		
		
		
		

	}

}
