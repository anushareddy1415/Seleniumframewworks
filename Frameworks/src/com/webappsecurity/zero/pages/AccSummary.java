package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccSummary {

	@FindBy(linkText="Transfer Funds")
	private WebElement transferfunds;
	
	public AccSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicktranferfunds() {
		transferfunds.click();
		}
	
	public boolean istransferfundsvisible() {
		boolean transferfundsvisible = transferfunds.isDisplayed();
		return transferfundsvisible;
		
	}
}
