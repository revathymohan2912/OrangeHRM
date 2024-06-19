package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMHomePage {
	WebDriver driver;
	By searchTab = By.xpath("//input[@placeholder='Search']");
	By adminTab = By.xpath("//span[text()='Admin']");
	By pimTab = By.xpath("//span[text()='PIM']");
	By leaveTab = By.xpath("//span[text()='Leave']");
	
	public OrangeHRMHomePage(WebDriver driver) {
		this.driver = driver;
	}



	public WebElement searchTabOption() {
		return(driver.findElement(searchTab));
	}
	public WebElement adminOptionVerification() {
		return(driver.findElement(adminTab));
	}
	public WebElement pimTabVerification() {
		return(driver.findElement(pimTab));
	}
	public boolean leaveOptionVerification() {
		return(driver.findElement(leaveTab).isDisplayed());
	}
}
