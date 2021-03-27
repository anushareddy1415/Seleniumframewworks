package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTransferFunds {

	@FindBy(id="btn_submit")
	private WebElement verifysubmitbtn;
	
	public VerifyTransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicksubmitbtn ()	{
		verifysubmitbtn.click();
	}
}
