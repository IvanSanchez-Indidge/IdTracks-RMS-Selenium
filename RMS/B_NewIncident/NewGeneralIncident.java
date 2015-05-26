package B_NewIncident;

import static org.junit.Assert.*;

import java.util.List;

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
	public void bestCase() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.clickElementById(Constants.portalRMS);
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String incidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		
		String reportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		
		selenium.clickElementById(Constants.idDateOfIncident);
		
		selenium.chooseDateInDatePicker(Constants.idDateOfIncident, "January", "1","2015", "5");
		
		String dateInPicker = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
		
		assertTrue("Date was incorrect after click", dateInPicker.contentEquals("01/05/2015"));
		
		selenium.clickElementById(Constants.idTimeOfIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idTimeOfIncident, "5", "30", "PM");
		
		String timeInPicker = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		
		assertTrue("Time was incorrect after click", timeInPicker.contentEquals("5:30 PM"));
		
		selenium.clickElementById(Constants.idIncidentType);
		
		selenium.clickIncidentType("Assault", "Attempted");
		
		String incidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		
		assertTrue("Type was incorrect after click", incidentType.contentEquals("Attempted"));
		
		selenium.clickElementById(Constants.idIncidentDepartment);
		
		selenium.clickParentIncidentDeptWithinTreeByName("Clinic");
		
		String incidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		
		assertTrue("Department was incorrect after click", incidentDept.contentEquals("Clinic"));
		
		selenium.clickElementById(Constants.idProgramId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idProgramId_chosen, "School");
		
		String program = selenium.getValueFromDropDownById(Constants.idProgramId_chosen);
		
		assertTrue("Program was incorrect after click", program.contentEquals("School"));
		
		selenium.clickElementById(Constants.idLocationId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idLocationId_chosen, "Hospital-Wide");
		
		String location = selenium.getValueFromDropDownById(Constants.idLocationId_chosen);
		
		assertTrue("Location was incorrect after click", location.contentEquals("Hospital-Wide"));
		
		selenium.clickElementById(Constants.idPlaceOfIncident);
		
		selenium.sendKeysById(Constants.idPlaceOfIncident, "Da Bathroom");
		
		String placeOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		
		assertTrue("Place of incident was incorrect after click", placeOfIncident.contentEquals("Da Bathroom"));
		
		/*
		 * Grid testing goes here
		*/
		
		selenium.clickElementById(Constants.idInjury_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idInjury_chosen, "Yes");
		
		String injury = selenium.getValueFromDropDownById(Constants.idInjury_chosen);
		
		assertTrue("Injury was incorrect after click", injury.contentEquals("Yes"));
		
		selenium.clickElementById(Constants.idSeverity_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idSeverity_chosen, "5");
		
		String severity = selenium.getValueFromDropDownById(Constants.idSeverity_chosen);
		
		assertTrue("Severity was incorrect after click", severity.contentEquals("5"));
		
		String firstAid = "First Aid";
		String er = "ER";
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, firstAid);
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, er);
		
		List<String> results = selenium.getChoicesFromDropDownById(Constants.idResultIds_chosen);
		
		assertTrue("Size of list is wrong", results.size() == 2);
		
		assertTrue("First aid not in list", results.contains(firstAid));
		
		selenium.clickElementById(Constants.idNarrative);
		
		selenium.sendKeysById(Constants.idNarrative, "I fell and broke my arm. No one was around to help me.");
		
		String narrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		
		assertTrue("Narrative was incorrect after typing", narrative.contentEquals("I fell and broke my arm. No one was around to help me."));
		
		selenium.clickElementById(Constants.idNurseMedReportFor_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idNurseMedReportFor_chosen, "Staff");
		
		String nurseMedReport = selenium.getValueFromDropDownById(Constants.idNurseMedReportFor_chosen);
		
		assertTrue("Nurse Med Report was incorrect after click", nurseMedReport.contentEquals("Staff"));
		
		selenium.clickElementById(Constants.idNurseDateOfIncident);
		
		selenium.chooseDateInDatePicker(Constants.idNurseDateOfIncident, "February", "2", "2005", "2");
		
		String nurseDateOfIncident = selenium.findElementById(Constants.idNurseDateOfIncident).getAttribute("value");
		
		assertTrue("Nurse Date of Incident was incorrect after click", nurseDateOfIncident.contentEquals("02/02/2005"));
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idNurseTimeOfIncident, "12", "28", "AM");
		
		String nurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		
		assertTrue("Nurse Time of Incident was incorrect after click", nurseTimeOfIncident.contentEquals("12:28 AM"));
		
		selenium.clickElementById(Constants.idNurseFirstName);
		
		selenium.sendKeysById(Constants.idNurseFirstName, "Ivan");
		
		String nurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		
		assertTrue("Nurse First Name was incorrect after click", nurseFirstName.contentEquals("Ivan"));
		
		selenium.clickElementById(Constants.idNurseLastName);
		
		selenium.sendKeysById(Constants.idNurseLastName, "Ginez Sanchez");
		
		String nurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		
		assertTrue("Nurse Last Name was incorrect after click", nurseLastName.contentEquals("Ginez Sanchez"));
		
		selenium.clickElementById(Constants.idNurseTitle);
		
		selenium.sendKeysById(Constants.idNurseTitle, "No title");
		
		String nurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		
		assertTrue("Nurse Title was incorrect after click", nurseTitle.contentEquals("No title"));
		
		selenium.clickElementById(Constants.idNurseReport);
		
		selenium.sendKeysById(Constants.idNurseReport, "Found the victim laying on the ground  with a broken arm.");
		
		String nurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		
		assertTrue("Nurse Report was incorrect after click", nurseReport.contentEquals("Found the victim laying on the ground  with a broken arm."));
		
		selenium.clickElementById(Constants.idPhysicianMedReportFor_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen, "Patient");
		
		String physicianMedReport = selenium.getValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen);
		
		assertTrue("Physician Med Report was incorrect after click", physicianMedReport.contentEquals("Patient"));
		
		selenium.clickElementById(Constants.idPhysicianDateOfIncident);
		
		selenium.chooseDateInDatePicker(Constants.idPhysicianDateOfIncident, "January", "1", "2007", "25");
		
		String physicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		
		assertTrue("Physician Date of Incident was incorrect after click", physicianDateOfIncident.contentEquals("01/25/2007"));
		
		selenium.clickElementById(Constants.idPhysicianTimeOfIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idPhysicianTimeOfIncident, "1", "30", "PM");
		
		String physicianTimeOfIncident = selenium.findElementById(Constants.idPhysicianTimeOfIncident).getAttribute("value");
		
		assertTrue("Physican Time of Incident was incorrect after click", physicianTimeOfIncident.contentEquals("1:30 PM"));
		
		selenium.clickElementById(Constants.idPhysicianFirstName);
		
		selenium.sendKeysById(Constants.idPhysicianFirstName, "Jordan");
		
		String physicianFirstName = selenium.findElementById(Constants.idPhysicianFirstName).getAttribute("value");
		
		assertTrue("Physican Name was incorrect after typing", physicianFirstName.contentEquals("Jordan"));
		
		selenium.clickElementById(Constants.idPhysicianLastName);
		
		selenium.sendKeysById(Constants.idPhysicianLastName, "Sloan");
		
		String physicianLastName = selenium.findElementById(Constants.idPhysicianLastName).getAttribute("value");
		
		assertTrue("Physican Last was incorrect after typing", physicianLastName.contentEquals("Sloan"));
		
		selenium.clickElementById(Constants.idPhysicianTitle);
		
		selenium.sendKeysById(Constants.idPhysicianTitle, "No title");
		
		String physicianTitle = selenium.findElementById(Constants.idPhysicianTitle).getAttribute("value");
		
		assertTrue("Physican Title was incorrect after typing", physicianTitle.contentEquals("No title"));
		
		selenium.clickElementById(Constants.idPhysicianReport);
		
		selenium.sendKeysById(Constants.idPhysicianReport, "I cured.");
		
		String physicianReport = selenium.findElementById(Constants.idPhysicianReport).getAttribute("value");
		
		assertTrue("Physican Report was incorrect after typing", physicianReport.contentEquals("I cured."));
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentSubmitButton);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTableSearch);
		
		selenium.sendKeysByxPath(Constants.xPathIncidentTableSearch, incidentNumber);
		
		selenium.clickElementByxPath(Constants.xPathFirstLinkInTable);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String detailsIncidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		String detailsReportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		String detailsDateOfIncident = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
		String detailsTimeOfIncident = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		String detailsIncidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		String detailsIncidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		String detailsProgramId = selenium.findElementById(Constants.idProgramId_chosen).getText();
		String detailsLocationId = selenium.findElementById(Constants.idLocationId_chosen).getText();
		String detailsPlaceOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		String detailsInjuryId = selenium.findElementById(Constants.idInjury_chosen).getText();
		String detailsSeverity = selenium.findElementById(Constants.idSeverity_chosen).getText();
		//String detailsResult;
		String detailsNarrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		String detailsNurseMedReport = selenium.findElementById(Constants.idNurseMedReportFor_chosen).getText();
		String detailsNurseDateOfIncident = selenium.findElementById(Constants.idNurseDateofIncident).getAttribute("value");
		String detailsNurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		String detailsNurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		String detailsNurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		String detailsNurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		String detailsNurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		String detailsPhysicianMedReport = selenium.findElementById(Constants.idPhysicianMedReportFor_chosen).getText();
		String detailsPhysicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		String detailsPhysicianTimeOfIncident = selenium.findElementById(Constants.idPhysicianTimeOfIncident).getAttribute("value");
		String detailsPhysicianFirstName = selenium.findElementById(Constants.idPhysicianFirstName).getAttribute("value");
		String detailsPhysicianLastName = selenium.findElementById(Constants.idPhysicianLastName).getAttribute("value");
		String detailsPhysicianTitle = selenium.findElementById(Constants.idPhysicianTitle).getAttribute("value");
		String detailsPhysicianReport = selenium.findElementById(Constants.idPhysicianReport).getAttribute("value");
		
		assertTrue("Wrong Incident Number", detailsIncidentNumber.contentEquals(incidentNumber));
		assertTrue("Wrong Reported By", detailsReportedBy.contentEquals(reportedBy));
		assertTrue("Wrong Date of Incident", detailsDateOfIncident.contentEquals(dateInPicker));
		assertTrue("Wrong Time of Incident", detailsTimeOfIncident.contentEquals(timeInPicker));
		assertTrue("Wrong Incident Type", detailsIncidentType.contentEquals(incidentType));
		assertTrue("Wrong Incident Dept", detailsIncidentDept.contentEquals(incidentDept));
		assertTrue("Wrong Program", detailsProgramId.contentEquals(program));
		assertTrue("Wrong Location", detailsLocationId.contentEquals(location));
		assertTrue("Wrong Place of incident", detailsPlaceOfIncident.contentEquals(placeOfIncident));
		assertTrue("Wrong Injury", detailsInjuryId.contentEquals(injury));
		assertTrue("Wrong Severity", detailsSeverity.contentEquals(severity));
		//assertTrue("Wrong Results", detailsResult.contentEquals(results));
		assertTrue("Wrong Narrative", detailsNarrative.contentEquals(narrative));
		assertTrue("Wrong Nurse Med Report", detailsNurseMedReport.contentEquals(nurseMedReport));
		assertTrue("Wrong Nurse Date Of Incident", detailsNurseDateOfIncident.contentEquals(nurseDateOfIncident));
		assertTrue("Wrong Nurse Time Of Incident", detailsNurseTimeOfIncident.contentEquals(nurseTimeOfIncident));
		assertTrue("Wrong Nurse First Name", detailsNurseFirstName.contentEquals(nurseFirstName));
		assertTrue("Wrong Nurse Last Name", detailsNurseLastName.contentEquals(nurseLastName));
		assertTrue("Wrong Nurse Title", detailsNurseTitle.contentEquals(nurseTitle));
		assertTrue("Wrong Nurse Report", detailsNurseReport.contentEquals(nurseReport));
		assertTrue("Wrong Nurse Med Report", detailsPhysicianMedReport.contentEquals(physicianMedReport));
		assertTrue("Wrong Physician Date Of Incident", detailsPhysicianDateOfIncident.contentEquals(physicianDateOfIncident));
		assertTrue("Wrong Physician Time Of Incident", detailsPhysicianTimeOfIncident.contentEquals(physicianTimeOfIncident));
		assertTrue("Wrong Physican First Name", detailsPhysicianFirstName.contentEquals(physicianFirstName));
		assertTrue("Wrong Physician Last Name", detailsPhysicianLastName.contentEquals(physicianLastName));
		assertTrue("Wrong Physician Title", detailsPhysicianTitle.contentEquals(physicianTitle));
		assertTrue("Wrong Physician Report", detailsPhysicianReport.contentEquals(physicianReport));
	}
	
	@Test
	public void intermediateCase() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.clickElementById(Constants.portalRMS);
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String incidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		
		String reportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		
		selenium.clickElementById(Constants.idDateOfIncident);
		
		selenium.chooseDateInDatePicker(Constants.idDateOfIncident, "January", "1","2015", "5");
		
		String dateInPicker = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
		
		assertTrue("Date was incorrect after click", dateInPicker.contentEquals("01/05/2015"));
		
