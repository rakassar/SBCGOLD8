package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case AIR
*/


   public class SC_010_Case_AccountBalanceComputationAIR extends HomePageMethod
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
	public void SC_010_TC_001() throws Exception
	{


    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_007_CaseAccountBalanceComputation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
        Thread.sleep(2000);
        CJPM.FillSSC("Account Balance Computation");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
	    CJPM.creditcardproduct();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		home.scrollBy();
		Thread.sleep(5000);
	   //Stage1 Case Journey
		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(1000);
	    cs1pm.SelectComputationRequest("Available Balance Computation");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
		Thread.sleep(1000);
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		Thread.sleep(1000);

		cs1pm.GetCaseId();
		Thread.sleep(1000);
		//LogoutButtonClick();
		QuiteBrowser();

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_CCGInboundTeamLeader_Pro);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    cs1pm.sel_depetdecison("Additional Information Required");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_010_CaseAccountBalanceComputationAIR");
	    CJPM.casesaveAndProceed();
	    Thread.sleep(5000);
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }




