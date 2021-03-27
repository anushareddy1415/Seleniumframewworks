package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="user_login")
	private WebElement uname;
	
	@FindBy(id="user_password")
	private WebElement psword;
	
	@FindBy(name="submit")
	private WebElement signin;
	
	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement errormsg;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Acclogin(String loginName, String loginPassword) {
		uname.sendKeys(loginName);
		psword.sendKeys(loginPassword);
		signin.click();
	}
	   
    public String getErrorMsg() {
    	String errormessage = errormsg.getText();
    	return errormessage;
    	
    	
    }
	
}
