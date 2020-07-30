package com.bestbuy.qa.bdd.base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class PageBase {
	
protected WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void verifyPageTitle(String title) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(title, actualTitle);
	}

}
