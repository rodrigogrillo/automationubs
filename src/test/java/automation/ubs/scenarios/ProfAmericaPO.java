package automation.ubs.scenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import automation.ubs.mapping.MAPProfAmerica;
import automation.ubs.util.Element;

public abstract class ProfAmericaPO {

	public static void clickMenuCareer() {
		Element.click(Main.getDriver(), By.cssSelector(MAPProfAmerica.LNK_CAREERS));
	}

	public static void selectSearchJobs() {
		Element.click(Main.getDriver(), By.linkText(MAPProfAmerica.LNK_SEARCHJOBS));
	}

	public static String careersInterface() {
		return ProfAmericaPO.theWebsiteShowTheCareersInterface();
	}

	public static void selectAmericaProfissional() {
		List<WebElement> list = Element.clickList(Main.getDriver(), By.xpath(MAPProfAmerica.SLC_PROFESSIONALS));
		Element.click(Main.getDriver(), list.get(1));
	}

	public static String jobOpportunities() {
		Main.getDriver().switchTo().window(Element.selectWindowHandles(Main.getDriver()).get(1));
		return Element.captureText(Main.getDriver(), By.cssSelector(MAPProfAmerica.SLC_SEARCHBTN));
	}

	public static void selectSearchOption() {
		Element.click(Main.getDriver(), By.cssSelector(MAPProfAmerica.SLC_SEARCHBTN));
	}

	public static String allOpportunities() {
		return Element.captureText(Main.getDriver(), By.id(MAPProfAmerica.SLC_CONTENT));
	}

	public static void writeLocationField(String country) {
		Element.writeTextField(Main.getDriver(), By.name(MAPProfAmerica.SLC_LOCATION), country);
	}

	public static void writeOpportunitieField(String opportunitie) {
		Element.writeTextField(Main.getDriver(), By.name(MAPProfAmerica.SLC_OPPORTUNITIE), opportunitie);
	}

	public static String theWebsiteShowTheCareersInterface() {
		return Element.captureText(Main.getDriver(), By.cssSelector(MAPProfAmerica.SLC_SEARCHJOBS));
	}

	public static String showMessage() {
		return Element.captureText(Main.getDriver(), By.cssSelector(MAPProfAmerica.SLC_MESSAGE));
	}

}