//		String timeInPicker = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		
		selenium.clickElementById(Constants.idIncidentType);
		
		selenium.clickIncidentType("Assault", "Attempted");
		
		String incidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		
		assertTrue("Type was incorrect after click", incidentType.contentEquals("Attempted"));
		
//		String incidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		
		selenium.clickElementById(Constants.idProgramId_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idProgramId_chosen, "School");
		
		String program = selenium.getValueFromDropDownById(Constants.idProgramId_chosen);
		
		assertTrue("Program was incorrect after click", program.contentEquals("School"));
		
//		String location = selenium.getValueFromDropDownById(Constants.idLocationId_chosen);
		
		selenium.clickElementById(Constants.idPlaceOfIncident);
		
		selenium.sendKeysById(Constants.idPlaceOfIncident, "Da Bathroom");
		
		String placeOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		
		assertTrue("Place of incident was incorrect after click", placeOfIncident.contentEquals("Da Bathroom"));
		
		/*
		 * Grid testing goes here
		*/
		
//		String injury = selenium.getValueFromDropDownById(Constants.idInjury_chosen);
		
		selenium.clickElementById(Constants.idSeverity_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idSeverity_chosen, "5");
		
		String severity = selenium.getValueFromDropDownById(Constants.idSeverity_chosen);
		
		assertTrue("Severity was incorrect after click", severity.contentEquals("5"));
		
		String firstAid = "First Aid";
		String er = "ER";
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, firstAid);
		
		selenium.clickElementById(Constants.idResultIds_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idResultIds_chosen, er);
		
		List<String> results = selenium.getChoicesFromDropDownById(Constants.idResultIds_chosen);
		
		assertTrue("Size of list is wrong", results.size() == 2);
		
		assertTrue("First aid not in list", results.contains(firstAid));
		
		selenium.clickElementById(Constants.idNarrative);
		
		selenium.sendKeysById(Constants.idNarrative, "I fell and broke my arm. No one was around to help me.");
		
		String narrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		
		assertTrue("Narrative was incorrect after typing", narrative.contentEquals("I fell and broke my arm. No one was around to help me."));
		
