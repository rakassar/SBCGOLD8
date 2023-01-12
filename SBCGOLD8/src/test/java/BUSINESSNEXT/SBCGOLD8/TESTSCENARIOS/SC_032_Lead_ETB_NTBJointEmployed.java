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
public class SC_032_Lead_ETB_NTBJointEmployed extends HomePageMethod
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
           CheckRole();
           Thread.sleep(100);
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
               lopm.GetLeadId();

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
               CLDLPM.SoleOwner("No");
               Thread.sleep(1000);
               CLDLPM.CustomerRelationship("And");
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

    @Test(priority=8)
 	public void SC_021_TC_008() throws InterruptedException
 	{
        CLDLPM.clickaddScndryLeadButton();
        lopm.SwitchToSecondaryWindow();
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
     Thread.sleep(60000);
     lopm.waitTillAccountOpen();
     QuiteBrowser();







 	}
    @Test(priority=9)
    public void SC_021_TC_009() throws InterruptedException
 	{
    	lopm.SwitchToParentWindow();
        Refresh();
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
    	scrolldown();
        screen.ScreenshotMethod("SC_021_NTBJointEmployed-");
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


