package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_021_Lead_NTBJointEmployed extends HomePageMethod
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
	public void SC_021_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_021_TC_002() throws InterruptedException, IOException
	{
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        System.out.print("Primary ");
        lopm.GetLeadId();

    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_021_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        //Joint fields
        CLDLPM.SoleOwner("No");
        Thread.sleep(1000);
        CLDLPM.CustomerRelationship("And");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.OnlyBBNRequired("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
	}


    @Test(priority=4)
	public void SC_021_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_021_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_021_NTBJointEmployed-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_021_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
    	//CLDLPM.leadredbutton();


      /*  //   OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
*/


         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);

         
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test(priority=7)
 	public void SC_021_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

 	}

    @Test(priority=8)
 	public void SC_021_TC_008() throws InterruptedException
 	{
        CLDLPM.clickaddScndryLeadButton();
        //lopm.SwitchToSecondaryWindow();
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        System.out.print("Child ");
        lopm.GetLeadId();

    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

        /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        /*employed steps end */

        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

   	 CLDLPM.clickClosePopup();
	 screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     CLDLPM.clickCRRSCButton();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

 /* // OLD CRRSC
  	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
  	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
  	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
  	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
  	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
  	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
  	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
     //Thread.sleep(1000);
  	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
  	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     Thread.sleep(1000);
  	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
  	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
  	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
  	Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

  	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

     Thread.sleep(1000);
  	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
  	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
  	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
  	*/
     //New CRRSC
     CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
     CRRSC.Sbol(TestDataFromExcel.Sbol);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");

     CRRSC.RemarksCRRSC("I am Indian!");
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     CRRSC.Finish();

     Thread.sleep(1000);
     CLDLPM.clickClosePopup();
 	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     lopm.ClickOnCRRSCtab();
     Thread.sleep(2000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
 	CLDLPM.CreatedNewLeadEdit();
     Thread.sleep(1000);
 	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
 	Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
 	lopm.saveAndProceed();
 	Thread.sleep(1000);
 	screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     scrollBy();
     Thread.sleep(1000);
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
     lopm.ProcessApplication();
     Thread.sleep(1000);
     lopm.ProcessApplicationPopUpClose();
     Thread.sleep(5000);
     lopm.waitTillAccountOpen();
     screen.ScreenshotMethod("SC_021_NTBJointEmployed-");



 	}
    @Test(priority=9)
    public void SC_021_TC_009() throws InterruptedException
 	{
    	lopm.goToParentLead();
    	CLDLPM.clickClosePopup();
   	 screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        scrollBy();
    	
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        Thread.sleep(1000);

 	}


    @Test(priority=10)
 	public void SC_021_TC_010() throws InterruptedException
 	{
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        lopm.waitTillAccountOpen();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
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


