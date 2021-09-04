package com.telecom.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.CommonActions;

public class AddCustomerPage extends CommonActions {
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text()='Add Tariff Plan'])")
	 private WebElement addTariffButton;
	
	@FindBy(name ="rental")
	private WebElement MR;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement FLM;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement FIM;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement FSP;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement LPMC;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement IPMC;
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement SPMC;
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement SubBtn;
	public WebElement getAddTariffButton() {
		return addTariffButton;
	}
	public WebElement getMR() {
		return MR;
	}
	public WebElement getFLM() {
		return FLM;
	}
	public WebElement getFIM() {
		return FIM;
	}
	public WebElement getFSP() {
		return FSP;
	}
	public WebElement getLPMC() {
		return LPMC;
	}
	public WebElement getIPMC() {
		return IPMC;
	}
	public WebElement getSPMC() {
		return SPMC;
	}
	public WebElement getSubBtn() {
		return SubBtn;
	}
	
}
