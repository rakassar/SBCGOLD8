package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CA for SSC=Account Balance Computation
Source=Branch Walkin
Computation request=Available Balance Computation
*/


   public class SC_007_Case_AccountBalanceComputation extends HomePageMethod
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
	public void SC_007_TC_001() throws Exception
	{


    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        CheckRole();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        Thread.sleep(2000);
        CJPM.FillSSC("Account Balance Computation");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
	    CJPM.creditcardproduct();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		 Thread.sleep(1000);
	    screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
		home.scrollBy();
		Thread.sleep(5000);
	   //Stage1 Case Journey
		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(1000);
	    cs1pm.SelectComputationRequest("Available Balance Computation");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
		Thread.sleep(1000);
		cs1pm.fill_Remarks("Successful Case Creation");
		 Thread.sleep(1000);
	        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		 Thread.sleep(1000);
	        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();
	}
    
    @Test(priority=2)
   	public void SC_007_TC_002() throws Exception
   	{
		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGInboundTeamLeader_Pro);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    EnterPassword(TestDataFromExcel.Password);
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
        LoginButtonClick();
	    Thread.sleep(1000);
	    CheckRole();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    cs1pm.sel_depetdecison("Accept");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
        screen.ScreenshotMethod("SC_007_CaseAccountBalanceComputation-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }




