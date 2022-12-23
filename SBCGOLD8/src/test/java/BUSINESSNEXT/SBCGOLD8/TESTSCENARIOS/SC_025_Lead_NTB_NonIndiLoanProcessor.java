package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Onboarding process for NTB Nonindi Loan process(To create customer only not account)
To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_025_Lead_NTB_NonIndiLoanProcessor extends HomePageMethod
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
	public void SC_025_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_LoanProcessor);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        ClickOnLoanJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        lopm.ClickOnOnBoardingJourneyNonIndi();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_025_TC_002() throws InterruptedException, IOException
	{

        NTBSJPM.CompanyName();
        NTBSJPM.EnterMobile();
        NTBSJPM.LeadRating("Hot");
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        lopm.GetLeadId();
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_025_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear); //business registration


        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.CustomerCategory("FINANCIAL CORPORATION (BANK)");
        CLDLPM.CustomerType("Foreign Banks");
        //CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        //CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
	}


    @Test(priority=4)
	public void SC_025_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
    	CLDLPM.PlcaeOfBirth();  //place of registration
    	CLDLPM.businessExpiry("04042025");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        CLDLPM.TypeOfCorp("Domestic Corporation");
        Thread.sleep(500);

        CLDLPM.Tin("");
        Thread.sleep(500);

        CLDLPM.EntityType("Private");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");

        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_025_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.CorporateDocumentPickerCLK();
        Thread.sleep(500);
        CLDLPM.CorporateDocumentPickerCheck();
        Thread.sleep(500);
        lopm.ProcessApplicationPopUpClose();
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        Thread.sleep(500);
        CLDLPM.AddressTabNonindi();
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.streetfiedNonIndi();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        CLDLPM.ZipcodeNonIndi(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        Thread.sleep(1000);
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_025_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         CLDLPM.clickCRRSCButtonNonIndi();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
    	//CLDLPM.leadredbutton();


        // OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
        scrollBy();
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(400);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
    // 	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     //	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	CRRSC.CityCRRSCNonIndi(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");



        /* //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
         */
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test(priority=7)
 	public void SC_025_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");

 	}




    @Test(priority=8)
 	public void SC_025_TC_008() throws InterruptedException
 	{
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_025_Lead_NTB_NonIndiLoanProcessor-");
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


