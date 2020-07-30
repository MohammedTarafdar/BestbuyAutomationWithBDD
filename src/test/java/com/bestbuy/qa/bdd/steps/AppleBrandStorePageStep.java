package com.bestbuy.qa.bdd.steps;

import cucumber.api.java.en.*;

public class AppleBrandStorePageStep extends StepBase {
	
	
	
	
	@Given("Useer already in AppleBrandStore page")
	public void useer_already_in_AppleBrandStore_page() {
		controller.utilClass().navigateTo("https://www.bestbuy.com/site/brands/apple/pcmcat128500050005.c?id=pcmcat128500050005");
	    
	}

	@When("User click on Mac link")
	public void user_click_on_Mac_link() {
	   controller.appleBrandPage().clickMacLink();
	   controller.utilClass().delayFor(5000);
	}

	@When("User click on MacBook Pro link")
	public void user_click_on_MacBook_Pro_link() {
	    controller.appleBrandPage().clickmacBookProLink();
	    controller.utilClass().delayFor(5000);
	}

	@Then("User land on Apple MacBook Pro page")
	public void user_land_on_Apple_MacBook_Pro_page() {
		controller.appleBrandPage().verifyLandingPageTitle();
		controller.utilClass().delayFor(5000);
	    
	}
	
	@Then("User able to back on Apple Brand page")
	public void user_able_to_back_on_Apple_Brand_page() {
	    controller.utilClass().navigateBack();
	    controller.appleBrandPage().verifyPageTitle();
	}

}
