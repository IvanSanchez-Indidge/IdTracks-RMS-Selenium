package A_Incidents;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeoutException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Constants;
import utility.SeleniumFunctions;

public class Delete

{
	
	SeleniumFunctions selenium = new SeleniumFunctions();
	public WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		selenium.setUp();
			
	}

	@Test
	public void test() throws Exception , TimeoutException
	 
	{
		
		selenium.setUpWait();
		
		selenium.adminLogin();
	
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xPathIncidentNumber).getText();
		
		System.out.println("The incident number :" + incidentNumber);
					
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xPathActionsButton);
				
		selenium.clickElementByxPath(Constants.xPathDeletelistButton);
		
		selenium.waitUntilxPath(Constants.xPathDeletionWarning);
						
		boolean deletionWarning = selenium.findElementByxPath(Constants.xPathDeletionWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , deletionWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xPathDeleteWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		System.out.println("Incident number matched");

		selenium.clickElementByxPath(Constants.xPathNoDeletionButton);
		
		System.out.println("Deletion warning dispalyed and closed");
		
	}
	
	//@Test
	public void deleteTest() throws Exception , TimeoutException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
	
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xPathIncidentNumber).getText();
		
		System.out.println("The incident number :" + incidentNumber);
					
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xPathActionsButton);
				
		selenium.clickElementByxPath(Constants.xPathDeletelistButton);
		
		selenium.waitUntilxPath(Constants.xPathDeletionWarning);
						
		boolean deletionWarning = selenium.findElementByxPath(Constants.xPathDeletionWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , deletionWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xPathDeleteWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		System.out.println("Incident number matched");

		selenium.clickElementByxPath(Constants.xPathYesDeletionButton);
		
		selenium.waitUntilId("incident-table");
		
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
		
		String itemnotFound = selenium.findElementByxPath(Constants.xPathNoIncident).getText();
		assertTrue("Incident not deleted" , itemnotFound.contains("No matching records found") );
		
		System.out.println("Incident deleted successfully");
		
		
	}
	

	
	@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}

}
