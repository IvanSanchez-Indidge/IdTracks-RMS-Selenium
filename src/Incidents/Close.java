package Incidents;

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
		
		String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
							
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
				
		selenium.clickElementByxPath(Constants.xpathCloseListButton);
		
		selenium.waitUntilxPath(Constants.xpathCloseWarning);
		
		boolean closeWarning = selenium.findElementByxPath(Constants.xpathCloseWarning).isDisplayed();
		assertTrue("Warning Message Not Displayed " , closeWarning );
		
		String warningText = selenium.findElementByxPath(Constants.xpathCloseWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
				
		selenium.clickElementByxPath(Constants.xpathNoCloseButton);
		
	}
	
	@Test
	public void close_Yes() throws Exception
	{
	selenium.setUp();
	
	selenium.adminLogin();
	
	selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
	
	selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
	
	selenium.waitUntilId("incident-table");	
	
	String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
					
	selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
					
	selenium.clickElementByxPath(Constants.xpathActionsButton);
		
	selenium.clickElementByxPath(Constants.xpathCloseListButton);
	
	selenium.waitUntilxPath(Constants.xpathCloseWarning);
	
	boolean closeWarning = selenium.findElementByxPath(Constants.xpathCloseWarning).isDisplayed();
	assertTrue("Warning Message Not Displayed " , closeWarning );
	
	String warningText = selenium.findElementByxPath(Constants.xpathCloseWarningText).getText();
	assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		
	selenium.clickElementByxPath(Constants.xpathYesCloseButton);
	
	selenium.waitUntilId("incident-table");
	
	selenium.clearElementByxPath(Constants.xpathIncidentSearch);
	
	selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
	
	String status = selenium.findElementByxPath(Constants.xpathIncidentStatus).getText();
	assertTrue("Incident Not closed Properly", status != "open");	
		
	}
	
	//@Test
	public void reopen()throws Exception
	{
		
		selenium.setUp();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xpathIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
		
		String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
						
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
		
		selenium.clickElementByxPath(Constants.xpathReopenListButton);
		
		selenium.waitUntilxPath(Constants.xpathReopenWarning);
		
		boolean reopenWarning = selenium.findElementByxPath(Constants.xpathReopenWarning).isDisplayed();
		assertTrue("Warning Message Not Disp[alyed" , reopenWarning);
		
		String warningText = selenium.findElementByxPath(Constants.xpathReopenWarningText).getText();
		assertTrue("Mismatch in Incident Number" , warningText.contains(incidentNumber));
		
		selenium.clickElementByxPath(Constants.xpathYesReopenButton);
		
		selenium.waitUntilId("incident-table");
		
		selenium.clearElementByxPath(Constants.xpathIncidentSearch);
		
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
		
		String status = selenium.findElementByxPath(Constants.xpathIncidentStatus).getText();
		assertTrue("Incident Not Reopened Properly", status != "Closed");
		
		
	}
	
	@After
	public void closeBrowser() throws Exception
	
	{
		selenium.closeBrowser();
		
	}

}
