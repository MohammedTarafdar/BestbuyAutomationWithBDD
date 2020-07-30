package com.bestbuy.qa.bdd.steps;



import com.bestbuy.qa.bdd.base.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookSteps extends StepBase {
	
	@Before
	public void setUp() {
		driver = DriverFactory.getInstance().getDriver();
	}
	
	@After
	public void tearDown() {
		DriverFactory.getInstance().removeDriver();
	}

}
