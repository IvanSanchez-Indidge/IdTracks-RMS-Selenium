package utility;

public class Constants
{
	public static String adminEmail = "riskmanager@indidge.com";
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
	
	
public static String xpathDashboardPageTitle=						"//body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[@class='alert alert-block alert-success']";

	
	/* */
	
	public static String xpathLoginButton = 							"//button[@type='submit']";
	public static String xpathNoIncident = 								"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[2]/div[@id='incident-table_wrapper']/table[@id='incident-table']/tbody/tr[@class='odd']/td[@class='dataTables_empty']";
	public static String xpathIncidentSearch =							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[2]/div[@id='incident-table_wrapper']/div[@class='row'][1]/div[@class='col-xs-6'][2]/div[@id='incident-table_filter']/label/input[@class='form-control input-sm']"; 							
	public static String xpathActionsButton = 							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[2]/div[@id='incident-table_wrapper']/table[@id='incident-table']/tbody/tr[@class='odd'][1]/td[8]/div/div[@class='inline position-relative']/button[@class='btn btn-minier btn-yellow dropdown-toggle']/i[@class='ace-icon fa fa-caret-down icon-only bigger-120']";
	
	public static String xpathIncidentsDetailsTab = 					"//*[@id='accordion']/form/div/div[1]/h4/a";
	public static String xpathDetailListButton = 						"//li[@class='dt_list'][1]/span[@class='blue']/a";
	public static String xpathDetailsIncidentPage = 					"/html/body/div[2]/div[2]/div/div/div[1]/h1";
	public static String xpathDetailsDescription = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/form[@class='form-horizontal']/div[@class='panel panel-default']/div[@id='collapseOne']/div[@class='panel-body']/div[@class='row']/div[@class='col-xs-12']/div[@class='row'][5]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-8']/textarea[@id='Narrative']";
	public static String xpathSaveDetailsButton = 						"/html/body/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div[2]/div/div/button[1]";
	public static String xpathDetailsNotesTab = 						"//*[@id='accordion']/div[2]/div[1]/h4/a"; 
	public static String xpathDetailsNotesAdd = 						"//*[@id='noteForm']/div/div/div/div[3]/div/div/div[2]/span/button";
	public static String xpathDetailNotesTitle = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/div[@class='panel panel-default'][2]/div[@id='collapseThree']/div[@class='panel-body']/div[@class='widget-box']/div[@class='widget-body']/div[@class='widget-main no-padding']/form[@id='noteForm']/div[@class='clearfix form-actions']/div[@class='row']/div[@class='col-xs-12']/div[@class='row'][2]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-8 col-md-offset-1']/input[@class='form-control']";
	public static String xpathDetailsNotesText = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/div[@class='panel panel-default'][2]/div[@id='collapseThree']/div[@class='panel-body']/div[@class='widget-box']/div[@class='widget-body']/div[@class='widget-main no-padding']/form[@id='noteForm']/div[@class='clearfix form-actions']/div[@class='row']/div[@class='col-xs-12']/div[@class='row'][3]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-8 col-md-offset-1']/textarea[@class='form-control']";
	
