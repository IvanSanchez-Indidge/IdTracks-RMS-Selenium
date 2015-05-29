package B_NewIncident;

import static org.junit.Assert.*;

import java.util.List;

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
	public void bestCase() throws InterruptedException
	{
		selenium.setUpWait();
		
		selenium.adminLogin();
		
		selenium.clickElementById(Constants.portalRMS);
		
		selenium.waitUntilxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathNewIncidentLeftNav);
		
		selenium.waitUntilxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.clickElementByxPath(Constants.xPathFallIncidentLeftNav);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String incidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		
		String reportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		
		selenium.clickElementById(Constants.idDateofIncident);
		selenium.chooseDateInDatePicker(Constants.idDateofIncident, "January", "1","2015", "5");
		String dateInPicker = selenium.findElementById(Constants.idDateofIncident).getAttribute("value");
		assertTrue("Date was incorrect after click", dateInPicker.contentEquals("01/05/2015"));
		
		selenium.clickElementById(Constants.idTimeOfIncident);
		selenium.chooseTimeInTimePicker(Constants.idTimeOfIncident, "5", "30", "PM");
		String timeInPicker = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		assertTrue("Time was incorrect after click", timeInPicker.contentEquals("5:30 PM"));
		
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
		String program = selenium.getValueFromDropDownById(Constants.idProgramId_chosen);
		assertTrue("Program was incorrect after click", program.contentEquals("School"));
		
		selenium.clickElementById(Constants.idLocationId_chosen);
		selenium.clickValueFromDropDownById(Constants.idLocationId_chosen, "Hospital-Wide");
		String location = selenium.getValueFromDropDownById(Constants.idLocationId_chosen);
		assertTrue("Location was incorrect after click", location.contentEquals("Hospital-Wide"));
		
		selenium.clickElementById(Constants.idPlaceofIncident);
		selenium.sendKeysById(Constants.idPlaceofIncident, "Da Bathroom");
		String placeOfIncident = selenium.findElementById(Constants.idPlaceofIncident).getAttribute("value");
		assertTrue("Place of incident was incorrect after click", placeOfIncident.contentEquals("Da Bathroom"));
		
		/*
		 * Grid testing goes here
		*/
		
		selenium.clickElementById(Constants.idFallRiskAssessmentScore);
		selenium.sendKeysById(Constants.idFallRiskAssessmentScore, "Highest Score");
		String fallRiskAssessmentScore = selenium.findElementById(Constants.idFallRiskAssessmentScore).getAttribute("value");
		assertTrue("Fall Risk Assessment Score was incorrect after typing", fallRiskAssessmentScore.contentEquals("Highest Score"));
		
		selenium.clickElementById(Constants.idDateofFall);
		selenium.chooseDateInDatePicker(Constants.idDateofFall, "January", "1", "2015", "10");
		String dateInDatePicker = selenium.findElementById(Constants.idDateofFall).getAttribute("value");
		assertTrue("Date of Fall was incorrect after choosing", dateInDatePicker.contentEquals("01/10/2015"));
		
		selenium.clickRadioBoxWithIdByValue(Constants.idAllFallPrecautionsInPlaceAtTimeOfFall, "No");
		boolean fallPrecautionsInPlaceAtTimeOfFall = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAllFallPrecautionsInPlaceAtTimeOfFall, "No");
		assertTrue("Fall Precautions In Place At Time Of Fall was incorrect after choosing", fallPrecautionsInPlaceAtTimeOfFall);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idPhysicalTherapyInvolved, "No");
		boolean physicalTherapyInvolved = selenium.isRadioBoxSelectedWithIdByValue(Constants.idPhysicalTherapyInvolved, "No");
		assertTrue("Physical Therapy Involved was incorrect after choosing", physicalTherapyInvolved);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idDidPatientHaveECTEarlierOnDayOfFall, "Yes");
		boolean didPatientHaveECTEarlierOnDayOfFall = selenium.isRadioBoxSelectedWithIdByValue(Constants.idDidPatientHaveECTEarlierOnDayOfFall, "Yes");
		assertTrue("Patient Have ECT Earlier On Day Of Fall incorrect after choosing", didPatientHaveECTEarlierOnDayOfFall);
		
		selenium.clickElementById(Constants.idContributingFactors_chosen);
		selenium.clickValueFromDropDownById(Constants.idContributingFactors_chosen, "Incontinence I urinary urgency");
		String contributingFactors = selenium.getValueFromDropDownById(Constants.idContributingFactors_chosen);
		assertTrue("Contributing Factors incorrect after choosing", contributingFactors.contentEquals("Incontinence I urinary urgency"));
		
		selenium.clickElementById(Constants.idDirectCauseOfFall);
		selenium.sendKeysById(Constants.idDirectCauseOfFall, "Slippery floor");
		String directCauseOfFall = selenium.findElementById(Constants.idDirectCauseOfFall).getAttribute("value");
		assertTrue("Direct Cause Of Fall incorrect after typing", directCauseOfFall.contentEquals("Slippery floor"));
		
		selenium.clickRadioBoxWithIdByValue(Constants.idInjury, "No");
		boolean injury = selenium.isRadioBoxSelectedWithIdByValue(Constants.idInjury, "No");
		assertTrue("Injury incorrect after choosing", injury);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idEvalByMD, "No");
		boolean evaluatedByMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idEvalByMD, "No");
		assertTrue("Evaluated by MD incorrect after choosing", evaluatedByMD);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idSentToER, "Yes");
		boolean sentToER = selenium.isRadioBoxSelectedWithIdByValue(Constants.idSentToER, "Yes");
		assertTrue("Sent to ER incorrect after choosing", sentToER);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idAdmittedMedically, "Yes");
		boolean admittedMedically = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAdmittedMedically, "Yes");
		assertTrue("Admitted Medically incorrect after choosing", admittedMedically);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idFallRiskAssessmentRedone, "Yes");
		boolean fallRiskAssessmentRedone = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallRiskAssessmentRedone, "Yes");
		assertTrue("Fall Risk Assessment Redone incorrect after choosing", fallRiskAssessmentRedone);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idFallputinSignificantEventsinEMR, "Yes");
		boolean fallPutInSignificantEventsInEMR = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallputinSignificantEventsinEMR, "Yes");
		assertTrue("Fall Put In Significant Events In EMR incorrect after choosing", fallPutInSignificantEventsInEMR);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idUnitManagerCalledImmediatelyAfterHuddle, "No");
		boolean unitManagerCalledImmediatelyAfterHuddle = selenium.isRadioBoxSelectedWithIdByValue(Constants.idUnitManagerCalledImmediatelyAfterHuddle, "No");
		assertTrue("Unit Manager Called Immediately After Huddle incorrect after choosing", unitManagerCalledImmediatelyAfterHuddle);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idNewOrdersWritten, "No");
		boolean newOrdersWritten = selenium.isRadioBoxSelectedWithIdByValue(Constants.idNewOrdersWritten, "No");
		assertTrue("New Orders Written incorrect after choosing", newOrdersWritten);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idProblemEnteredInHealthIssuesbyRN, "N/A");
		boolean problemEnteredInHealthIssuesbyRN = selenium.isRadioBoxSelectedWithIdByValue(Constants.idProblemEnteredInHealthIssuesbyRN, "N/A");
		assertTrue("Problem Entered In Health Issues by RN incorrect after choosing", problemEnteredInHealthIssuesbyRN);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idAxisIIIUpdatedByMD, "N/A");
		boolean axisIIIUpdatedByMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAxisIIIUpdatedByMD, "N/A");
		assertTrue("Axis III Updated By MD incorrect after choosing", axisIIIUpdatedByMD);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idFallRiskAddedAsNewMTPProblem, "No");
		boolean fallRiskAddedAsNewMTPProblem = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallRiskAddedAsNewMTPProblem, "No");
		assertTrue("Fall Risk Added As New MTP Problem incorrect after choosing", fallRiskAddedAsNewMTPProblem);
		
		selenium.clickRadioBoxWithIdByValue(Constants.idDiscussedWithAttendingMD, "Yes");
		boolean discussedWithAttendingMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idDiscussedWithAttendingMD, "Yes");
		assertTrue("Discussed With Attending MD incorrect after choosing", discussedWithAttendingMD);
		
		selenium.clickElementById(Constants.idName);
		selenium.sendKeysById(Constants.idName, "Emergency");
		String name = selenium.findElementById(Constants.idName).getAttribute("value");
		assertTrue("Name incorrect after typing", name.contentEquals("Emergency"));
		
		selenium.clickElementById(Constants.idNameOfRN);
		selenium.sendKeysById(Constants.idNameOfRN, "John Doe");
		String nameOfRN = selenium.findElementById(Constants.idNameOfRN).getAttribute("value");
		assertTrue("Name of RN incorrect after typing", nameOfRN.contentEquals("John Doe"));
		
		selenium.clickElementById(Constants.idReportRN);
		selenium.sendKeysById(Constants.idReportRN, "Report goes here.");
		String reportRN = selenium.findElementById(Constants.idReportRN).getAttribute("value");
		assertTrue("Report RN incorrect after typing", reportRN.contentEquals("Report goes here."));
		
		selenium.clickElementById(Constants.idOtherCommentsObservations);
		selenium.sendKeysById(Constants.idOtherCommentsObservations, "None.");
		String otherCommentsObservations = selenium.findElementById(Constants.idOtherCommentsObservations).getAttribute("value");
		assertTrue("Other Comments Observations incorrect after typing", otherCommentsObservations.contentEquals("None."));
		
		selenium.clickElementById(Constants.idPostFallHuddle);
		selenium.sendKeysById(Constants.idPostFallHuddle, "None.");
		String postFallHuddle = selenium.findElementById(Constants.idPostFallHuddle).getAttribute("value");
		assertTrue("Post Fall Huddle incorrect after typing", postFallHuddle.contentEquals("None."));
		
		selenium.clickElementById(Constants.idUnitCensus);
		selenium.sendKeysById(Constants.idUnitCensus, "None.");
		String unitCensus = selenium.findElementById(Constants.idUnitCensus).getAttribute("value");
		assertTrue("Unit Census incorrect after typing", unitCensus.contentEquals("None."));
		
		selenium.clickElementById(Constants.idNumberOfStaff);
		selenium.sendKeysById(Constants.idNumberOfStaff, "3");
		String numberOfStaff = selenium.findElementById(Constants.idNumberOfStaff).getAttribute("value");
		assertTrue("Number Of Staff incorrect after typing", numberOfStaff.contentEquals("3"));
		
		selenium.clickElementById(Constants.idRN);
		selenium.sendKeysById(Constants.idRN, "Sally Mae");
		String rn = selenium.findElementById(Constants.idRN).getAttribute("value");
		assertTrue("RN incorrect after typing", rn.contentEquals("Sally Mae"));
		
		selenium.clickElementById(Constants.idMHW);
		selenium.sendKeysById(Constants.idMHW, "None.");
		String mhw = selenium.findElementById(Constants.idMHW).getAttribute("value");
		assertTrue("MHW incorrect after typing", mhw.contentEquals("None."));
		
		selenium.clickElementById(Constants.idLPN);
		selenium.sendKeysById(Constants.idLPN, "None.");
		String lpn = selenium.findElementById(Constants.idLPN).getAttribute("value");
		assertTrue("LPN incorrect after typing", lpn.contentEquals("None."));
		
		selenium.clickElementById(Constants.idAcuityLevel);
		selenium.sendKeysById(Constants.idAcuityLevel, "7");
		String acuityLevel = selenium.findElementById(Constants.idAcuityLevel).getAttribute("value");
		assertTrue("Acuity Level incorrect after typing", acuityLevel.contentEquals("7"));
		
		selenium.clickElementById(Constants.idOtherComments);
		selenium.sendKeysById(Constants.idOtherComments, "None.");
		String otherComments = selenium.findElementById(Constants.idOtherComments).getAttribute("value");
		assertTrue("Other Comments incorrect after typing", otherComments.contentEquals("None."));
		
		selenium.clickElementByxPath(Constants.xPathFallIncidentSubmitButton);
		
		selenium.clickElementByxPath(Constants.xPathIncidentTableSearch);
		
		selenium.sendKeysByxPath(Constants.xPathIncidentTableSearch, incidentNumber);
		
		selenium.clickElementByxPath(Constants.xPathFirstLinkInTable);
		
		selenium.waitUntilId(Constants.idIncidentNumber);
		
		String detailsIncidentNumber = selenium.findElementById(Constants.idIncidentNumber).getAttribute("value");
		String detailsReportedBy = selenium.findElementById(Constants.idReportedBy).getAttribute("value");
		String detailsDateOfIncident = selenium.findElementById(Constants.idDateofIncident).getAttribute("value");
		String detailsTimeOfIncident = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		String detailsIncidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		String detailsSeverity = selenium.findElementById(Constants.idSeverity_chosen).getText();
		String detailsProgramId = selenium.findElementById(Constants.idProgramId_chosen).getText();
		String detailsLocationId = selenium.findElementById(Constants.idLocationId_chosen).getText();
		String detailsPlaceOfIncident = selenium.findElementById(Constants.idPlaceofIncident).getAttribute("value");
		String detailsFallRiskAssessmentScore = selenium.findElementById(Constants.idFallRiskAssessmentScore).getAttribute("value");
		String detailsDateofFall = selenium.findElementById(Constants.idDateofFall).getAttribute("value");
		boolean detailsFallPrecautionsInPlaceAtTimeOfFall = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAllFallPrecautionsInPlaceAtTimeOfFall, "No");
		boolean detailsPhysicalTherapyInvolved = selenium.isRadioBoxSelectedWithIdByValue(Constants.idPhysicalTherapyInvolved, "No");
		boolean detailsDidPatientHaveECTEarlierOnDayOfFall = selenium.isRadioBoxSelectedWithIdByValue(Constants.idDidPatientHaveECTEarlierOnDayOfFall, "Yes");
		String detailsContributingFactors = selenium.findElementById(Constants.idContributingFactors_chosen).getText();
		String detailsDirectCauseOfFall = selenium.findElementById(Constants.idDirectCauseOfFall).getAttribute("value");
		boolean detailsInjury = selenium.isRadioBoxSelectedWithIdByValue(Constants.idInjury, "No");
		boolean detailsEvaluatedByMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idEvalByMD, "No");
		boolean detailsSentToER = selenium.isRadioBoxSelectedWithIdByValue(Constants.idSentToER, "Yes");
		boolean detailsAdmittedMedically = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAdmittedMedically, "Yes");
		boolean detailsFallRiskAssessmentRedone = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallRiskAssessmentRedone, "Yes");
		boolean detailsFallPutInSignificantEventsInEMR = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallputinSignificantEventsinEMR, "Yes");
		boolean detailsUnitManagerCalledImmediatelyAfterHuddle = selenium.isRadioBoxSelectedWithIdByValue(Constants.idUnitManagerCalledImmediatelyAfterHuddle, "No");
		boolean detailsNewOrdersWritten = selenium.isRadioBoxSelectedWithIdByValue(Constants.idNewOrdersWritten, "No");
		boolean detailsProblemEnteredInHealthIssuesbyRN = selenium.isRadioBoxSelectedWithIdByValue(Constants.idProblemEnteredInHealthIssuesbyRN, "N/A");
		boolean detailsAxisIIIUpdatedByMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idAxisIIIUpdatedByMD, "N/A");
		boolean detailsFallRiskAddedAsNewMTPProblem = selenium.isRadioBoxSelectedWithIdByValue(Constants.idFallRiskAddedAsNewMTPProblem, "No");
		boolean detailsDiscussedWithAttendingMD = selenium.isRadioBoxSelectedWithIdByValue(Constants.idDiscussedWithAttendingMD, "Yes");
		String detailsName = selenium.findElementById(Constants.idName).getAttribute("value");
		String detailsNameOfRN = selenium.findElementById(Constants.idNameOfRN).getAttribute("value");
		String detailsReportRN = selenium.findElementById(Constants.idReportRN).getAttribute("value");
		String detailsOtherCommentsObservations = selenium.findElementById(Constants.idOtherCommentsObservations).getAttribute("value");
		String detailsPostFallHuddle = selenium.findElementById(Constants.idPostFallHuddle).getAttribute("value");
		String detailsUnitCensus = selenium.findElementById(Constants.idUnitCensus).getAttribute("value");
		String detailsNumberOfStaff = selenium.findElementById(Constants.idNumberOfStaff).getAttribute("value");
		String detailsRN = selenium.findElementById(Constants.idRN).getAttribute("value");
		String detailsMHW = selenium.findElementById(Constants.idMHW).getAttribute("value");
		String detailsLPN = selenium.findElementById(Constants.idLPN).getAttribute("value");
		String detailsAcuityLevel = selenium.findElementById(Constants.idAcuityLevel).getAttribute("value");
		String detailsOtherComments = selenium.findElementById(Constants.idOtherComments).getAttribute("value");
		
		assertTrue("Wrong Incident Number", detailsIncidentNumber.contentEquals(incidentNumber));
		assertTrue("Wrong Reported By", detailsReportedBy.contentEquals(reportedBy));
		assertTrue("Wrong Date of Incident", detailsDateOfIncident.contentEquals(dateInPicker));
		assertTrue("Wrong Time of Incident", detailsTimeOfIncident.contentEquals(timeInPicker));
		assertTrue("Wrong Incident Dept", detailsIncidentDept.contentEquals(incidentDept));
		assertTrue("Wrong Severity", detailsSeverity.contentEquals(severity));
		assertTrue("Wrong Program", detailsProgramId.contentEquals(program));
		assertTrue("Wrong Location", detailsLocationId.contentEquals(location));
		assertTrue("Wrong Place of incident", detailsPlaceOfIncident.contentEquals(placeOfIncident));
		assertTrue("Wrong Fall Risk Assessment Score", detailsFallRiskAssessmentScore.contentEquals(fallRiskAssessmentScore));
		assertTrue("Wrong Date of Fall", detailsDateofFall.contentEquals(dateInDatePicker));
		assertTrue("Wrong Fall Precautions In Place At Time Of Fall", detailsFallPrecautionsInPlaceAtTimeOfFall);
		assertTrue("Wrong Physical Therapy Involved", detailsPhysicalTherapyInvolved);
		assertTrue("Wrong Did Patient Have ECT Earlier On Day Of Fall", detailsDidPatientHaveECTEarlierOnDayOfFall);
		assertTrue("Wrong Contributing Factors", detailsContributingFactors.contentEquals(contributingFactors));
		assertTrue("Wrong Direct Cause Of Fall", detailsDirectCauseOfFall.contentEquals(directCauseOfFall));
		assertTrue("Wrong Injury", detailsInjury);
		assertTrue("Wrong Evaluated By MD", detailsEvaluatedByMD);
		assertTrue("Wrong Sent To ER", detailsSentToER);
		assertTrue("Wrong Admitted Medically", detailsAdmittedMedically);
		assertTrue("Wrong Fall Risk Assessment Redone", detailsFallRiskAssessmentRedone);
		assertTrue("Wrong Fall Put In Significant Events In EMR", detailsFallPutInSignificantEventsInEMR);
		assertTrue("Wrong Unit Manager Called Immediately After Huddle", detailsUnitManagerCalledImmediatelyAfterHuddle);
		assertTrue("Wrong New Orders Written", detailsNewOrdersWritten);
		assertTrue("Wrong Problem Entered In Health Issues by RN", detailsProblemEnteredInHealthIssuesbyRN);
		assertTrue("Wrong Axis III Updated By MD", detailsAxisIIIUpdatedByMD);
		assertTrue("Wrong Fall Risk Added As New MTP Problem", detailsFallRiskAddedAsNewMTPProblem);
		assertTrue("Wrong Discussed With Attending MD", detailsDiscussedWithAttendingMD);
		assertTrue("Wrong Name", detailsName.contentEquals(name));
		assertTrue("Wrong Name Of RN", detailsNameOfRN.contentEquals(nameOfRN));
		assertTrue("Wrong Report RN", detailsReportRN.contentEquals(reportRN));
		assertTrue("Wrong Other Comments Observations", detailsOtherCommentsObservations.contentEquals(otherCommentsObservations));
		assertTrue("Wrong Post Fall Huddle", detailsPostFallHuddle.contentEquals(postFallHuddle));
		assertTrue("Wrong Unit Census", detailsUnitCensus.contentEquals(unitCensus));
		assertTrue("Wrong Number Of Staff", detailsNumberOfStaff.contentEquals(numberOfStaff));
		assertTrue("Wrong RN", detailsRN.contentEquals(rn));
		assertTrue("Wrong MHW", detailsMHW.contentEquals(mhw));
		assertTrue("Wrong LPN", detailsLPN.contentEquals(lpn));
		assertTrue("Wrong Acuity Level", detailsAcuityLevel.contentEquals(acuityLevel));
		assertTrue("Wrong Other Comments", detailsOtherComments.contentEquals(otherComments));
		
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
		
