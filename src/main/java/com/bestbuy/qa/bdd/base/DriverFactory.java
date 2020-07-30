package com.bestbuy.qa.bdd.base;

//import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class DriverFactory {
	
	
	private static DriverFactory instance = null;
	private ThreadLocal<WebDriver> driverCollection = new ThreadLocal<WebDriver>();
	
	
	private DriverFactory() {
			
		}
	public static DriverFactory getInstance() {
		//
		/*
		if(instance == null) {
			instance = new DriverFactory();
		}
		
		if(instance.driverCollection.get() == null) {
			ChromeDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			instance.driverCollection.set(driver);
		}
		*/
		
		return getInstance(null);
		
	}

public static DriverFactory getInstance(String browser) {
	if(instance == null) {
		instance = new DriverFactory();
	}
	
	if(browser == null) {
		browser = "";
	}
	
	if(instance.driverCollection.get() == null) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			instance.driverCollection.set(driver);
		}
		
		else if (browser.equalsIgnoreCase("IE")) {
			InternetExplorerDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			instance.driverCollection.set(driver);
		}
		/*
		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			instance.driverCollection.set(driver);
		}
		
		else if(browser.equalsIgnoreCase("chrome-cloud")) {
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "65.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1200");

		    try {
				WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
				instance.driverCollection.set(driver);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		*/

		else {
			ChromeDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			instance.driverCollection.set(driver);
			}	
		}
	
		return instance;
	}

public WebDriver getDriver() {
	return driverCollection.get();
}

public void removeDriver() {
	driverCollection.get().quit();
	driverCollection.remove();
}

}