	public static String xpathInpatient = 								"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/form[@class='form-horizontal']/div[@class='panel panel-default']/div[@id='collapseOne']/div[@class='panel-body']/div[@class='row']/div[@class='col-xs-12']/div[@class='row'][3]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-4'][1]/div[@id='ProgramId_chosen']/a[@class='chosen-single']/span"; 
	public static String xpathDetailsIncidentNumber = 					"/html/body/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/input";
	public static String xpathDeletelistButton = 						"//li[@class='dt_list'][6]/span[@class='red']/a";
	public static String xpathDeletionWarning = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix ui-draggable-handle']/span[@id='ui-id-4']/div[@class='widget-header widget-header-small']/h4[@class='smaller']"; 
	public static String xpathDeleteWarningText = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@id='ui-id-3']/p";
	public static String xpathNoDeletionButton = 						"/html/body/div[4]/div[3]/div/button[2]";  
	public static String xpathYesDeletionButton = 						"html/body/div[5]/div[3]/div/button[1]";
	public static String xpathDetailsPage = 							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='page-header']";
	public static String xpathIncidentNumber = 							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@class='row']/div[@class='col-xs-12']/div[2]/div[@id='incident-table_wrapper']/table[@id='incident-table']/tbody/tr[@class='even'][1]/td[2]/a[2]";							
	public static String xpathIncidentOccuredToggle = 						"//*[@id='ProgramId_chosen']/a/span";
	public static String xpathIncidentOccuredSearch = 					"//*[@id='ProgramId_chosen']/div/div/input";
	public static String xpathIncidentTypeTab = 						"//*[@id='collapseOne']/div/div[1]/div/div[2]/div/div/div[1]/div/span/i";
	public static String xpathIncidentTypeVehicle = 					"//*[@id='3']/span/span[2]";
	public static String xpathIncidentTypeWindowOKButton = 				"/html/body/div[19]/div[3]/div/button";
	public static String xpathIncidentDeptAdmissions = 					"//*[@id='3-label']";
	public static String xpathIncidentDeptWindowOkButton =				"/html/body/div[20]/div[3]/div/button";
	public static String xpathNurseMedReportToggle = 							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/form[@class='form-horizontal']/div[@class='panel panel-default']/div[@id='collapseOne']/div[@class='panel-body']/div[@class='row']/div[@class='col-xs-12']/div[@class='row form-padding-top'][1]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-4']/div[@id='NurseMedReportFor_chosen']/a[@class='chosen-single']/span";
	public static String xpathNurseMedReportSearch = 					"//*[@id='NurseMedReportFor_chosen']/div/div/input";
	public static String xpathPhysicianMedReportToggle = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='page-content-area']/div[@id='accordion']/form[@class='form-horizontal']/div[@class='panel panel-default']/div[@id='collapseOne']/div[@class='panel-body']/div[@class='row']/div[@class='col-xs-12']/div[@class='row form-padding-top'][2]/div[@class='form-group']/div[@class='col-sm-12']/div[@class='col-md-4']/div[@id='PhysicianMedReportFor_chosen']/a[@class='chosen-single']/span";
	public static String xpathPhysicianMedReportSearch = 				"//*[@id='PhysicianMedReportFor_chosen']/div/div/input";
	public static String xpathIncidentLocationToggle = 						"//*[@id='LocationId_chosen']/a/span";
	public static String xpathIncidentLocationSearch = 					"//*[@id='LocationId_chosen']/div/div/input";
	public static String xpathInjuryToggle = 							"//*[@id='Injury_chosen']/a/span";
	public static String xpathInjurySearch = 							"//*[@id='Injury_chosen']/div/div/input";
	public static String xpathSeverityToggle = 							"//*[@id='Severity_chosen']/a/span";
	public static String xpathSeveritySearch = 							"//*[@id='Severity_chosen']/div/div/input";
	public static String xpathResultToggle = 							"//*[@id='ResultIds_chosen']/ul";
	public static String xpathResultSearch = 							"//*[@id='ResultIds_chosen']/ul/li/input";
	public static String xpathCloseListButton =							"//li[@class='dt_list'][7]/span[@class='red']/a"; 						
	public static String xpathCloseWarning =							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix ui-draggable-handle']/span[@id='ui-id-4']/div[@class='widget-header widget-header-small']/h4[@class='smaller']";							
	public static String xpathCloseWarningText = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@id='ui-id-3']/p";
	public static String xpathNoCloseButton =							"/html/body/div[4]/div[3]/div/button[2]";		
	public static String xpathYesCloseButton = 							"/html/body/div[4]/div[3]/div/button[1]";
	public static String xpathIncidentStatus = 							"//*[@id='incident-table']/tbody/tr/td[5]/div/strong";
	public static String xpathReopenListButton = 						"//li[@class='dt_list'][8]/span[@class='green']/a";
	public static String xpathReopenWarning = 							"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix ui-draggable-handle']/span[@id='ui-id-4']/div[@class='widget-header widget-header-small']/h4[@class='smaller']";
	public static String xpathReopenWarningText = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable'][2]/div[@id='ui-id-3']/p";
	public static String xpathYesReopenButton = 						"/html/body/div[4]/div[3]/div/button[1]";
	public static String xpathfirstAid = "//*[@id='ResultIds_chosen']/ul/li[1]/span";
	
	
	
	/* Left Navigation Xpath */
	
	public static String xpathIncidentLeftNav = 						"/html[@class=' js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths']/body[@class='no-skin']/div[@id='main-container']/div[@id='sidebar']/ul[@class='nav nav-list']/li[2]/a/span[@class='menu-text']";

	/* id's in Incident Details Page */
	
	
	public static String idNurseFirstName = 							"NurseFirstName";
	public static String idNurseLastName  =								"NurseLastName";
	public static String idNurseTitle = 								"NurseTitle";
	public static String idNurseReport = 								"NurseReport";
	public static String idPhysicianFirstName = 						"PhysicianFirstName";
	public static String idPhysicianLastName = 							"PhysicianLastName";
	public static String idPhysicianTitle = 							"PhysicianTitle";
	public static String idPhysicianReport = 							"PhysicianReport";
	public static String idDetailsDescription = 						"Narrative";
	public static String idIncidentTypeWindow = 						"ui-id-7";
	public static String idIncidentTypeAccident = 						"Accident-label";
	public static String idIncidentDept	=								"IncidentDepartment";
	public static String idIncidentDeptWindow = 						"ui-id-9";
	public static String idNurseDateofIncident =						"NurseDateOfIncident";
	public static String idNurseTimeOfIncident = 						"NurseTimeOfIncident";
	public static String idPhysicianDateOfIncident = 					"PhysicianDateOfIncident";
	public static String idPhysicianTimeOfIncident = 					"PhysicianTimeOfIncident";
	public static String idAddPatient = 								"add_rmsPatientGridTable";
	public static String idAdmissionNumber = 							"admissionnum";
	public static String idPatientFirstName = 							"firstname";
	public static String idPatientLastName = 							"lastname";
	public static String idPatientPrimary = 							"primary";
	public static String idSubmitButton = 								"sData";
}