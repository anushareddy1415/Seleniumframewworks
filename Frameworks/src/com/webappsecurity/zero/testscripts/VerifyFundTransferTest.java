package com.webappsecurity.zero.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccSummary;
import com.webappsecurity.zero.pages.ConfirmTransfer;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFunds;
import com.webappsecurity.zero.pages.VerifyTransferFunds;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base {
	
	@Test
	public void verifyfundtransfer() throws IOException  {
		
	Login lI = new Login(driver);
	AccSummary As = new AccSummary(driver);
	TransferFunds Tf = new TransferFunds(driver);
	VerifyTransferFunds Vtf = new VerifyTransferFunds(driver);
	ConfirmTransfer Ct = new ConfirmTransfer(driver);
	
	String[][] data = GenericMethods.getData("C:\\Anu-BA\\dataframework data.xlsx", "Sheet1");
	
	
	for(int i = 1;i<data.length;i++) {
	lI.Acclogin(data[i][0], data[i][1]);
	As.clicktranferfunds();
	Tf.TransferingFunds(data[i][2],data[i][3]);
	Vtf.clicksubmitbtn();
	String actualtext = Ct.getconfirmmsg();
	String expectedtext = data[i][4];
	
	Assert.assertEquals(actualtext, expectedtext);
	Ct.logoutfromapp();
	driver.get("http://zero.webappsecurity.com/index.html");
	
	}	
	
	
	

}
}