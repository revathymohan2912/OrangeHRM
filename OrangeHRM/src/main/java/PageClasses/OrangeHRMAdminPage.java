package PageClasses;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMAdminPage {
	
	WebDriver driver;
		
	By searchButton = By.xpath("//button[text()=' Search ']");
	By resetButton = By.xpath("//button[text()=' Reset ']");
	
	
	public OrangeHRMAdminPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	}
	
	public WebElement searchButtonClick() {
		return(driver.findElement(searchButton));
	}
	public WebElement resetButtonClick() {
		return(driver.findElement(resetButton));
	}

}
