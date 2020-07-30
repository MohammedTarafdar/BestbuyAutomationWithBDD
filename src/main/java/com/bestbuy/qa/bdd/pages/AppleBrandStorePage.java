package com.bestbuy.qa.bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.qa.bdd.base.PageBase;

public class AppleBrandStorePage extends PageBase {

	public AppleBrandStorePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//
	@FindBy(linkText="Mac")
	private WebElement macLink;
	
	@FindBy(xpath = "//*[text()=\"MacBook Pro\"]")
	private WebElement macBookProLink;
	
	
	
	
	public void clickMacLink() {
		macLink.click();
	}
	
	public void clickmacBookProLink() {
		macBookProLink.click();
	}
	
	public void verifyLandingPageTitle() {
		super.verifyPageTitle("Apple MacBook Pro - Best Buy");
	}
	
	public void verifyPageTitle() {
		super.verifyPageTitle("Apple Brand Store: Apple Products - Best Buy");
	}
	
	

}
