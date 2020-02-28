package automation.ubs.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.ubs.ConfigProject;
import automation.ubs.util.NavigatorEnum;

/**
 * Automation constructor to automation project
 * @author rodrigo.grillo
 *
 */
public class Main {

	private WebDriver driver;

	public Main() {
		selectNavigator();
		driver.get(ConfigProject.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * Logic to select navigators and execute the automation project.
	 * 
	 */
	private void selectNavigator() {
		if (ConfigProject.PARAM_NAVEGADOR.equals(NavigatorEnum.CHROME)){
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();	
		}else {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/firefoxdriver.exe");
			driver = new FirefoxDriver();	
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void closeNavigator() throws Throwable {
		driver.quit();
	}

}
