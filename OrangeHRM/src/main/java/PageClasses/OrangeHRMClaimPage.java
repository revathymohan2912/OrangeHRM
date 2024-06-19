package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMClaimPage {
	WebDriver driver;
	By searchButton = By.xpath("//button[text()=' Search ']");
	
	
	public OrangeHRMClaimPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim");
	}
	
	public WebElement searchButton() {
		return(driver.findElement(searchButton));
	}

}
