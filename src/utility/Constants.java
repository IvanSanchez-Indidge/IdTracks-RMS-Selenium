package utility;

public class Constants
{
	public static String adminEmail = "jordan.sloan@indidge.com";
	public static String adminPassword = "Indidge$1";
	
	public static String xPathloginButton												= "/html/body[@class='login-layout']/div[@class='main-container']/div[@class='main-content']/div[@class='row']/div[@class='col-sm-10 col-sm-offset-1']/div[@class='login-container']/div[@class='position-relative']/div[@id='login-box']/div[@class='widget-body']/div[@class='widget-main']/form/fieldset/div[@class='clearfix']/button[@class='width-35 pull-right btn btn-sm btn-primary']";
	
	/*	Generic ID's and xPaths	*/
	public static String idIncidentNumber												= "IncidentNumber";
	
	/*	New Fall Incident Page XPaths and Id's	*/
	public static String idDateofIncident												= "DateofIncident";
	public static String idTimeofIncident												= "TimeofIncident";
	public static String idIncidentDepartment											= "IncidentDepartment";
	public static String xPathAddIncidentDeptWindow										= "/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix ui-draggable-handle']/span[@id='ui-id-3']/div[@class='widget-header widget-header-small']/h4[@class='smaller']";
	public static String xPathIncidentDepartmentAdmissions								= "/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@id='rmsTreeContainer']/ul[@id='rmsTree']/li[@id='3']/div[@class='tree-branch-header tree-folder']/span[@class='tree-branch-name']/span[@id='3-label']";
	public static String xPathIncidentDepartmentWindowOkButton							= "/html/body/div[4]/div[3]/div/button/span";
	
	public static String xPathSeverityToggle											= "/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/form[@class='form-horizontal']/div[@class='form-group']/div[@class='col-sm-12']/div[@class='row'][2]/div[@class='col-md-4'][2]/div[@id='Severity_chosen']/a[@class='chosen-single']/span";
	public static String xPathSeveritySearch											= "//*[@id='Severity_chosen']/div/div/input";
	
	public static String xPathIncidentOccuredToggle										= "//*[@id='ProgramId_chosen']/a/span";
	public static String xPathIncidentOccuredSearch										= "//*[@id='ProgramId_chosen']/div/div/input";
	
	public static String xPathLocationOfIncidentToggle									= "//*[@id='LocationId_chosen']/a/span";
	public static String xPathLocationOfIncidentSearch									= "//*[@id='LocationId_chosen']/div/div/input";
	
	public static String idPlaceOfIncident												= "PlaceofIncident";
	public static String idFallRiskAssessmentScore										= "FallRiskAssessmentScore";
	
	public static String xPathContributingFactorsToggle									= "//*[@id='ContributingFactors_chosen']/a/span";
	public static String xPathContributingFactorsSearch									= "//*[@id='ContributingFactors_chosen']/div/div/input";
	
	public static String idDateOfFall													= "DateofFall";
	
	public static String idDirectCauseOfFall											= "DirectCauseOfFall";
	
	public static String idAllFallPrecautionsInPlaceAtTimeOfFall						= "AllFallPrecautionsinplaceattimeoffall";
	public static String idPhysicalTherapyInvolved										= "PhysicalTherapyInvolved";
	public static String idDidPatientHaveECTEarlierOnDayOfFall							= "DidPatientHaveECTEarlierOnDayOfFall";
	public static String idInjury														= "Injury";
	public static String idEvalByMD														= "EvalByMD";
	public static String idSentToER														= "SentToER";
	public static String idAdmittedMedically											= "AdmittedMedically";
	public static String idFallRiskAssessmentRedone										= "FallRiskAssessmentRedone";
	public static String idFallputinSignificantEventsinEMR								= "FallputinSignificantEventsinEMR";
	public static String idUnitManagerCalledImmediatelyAfterHuddle						= "UnitManagercalledimmediatelyafterhuddle";
	public static String idNewOrdersWritten												= "Neworderswritten";
	public static String idProblemEnteredInHealthIssuesbyRN								= "ProblemEnteredInHealthIssuesbyRN";
	public static String idAxisIIIUpdatedByMD											= "AxisIIIUpdatedByMD";
	public static String idFallRiskAddedAsNewMTPProblem									= "FallRiskAddedAsNewMTPProblem";
	public static String idDiscussedWithAttendingMD										= "DiscussedWithAttendingMD";
	
	public static String idName															= "Name";
	public static String idNameOfRN														= "NameofRN";
	public static String idReportRN														= "ReportRN";
	public static String idOtherCommentsObservations									= "OtherCommentsObservations";
	public static String idPostFallHuddle												= "PostFallHuddle";
	public static String idUnitCensus													= "UnitCensus";
	public static String idNumberOfStaff												= "NumberofStaff";
	public static String idRN															= "RN";
	public static String idMHW															= "MHW";
	public static String idLPN															= "LPN";
	public static String idAcuityLevel													= "AcuityLevel";
	public static String idOtherComments												= "OtherComments";
	
	public static String xPathSubmitButton												= "//*[@id='main-container']/div[2]/div/div/div[2]/div/form/div[2]/div/div/button[1]";
	public static String xPathResetButton												= "//*[@id='main-container']/div[2]/div/div/div[2]/div/form/div[2]/div/div/button[2]";
	
	/*	New General Incident Page xPath's and ID's	*/
	public static String idDateOfIncident												= "DateOfIncident";
	public static String idTimeOfIncident												= "TimeOfIncident";
	
	/*	Incidents Page	*/
	public static String idIncidentTable												= "incident-table";
	public static String xPathIncidentsSearch											= "/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[2]/div[@id='incident-table_wrapper']/div[@class='row'][1]/div[@class='col-xs-6'][2]/div[@id='incident-table_filter']/label/input[@class='form-control input-sm']";
	
	public static String xPathIncidentsLeftNav											= "/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@id='sidebar']/ul[@class='nav nav-list']/li[2]/a/span[@class='menu-text']";
	public static String xPathNewIncidentLeftNav										= "//*[@id='sidebar']/ul/li[3]/a";
	public static String xPathFallIncidentLeftNav										= "//*[@id='sidebar']/ul/li[3]/ul/li[2]/a";
	public static String xPathGeneralIncidentLeftNav									= "//*[@id='sidebar']/ul/li[3]/ul/li[1]/a";
}