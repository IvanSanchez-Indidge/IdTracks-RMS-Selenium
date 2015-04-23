package A_AdminTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.Constants;
import utility.SeleniumFunctions;

public class NewGeneralIncident
{
	SeleniumFunctions selenium = new SeleniumFunctions();
	
	@Before
	public void setUp() throws Exception
	{	
		selenium.setUp();
	}

	//@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}
	
	@Test
	public void addFallIncident_1() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		//selenium.clickElementById(Constants.idDateOfIncident);
		
		//selenium.chooseDateInDatePicker("January", "2015", "5");
		
		//selenium.clickElementById(Constants.idTimeOfIncident);
		
		//selenium.chooseTimeInTimePicker("5", "30", "PM");
		
		selenium.clickElementById(Constants.idIncidentDepartment);
		
		selenium.waitUntilId(Constants.idRmsTreeContainer);
		
		selenium.clickParentIncidentDeptWithinTreeByName("Clinic");
		
		
	}
}