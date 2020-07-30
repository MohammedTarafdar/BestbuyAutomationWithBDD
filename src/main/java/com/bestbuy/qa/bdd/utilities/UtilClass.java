package com.bestbuy.qa.bdd.utilities;

import org.openqa.selenium.WebDriver;
import com.bestbuy.qa.bdd.base.PageBase;

public class UtilClass extends PageBase {

	public UtilClass(WebDriver driver) {
		super(driver);
	}
	
	public void delayFor(int timeMS) {
		try {
			Thread.sleep(timeMS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	

}
