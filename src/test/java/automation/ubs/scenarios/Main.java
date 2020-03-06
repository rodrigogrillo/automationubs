package automation.ubs.scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.ubs.ConfigProject;
import automation.ubs.util.NavigatorEnum;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

/**
 * Automation constructor to automation project
 * 
 * @author rodrigo.grillo
 *
 */

@RunWith(value = Cucumber.class)

public class Main {

	private static WebDriver driver;

	@Before
	public static void inicialization() {
		selectNavigator();
		driver.get(ConfigProject.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * Logic to select navigators and execute the automation project.
	 * 
	 */
	public static void selectNavigator() {
		if (ConfigProject.PARAM_NAVEGADOR.equals(NavigatorEnum.CHROME)) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public static void closeNavigator() throws Throwable {
		driver.quit();
	}

}