//		selenium.clickElementById(Constants.idDateOfIncident);	
//		selenium.chooseDateInDatePicker(Constants.idDateOfIncident, "January", "1","2015", "5");
		String dateInPicker = selenium.findElementById(Constants.idDateOfIncident).getAttribute("value");
//		assertTrue("Date was incorrect after click", dateInPicker.contentEquals("01/05/2015"));
		
		selenium.clickElementById(Constants.idTimeOfIncident);
		selenium.chooseTimeInTimePicker(Constants.idTimeOfIncident, "12", "28", "AM");
//		String timeInPicker = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		
		selenium.clickElementById(Constants.idIncidentType);
		selenium.clickIncidentType("Assault", "Attempted");
		String incidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		assertTrue("Type was incorrect after click", incidentType.contentEquals("Attempted"));
		
		String incidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		
		selenium.clickElementById(Constants.idProgramId_chosen);
		selenium.clickValueFromDropDownById(Constants.idProgramId_chosen, "School");
		String program = selenium.getValueFromDropDownById(Constants.idProgramId_chosen);
		assertTrue("Program was incorrect after click", program.contentEquals("School"));
		
		String location = selenium.getValueFromDropDownById(Constants.idLocationId_chosen);
		
		selenium.clickElementById(Constants.idPlaceOfIncident);
		selenium.sendKeysById(Constants.idPlaceOfIncident, "Da Bathroom");
		String placeOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		assertTrue("Place of incident was incorrect after click", placeOfIncident.contentEquals("Da Bathroom"));
		
		/*
		 * Grid testing goes here
		*/
		
		String injury = selenium.getValueFromDropDownById(Constants.idInjury_chosen);
		
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
		assertTrue("ER not in list", results.contains(er));
		
		selenium.clickElementById(Constants.idNarrative);
		selenium.sendKeysById(Constants.idNarrative, "I fell and broke my arm. No one was around to help me.");
		String narrative = selenium.findElementById(Constants.idNarrative).getAttribute("value");
		assertTrue("Narrative was incorrect after typing", narrative.contentEquals("I fell and broke my arm. No one was around to help me."));
		
		String nurseMedReport = selenium.getValueFromDropDownById(Constants.idNurseMedReportFor_chosen);
		
		selenium.clickElementById(Constants.idNurseDateOfIncident);
		selenium.chooseDateInDatePicker(Constants.idNurseDateOfIncident, "February", "2", "2015", "2");
		String nurseDateOfIncident = selenium.findElementById(Constants.idNurseDateOfIncident).getAttribute("value");
		assertTrue("Nurse Date of Incident was incorrect after click", nurseDateOfIncident.contentEquals("02/02/2015"));
		
		selenium.clickElementById(Constants.idNurseTimeOfIncident);
		selenium.chooseTimeInTimePicker(Constants.idNurseTimeOfIncident, "12", "28", "AM");
		String nurseTimeOfIncident = selenium.findElementById(Constants.idNurseTimeOfIncident).getAttribute("value");
		assertTrue("Nurse Time of Incident was incorrect after click", nurseTimeOfIncident.contentEquals("12:28 AM"));
		
		selenium.clickElementById(Constants.idNurseFirstName);
		selenium.sendKeysById(Constants.idNurseFirstName, "Ivan");
		String nurseFirstName = selenium.findElementById(Constants.idNurseFirstName).getAttribute("value");
		assertTrue("Nurse First Name was incorrect after click", nurseFirstName.contentEquals("Ivan"));
		
		String nurseLastName = selenium.findElementById(Constants.idNurseLastName).getAttribute("value");
		
		selenium.clickElementById(Constants.idNurseTitle);
		selenium.sendKeysById(Constants.idNurseTitle, "No title");
		String nurseTitle = selenium.findElementById(Constants.idNurseTitle).getAttribute("value");
		assertTrue("Nurse Title was incorrect after click", nurseTitle.contentEquals("No title"));
		
		selenium.clickElementById(Constants.idNurseReport);
		selenium.sendKeysById(Constants.idNurseReport, "Found the victim laying on the ground  with a broken arm.");
		String nurseReport = selenium.findElementById(Constants.idNurseReport).getAttribute("value");
		assertTrue("Nurse Report was incorrect after click", nurseReport.contentEquals("Found the victim laying on the ground  with a broken arm."));
		
		String physicianMedReport = selenium.getValueFromDropDownById(Constants.idPhysicianMedReportFor_chosen);
		
		String physicianDateOfIncident = selenium.findElementById(Constants.idPhysicianDateOfIncident).getAttribute("value");
		
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
//		String detailsTimeOfIncident = selenium.findElementById(Constants.idTimeOfIncident).getAttribute("value");
		String detailsIncidentType = selenium.findElementById(Constants.idIncidentType).getAttribute("value");
		String detailsIncidentDept = selenium.findElementById(Constants.idIncidentDepartment).getAttribute("value");
		String detailsProgramId = selenium.findElementById(Constants.idProgramId_chosen).getText();
		String detailsLocationId = selenium.findElementById(Constants.idLocationId_chosen).getText();
		String detailsPlaceOfIncident = selenium.findElementById(Constants.idPlaceOfIncident).getAttribute("value");
		String detailsInjuryId = selenium.findElementById(Constants.idInjury_chosen).getText();
		String detailsSeverity = selenium.findElementById(Constants.idSeverity_chosen).getText();
		List<String> detailsResult = selenium.getChoicesFromDropDownById(Constants.idResultIds_chosen);
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
		
		selenium.sortStringList(results);
		selenium.sortStringList(detailsResult);
		
		assertTrue("Wrong Incident Number", detailsIncidentNumber.contentEquals(incidentNumber));
		assertTrue("Wrong Reported By", detailsReportedBy.contentEquals(reportedBy));
		assertTrue("Wrong Date of Incident", detailsDateOfIncident.contentEquals(dateInPicker));
//		assertTrue("Wrong Time of Incident", detailsTimeOfIncident.contentEquals(timeInPicker));
		assertTrue("Wrong Incident Type", detailsIncidentType.contentEquals(incidentType));
		assertTrue("Wrong Incident Dept", detailsIncidentDept.contentEquals(incidentDept));
		assertTrue("Wrong Program", detailsProgramId.contentEquals(program));
		assertTrue("Wrong Location", detailsLocationId.contentEquals(location));
		assertTrue("Wrong Place of incident", detailsPlaceOfIncident.contentEquals(placeOfIncident));
		assertTrue("Wrong Injury", detailsInjuryId.contentEquals(injury));
		assertTrue("Wrong Severity", detailsSeverity.contentEquals(severity));
		assertTrue("Wrong Results", detailsResult.equals(results));
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
		List<String> detailsResult = selenium.getChoicesFromDropDownById(Constants.idResultIds_chosen);
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
		
		selenium.sortStringList(detailsResult);
		
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
		assertTrue("Wrong Results", detailsResult.size() == 0);
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