package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class InValidLogin extends BaseTest
{
	@Test(priority = 1)
	public void testInValidLogin() {
		String un=Excel.getCellData(INPUTTXL_PATH, "InValidLogin",1, 0);
		String pw=Excel.getCellData(INPUTTXL_PATH, "InValidLogin",1, 1);
		
//		1. Enter Invalid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
		extentTest.log(Status.INFO, "Enter Invalid user name:"+un);
		
//		2. Enter Invalid password
		loginPage.setPassword(pw);
		extentTest.log(Status.INFO, "Enter Invalid password:"+pw);
		
//		3. click on login button
		loginPage.clickLoginButton();
		extentTest.log(Status.INFO, "Click on login Button");
		
//		4. Verify error message is displayed
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyLogoutIsDisplayed(wait);
		Assert.assertTrue(result,"Home Page is not Displayed");
		extentTest.log(Status.INFO, "Verify error message is displayed");
		
	}
}
