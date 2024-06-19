package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import net.bytebuddy.asm.Advice.This;

public class OrangeHRMLoginPage {
	WebDriver driver;
	@FindBy(name = "username")
	WebElement usernamefield;
	
	@FindBy(name = "password")
	WebElement passwordfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotpasswordlink;
	
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement forgetPasswordLinkButton() {
		return forgotpasswordlink;
	}
	
	public void login(String username, String password) {
		//usernamefield.sendKeys(username);
		PageUtility.enterText(usernamefield, username);
		//passwordfield.sendKeys(password);
		PageUtility.enterText(passwordfield, password);
		//loginButton.click();
		PageUtility.clickOnElement(loginButton);
	}
}
