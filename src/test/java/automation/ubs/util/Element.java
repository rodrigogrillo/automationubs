package automation.ubs.util;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * Class to webdriver elements to use on project
 * 
 * @author rodrigo.grillo
 *
 */
public abstract class Element {

	/**
	 * 
	 * Element Click
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void click(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * Element Click on locator
	 * 
	 * @param driver
	 * @param element
	 */
	public static void click(WebDriver driver, WebElement element) {
		element.click();
	}

	/**
	 * Element Click with List
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static List<WebElement> clickList(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	/**
	 * Element to get text from webpage
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static String captureText(WebDriver driver, By locator) {
		return driver.findElement(locator).getText();
	}

	/**
	 * Element to send keys to textfields
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void writeTextField(WebDriver driver, By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	/**
	 * Element to get a list
	 * 
	 * @param driver
	 * @return
	 */
	public static List<String> selectWindowHandles(WebDriver driver) {
		return new ArrayList<String>(driver.getWindowHandles());

	}

}
