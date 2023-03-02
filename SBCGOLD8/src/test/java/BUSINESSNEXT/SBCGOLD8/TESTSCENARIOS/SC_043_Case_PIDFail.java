package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test; 

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;



/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='12400000117')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='12400000117')
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CCA for SSC=Bank Initiated Info Maintenance
 * CCRSC=No
Source=Branch Walkin

*/


   public class SC_043_Case_PIDFail extends HomePageMethod
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
	public void SC_043_TC_001() throws Exception
	{

    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CCA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        Thread.sleep(2000);
        CJPM.FillSSC("Account Balance Computation");
       	CJPM.Source("Call Center");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
	    CJPM.PIDStatus("Fail");
	    Thread.sleep(1000);
	    //CJPM.ComplaintCategory("CCU");
		CJPM.NextOnCasePage();
		cs1pm.NameOfCaller("Ramu");
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
		home.scrollBy();
		Thread.sleep(1000);
		//Stage1 Case Journey
		//cs1pm.ReportedSystem("SBOL1");
		//cs1pm.EmployeeInvolved("EmployeeInvolved");
		//cs1pm.UnitGroup("UnitGroup");
		//cs1pm.Employeeoutsource("Employeeoutsource");
		//cs1pm.Position("Position");
		//cs1pm.ActionTaken("ActionTaken");
		//cs1pm.OtherAction("OtherAction");

		//cs1pm.SourceAccountNumber("787873281837");
		//cs1pm.DestinatuionAccountNumber("78787328188");

	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
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
	 	EnterUserName("203713");
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Fraud Cases");
	    
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    scrollBy();
	    cs1pm.clk_onMyBucketcase();
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
	    
	    Thread.sleep(1000);
	    //cs1pm.ValidityTagging("VALID");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        CJPM.casesaveAndProceed();
        Thread.sleep(5000);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_043_Case_PIDFail_");
		QuiteBrowser();

	}
    }




