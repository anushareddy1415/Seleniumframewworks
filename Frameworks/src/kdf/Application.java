package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	
	@Test
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("C:\\Anu-BA\\testing\\Automation\\class 9\\TestData.xlsx", "Sheet2");
	Methods mtd = new Methods();
	//Making changes to code
		for(int i = 1;i<data.length;i++) {
	switch(data[i][3]) {
	    case "openBrowser":
		mtd.openBrowser();
	break;
	    case "maxBrowser":
	    	mtd.maximizeBrowserWindow();
	break;
	    case "impWait":
	    	mtd.implicitlyWait();
	break;
	    case "navigateToApp":
	    	mtd.navigateToApplication(data[i][6]);
	break;
	    case "enterInTextBox":
	    	mtd.enterUserName(data[i][5], data[i][6]);
	break;
	    case "clickButton":
	    	mtd.clickSubmitButton(data[i][4],data[i][5]);
	break;
	    case"verifyErrorMsg":
	    String actualMsg = mtd.verifyErrorMessage(data[i][4],data[i][5]);
	   Assert.assertEquals(actualMsg, data[i][6]);
    break;
	    case "closeApp":
	    	mtd.closeApplication();
	break;
	
	}
		
		
	}
	
	}

}
