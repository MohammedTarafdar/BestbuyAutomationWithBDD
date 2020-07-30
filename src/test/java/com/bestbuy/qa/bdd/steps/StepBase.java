package com.bestbuy.qa.bdd.steps;

import org.openqa.selenium.WebDriver;

import com.bestbuy.qa.bdd.base.ApplicationController;
import com.bestbuy.qa.bdd.base.DriverFactory;

public class StepBase {
	protected WebDriver driver = DriverFactory.getInstance("chrome").getDriver();
	protected ApplicationController controller = new ApplicationController(driver);

}