//		String nurseMedReport = selenium.getValueFromDropDownById(Constants.idNurseMedReportFor_chosen);
		
		selenium.clickElementById(Constants.idNurseDateOfIncident);
		
		selenium.chooseDateInDatePicker(Constants.idNurseDateOfIncident, "February", "2", "2005", "2");
		
		String nurseDateOfIncident = selenium.findElementById(Constants.idNurseDateOfIncident).getAttribute("value");
		
		assertTrue("Nurse Date of Incident was incorrect after click", nurseDateOfIncident.contentEquals("02/02/2005"));
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idNurseTimeOfIncident, "12", "28", "AM");
		
		String nurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		
		assertTrue("Nurse Time of Incident was incorrect after click", nurseTimeOfIncident.contentEquals("12:28 AM"));
		
		selenium.clickElementById(Constants.idNurseFirstName);
		
		selenium.sendKeysById(Constants.idNurseFirstName, "Ivan");
		
		String nurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		
		assertTrue("Nurse First Name was incorrect after click", nurseFirstName.contentEquals("Ivan"));
		
//		String nurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		
		selenium.clickElementById(Constants.idNurseTitle);
		
		selenium.sendKeysById(Constants.idNurseTitle, "No title");
		
		String nurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		
		assertTrue("Nurse Title was incorrect after click", nurseTitle.contentEquals("No title"));
		
		selenium.clickElementById(Constants.idNurseReport);
		
		selenium.sendKeysById(Constants.idNurseReport, "Found the victim laying on the ground  with a broken arm.");
		
		String nurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		
		assertTrue("Nurse Report was incorrect after click", nurseReport.contentEquals("Found the victim laying on the ground  with a broken arm."));
		
		selenium.clickElementById(Constants.idPhysicianMedReportFor_chosen);
		
		selenium.clickValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen, "Patient");
		
		String physicianMedReport = selenium.getValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen);
		
		assertTrue("Physician Med Report was incorrect after click", physicianMedReport.contentEquals("Patient"));
		
