package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("User launches telecom application")
	public void user_launches_telecom_application() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		 
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("xxxx");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("yyyyyyy");
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("wwww@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("madurai");
		driver.findElement(By.xpath("(//input[@name='telephoneno'])")).sendKeys("9994312470");
		
		
	}

	@When("user click on submit buttton")
	public void user_click_on_submit_buttton() {
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	    	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		String text = driver.findElement(By.xpath("(//b[text()='Please Note Down Your CustomerID'])")).getText();
		Assert.assertEquals("Please Note Down Your CustomerID", text);
	    
	}



}
