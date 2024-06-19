package OrangeHRM;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AutomationCore.BaseClass;
import PageClasses.OrangeHRMAdminPage;
import PageClasses.OrangeHRMClaimPage;
import PageClasses.OrangeHRMHomePage;
import PageClasses.OrangeHRMLoginPage;
import PageClasses.OrangeHRMRecruitmentPage;
import Utilities.PageUtility;

public class TestCases extends BaseClass{
	public WebDriver driver;
	OrangeHRMLoginPage loginPage; 	//obj created for that page/class
	OrangeHRMHomePage homePage;		
	OrangeHRMAdminPage adminPage;
	OrangeHRMClaimPage claimPage;
	OrangeHRMRecruitmentPage recruitment;
	
	@BeforeMethod
	public void initialization() throws Exception {
		
		driver = browzerInitialization("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		loginPage = new OrangeHRMLoginPage(driver);
		homePage = new OrangeHRMHomePage(driver);
		adminPage = new OrangeHRMAdminPage(driver);
		claimPage = new OrangeHRMClaimPage(driver);
		recruitment = new OrangeHRMRecruitmentPage(driver);
	}

@Test
public void forgotPasswordLinkVerification() {
	//loginPage.forgetPasswordLinkButton().click();
	PageUtility.clickOnElement(loginPage.forgetPasswordLinkButton());
}
@Test
public void searchOptionVerification() {
	loginPage.login("Admin", "admin123");
	Assert.assertEquals(homePage.searchTabOption().isDisplayed(), true);
	Assert.assertEquals(homePage.adminOptionVerification().isDisplayed(), true);
	Assert.assertEquals(homePage.pimTabVerification().isDisplayed(), true);
	//Assert.assertEquals(homePage.leaveOptionVerification().isDisplayed(), true);
	Assert.assertEquals(homePage.leaveOptionVerification(), true);

}

@Test
public void adminTabOptionVerification() {
	loginPage.login("Admin", "admin123");
	Assert.assertEquals(adminPage.searchButtonClick().isDisplayed(), true);
	Assert.assertEquals(adminPage.resetButtonClick().isDisplayed(), true);
}

@Test
public void claimTabVerification() {
	loginPage.login("Admin", "admin123");
	Assert.assertEquals(claimPage.searchButton().isDisplayed(), true);
}

@Test
public void recruitmentTabVerification() {
	loginPage.login("Admin", "admin123");
	Assert.assertEquals(recruitment.addButtonClicking().isDisplayed(), true);
}

}
