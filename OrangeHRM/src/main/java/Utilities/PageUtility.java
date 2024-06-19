package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	//for clicking
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static String getElementText(WebElement element) {
		return(element.getText());
	}
	public static void clearText(WebElement element) {
		element.clear();
	}
	public static void navigateToBack(WebDriver driver) {
		driver.navigate().back();
	}
	public static String getElementAttribute(WebElement element, String attribute) {
		return(element.getAttribute(attribute));
	}
	public static void moveToElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public static void doubleClickElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick().build().perform();
	}
	
	
	public static void rightClickOnAnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).click().perform();
	}
	public static void clickAndHoldAnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element);
	}
	public static void acceptAnAlertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public static void dismissAnAlertPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public static boolean isElementDisplayed(WebElement element) {
		return(element.isDisplayed());
	}
	public static boolean isElementEnabled(WebElement element) {
		return(element.isEnabled());
	}
	public static boolean isElementSelected(WebElement element) {
		return(element.isSelected());
	}
	public static void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public static void scrollUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,1000)", " ");
	}
	public static void selectDropDownByText(WebElement element, String text) {
		Select obj = new Select(element);
		obj.selectByVisibleText(text);
	}
	public static void selectDropDownByValue(WebElement element, String value) {
		Select obj = new Select(element);
		obj.selectByValue(value);
	}
	public static void selectDropDownByIndex(WebElement element, int index) {
		Select obj = new Select(element);
		obj.selectByIndex(index);
	}
	
	public static void clickEnterKey(String key) {
		
	}
	
	
	
	
	
}
