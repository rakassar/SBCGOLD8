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

   public class SC_006_Lead_ETBLeadCreation extends HomePageMethod
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
    @Test
	public void SC_006_TC_001() throws Exception
	{

    	launchBrowser();
    	screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
    	screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        LoginButtonClick();
        CheckRole();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        lopm.ClickOnOnBoardingJourney();
        cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
        Thread.sleep(1000);
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        cspm.ChooseBBNfromList();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        cspm.clickstartjourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        cspm.ETBIndividualSalesJorney();
        //cspm.clickonredbutton();
        //cspm.ClickOnOnBoardingJourneynext2();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");

	}
        @Test
    	public void SC_006_TC_002() throws Exception
    	{

        	NTBSJPM.LeadRating("Hot");
        	screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            NTBSJPM.NTBJourneynext1();
            Thread.sleep(1000);
            NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
            Thread.sleep(500);
            NTBSJPM.Product(TestDataFromExcel.Product);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            NTBSJPM.NTBJourneynext2();
            Thread.sleep(2000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            //NTBSJPM.NTBignoreandCreate();
            CLDLPM.CheckEmployeetype();
            Thread.sleep(500);
			lopm.ClickOnAddresstab();
			Thread.sleep(500);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            CLDLPM.CreatedNewLeadEdit();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
	   }


        @Test
    	public void SC_006_TC_003() throws InterruptedException, IOException
    	{
            CLDLPM.selectstatuscode();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
			/*
			 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			 * Thread.sleep(2000);
			 */

         if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed"))
         {

        	  CLDLPM.businessname();
        	  CLDLPM.Sourceoffunds("Business");
        	  CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        	  Thread.sleep(1000);
              screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
              CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  

			  Thread.sleep(2000);
			  System.out.println("EmployeeType is self-employed");

         }
         else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

         {
        	 CLDLPM.Sourceoffunds("Inheritance");
             screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
             Thread.sleep(1000);
        	 System.out.println("EmployeeType is unemployed");
         }
         else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed"))
         {
       		 CLDLPM.employername();
       		CLDLPM.Sourceoffunds("Salary");
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
             CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
             Thread.sleep(1000);
             CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
             Thread.sleep(1000);

             CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  
             Thread.sleep(1000);
             screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        	 System.out.println("EmployeeType is Employed");
         }

    	}

        @Test
    	public void SC_006_TC_004() throws InterruptedException, IOException

    	{
        	CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
            CLDLPM.IDNumner();
            screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
            Thread.sleep(2000);
    	}


        @Test
    	public void SC_006_TC_005() throws InterruptedException, IOException

    	{   Thread.sleep(2000);
            CLDLPM.ClickOnAddress();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        	CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            lopm.saveAndProceed();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
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
        @Test
    	public void SC_006_TC_006() throws InterruptedException, IOException

    	{

        Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_006_ETBLeadCreation-");


    	}
        @Test
    	public void SC_006_TC_007() throws InterruptedException, IOException
     	{
        	Thread.sleep(500);
        	lopm.ClickOnUpdtButton();
        	Thread.sleep(500);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            lopm.popupdate360("No");
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            lopm.update360();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            FAIPM.ClickFillAccountInformation();
            FAIPM.RequestType(TestDataFromExcel.RequestTypef);
            FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
            FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
            FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
            FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            CRRSC.Finish();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            Thread.sleep(1000);


     	}
        @Test
    	public void SC_006_TC_008() throws InterruptedException, IOException
     	{
        	Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            lopm.ProcessApplication();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
            lopm.ProcessApplicationPopUpClose();
            Thread.sleep(2000);
            lopm.GetLeadId();
            screen.ScreenshotMethod("SC_006_ETBLeadCreation-");
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