package A_AdminTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.Constants;
import utility.SeleniumFunctions;

public class B_NewFallIncident
{
	SeleniumFunctions selenium = new SeleniumFunctions();
	
	@Before
	public void setUp() throws Exception
	{	
		selenium.setUp();
	}

	@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}
	
	@Test
	public void addFallIncident_1()
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.waitUntilId("IncidentNumber");
		
		selenium.clickElementById(Constants.idDateofIncident);
		
		selenium.chooseDateInDatePicker("March", "03", "2014", "31");
		
		selenium.clickElementById(Constants.idTimeofIncident);
		
		selenium.chooseTimeInTimePicker("1", "01", "AM");
		
		selenium.clickElementById(Constants.idIncidentDepartment);
		
//		selenium.waitUntilxPath(Constants.xPathAddIncidentDeptWindow);
//		
//		selenium.waitUntilxPath(Constants.xPathIncidentDepartmentAdmissions);
//		
//		selenium.clickElementByxPath(Constants.xPathIncidentDepartmentAdmissions);
//		
//		selenium.clickElementByxPath(Constants.xPathIncidentDepartmentWindowOkButton);
//		
//		selenium.clickElementByxPath(Constants.xPathSeverityToggle);
//		
//		selenium.sendKeysByxPath(Constants.xPathSeveritySearch, "5");
//		
//		selenium.enterPressByxPath(Constants.xPathSeveritySearch);
//		
//		selenium.clickElementByxPath(Constants.xPathIncidentOccuredToggle);
//		
//		selenium.sendKeysByxPath(Constants.xPathIncidentOccuredSearch, "School");
//		
//		selenium.enterPressByxPath(Constants.xPathIncidentOccuredSearch);
//		
//		selenium.clickElementByxPath(Constants.xPathLocationOfIncidentToggle);
//		
//		selenium.sendKeysByxPath(Constants.xPathLocationOfIncidentSearch, "Gym");
//		
//		selenium.enterPressByxPath(Constants.xPathLocationOfIncidentSearch);
		
		selenium.clickElementById(Constants.idPlaceOfIncident);
		
		selenium.sendKeysById(Constants.idPlaceOfIncident, "Test");
		
		selenium.clickElementById(Constants.idFallRiskAssessmentScore);
		
		selenium.sendKeysById(Constants.idFallRiskAssessmentScore, "Test");
		
//		selenium.clickElementByxPath(Constants.xPathContributingFactorsToggle);
//		
//		selenium.sendKeysByxPath(Constants.xPathContributingFactorsSearch, "Dizzi");
//		
//		selenium.enterPressByxPath(Constants.xPathContributingFactorsSearch);
	}
}