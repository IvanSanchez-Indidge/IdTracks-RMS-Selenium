package Incidents;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Constants;
import utility.SeleniumFunctions;

public class Details

{
	public WebDriver driver;
	SeleniumFunctions selenium = new SeleniumFunctions();

	@Before
	public void setUp() throws Exception 
	{
		selenium.setUp();
	}

	@Test
	public void test() throws Exception
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
		
		selenium.clickElementByxPath(Constants.xPathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xPathDetailsIncidentPage);
		
		String pageTitle = selenium.findElementByxPath(Constants.xPathDetailsIncidentPage).getText();
						
		assertTrue("Navigation error !" , pageTitle.contains("Details Incident General"));
		
		String detailsIncidentNumber = selenium.findElementByxPath(Constants.xPathDetailsIncidentNumber).getAttribute("value");
				
		System.out.println("incident number details page:" + detailsIncidentNumber);
		
		assertEquals(detailsIncidentNumber,incidentNumber);
		
		//selenium.clickElementByXpath(Constants.xpathIncidentOccured);
						
		//selenium.clickElementByXpath(Constants.xpathInpatient);		
		
		//selenium.selectVisibleTextByXpath(Constants.xpathIncidentOccured, "Inpatient");
		
		selenium.clickElementById(Constants.idDateofIncident);
		
		selenium.chooseDateInDatePicker("April", "4", "2015", "23");
		
		selenium.clickElementById(Constants.idTimeofIncident);
		
		selenium.chooseTimeInTimePicker("1", "02", "AM");
		
		selenium.clickElementByxPath(Constants.xPathIncidentTypeTab);
		
		//selenium.waitUntilId(Constants.idIncidentTypeWindow);
		
		selenium.clickElementById(Constants.idIncidentTypeAccident);
		
