package stepDefinitions;



import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import common.Page_BasePage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import seleniumpages.Page_Common;

public class Hook extends Page_BasePage {

	Page_Common common = new Page_Common();

	// Before hook
		@Before
		public void launchbrowser()
		{
			System.out.println(" BEFORE HOOK");
			//System.setProperty("webdriver.http.factory","jdk-http-client");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY,options);
			options.merge(cp);
			//WebDriverManager.firefoxdriver().setup();
			//WebDriverManager.chromedriver().driverVersion("124.0.6367.156").setup();
			 driver  = new ChromeDriver(options);
			//driver  = new FirefoxDriver();
			
		//	System.setProperty("webdriver.chrome.driver", chromedriverPath
		//			+ "chromedriver.exe");
		//driver = new ChromeDriver();
			
		/*
		 * System.setProperty("webdriver.gecko.driver", firefoxdriverPath +
		 * "geckodriver.exe");
		 * 
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette", true); driver = new
		 * FirefoxDriver(capabilities);
		 */
			
			//driver = new FirefoxDriver();
			
		}
		
		// After Hook
		@After
		public void closebrowser()
		{
			driver.quit();
			
			System.out.println(" AFTER HOOK");
		
		}


}
