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


   public class SC_048_Case_CBAWithCardDelivery extends HomePageMethod
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
	public void SC_048_TC_001() throws Exception
	{
    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        ClickOnCaseJouney();
        CJPM.IndividualCaseJorney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        cspm.ClickOnNextButtonOnCustomerSearch();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        cspm.ChooseBBNfromList();
        Thread.sleep(1000);
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        Thread.sleep(1000);
        cspm.CustomerServiceJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        Thread.sleep(2000);
        CJPM.FillSSC("CBA With Card Delivery For Newly Issued - Low Risk");
       	CJPM.Source("Branch Walkin");
	    Thread.sleep(1000);
	    CJPM.creditcardproduct();

        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
	    Thread.sleep(1000);
		CJPM.NextOnCasePage();
		//scrollBy();
		Thread.sleep(2000);
	   //Stage1 Case Journey

		
        

		cs1pm.fill_DetailsInConcern("Test Details of Concern Field");
		Thread.sleep(500);
		
		cs1pm.fill_Remarks("Successful Case Creation");
		Thread.sleep(1000);
		CJPM.casesaveAndProceed();
		cs1pm.GetCaseId();
		Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
		//LogoutButtonClick();
		QuiteBrowser();


	}
    @Test(priority=2)
	public void SC_048_TC_002() throws Exception
	{
    launchBrowser();
    //TDFX.DataRead();
 	EnterUserName(TestDataFromExcel.UserName_DetectionProcesoor);
 	Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    EnterPassword(TestDataFromExcel.Password);
    LoginButtonClick();
    Thread.sleep(1000);
    cs1pm.clk_caseobject();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    Thread.sleep(1000);
    cs1pm.clk_selfassigncase("Assigned to Department");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    Thread.sleep(1000);
    cs1pm.sel_caseview("Assigned to Me");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    //cs1pm.clk_onMycaseview_220("Assigned to Me");
    Thread.sleep(1000);
    cs1pm.clk_onMyBucketcase();
    cs1pm.clk_caseEditButton();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    cs1pm.sel_depetdecison("Accept");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    
    cs1pm.fill_Remarks("rizwan");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    CJPM.casesaveAndProceed();
    Thread.sleep(5000);
	//LogoutButtonClick();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
	QuiteBrowser();


}
    @Test(priority=3)
	public void SC_048_TC_003() throws Exception
	{
    launchBrowser();
    //TDFX.DataRead();
 	EnterUserName(TestDataFromExcel.UserName_AMDProcessor);
 	Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    EnterPassword(TestDataFromExcel.Password);
    LoginButtonClick();
    Thread.sleep(1000);
    cs1pm.clk_caseobject();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    Thread.sleep(1000);
    cs1pm.clk_selfassigncase("Assigned to Department");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    Thread.sleep(1000);
    cs1pm.sel_caseview("Assigned to Me");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    //cs1pm.clk_onMycaseview_220("Assigned to Me");
    Thread.sleep(1000);
    cs1pm.clk_onMyBucketcase();
    cs1pm.clk_caseEditButton();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    cs1pm.sel_depetdecison("Accept");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    
    cs1pm.fill_Remarks("rizwan");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    CJPM.casesaveAndProceed();
    Thread.sleep(5000);
	//LogoutButtonClick();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
    screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
    scrollBy();
	QuiteBrowser();


}
    @Test(priority=4)
   	public void SC_048_TC_004() throws Exception
   	{
       launchBrowser();
       //TDFX.DataRead();
    	EnterUserName(TestDataFromExcel.UserName_ReleasingProcessor);
    	Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       EnterPassword(TestDataFromExcel.Password);
       LoginButtonClick();
       Thread.sleep(1000);
       cs1pm.clk_caseobject();
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       Thread.sleep(1000);
       cs1pm.clk_selfassigncase("Assigned to Department");
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       Thread.sleep(1000);
       cs1pm.sel_caseview("Assigned to Me");
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       //cs1pm.clk_onMycaseview_220("Assigned to Me");
       Thread.sleep(1000);
       cs1pm.clk_onMyBucketcase();
       cs1pm.clk_caseEditButton();
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       cs1pm.sel_depetdecison("Accept");
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       scrollBy();
		
	       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       
       cs1pm.fill_Remarks("rizwan");
       Thread.sleep(1000);
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       CJPM.casesaveAndProceed();
       Thread.sleep(5000);
   	//LogoutButtonClick();
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       scrollBy();
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       scrollBy();
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       scrollBy();
       screen.ScreenshotMethod("SC_048_Case_CBAWithCardDelivery-");
       scrollBy();
   	QuiteBrowser();


   }
}




