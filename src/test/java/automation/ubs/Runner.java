package automation.ubs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * Class to execute the automation test from UBS website.
 * 
 * @author rodrigo.grillo
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(glue = { "automation.ubs.scenarios" }, features = { "src/test/java/automation/ubs/features" },
		// tags = {"@Test"},
		snippets = SnippetType.CAMELCASE)

public class Runner {

}
