package automation.ubs.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * 
 * @author rodrigo.grillo
 *
 */
public abstract class Element {

	/**
	 * 
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void click(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * @param driver
	 * @param element
	 */
	public static void click(WebDriver driver, WebElement element) {
		element.click();
	}

	/**
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static List<WebElement> clickList(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	/**
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String captureText(WebDriver driver, By locator) {
		return driver.findElement(locator).getText();
	}
	
	/**
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void writeTextField(WebDriver driver, By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	/**
	 * @param driver
	 * @return
	 */
	public static List<String> selectWindowHandles(WebDriver driver){
		return new ArrayList<String>(driver.getWindowHandles());
		
	}

}
