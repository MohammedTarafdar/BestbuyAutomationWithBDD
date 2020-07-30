package com.bestbuy.qa.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/features", 
		glue = "com.bestbuy.qa.bdd.steps", 
		
		//dryRun = true,

		plugin = { "pretty:target/cucumber-test-report/cucumber-pretty.txt", 
				"html:target/cucumber-test-report",
				"json:target/cucumber-test-report/cucumber-report.json",
				"junit:target/cucumber-test-report/test-report.xml" }

)

public class BddRunner {

}
