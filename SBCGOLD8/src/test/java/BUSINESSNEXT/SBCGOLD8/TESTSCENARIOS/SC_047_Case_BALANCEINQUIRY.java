package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CaseStagePageObject;

/*select a.statuscodeid,a.* from cases a
where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')
order by caseid desc
--update cases set statuscodeid=5 where caseid in ( select CAS_EX1_id from CAS_EX1 where CAS_EX1_1='14300000797')

*/


   public class SC_047_Case_BALANCEINQUIRY extends HomePageMethod
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
	public void SC_047_TC_001() throws Exception
	{
    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        Thread.sleep(2000);
        CJPM.FillSSC("BALANCE INQUIRY");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
	    CJPM.creditcardproduct();

        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		//scrollBy();
		Thread.sleep(2000);
	   //Stage1 Case Journey

		
        

		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(500);
		cs1pm.balanceInquiryType();
		cs1pm.selectCheckbox();
		cs1pm.clickOk();
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_047_Case_BALANCEINQUIRY-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    }




