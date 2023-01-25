package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/
import BUSINESSNEXT.SBCGOLD8.OBJECT.LeadObjectPageObject;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_038_Lead_NTBJointTrustIndi extends HomePageMethod
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
	public void SC_028_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_028_TC_002() throws InterruptedException, IOException
	{
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.InterestedIn("Trust");

        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        NTBSJPM.ProductCategory("UITF");
        Thread.sleep(500);
        NTBSJPM.Product("SB PESO BOND FUND");
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        System.out.print("Trust ");
        lopm.GetLeadId();
        lopm.Trust_TreasuryLeadId();

    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_028_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.Enteremail();
        CLDLPM.settlementaccntType("Open New Settlement Account");
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        //Joint fields
        CLDLPM.SoleOwner("No");
        CLDLPM.CustomerRelationship("And");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
       // CLDLPM.OnlyBBNRequired("No");
        Thread.sleep(1000);
        CLDLPM.GroupID("Groupid123");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
	}


    @Test(priority=4)
	public void SC_028_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_028_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        //CLDLPM.Tin("");
        CLDLPM.dosriFlag("No");
        CLDLPM.fatcaFlag("Yes");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_028_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

 	}
    @Test(priority=7)
 	public void SC_028_TC_007() throws InterruptedException
 	{
    CLDLPM.clickaddScndryLeadButton();
    NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
    NTBSJPM.EnterFirstName();
    NTBSJPM.EnterlastName();
    NTBSJPM.EntermiddleName();
    NTBSJPM.EnterMobile();
    NTBSJPM.NTBJourneynext2();
    Thread.sleep(1000);
    System.out.print("Child ");
    lopm.GetLeadId();

	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.CreatedNewLeadEdit();
    
    CLDLPM.selectstatuscode();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.Enteremail();
    
    Thread.sleep(300);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
    CLDLPM.Gender(TestDataFromExcel.Gender);
    CLDLPM.PlcaeOfBirth();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
    CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
    CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
    CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
    CLDLPM.AoCode(TestDataFromExcel.AoCode);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    //Joint fields
    
   
    Thread.sleep(500);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   // CLDLPM.OnlyBBNRequired("No");
    Thread.sleep(1000);
    CLDLPM.GroupID("Groupid123");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    
    CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
    CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
    CLDLPM.employername();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.occupation(TestDataFromExcel.occupation);
    CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
    Thread.sleep(1000);
    CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    scrollBy();
    CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
    Thread.sleep(500);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
    Thread.sleep(1000);
    CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    /*employed steps end */





    CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
    CLDLPM.IDNumner();
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.MaidanName();
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    //CLDLPM.Tin("");
    CLDLPM.dosriFlag("No");
    //CLDLPM.fatcaFlag("Yes");
    Thread.sleep(500);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.ClickOnAddress();
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.streetfied();
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    Thread.sleep(1000);
    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    lopm.saveAndProceed();
    Thread.sleep(2000);
	    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");


   
	 CLDLPM.clickClosePopup();
	 screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    
    
}
    @Test(priority=8)
 	public void SC_028_TC_008() throws InterruptedException
 	{
    	lopm.goToParentLead();  
    	CLDLPM.clickIndiAccntCreateBtn();
        lopm.SwitchToLastWindow();
        NTBSJPM.LeadRating("Hot");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        System.out.print("Settlement ");
        lopm.GetLeadId();

    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        CLDLPM.OnlyBBNRequired("No");
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7

        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrollBy();
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

   	 CLDLPM.clickClosePopup();
	 screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     CLDLPM.clickCRRSCButton();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

     /*      // OLD CRRSC
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
     */
      //New CRRSC
      CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
      CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
      CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
      CRRSC.Sbol(TestDataFromExcel.Sbol);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);

     CRRSC.RemarksCRRSC("I am Indian!");
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     CRRSC.Finish();

     Thread.sleep(1000);
     CLDLPM.clickClosePopup();
 	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     lopm.ClickOnCRRSCtab();
     Thread.sleep(2000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
 	CLDLPM.CreatedNewLeadEdit();
     Thread.sleep(1000);
 	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
 	Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
 	lopm.saveAndProceed();
 	Thread.sleep(1000);
 	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
 	}
     @Test(priority=9)
  	public void SC_021_TC_009() throws InterruptedException
  	{
         CLDLPM.clickaddScndryLeadButton();
         
         Thread.sleep(1000);
      	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         NTBSJPM.NTBJourneynext2();
         Thread.sleep(1000);
         System.out.print("Child ");
         lopm.GetLeadId();

     	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
     	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         CLDLPM.CreatedNewLeadEdit();
         Thread.sleep(1000);
         CLDLPM.selectstatuscode();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7

         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         CLDLPM.ClickOnAddress();
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         Thread.sleep(500);
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         scrollBy();
         
         screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
         
         
         
         
         lopm.saveAndProceed();
         Thread.sleep(1000);
    	    screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

    	 CLDLPM.clickClosePopup();
 	 screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CLDLPM.clickCRRSCButton();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

  /* // OLD CRRSC
   	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
   	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
   	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
   	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
   	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
   	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
   	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
   	Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
      //Thread.sleep(1000);
   	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
   	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
   	Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      Thread.sleep(1000);
   	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
   	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
   	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
   	Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

   	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

      Thread.sleep(1000);
   	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
   	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
   	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
   	*/
      //New CRRSC
      CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
      CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
      CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
      CRRSC.Sbol(TestDataFromExcel.Sbol);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

      CRRSC.RemarksCRRSC("I am Indian!");
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      CRRSC.Finish();

      Thread.sleep(1000);
      CLDLPM.clickClosePopup();
  	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      lopm.ClickOnCRRSCtab();
      Thread.sleep(2000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
  	CLDLPM.CreatedNewLeadEdit();
      Thread.sleep(1000);
  	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
  	Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
  	lopm.saveAndProceed();
  	Thread.sleep(1000);
  	screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      scrollBy();
      Thread.sleep(1000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      lopm.ProcessApplication();
      Thread.sleep(3000);
      lopm.ProcessApplicationPopUpClose();
      Thread.sleep(3000);
      
      lopm.waitTillAccountOpen();
      Thread.sleep(3000);
      screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
      

  	}
     
     @Test(priority=10)
   	public void SC_021_TC_010() throws InterruptedException
   	{
    	 lopm.goToParentLead();
    	 FAIPM.ClickFillAccountInformation();
     FAIPM.RequestType(TestDataFromExcel.RequestTypef);
     FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
     FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
     FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
     FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     CRRSC.Finish();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     lopm.ProcessApplication();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     lopm.ProcessApplicationPopUpClose();
     Thread.sleep(2000);
     lopm.waitTillAccountOpen();
     screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
     Thread.sleep(60000);  // for soap hit
     

 	}
     
    @Test(priority=11)
    public void SC_028_TC_011() throws InterruptedException
 	{
    	clk_leadobject();
		lopm.leadSearch(lopm.tLeadID);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
		CLDLPM.clickClosePopup();
		scrollBy();
		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.settlementaccntType("Choose from Existing Account");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.settlementaccntPickerclk();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.settlementaccntclk();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.UpdateDetailsTrustTreasury("No");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        NTBSJPM.CaseDedupeOnDocsLead();
        Thread.sleep(1000);
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.settlementaccntType("Choose from Existing Account");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.settlementaccntPickerclk();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.settlementaccntclk();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        CLDLPM.UpdateDetailsTrustTreasury("No");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        NTBSJPM.CaseDedupeOnDocsLead();
        System.out.println("Please fill csq");
        lopm.waitTillCSQPerform();
        Thread.sleep(3000);
        lopm.goToTChildLead();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");

        CLDLPM.CreatedNewLeadEdit();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        scrolldown();
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        Thread.sleep(500);
        CLDLPM.UpdateDetailsTrustTreasury("No");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.saveAndProceed();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        lopm.waitTillCSQPerform();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
        QuiteBrowser();

 	}


    @Test(priority=12)
 	public void SC_028_TC_012() throws InterruptedException, IOException
 	{
    	 launchBrowser();
    	    TestDataFromExcel.DataRead();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
            EnterUserName(TestDataFromExcel.UserName_TrustOps);
    	    EnterPassword(TestDataFromExcel.Password);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    LoginButtonClick();
    	    CheckRole();
    		Thread.sleep(500);
    	    clk_leadobject();
    	    lopm.categoryview("Trust-Individual");
    	    lopm.selfassignlead("Assigned to Trust");
    	    lopm.leadview("Assigned Leads");
    	    Thread.sleep(500);
    	    lopm.onMyBucketlead();
    	    Thread.sleep(500);
    	    lopm.ProcessApplication();
    	    Thread.sleep(1500);
    		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
    	    Thread.sleep(1500);
    	    lopm.TustOpsConvertLeadCLK();
    	    Thread.sleep(500);
    		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
            
            clk_leadobject();  //for secondary lead
    	    lopm.categoryview("Trust-Individual");
    	    lopm.selfassignlead("Assigned to Trust");
    	    lopm.leadview("Assigned Leads");
    	    Thread.sleep(500);
    	    lopm.onMyBucketlead();
    	    Thread.sleep(500);
    	    lopm.ProcessApplication();
    	    Thread.sleep(1500);
    		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
    	    Thread.sleep(1500);
    	    lopm.TustOpsConvertLeadCLK();
    	    Thread.sleep(500);
    		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    scrollBy();
    	    Thread.sleep(1000);
            screen.ScreenshotMethod("SC_038_Lead_NTBJointTrustIndi-");
    	    QuiteBrowser();
    	 	}




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

     