		selenium.waitUntilxPath(Constants.xPathIncidentTypeVehicle);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTypeVehicle);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTypeWindowOKButton);
		
		selenium.clickElementById(Constants.idIncidentDept);
		
		//selenium.waitUntilId(Constants.idIncidentDeptWindow);
		
		selenium.clickElementByxPath(Constants.xPathIncidentDeptAdmissions);
		
		selenium.clickElementByxPath(Constants.xPathIncidentDeptWindowOkButton);
		
		//selenium.selectSpanTextByxPath(Constants.xPathIncidentOccuredToggle, Constants.xPathIncidentOccuredSearch, "Residential");
		
		selenium.selectSpanTextByxPath(Constants.xPathIncidentLocationToggle, Constants.xPathIncidentLocationSearch, "public");
					
		selenium.sendKeysById(Constants.idPlaceOfIncident, "place");
		
		/* Add patient not getting updated*/
		
		selenium.clickElementById(Constants.idAddPatient);
		
		selenium.sendKeysById(Constants.idAdmissionNumber, "1");
		
		selenium.sendKeysById(Constants.idPatientFirstName, "A");
		
		selenium.sendKeysById(Constants.idPatientLastName, "B");
		
		selenium.clickElementById(Constants.idPatientPrimary);
		
		selenium.clickElementById(Constants.idSubmitButton);
		
		selenium.selectSpanTextByxPath(Constants.xPathInjuryToggle, Constants.xPathInjurySearch, "unknown");
		
		//selenium.selectSpanTextByxPath(Constants.xPathSeverityToggle, Constants.xPathSeveritySearch, "1");
				
		selenium.selectSpanTextByxPath(Constants.xPathResultToggle, Constants.xPathResultSearch, "First Aid");	
		
		String firstAidResult = selenium.findElementByxPath(Constants.xPathfirstAid).getText();
		
		System.out.println(firstAidResult);
		
		//assertTrue("Already Exist", firstAidResult.)
		
		selenium.selectSpanTextByxPath(Constants.xPathResultToggle, Constants.xPathResultSearch, "Urgent Care/specialist");
		
		selenium.sendKeysByxPath(Constants.xPathDetailsDescription, "asdjadhf");
		
		
		String detailsDescription = selenium.findElementByxPath(Constants.xPathDetailsDescription).getAttribute("value");
		
		System.out.println("description"+detailsDescription);
		
		selenium.selectSpanTextByxPath(Constants.xPathNurseMedReportToggle,Constants.xPathNurseMedReportSearch, "Staff");
		
		selenium.clickElementById(Constants.idNurseDateofIncident);
		
		selenium.chooseDateInDatePicker("May", "5", "2015", "21");
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("1", "03", "AM");
						
		selenium.sendKeysById(Constants.idNurseFirstName, "Mary");
		
		selenium.sendKeysById(Constants.idNurseLastName, "XYZ");
		
		selenium.sendKeysById(Constants.idNurseTitle, "Title");
		
		selenium.sendKeysById(Constants.idNurseReport, "text");
		
		selenium.selectSpanTextByxPath(Constants.xPathPhysicianMedReportToggle, Constants.xPathPhysicianMedReportSearch, "patient");
		
		selenium.clickElementById(Constants.idPhysicianDateOfIncident);
		
		selenium.chooseDateInDatePicker("June", "6", "2015", "21");
						
		//selenium.clickElementById(Constants.idPhysicianTimeOfIncident);
		
		//selenium.chooseTimeInTimePicker("1", "03", "AM"); /* Displaying NosuchElement Exception*/ 
		
				
		selenium.sendKeysById(Constants.idPhysicianFirstName, "Nicholas");
		
		selenium.sendKeysById(Constants.idPhysicianLastName, "Sparks");
		
		selenium.sendKeysById(Constants.idPhysicianReport, "Physician Report");
		
		selenium.sendKeysById(Constants.idPhysicianTitle, "text");
		
		selenium.clickElementByxPath(Constants.xPathSaveDetailsButton);		
		
		//selenium.isAlertPresent();
		
		/* Updation Alert popup - couldn't get the xpath/id - need to check with popup*/
		
		selenium.waitUntilxPath(Constants.xPathDetailsIncidentPage);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
				
		selenium.sendKeysByxPath(Constants.xPathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xPathActionsButton);
		
		selenium.clickElementByxPath(Constants.xPathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xPathDetailsIncidentPage);
		
		String updatedDescription = selenium.findElementByxPath(Constants.xPathDetailsDescription).getText();
		
		System.out.println("Updated Description" +updatedDescription);
		
		assertEquals(updatedDescription,detailsDescription);
		
		selenium.clearElementById(Constants.idDetailsDescription);
		
		selenium.clearElementById(Constants.idPlaceOfIncident);
		
		/*except description field , nurse and physician details are not getting updated*/
		
				
	}
	
	
	
	
	/*Test for Notes Tab*/
	//@Test
	public void test_1() throws Exception
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
		
		selenium.clickElementByxPath(Constants.xPathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xPathDetailsIncidentPage);			
		
		String detailsIncidentNumber = selenium.findElementByxPath(Constants.xPathDetailsIncidentNumber).getAttribute("value");
				
		System.out.println("incident number details page:" + detailsIncidentNumber);
		
		assertEquals(detailsIncidentNumber,incidentNumber);
		
		selenium.clickElementByxPath(Constants.xPathIncidentsDetailsTab);
		
		selenium.clickElementByxPath(Constants.xPathDetailsNotesTab);
						
		selenium.sendKeysByxPath(Constants.xPathDetailNotesTitle, "Testing");
		
		selenium.sendKeysByxPath(Constants.xPathDetailsNotesText, "Data");
		
		selenium.clickElementByxPath(Constants.xPathDetailsNotesAdd);
		
		/*Alert displayed for notes added*/
		
		selenium.waitUntilxPath(Constants.xPathDetailsIncidentPage);
		
		selenium.clickElementByxPath(Constants.xPathDetailsNotesTab);
		
				
	}
		

	@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}

}
