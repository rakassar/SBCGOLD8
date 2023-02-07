package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')

/*case creation by CA for SSC=Customer Initiated Info Maintenance
Source=Branch Walkin

*/


   public class SC_050_Case_SSCViaEmailSyndication extends HomePageMethod
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
	public void SC_045_TC_001() throws Exception
	{
    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_EmailTeam);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncaseES("Email Syndication Cases");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        CJPM.enterCustomerDetails();
        CJPM.mobileForDedupe("33445566");
        lopm.update360();
        
        CJPM.tagCustomer();
        
        Thread.sleep(2000);
		NTBSJPM.chooseDedupe();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.clickUpdate();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        CJPM.SwitchCase();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        Thread.sleep(2000);
        CJPM.FillSSC("SA ID/AO Code Maintenance");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
	    CJPM.loanProduct();
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		//scrollBy();
		Thread.sleep(2000);
	   //Stage1 Case Journey

		


		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(500);
		cs1pm.sel_AOCode("SSK");
		cs1pm.pic_SAID();
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
		//LogoutButtonClick();
		QuiteBrowser();

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    CheckRole();
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    cs1pm.sel_depetdecison("Accept");
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
	    CJPM.casesaveAndProceed();
		Thread.sleep(3000);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_045_Case_SAIDMaintenance-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }




