package Incidents;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.Constants;
import utility.SeleniumFunctions;

public class Details
{
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
		
		String incidentNumber = selenium.findElementByxPath(Constants.xpathIncidentNumber).getText();
		
		System.out.println("The incident number :" + incidentNumber);
					
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
		
		selenium.clickElementByxPath(Constants.xpathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xpathDetailsIncidentPage);
		
		String pageTitle = selenium.findElementByxPath(Constants.xpathDetailsIncidentPage).getText();
						
		assertTrue("Navigation error !" , pageTitle.contains("Details Incident General"));
		
		String detailsIncidentNumber = selenium.findElementByxPath(Constants.xpathDetailsIncidentNumber).getAttribute("value");
				
		System.out.println("incident number details page:" + detailsIncidentNumber);
		
		assertEquals(detailsIncidentNumber,incidentNumber);
		
		//selenium.clickElementByXpath(Constants.xpathIncidentOccured);
						
		//selenium.clickElementByXpath(Constants.xpathInpatient);		
		
		//selenium.selectVisibleTextByXpath(Constants.xpathIncidentOccured, "Inpatient");
		
		selenium.clickElementById(Constants.idDateOfIncident);
		
		selenium.chooseDateInDatePicker("February", "02","2015", "23");
		
		selenium.clickElementById(Constants.idTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("8", "30", "PM");
		
		selenium.clickElementByxPath(Constants.xpathIncidentTypeTab);
		
		selenium.waitUntilId(Constants.idIncidentTypeAccident);
		
		selenium.clickElementById(Constants.idIncidentTypeAccident);
		
		selenium.waitUntilxPath(Constants.xpathIncidentTypeVehicle);
		
		selenium.clickElementByxPath(Constants.xpathIncidentTypeVehicle);
		
		selenium.clickElementByxPath(Constants.xpathIncidentTypeWindowOKButton);
		
		selenium.clickElementById(Constants.idIncidentDept);
		
		//selenium.waitUntilId(Constants.idIncidentDeptWindow);
		
		//selenium.clickElementByxPath(Constants.xpathIncidentDeptAdmissions);
		
		selenium.clickParentIncidentDeptWithinTreeByName("Clinic");
		/*
		selenium.clickElementByxPath(Constants.xpathIncidentDeptWindowOkButton);
		
		//selenium.selectSpanTextByXpath(Constants.xpathIncidentOccuredToggle, Constants.xpathIncidentOccuredSearch, "Residential");
		
		selenium.clickElementByxPath(Constants.xpathIncidentOccuredToggle);
		
		selenium.sendKeysByxPath(Constants.xpathIncidentOccuredSearch, "Residential");
		
		selenium.enterPressByxPath(Constants.xpathIncidentOccuredSearch);
		
		//selenium.selectSpanTextByXpath(Constants.xpathIncidentLocationToggle, Constants.xpathIncidentLocationSearch, "public");
		
		//selenium.sendKeysById(Constants.idPlaceOfIncident, "place");
		
		/* Add patient not getting updated*/
		/*
		selenium.clickElementById(Constants.idAddPatient);
		
		selenium.sendKeysById(Constants.idAdmissionNumber, "1");
		
		selenium.sendKeysById(Constants.idPatientFirstName, "A");
		
		selenium.sendKeysById(Constants.idPatientLastName, "B");
		
		selenium.clickElementById(Constants.idPatientPrimary);
		
		selenium.clickElementById(Constants.idSubmitButton);
		
		//selenium.selectSpanTextByXpath(Constants.xpathInjuryToggle, Constants.xpathInjurySearch, "unknown");
		
		selenium.clickElementByxPath(Constants.xpathInjuryToggle);
		
		selenium.sendKeysByxPath(Constants.xpathInjurySearch, "unknown");
		
		selenium.enterPressByxPath(Constants.xpathInjurySearch);
		
		//selenium.selectSpanTextByXpath(Constants.xpathSeverityToggle, Constants.xpathSeveritySearch, "1");
		
		selenium.clickElementByxPath(Constants.xpathSeverityToggle);
		
		selenium.sendKeysByxPath(Constants.xpathSeveritySearch, "1");
		
		selenium.enterPressByxPath(Constants.xpathSeveritySearch);
				
		//selenium.selectSpanTextByXpath(Constants.xpathResultToggle, Constants.xpathResultSearch, "First Aid");
		
		selenium.clickElementByxPath(Constants.xpathResultToggle);
		
		selenium.sendKeysByxPath(Constants.xpathResultSearch, "First Aid");
		
		selenium.enterPressByxPath(Constants.xpathResultSearch);
		
		String firstAidResult = selenium.findElementByxPath(Constants.xpathfirstAid).getText();
		
		System.out.println(firstAidResult);
		
		//assertTrue("Already Exist", firstAidResult.)
		
		//selenium.selectSpanTextByXpath(Constants.xpathResultToggle, Constants.xpathResultSearch, "Urgent Care/specialist");
		
		selenium.clickElementByxPath(Constants.xpathResultToggle);
		
		selenium.sendKeysByxPath(Constants.xpathResultSearch, "Urgent Care/specialist");
		
		selenium.enterPressByxPath(Constants.xpathResultSearch);
		
		selenium.sendKeysByxPath(Constants.xpathDetailsDescription, "asdjadhf");
		
		
		String detailsDescription = selenium.findElementByxPath(Constants.xpathDetailsDescription).getAttribute("value");
		
		System.out.println("description"+detailsDescription);
		
		//selenium.selectSpanTextByXpath(Constants.xpathNurseMedReportToggle,Constants.xpathNurseMedReportSearch, "Staff");
		
		selenium.clickElementByxPath(Constants.xpathNurseMedReportToggle);
		
		selenium.sendKeysByxPath(Constants.xpathNurseMedReportSearch, "Staff");
		
		selenium.enterPressByxPath(Constants.xpathNurseMedReportSearch);
		
		selenium.clickElementById(Constants.idNurseDateofIncident);
		
		selenium.chooseDateInDatePicker("May", "05","2015", "21");
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("1", "03", "AM");
						
		selenium.sendKeysById(Constants.idNurseFirstName, "Mary");
		
		selenium.sendKeysById(Constants.idNurseLastName, "XYZ");
		
		selenium.sendKeysById(Constants.idNurseTitle, "Title");
		
		selenium.sendKeysById(Constants.idNurseReport, "text");
		
		//selenium.selectSpanTextByXpath(Constants.xpathPhysicianMedReportToggle, Constants.xpathPhysicianMedReportSearch, "patient");
		
		selenium.clickElementByxPath(Constants.xpathPhysicianMedReportToggle);
		
		selenium.sendKeysByxPath(Constants.xpathPhysicianMedReportSearch, "patient");
		
		selenium.enterPressByxPath(Constants.xpathPhysicianMedReportSearch);
		
		selenium.clickElementById(Constants.idPhysicianDateOfIncident);
		
		selenium.chooseDateInDatePicker("June", "06", "2015", "21");
						
		selenium.clickElementById(Constants.idPhysicianTimeOfIncident);
		
		selenium.chooseTimeInTimePicker("1", "03", "AM");
		
				
		selenium.sendKeysById(Constants.idPhysicianFirstName, "Nicholas");
		
		selenium.sendKeysById(Constants.idPhysicianLastName, "Sparks");
		
		selenium.sendKeysById(Constants.idPhysicianReport, "Physician Report");
		
		selenium.sendKeysById(Constants.idPhysicianTitle, "text");
		
		selenium.clickElementByxPath(Constants.xpathSaveDetailsButton);		
		
		//selenium.isAlertPresent();
		
		/* Updation Alert popup - couldn't get the xpath/id - need to check with popup*/
		/*
		selenium.waitUntilxPath(Constants.xpathDetailsIncidentPage);
		
		selenium.clickElementByxPath(Constants.xpathIncidentLeftNav);
		
		selenium.waitUntilId("incident-table");	
				
		selenium.sendKeysByxPath(Constants.xpathIncidentSearch, incidentNumber);
						
		selenium.clickElementByxPath(Constants.xpathActionsButton);
		
		selenium.clickElementByxPath(Constants.xpathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xpathDetailsIncidentPage);
		
		String updatedDescription = selenium.findElementByxPath(Constants.xpathDetailsDescription).getText();
		
		System.out.println("Updated Description" +updatedDescription);
		
		assertEquals(updatedDescription,detailsDescription);
		
		selenium.clearElementById(Constants.idDetailsDescription);
		
		selenium.clearElementById(Constants.idPlaceOfIncident);
		
		/*except description field , nurse and physician details are not getting updated*/
	}
	
	//@Test
	public void test_1() throws Exception
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
		
		selenium.clickElementByxPath(Constants.xpathDetailListButton);
		
		selenium.waitUntilxPath(Constants.xpathDetailsIncidentPage);			
		
		String detailsIncidentNumber = selenium.findElementByxPath(Constants.xpathDetailsIncidentNumber).getAttribute("value");
				
		System.out.println("incident number details page:" + detailsIncidentNumber);
		
		assertEquals(detailsIncidentNumber,incidentNumber);
		
		selenium.clickElementByxPath(Constants.xpathIncidentsDetailsTab);
		
		selenium.clickElementByxPath(Constants.xpathDetailsNotesTab);
						
		selenium.sendKeysByxPath(Constants.xpathDetailNotesTitle, "Testing");
		
		selenium.sendKeysByxPath(Constants.xpathDetailsNotesText, "Data");
		
		selenium.clickElementByxPath(Constants.xpathDetailsNotesAdd);
		
		/*Alert displayed for notes added*/
		
		selenium.waitUntilxPath(Constants.xpathDetailsIncidentPage);
		
		selenium.clickElementByxPath(Constants.xpathDetailsNotesTab);
		
				
	}
		

	//@After
	public void closeBrowser() throws Exception
	{
		selenium.closeBrowser();
	}

}
