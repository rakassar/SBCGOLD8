package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CaseStagePageObject;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.EKYC_InquireLeadStatus;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.EKYC_LeadCreate;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.EKYC_createCustomer_Account;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.EKYC_performCRRSC;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.EKYC_updateLead;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.TokenCreate_V;


   public class SC_061_EKYC_LeadJourney extends HomePageMethod
   {
	//Object for methods class
	   EKYC_performCRRSC EPC=new EKYC_performCRRSC();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	EKYC_createCustomer_Account CSA=new EKYC_createCustomer_Account();
	EKYC_InquireLeadStatus ELS=new EKYC_InquireLeadStatus();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    TokenCreate_V token=new TokenCreate_V();
    EKYC_LeadCreate  LC = new EKYC_LeadCreate();

    HomePageMethod home = new HomePageMethod();
	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_047_TC_001() throws Exception
	{
    	//token.generateToken();
    	LC.createLead();
    	
    	
    	launchBrowser();
    	TestDataFromExcel.DataRead();
    	Thread.sleep(5000);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        CheckRole();
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        
        clk_leadobject();
		lopm.leadSearch(lopm.leadid);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        
        EPC.performCRRSC(lopm.leadid);
        
        Refresh();
        scrollToTop();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollToTop();
        
        CSA.accountOpen(lopm.leadid);
        
        Refresh();
        scrollToTop();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        
        lopm.waitTillAccountOpen();
        
        Refresh();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
		scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
        scrollBy();
		Thread.sleep(300);
        screen.ScreenshotMethod("SC_061_EKYC_LeadJourney-");
         
        ELS.enquireLeadStatus(lopm.leadid);
        
        QuiteBrowser();
        
        
        
        
        
        
	}
    }




