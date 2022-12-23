package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_024_Lead_NTBEmployedLoanProcessor extends HomePageMethod
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
	public void SC_024_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_LoanProcessor);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        ClickOnLoanJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_024_TC_002() throws InterruptedException, IOException
	{
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");

        NTBSJPM.NTBJourneynext1();

        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_024_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
	}


    @Test(priority=4)
	public void SC_024_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_024_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_024_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
    	//CLDLPM.leadredbutton();


        // OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");


        /*
         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);

         */

         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test(priority=7)
 	public void SC_024_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");

 	}

    @Test(priority=8)
 	public void SC_024_TC_008() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");


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


