package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

/*case creation by CA for SSC=Customer Initiated Info Maintenance
Source=Branch Walkin

*/


   public class SC_017_Case_CustomerInitiatedInfoMaintenance extends HomePageMethod
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
	public void SC_017_TC_001() throws Exception
	{

        //Vishal
    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        Thread.sleep(2000);
        CJPM.FillSSC("Customer Initiated Info Maintenance");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		//scrollBy();
		Thread.sleep(2000);
	   //Stage1 Case Journey

		cs1pm.ContactInformationactipntype("Contact Creation");
		Thread.sleep(1000);
		cs1pm.casecountry("Albania");
		Thread.sleep(1000);
		cs1pm.CaseHosueNumber();
		cs1pm.caseStreet();
		cs1pm.casemobile();
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");

		cs1pm.CaseCustomerType("Employed");
		Thread.sleep(1000);
		
		cs1pm.ForEmployement("Yes");
		cs1pm.natureOfWork("Airline");
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");



		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(500);
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
		//LogoutButtonClick();
		QuiteBrowser();

		launchBrowser();
	    //TDFX.DataRead();
	 	EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	 	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    EnterPassword(TestDataFromExcel.Password);
	    LoginButtonClick();
	    Thread.sleep(1000);
	    CheckRole();
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    cs1pm.clk_caseobject();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.clk_selfassigncase("Assigned to Department");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    Thread.sleep(1000);
	    cs1pm.sel_caseview("Assigned to Me");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    //cs1pm.clk_onMycaseview_220("Assigned to Me");
	    Thread.sleep(1000);
	    cs1pm.clk_onMyBucketcase();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    cs1pm.clk_caseEditButton();
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    cs1pm.sel_depetdecison("Accept");
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    cs1pm.fill_Remarks("rizwan");
	    Thread.sleep(1000);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
	    CJPM.casesaveAndProceed();
        Thread.sleep(2000);

	    cs1pm.waitTillClosed();
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_017_CustomerInitiatedInfoMaintenance-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }




