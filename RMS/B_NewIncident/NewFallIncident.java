package B_NewIncident;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.Constants;
import utility.SeleniumFunctions;

public class NewFallIncident
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
	public void addFallIncident_1() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.clickElementById(Constants.portalRMS);
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.waitUntilId("IncidentNumber");
		
		selenium.clickElementById(Constants.idDateofIncident);
		
		selenium.chooseDateInDatePicker(Constants.idDateofIncident, "March", "3", "2014", "31");
		
		selenium.clickElementById(Constants.idTimeofIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idTimeofIncident, "1", "01", "AM");
		
		selenium.clickElementById(Constants.idIncidentDepartment);
		
		selenium.clickParentIncidentDeptWithinTreeByName("Clinic");
		
		String incidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		
		assertTrue("Department was incorrect after click", incidentDept.contentEquals("Clinic"));
		
		selenium.clickElementById(Constants.idSeverity_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idSeverity_chosen, "5");
		
		String severity = selenium.getValueFromDropDownById(Constants.idSeverity_chosen);
		
		assertTrue("Severity was incorrect after click", severity.contentEquals("5"));
		
		selenium.clickElementById(Constants.idProgramId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idProgramId_chosen, "School");
		
		String programId = selenium.getValueFromDropDownById(Constants.idProgramId_chosen);
		
		assertTrue("Program ID was incorrect after click", programId.contentEquals("School"));
		
		selenium.clickElementById(Constants.idLocationId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idLocationId_chosen, "Med Rm");
		
		String locationId = selenium.getValueFromDropDownById(Constants.idLocationId_chosen);
		
		assertTrue("Location ID was incorrect after click", locationId.contentEquals("Med Rm"));
		
		selenium.clickElementById(Constants.idPlaceofIncident);
		
		selenium.sendKeysById(Constants.idPlaceofIncident, "Classroom");
		
		selenium.clickElementById(Constants.idFallRiskAssessmentScore);
		
		selenium.sendKeysById(Constants.idFallRiskAssessmentScore, "Good");
		
		selenium.clickElementById(Constants.idContributingFactors_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idContributingFactors_chosen, "Hypotension");
		
		selenium.clickElementById(Constants.idDateofFall);
		
		selenium.chooseDateInDatePicker(Constants.idDateofFall, "March", "3", "2015", "10");
		
		selenium.clickElementById(Constants.idDirectCauseOfFall);
		
		selenium.sendKeysById(Constants.idDirectCauseOfFall, "Chair was in the way.");
		
		selenium.clickRadioBoxWithIdByValue(Constants.idAllFallPrecautionsInPlaceAtTimeOfFall, "Yes");
		
		selenium.clickRadioBoxWithIdByValue(Constants.idPhysicalTherapyInvolved, "No");
		
		selenium.clickRadioBoxWithIdByValue(Constants.idDidPatientHaveECTEarlierOnDayOfFall, "No");
	}
}