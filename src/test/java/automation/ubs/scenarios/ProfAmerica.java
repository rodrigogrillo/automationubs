package automation.ubs.scenarios;

import org.junit.Assert;
import automation.ubs.mapping.MAPProfAmerica;
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
		ProfAmericaPO.clickMenuCareer();
	}

	@When("^I select the submenu Search jobs$")
	public void iSelectTheSubmenuSearchJobs() throws Throwable {
		ProfAmericaPO.selectSearchJobs();
	}

	@Then("^The website show the Careers interface$")
	public void theWebsiteShowTheCareersInterface() throws Throwable {
		Assert.assertEquals(MAPProfAmerica.LBL_SEARCHJOBS, ProfAmericaPO.careersInterface());
	}

	@When("^I select the option Americas > Professional$")
	public void iSelecTheOptionAmericasProfessional() throws Throwable {
		ProfAmericaPO.selectAmericaProfissional();
	}

	@Then("^the website show the job opportunities$")
	public void theWebsiteShowTheJobOpportunities() throws Throwable {
		Assert.assertEquals("Search", ProfAmericaPO.jobOpportunities());
	}

	@When("^I select the search option$")
	public void iSelectTheSearchOption() throws Throwable {
		ProfAmericaPO.selectSearchOption();
	}

	@Then("^the website show me all opportunities$")
	public void theWebsiteShowMeAllOpportunities() throws Throwable {
		Assert.assertEquals(MAPProfAmerica.LBL_CONTENT, ProfAmericaPO.allOpportunities());
	}

	@Given("^I write the location \"([^\"]*)\" on location field$")
	public void iWriteTheLocationOnLocationField(String country) throws Throwable {
		ProfAmericaPO.writeLocationField(country);
	}

	@Given("^I write the opportunitie \"([^\"]*)\" on opportunitie field$")
	public void iWriteTheOpportunitieOnOpportunitieField(String opportunitie) throws Throwable {
		ProfAmericaPO.writeOpportunitieField(opportunitie);
	}

	@Then("^the website show me the message \"([^\"]*)\"$")
	public void theWebsiteShowMeTheMessage(String message) throws Throwable {
		Assert.assertEquals(ProfAmericaPO.showMessage(), message);
	}

}
