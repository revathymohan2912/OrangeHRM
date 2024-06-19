package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMRecruitmentPage {
	WebDriver driver;
	
	/*@FindBy(xpath =  "//button[text()=' Add ']")
	WebElement addButton;*/
	
	By addButton = By.xpath("//button[text()=' Add ']");
	
	public OrangeHRMRecruitmentPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
	}
	
	public WebElement addButtonClicking() {
		return(driver.findElement(addButton));
	}

}
