package A_Incidents;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import utility.Constants;
import utility.SeleniumFunctions;

public class Close
{
	SeleniumFunctions selenium = new SeleniumFunctions();

	@Before
	public void setUp() throws Exception
	
	{
		selenium.setUp();
		
	}

	//@Test
	public void test() throws Exception , NoSuchElementException
	
	{

		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xPathIncidentNumber).getText();
							
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xPathActionsButton);
				
		selenium.clickElementByxPath(Constants.xPathCloseListButton);
		
		selenium.waitUntilxPath(Constants.xPathCloseWarning);
		
		boolean closeWarning = selenium.findElementByxPath(Constants.xPathCloseWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , closeWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xPathCloseWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
				
		selenium.clickElementByxPath(Constants.xPathNoCloseButton);
		
	}
	
	@Test
	public void close_Yes() throws Exception
	{
	selenium.setUpWait();
	
	selenium.adminLogin();
	
	selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
	
	selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
	
	selenium.waitUntilId("incident-table");	
	
	String incidentNumber = selenium.findElementByxPath(Constants.xPathIncidentNumber).getText();
					
	selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
					
	selenium.clickElementByxPath(Constants.xPathActionsButton);
		
	selenium.clickElementByxPath(Constants.xPathCloseListButton);
	
	selenium.waitUntilxPath(Constants.xPathCloseWarning);
	
	boolean closeWarning = selenium.findElementByxPath(Constants.xPathCloseWarning).isDisplayed();
	assertTrue("Warning Message Not Displayed " , closeWarning );
	
	String warningText = selenium.findElementByxPath(Constants.xPathCloseWarningText).getText();
	assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		
	selenium.clickElementByxPath(Constants.xPathYesCloseButton);
	
	selenium.waitUntilId("incident-table");
	
	selenium.clearElementByxPath(Constants.xPathIncidentSearch);
	
	selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
	
	String status = selenium.findElementByxPath(Constants.xPathIncidentStatus).getText();
	assertTrue("Incident Not closed Properly", status != "open");	
		
	}
	
	//@Test
	public void reopen()throws Exception
	{
		
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xPathIncidentNumber).getText();
						
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xPathActionsButton);
		
		selenium.clickElementByxPath(Constants.xPathReopenListButton);
		
		selenium.waitUntilxPath(Constants.xPathReopenWarning);
		
		boolean reopenWarning = selenium.findElementByxPath(Constants.xPathReopenWarning).isDisplayed();
		assertTrue("Warning Message Not Disp[alyed" , reopenWarning);
		
		String warningText = selenium.findElementByxPath(Constants.xPathReopenWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		
		selenium.clickElementByxPath(Constants.xPathYesReopenButton);
		
		selenium.waitUntilId("incident-table");
		
		selenium.clearElementByxPath(Constants.xPathIncidentSearch);
		
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
		
		String status = selenium.findElementByxPath(Constants.xPathIncidentStatus).getText();
		assertTrue("Incident Not Reopened Properly", status != "Closed");
		
		
	}
	
	@After
	public void closeBrowser() throws Exception
	
	{
		selenium.closeBrowser();
		
	}

}
