package Incidents;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeoutException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.Constants;
import utility.SeleniumFunctions;

public class Delete

{
	
	SeleniumFunctions selenium = new SeleniumFunctions();

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
		
		String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
		
		System.out.println("The incident number :" + incidentNumber);
					
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
				
		selenium.clickElementByxPath(Constants.xpathDeletelistButton);
		
		selenium.waitUntilxPath(Constants.xpathDeletionWarning);
						
		boolean deletionWarning = selenium.findElementByxPath(Constants.xpathDeletionWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , deletionWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xpathDeleteWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		System.out.println("Incident number matched");

		selenium.clickElementByxPath(Constants.xpathNoDeletionButton);
		
		System.out.println("Deletion warning dispalyed and closed");
		
	}
	
	//@Test
	public void deleteTest() throws Exception , TimeoutException
	{
		selenium.setUp();
		
		selenium.adminLogin();
	
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
		
		System.out.println("The incident number :" + incidentNumber);
					
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
				
		selenium.clickElementByxPath(Constants.xpathDeletelistButton);
		
		selenium.waitUntilxPath(Constants.xpathDeletionWarning);
						
		boolean deletionWarning = selenium.findElementByxPath(Constants.xpathDeletionWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , deletionWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xpathDeleteWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		System.out.println("Incident number matched");

		selenium.clickElementByxPath(Constants.xpathYesDeletionButton);
		
		selenium.waitUntilId("incident-table");
		
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
		
		String itemnotFound = selenium.findElementByxPath(Constants.xpathNoIncident).getText();
		assertTrue("Incident not deleted" , itemnotFound.contains("No matching records found") );
		
		System.out.println("Incident deleted successfully");
		
		
	}
	

	
	@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}

}
