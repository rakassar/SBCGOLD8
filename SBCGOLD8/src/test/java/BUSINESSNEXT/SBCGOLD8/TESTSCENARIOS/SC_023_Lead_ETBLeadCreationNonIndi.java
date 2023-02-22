package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*
ETB onboarding journey, Including open case dedupe
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class SC_023_Lead_ETBLeadCreationNonIndi extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();
    Screenshot screen=new Screenshot();

    @Test(priority=1)
	public void SC_023_TC_001() throws Exception
	{

    	launchBrowser();
    	screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
    	screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        LoginButtonClick();
        CheckRole();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        lopm.ClickOnOnBoardingJourneyNonIndi();
        cspm.BBNFillForCustomerSearchNonIndi("10200000980");
        Thread.sleep(1000);
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        cspm.ChooseBBNfromListNonIndi();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        cspm.ETBIndividualSalesJorney();
        //cspm.clickonredbutton();
        //cspm.ClickOnOnBoardingJourneynext2();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");

	}
    @Test(priority=2)
    	public void SC_023_TC_002() throws Exception
    	{


            NTBSJPM.InterestedIn("Deposit");
            NTBSJPM.NTBJourneynext1();
            Thread.sleep(1000);
            NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
            Thread.sleep(500);
            NTBSJPM.Product(TestDataFromExcel.Product);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            NTBSJPM.NTBJourneynext2();
            Thread.sleep(3000);
            lopm.GetLeadId();

            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            //NTBSJPM.NTBignoreandCreate();
			lopm.ClickOnAddresstab();
			Thread.sleep(500);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");

	   }


    @Test(priority=3)
    	public void SC_023_TC_003() throws InterruptedException, IOException
    	{
        	 CLDLPM.CreatedNewLeadEdit();
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            CLDLPM.selectstatuscode();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
			    	}

    @Test(priority=4)
    	public void SC_023_TC_004() throws InterruptedException, IOException

    	{
        	CLDLPM.CorporateDocumentPickerCLK();
            Thread.sleep(500);
            CLDLPM.CorporateDocumentPickerCheck();
            Thread.sleep(500);
            lopm.ProcessApplicationPopUpClose();
            screen.ScreenshotMethod("TC_023_NTB_NonIndiDocsCollection-");
    	}


    @Test(priority=5)
    	public void SC_023_TC_005() throws InterruptedException, IOException

    	{   Thread.sleep(2000);
            CLDLPM.AddressTabNonindi();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        	CLDLPM.PlantAddresssameasOfficeAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            lopm.saveAndProceed();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            Thread.sleep(3000);

			/*
			 * try{driver.findElement(By.xpath("//button[@type = 'button'][1]")).click();
			 * System.out.println("case dedupe fired");}
			 *
			 *
			 * catch(NoSuchElementException e) { System.out.println("no case dedupe");
			 */
            NTBSJPM.CaseDedupeOnDocsLead();
           
    	}
    @Test(priority=6)
    	public void SC_023_TC_006() throws InterruptedException, IOException

    	{

        Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	NTBSJPM.CaseDedupeOnDocsLead();
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");


    	}
    @Test(priority=7)
    	public void SC_023_TC_007() throws InterruptedException, IOException
     	{
        	Thread.sleep(500);
        	lopm.ClickOnUpdtButton();
        	Thread.sleep(500);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            lopm.popupdate360("No");
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            lopm.update360();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            FAIPM.ClickFillAccountInformation();
            FAIPM.RequestType(TestDataFromExcel.RequestTypef);
            FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
            FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
            FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
            FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            CRRSC.Finish();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            Thread.sleep(1000);


     	}
    @Test(priority=8)
    	public void SC_023_TC_008() throws InterruptedException, IOException
     	{
        	Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            lopm.ProcessApplication();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            lopm.ProcessApplicationPopUpClose();
            Thread.sleep(2000);
            scrollToTop();
            lopm.waitTillAccountOpen();
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            CLDLPM.clickClosePopup();
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
            QuiteBrowser();
     	}
    @Test
   	public void SC_022_TC_010() throws InterruptedException, IOException
   	{
       	launchBrowser();
        screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
       	TestDataFromExcel.DataRead();
    		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
           EnterPassword(TestDataFromExcel.Password);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           LoginButtonClick();
           CheckRole();
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           clk_leadobject();
           lopm.categoryview("Deposit-Non Individual ");
           lopm.selfassignlead("Account Opened");
           lopm.leadview("Assigned Leads");
           Thread.sleep(500);
           lopm.onMyBucketlead();
           Thread.sleep(500);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           CLDLPM.clickClosePopup();
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           scrollBy();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           scrollBy();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
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
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           System.out.println("Lead status code is "+lopm.getStatusCode());
           lopm.goToCustomer360();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           cspm.switchCustomerView();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           scrollBy();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           scrollBy();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           scrollBy();
           Thread.sleep(1000);
           screen.ScreenshotMethod("SC_023_ETBLeadCreationNonIndi-");
           QuiteBrowser();


   	}



      //screen shot using listner class
    /* @Test
	  public void TestToPass()

	  {
	  System.out.println("This method to Check Fail Or Pass");
	  Assert.assertTrue(true);
	       */
}
