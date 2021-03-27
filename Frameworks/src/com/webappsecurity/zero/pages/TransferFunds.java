package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {

	@FindBy(id="tf_fromAccountId")
	private WebElement fromacc;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toacc;
	
	@FindBy(id="tf_amount")
	private WebElement amount;
	
	@FindBy(id="tf_description")
	private WebElement description;
	 
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	public void TransferingFunds(String amt, String desc) {
		Select fromdd = new Select(fromacc);
		fromdd.selectByIndex(2);
		
		Select todd = new Select(toacc);
		todd.selectByIndex(3);
		
		amount.sendKeys(amt);
		description.sendKeys(desc);
		
		submit.click();
		
		
		
	}
}