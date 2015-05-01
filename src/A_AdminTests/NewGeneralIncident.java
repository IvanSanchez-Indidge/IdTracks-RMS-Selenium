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

	@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}
	
	@Test
	public void addGeneralIncident_1() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		selenium.clickElementById(Constants.idDateOfIncident);
		
		selenium.chooseDateInDatePicker("January", "1","2015", "5");
		
		selenium.clickElementById(Constants.idTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("5", "30", "PM");
		
		selenium.clickElementById(Constants.idIncidentType);
		
		selenium.clickIncidentType("Assault", "Attempted");
		
		selenium.clickElementById(Constants.idIncidentDepartment);
		
		selenium.clickParentIncidentDeptWithinTreeByName("Clinic");
		
		selenium.clickElementById(Constants.idProgramId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idProgramId_chosen, "School");
		
		selenium.clickElementById(Constants.idLocationId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idLocationId_chosen, "Hospital-Wide");
		
		selenium.clickElementById(Constants.idPlaceOfIncident);
		
		selenium.sendKeysById(Constants.idPlaceOfIncident, "Da Bathroom");
		
		selenium.clickElementById(Constants.idInjury_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idInjury_chosen, "Yes");
		
		selenium.clickElementById(Constants.idSeverity_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idSeverity_chosen, "5");
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, "First Aid");
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, "ER");
		
		selenium.clickElementById(Constants.idNarrative);
		
		selenium.sendKeysById(Constants.idNarrative, "I fell and broke my arm. No one was around to help me.");
		
		selenium.clickElementById(Constants.idNurseMedReportFor_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idNurseMedReportFor_chosen, "Staff");
		
		selenium.clickElementById(Constants.idNurseDateOfIncident);
		
		selenium.chooseDateInDatePicker("February", "2", "2005", "2");
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("12", "28", "AM");
		
		selenium.clickElementById(Constants.idNurseFirstName);
		
		selenium.sendKeysById(Constants.idNurseFirstName, "Ivan");
		
		selenium.clickElementById(Constants.idNurseLastName);
		
		selenium.sendKeysById(Constants.idNurseLastName, "Ginez Sanchez");
		
		selenium.clickElementById(Constants.idNurseTitle);
		
		selenium.sendKeysById(Constants.idNurseTitle, "No title");
		
		selenium.clickElementById(Constants.idNurseReport);
		
		selenium.sendKeysById(Constants.idNurseReport, "Found the victim laying on the ground  with a broken arm.");
		
		selenium.clickElementById(Constants.idPhysicianMedReportFor_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen, "Patient");
		
		selenium.clickElementById(Constants.idPhysicianDateOfIncident);
		
		selenium.chooseDateInDatePicker("January", "1", "2007", "25");
		
		selenium.clickElementById(Constants.idPhysicianTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("1", "30", "PM");
		
		selenium.clickElementById(Constants.idPhysicianFirstName);
		
		selenium.sendKeysById(Constants.idPhysicianFirstName, "Jordan");
		
		selenium.clickElementById(Constants.idPhysicianLastName);
		
		selenium.sendKeysById(Constants.idPhysicianLastName, "Sloan");
		
		selenium.clickElementById(Constants.idPhysicianTitle);
		
		selenium.sendKeysById(Constants.idPhysicianTitle, "No title");
		
		selenium.clickElementById(Constants.idPhysicianReport);
		
		selenium.sendKeysById(Constants.idPhysicianReport, "I cured.");
	}
}