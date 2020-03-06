package automation.ubs.scenarios;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.ubs.mapping.POProfAmerica;
import automation.ubs.util.Element;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * Class where is the logic using selenium webdriver and cucumber as methods.
 * 
 * @author rodrigo.grillo
 *
 */
public class ProfAmerica {

	@Given("^I select the menu Careers$")
	public void iSelectTheMenuCareers() throws Throwable {
		Element.click(Main.getDriver(), By.cssSelector(POProfAmerica.LNK_CAREERS));
	}

	@When("^I select the submenu Search jobs$")
	public void iSelectTheSubmenuSearchJobs() throws Throwable {
		Element.click(Main.getDriver(), By.linkText(POProfAmerica.LNK_SEARCHJOBS));
	}

	@Then("^The website show the Careers interface$")
	public void theWebsiteShowTheCareersInterface() throws Throwable {
		String label = Element.captureText(Main.getDriver(), By.cssSelector(POProfAmerica.SLC_SEARCHJOBS));
		Assert.assertEquals(POProfAmerica.LBL_SEARCHJOBS, label);
	}

	@When("^I select the option Americas > Professional$")
	public void iSelecTheOptionAmericasProfessional() throws Throwable {
		List<WebElement> list = Element.clickList(Main.getDriver(), By.xpath(POProfAmerica.SLC_PROFESSIONALS));
		Element.click(Main.getDriver(), list.get(1));
	}

	@Then("^the website show the job opportunities$")
	public void theWebsiteShowTheJobOpportunities() throws Throwable {
		Main.getDriver().switchTo().window(Element.selectWindowHandles(Main.getDriver()).get(1));
		String label = Element.captureText(Main.getDriver(), By.cssSelector(POProfAmerica.SLC_SEARCHBTN));
		Assert.assertEquals("Search", label);
	}

	@When("^I select the search option$")
	public void iSelectTheSearchOption() throws Throwable {
		Element.click(Main.getDriver(), By.cssSelector(POProfAmerica.SLC_SEARCHBTN));
	}

	@Then("^the website show me all opportunities$")
	public void theWebsiteShowMeAllOpportunities() throws Throwable {
		String content = Element.captureText(Main.getDriver(), By.id(POProfAmerica.SLC_CONTENT));
		Assert.assertEquals(POProfAmerica.LBL_CONTENT, content);
	}

	@Given("^I write the location \"([^\"]*)\" on location field$")
	public void iWriteTheLocationOnLocationField(String country) throws Throwable {
		Element.writeTextField(Main.getDriver(), By.name(POProfAmerica.SLC_LOCATION), country);
	}

	@Given("^I write the opportunitie \"([^\"]*)\" on opportunitie field$")
	public void iWriteTheOpportunitieOnOpportunitieField(String opportunitie) throws Throwable {
		Element.writeTextField(Main.getDriver(), By.name(POProfAmerica.SLC_OPPORTUNITIE), opportunitie);
	}

	@Then("^the website show me the message \"([^\"]*)\"$")
	public void theWebsiteShowMeTheMessage(String message) throws Throwable {
		String content = Element.captureText(Main.getDriver(), By.cssSelector(POProfAmerica.SLC_MESSAGE));
		Assert.assertEquals(content, message);
	}

}
