package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/* lead for high risk BCM jourmey
*/


//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_020_Lead_BCMJourneyOnly extends HomePageMethod
{

    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();




    @Test(priority=1)
 	public void SC_020_TC_001() throws InterruptedException, IOException
 	{
    //LogoutButtonClick();
    launchBrowser();
    TestDataFromExcel.DataRead();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    EnterUserName(TestDataFromExcel.UserName_BranchBCM);
    EnterPassword(TestDataFromExcel.Password);
	screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    LoginButtonClick();
    CheckRole();
	Thread.sleep(500);
    clk_leadobject();
    lopm.categoryview("Deposit-Individual");
    lopm.selfassignlead("Need Approval");
    lopm.leadview("Assigned Leads");
    Thread.sleep(500);
    lopm.onMyBucketlead();
    Thread.sleep(500);
    lopm.BmApproveButtonclk();
    Thread.sleep(500);
    lopm.BmApproveComments("BM Comments");
    lopm.BmApproveUpdate();
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
    QuiteBrowser();
 	}

    @Test(priority=2)
 	public void SC_020_TC_002() throws InterruptedException

 	{

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(1000);
        lopm.onMyBucketlead();
        Thread.sleep(1000);

 	}


    @Test(priority=3)
 	public void SC_020_TC_003() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        Thread.sleep(400);
        scrollBy();

        FAIPM.PromoCode();
        //FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
    FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");

        //


 	}


      @Test(priority=4)
 	public void SC_020_TC_004() throws InterruptedException
 	{
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        Thread.sleep(1000);
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        scrollToTop();
        lopm.GetLeadId();
        lopm.waitTillAccountOpen();

        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
        QuiteBrowser();
 	}

      @Test
     	public void SC_020_TC_005() throws InterruptedException, IOException
     	{
         	launchBrowser();
          screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
         	TestDataFromExcel.DataRead();
      		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
             EnterPassword(TestDataFromExcel.Password);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             LoginButtonClick();
             CheckRole();
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             clk_leadobject();
             lopm.categoryview("Deposit-Individual");
             lopm.selfassignlead("Account Opened");
             lopm.leadview("Assigned Leads");
             Thread.sleep(500);
             lopm.onMyBucketlead();
             Thread.sleep(500);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             CLDLPM.clickClosePopup();
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             lopm.BBOGlogExceptionButton();
             lopm.SwitchToLastWindow();
             lopm.logException("No deficiency");
             lopm.LeadRemarks("No defect");
             lopm.clickFinsih();
             lopm.SwitchToParentWindow();
             
             lopm.BBOGVerify();
             lopm.LeadRemarks("No defect");
             lopm.BmApproveUpdate();
             Thread.sleep(1000);
             scrollToTop();
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             System.out.println("Lead status code is "+lopm.getStatusCode());
             lopm.goToCustomer360();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             cspm.switchCustomerView();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             scrollBy();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_020__Lead_BCMJourneyOnly-");
             QuiteBrowser();


     	}



	/*
	 * //screen shot using listner class
	 *
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */

     }


