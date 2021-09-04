package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonActions{

	CommonActions ca = new CommonActions();
	
	@Before
	public void beforeScenario() {
		
		ca.browserLaunch("http://www.demo.guru99.com/telecom/");


	}
	
	
	
	
	@After
	  public void AfterScenario(Scenario scenario) {
			
			if(scenario.isFailed()){

				final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

				scenario.embed(screenshot, "image/png");
			}else{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");

			}
		
		driver.close();

	}
}