//		String physicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		
		selenium.clickElementById(Constants.idPhysicianTimeOfIncident);
		
		selenium.chooseTimeInTimePicker(Constants.idPhysicianTimeOfIncident, "1", "30", "PM");
		
		String physicianTimeOfIncident = selenium.findElementById(Constants.idPhysicianTimeOfIncident).getAttribute("value");
		
		assertTrue("Physican Time of Incident was incorrect after click", physicianTimeOfIncident.contentEquals("1:30 PM"));
		
		selenium.clickElementById(Constants.idPhysicianFirstName);
		
		selenium.sendKeysById(Constants.idPhysicianFirstName, "Jordan");
		
		String physicianFirstName = selenium.findElementById(Constants.idPhysicianFirstName).getAttribute("value");
		
		assertTrue("Physican Name was incorrect after typing", physicianFirstName.contentEquals("Jordan"));
		
		selenium.clickElementById(Constants.idPhysicianLastName);
		
		selenium.sendKeysById(Constants.idPhysicianLastName, "Sloan");
		
		String physicianLastName = selenium.findElementById(Constants.idPhysicianLastName).getAttribute("value");
		
		assertTrue("Physican Last was incorrect after typing", physicianLastName.contentEquals("Sloan"));
		
		selenium.clickElementById(Constants.idPhysicianTitle);
		
		selenium.sendKeysById(Constants.idPhysicianTitle, "No title");
		
		String physicianTitle = selenium.findElementById(Constants.idPhysicianTitle).getAttribute("value");
		
		assertTrue("Physican Title was incorrect after typing", physicianTitle.contentEquals("No title"));
		
		selenium.clickElementById(Constants.idPhysicianReport);
		
		selenium.sendKeysById(Constants.idPhysicianReport, "I cured.");
		
		String physicianReport = selenium.findElementById(Constants.idPhysicianReport).getAttribute("value");
		
		assertTrue("Physican Report was incorrect after typing", physicianReport.contentEquals("I cured."));
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentSubmitButton);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTableSearch);
		
		selenium.sendKeysByxPath(Constants.xPathIncidentTableSearch, incidentNumber);
		
		selenium.clickElementByxPath(Constants.xPathFirstLinkInTable);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String detailsIncidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		String detailsReportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		String detailsDateOfIncident = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
		String detailsTimeOfIncident = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		String detailsIncidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		String detailsIncidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		String detailsProgramId = selenium.findElementById(Constants.idProgramId_chosen).getText();
		String detailsLocationId = selenium.findElementById(Constants.idLocationId_chosen).getText();
		String detailsPlaceOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		String detailsInjuryId = selenium.findElementById(Constants.idInjury_chosen).getText();
		String detailsSeverity = selenium.findElementById(Constants.idSeverity_chosen).getText();
		//String detailsResult;
		String detailsNarrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		String detailsNurseMedReport = selenium.findElementById(Constants.idNurseMedReportFor_chosen).getText();
		String detailsNurseDateOfIncident = selenium.findElementById(Constants.idNurseDateofIncident).getAttribute("value");
		String detailsNurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		String detailsNurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		String detailsNurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		String detailsNurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		String detailsNurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		String detailsPhysicianMedReport = selenium.findElementById(Constants.idPhysicianMedReportFor_chosen).getText();
		String detailsPhysicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		String detailsPhysicianTimeOfIncident = selenium.findElementById(Constants.idPhysicianTimeOfIncident).getAttribute("value");
		String detailsPhysicianFirstName = selenium.findElementById(Constants.idPhysicianFirstName).getAttribute("value");
		String detailsPhysicianLastName = selenium.findElementById(Constants.idPhysicianLastName).getAttribute("value");
		String detailsPhysicianTitle = selenium.findElementById(Constants.idPhysicianTitle).getAttribute("value");
		String detailsPhysicianReport = selenium.findElementById(Constants.idPhysicianReport).getAttribute("value");
		
		assertTrue("Wrong Incident Number", detailsIncidentNumber.contentEquals(incidentNumber));
		assertTrue("Wrong Reported By", detailsReportedBy.contentEquals(reportedBy));
		assertTrue("Wrong Date of Incident", detailsDateOfIncident.contentEquals(dateInPicker));
		assertTrue("Wrong Time of Incident", detailsTimeOfIncident.contentEquals(""));
		assertTrue("Wrong Incident Type", detailsIncidentType.contentEquals(incidentType));
		assertTrue("Wrong Incident Dept", detailsIncidentDept.contentEquals(""));
		assertTrue("Wrong Program", detailsProgramId.contentEquals(program));
		assertTrue("Wrong Location", detailsLocationId.contentEquals("Select the Location..."));
		assertTrue("Wrong Place of incident", detailsPlaceOfIncident.contentEquals(placeOfIncident));
		assertTrue("Wrong Injury", detailsInjuryId.contentEquals("Select an option..."));
		assertTrue("Wrong Severity", detailsSeverity.contentEquals(severity));
		//assertTrue("Wrong Results", detailsResult.contentEquals(results));
		assertTrue("Wrong Narrative", detailsNarrative.contentEquals(narrative));
		assertTrue("Wrong Nurse Med Report", detailsNurseMedReport.contentEquals("Select a report for..."));
		assertTrue("Wrong Nurse Date Of Incident", detailsNurseDateOfIncident.contentEquals(nurseDateOfIncident));
		assertTrue("Wrong Nurse Time Of Incident", detailsNurseTimeOfIncident.contentEquals(nurseTimeOfIncident));
		assertTrue("Wrong Nurse First Name", detailsNurseFirstName.contentEquals(nurseFirstName));
		assertTrue("Wrong Nurse Last Name", detailsNurseLastName.contentEquals(""));
		assertTrue("Wrong Nurse Title", detailsNurseTitle.contentEquals(nurseTitle));
		assertTrue("Wrong Nurse Report", detailsNurseReport.contentEquals(nurseReport));
		assertTrue("Wrong Nurse Med Report", detailsPhysicianMedReport.contentEquals(physicianMedReport));
		assertTrue("Wrong Physician Date Of Incident", detailsPhysicianDateOfIncident.contentEquals(""));
		assertTrue("Wrong Physician Time Of Incident", detailsPhysicianTimeOfIncident.contentEquals(physicianTimeOfIncident));
		assertTrue("Wrong Physican First Name", detailsPhysicianFirstName.contentEquals(physicianFirstName));
		assertTrue("Wrong Physician Last Name", detailsPhysicianLastName.contentEquals(physicianLastName));
		assertTrue("Wrong Physician Title", detailsPhysicianTitle.contentEquals(physicianTitle));
		assertTrue("Wrong Physician Report", detailsPhysicianReport.contentEquals(physicianReport));
	}
	
	@Test
	public void worstCase() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.clickElementById(Constants.portalRMS);
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String incidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		
		String reportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		
		selenium.clickElementByxPath(Constants.xPathGeneralIncidentSubmitButton);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTableSearch);
		
		selenium.sendKeysByxPath(Constants.xPathIncidentTableSearch, incidentNumber);
		
		selenium.clickElementByxPath(Constants.xPathFirstLinkInTable);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String detailsIncidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		String detailsReportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		String detailsDateOfIncident = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
		String detailsTimeOfIncident = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		String detailsIncidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		String detailsIncidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		String detailsProgramId = selenium.findElementById(Constants.idProgramId_chosen).getText();
		String detailsLocationId = selenium.findElementById(Constants.idLocationId_chosen).getText();
		String detailsPlaceOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		String detailsInjuryId = selenium.findElementById(Constants.idInjury_chosen).getText();
		String detailsSeverity = selenium.findElementById(Constants.idSeverity_chosen).getText();
		//String detailsResult;
		String detailsNarrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		String detailsNurseMedReport = selenium.findElementById(Constants.idNurseMedReportFor_chosen).getText();
		String detailsNurseDateOfIncident = selenium.findElementById(Constants.idNurseDateofIncident).getAttribute("value");
		String detailsNurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		String detailsNurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		String detailsNurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		String detailsNurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		String detailsNurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		String detailsPhysicianMedReport = selenium.findElementById(Constants.idPhysicianMedReportFor_chosen).getText();
		String detailsPhysicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		String detailsPhysicianTimeOfIncident = selenium.findElementById(Constants.idPhysicianTimeOfIncident).getAttribute("value");
		String detailsPhysicianFirstName = selenium.findElementById(Constants.idPhysicianFirstName).getAttribute("value");
		String detailsPhysicianLastName = selenium.findElementById(Constants.idPhysicianLastName).getAttribute("value");
		String detailsPhysicianTitle = selenium.findElementById(Constants.idPhysicianTitle).getAttribute("value");
		String detailsPhysicianReport = selenium.findElementById(Constants.idPhysicianReport).getAttribute("value");
		
		assertTrue("Wrong Incident Number", detailsIncidentNumber.contentEquals(incidentNumber));
		assertTrue("Wrong Reported By", detailsReportedBy.contentEquals(reportedBy));
		assertTrue("Wrong Date of Incident", detailsDateOfIncident.contentEquals(""));
		assertTrue("Wrong Time of Incident", detailsTimeOfIncident.contentEquals(""));
		assertTrue("Wrong Incident Type", detailsIncidentType.contentEquals(""));
		assertTrue("Wrong Incident Dept", detailsIncidentDept.contentEquals(""));
		assertTrue("Wrong Program", detailsProgramId.contentEquals("Select a Program..."));
		assertTrue("Wrong Location", detailsLocationId.contentEquals("Select the Location..."));
		assertTrue("Wrong Place of incident", detailsPlaceOfIncident.contentEquals(""));
		assertTrue("Wrong Injury", detailsInjuryId.contentEquals("Select an option..."));
		assertTrue("Wrong Severity", detailsSeverity.contentEquals("Select a severity..."));
		//assertTrue("Wrong Results", detailsResult.contentEquals(results));
		assertTrue("Wrong Narrative", detailsNarrative.contentEquals(""));
		assertTrue("Wrong Nurse Med Report", detailsNurseMedReport.contentEquals("Select a report for..."));
		assertTrue("Wrong Nurse Date Of Incident", detailsNurseDateOfIncident.contentEquals(""));
		assertTrue("Wrong Nurse Time Of Incident", detailsNurseTimeOfIncident.contentEquals(""));
		assertTrue("Wrong Nurse First Name", detailsNurseFirstName.contentEquals(""));
		assertTrue("Wrong Nurse Last Name", detailsNurseLastName.contentEquals(""));
		assertTrue("Wrong Nurse Title", detailsNurseTitle.contentEquals(""));
		assertTrue("Wrong Nurse Report", detailsNurseReport.contentEquals(""));
		assertTrue("Wrong Physician Med Report", detailsPhysicianMedReport.contentEquals("Select a report for..."));
		assertTrue("Wrong Physician Date Of Incident", detailsPhysicianDateOfIncident.contentEquals(""));
		assertTrue("Wrong Physician Time Of Incident", detailsPhysicianTimeOfIncident.contentEquals(""));
		assertTrue("Wrong Physican First Name", detailsPhysicianFirstName.contentEquals(""));
		assertTrue("Wrong Physician Last Name", detailsPhysicianLastName.contentEquals(""));
		assertTrue("Wrong Physician Title", detailsPhysicianTitle.contentEquals(""));
		assertTrue("Wrong Physician Report", detailsPhysicianReport.contentEquals(""));
	}
}