package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepositary.AddCustomerPage;
import com.telecom.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends CommonActions{
	/*static WebDriver driver;
	@Given("User launches telecom application")
	public void user_launches_telecom_application() {
		
	
	}*/
	CommonActions ca = new CommonActions();
    AddCustomerPage a = new AddCustomerPage();
	@Given("user click on add tariff plan button")
	public void user_click_on_add_customer_button() {
		ca.buton(a.getAddTariffButton());
	}

	@When("user need to fill up the fields")
	
	public void user_need_to_fill_up_the_fields() {
		
		 ca.sendKeys(a.getMR(), "99");
		 ca.sendKeys(a.getFLM(), "121");
		 ca.sendKeys(a.getFIM(), "44");
		 ca.sendKeys(a.getFSP(), "66");
		 ca.sendKeys(a.getLPMC(), "88");
		 ca.sendKeys(a.getIPMC(), "99");
		 ca.sendKeys(a.getSPMC(), "22");
		} 

	@When("user click on submit buttton")
	public void user_click_on_submit_buttton() {
		
			ca.buton(a.getSubBtn());
	  }

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		String text = driver.findElement(By.xpath("(//h2[text()='Congratulation you add Tariff Plan'])")).getText();
		Assert.assertEquals("Congratulation you add Tariff Plan", text);
		
	    
	}
	@When("user need to fill up the fields by {int}D List")
	
	public void user_need_to_fill_up_the_fields_by_D_List(Integer int1, DataTable datas) {
	  List<String> details = datas.asList();
	  
	  ca.sendKeys(a.getMR(),details.get(0));
	  ca.sendKeys(a.getFLM(),details.get(1));
	  ca.sendKeys(a.getFIM(),details.get(2));
	  ca.sendKeys(a.getFSP(),details.get(3));
	  ca.sendKeys(a.getLPMC(),details.get(4));
	  ca.sendKeys(a.getIPMC(),details.get(5));
	  ca.sendKeys(a.getSPMC(),details.get(6));
	 
	}
	 @When("user need to fill up the fields by {int}D Map")  
			public void user_need_to_fill_up_the_fields_by_D_Map(Integer int1, DataTable datas) {
				
			
		 Map<String, String> details = datas.asMap(String.class, String.class);
			 
		      ca.sendKeys(a.getMR(),details.get("MR"));
			  ca.sendKeys(a.getFLM(),details.get("FLM"));
			  ca.sendKeys(a.getFIM(),details.get("FIM"));
			  ca.sendKeys(a.getFSP(),details.get("FSP"));
			  ca.sendKeys(a.getLPMC(),details.get("LPMC"));
			  ca.sendKeys(a.getIPMC(),details.get("IPMC"));
			  ca.sendKeys(a.getSPMC(),details.get("SPMC"));
			
			}
		
		
	}

