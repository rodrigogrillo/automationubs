package automation.ubs.mapping;

/**
 * 
 * Class using Page Objects for selectors.
 * 
 * @author rodrigo.grillo
 *
 */
public class MAPProfAmerica {

	/*
	 * Selector for LINKS
	 */
	public static final String LNK_CAREERS = "#mainmenu a[href$='careers.html']";
	public static final String LNK_SEARCHJOBS = "Search jobs";

	/*
	 * Selectors for LABELS
	 */
	public static final String LBL_SEARCHJOBS = "Search jobs";
	public static final String LBL_CONTENT = "Relevance";

	/*
	 * Selectors for COMPONENTS
	 */
	public static final String SLC_SEARCHJOBS = "h1[class^='pageheadline__hl']";
	public static final String SLC_PROFESSIONALS = "//a[contains(text(), 'Professionals')]";
	public static final String SLC_SEARCHBTN = "#sidebarSearchbox .ladda-label";
	public static final String SLC_CONTENT = "sortBy-button_text";
	public static final String SLC_LOCATION = "locationSearch";
	public static final String SLC_OPPORTUNITIE = "keyWordSearch";
	public static final String SLC_MESSAGE = "h2[role='alert']";

}
