package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmTransfer {

	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confirmationmsg;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement logout;
	
	public ConfirmTransfer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getconfirmmsg() {
	String confirmtext = confirmationmsg.getText();
	return confirmtext;
	}
	
	public void logoutfromapp() {
		logout.click();
	}
}
