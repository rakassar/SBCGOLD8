package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

/*Customer Onboarding process for NTB Unemployed Indidvidual

*/
//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_004_Lead_DocsCollectedUnEmployed extends HomePageMethod
{

	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	Screenshot screen=new Screenshot();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();

    @Test
	public void SC_004_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        LoginButtonClick();
        CheckRole();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);

	}

    @Test
	public void SC_004_TC_002() throws InterruptedException, IOException
	{
    	NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        lopm.GetLeadId();

        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
	}

    @Test
	public void SC_004_TC_003() throws InterruptedException, IOException
	{
    	CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");


	}


    @Test
	public void SC_004_TC_004() throws InterruptedException, IOException
	{
        /*Unemployed steps start */
        CLDLPM.Employeetype("Unemployed");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsUnemp);
        scrollBy();
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");

        /*Unemployed steps end*/


	}

    @Test
	public void SC_004_TC_005() throws InterruptedException, IOException
	{

    	CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        //LogoutButtonClick();
       // QuiteBrowser();


	}



    @Test
 	public void SC_004_TC_006() throws InterruptedException
 	{
    	CLDLPM.clickClosePopup();
   	 screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CLDLPM.clickCRRSCButton();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
   	//CLDLPM.leadredbutton();


       /*  // OLD CRRSC
    	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
    	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
    	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
    	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
    	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
    	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
    	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
    	Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
       //Thread.sleep(1000);
    	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
    	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
    	Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
       Thread.sleep(1000);
    	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
    	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
    	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
    	Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

    	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

       Thread.sleep(1000);
    	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
    	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
    	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
       Thread.sleep(1000);
       screen.ScreenshotMethod("TC_003_NTBDocsCollectionEmployed-");
       */


        //New CRRSC
        CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
        CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
        CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
        CRRSC.Sbol(TestDataFromExcel.Sbol);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
        CRRSC.RemarksCRRSC("I am Indian!");
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CRRSC.Finish();

        Thread.sleep(1000);
 	}

    @Test
 	public void SC_004_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
 	}

    @Test
 	public void SC_004_TC_008() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        Thread.sleep(1000);


 	}


    @Test
 	public void SC_004_TC_009() throws InterruptedException
 	{
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        scrollToTop();
        lopm.GetLeadId();
        lopm.waitTillAccountOpen();
        screen.ScreenshotMethod("SC_004_LeadDocsCollectedUnEmployed-");
    	QuiteBrowser();
 	}



  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */

   }
