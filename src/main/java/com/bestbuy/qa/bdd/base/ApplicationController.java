package com.bestbuy.qa.bdd.base;



import org.openqa.selenium.WebDriver;

import com.bestbuy.qa.bdd.pages.AppleBrandStorePage;
import com.bestbuy.qa.bdd.utilities.UtilClass;


public class ApplicationController extends PageBase {
	
	private HomePage homePage = null;
	private AppleBrandStorePage appleBrandPage = null;
	private UtilClass utilClass = null;
	

	public ApplicationController(WebDriver driver) {
		super(driver);
	}
	
	
	public UtilClass utilClass() {
		if (utilClass == null) {
			utilClass = new UtilClass(driver);
		}
		return utilClass;
	}
	
	public HomePage homePage() {
		if(homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public AppleBrandStorePage appleBrandPage() {
		if(appleBrandPage == null) {
			appleBrandPage = new AppleBrandStorePage(driver);
		}
		return appleBrandPage;
	}
	
	


	

}
