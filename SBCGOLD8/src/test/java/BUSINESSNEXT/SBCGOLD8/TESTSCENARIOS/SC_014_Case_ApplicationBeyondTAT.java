package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CCA for SSC=Application Beyond TAT
Source=Branch Walkin

*/


   public class SC_014_Case_ApplicationBeyondTAT extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    CaseJourneyPageMethod CJPM=new CaseJourneyPageMethod();
    CaseStagePageMethod  cs1pm = new CaseStagePageMethod();

    HomePageMethod home = new HomePageMethod();
	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_014_TC_001() throws Exception
	{


    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CCA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        Thread.sleep(2000);
        CJPM.FillSSC("Application Beyond TAT");
       	CJPM.Source("Call Center");
	    Thread.sleep(1000);
	    CJPM.creditcardproduct();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    Thread.sleep(1000);
	    CJPM.PIDStatus("Pass");
	    Thread.sleep(1000);
	    CJPM.ComplaintCategory("CCU");
		CJPM.NextOnCasePage();
		home.scrollBy();
		Thread.sleep(1000);

		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
	   //Stage1 Case Journey
		//cs1pm.ReportedSystem("SBOL1");
		cs1pm.EmployeeInvolved("EmployeeInvolved");
		cs1pm.UnitGroup("UnitGroup");
		cs1pm.Employeeoutsource("Employeeoutsource");
		cs1pm.Position("Position");
		cs1pm.ActionTaken("ActionTaken");
		cs1pm.OtherAction("OtherAction");

		//cs1pm.SourceAccountNumber("787873281837");
		//cs1pm.DestinatuionAccountNumber("78787328188");

	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
		Thread.sleep(1000);
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_SQCCU);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    cs1pm.sel_depetdecison("Accept");
	    Thread.sleep(1000);
	    cs1pm.ValidityTagging("VALID");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        scrollBy();
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        scrollBy();
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        scrollBy();
        screen.ScreenshotMethod("SC_014_ApplicationBeyondTAT-");
        scrollBy();
		QuiteBrowser();


	}
    }




