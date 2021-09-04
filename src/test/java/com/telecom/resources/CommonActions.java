package com.telecom.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CommonActions {
	public static WebDriver driver;
	
	public void browserLaunch(String URL) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	public void sendKeys(WebElement ele, String Value) {
		ele.sendKeys(Value);
	}
	 public void buton(WebElement btn) {
		 btn.click();
	
		

	 }}
	 



