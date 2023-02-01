package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual
SC_032_Lead_ETB_NTBJointEmployed.java
To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_033_Lead_ETB_ETBJointEmployed extends HomePageMethod {

	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC = new CRRSCLeadPageMethod();
	Screenshot screen = new Screenshot();
	FillAccountInformationPageMethod FAIPM = new FillAccountInformationPageMethod();

	@Test(priority = 1)
	public void SC_033_TC_001() throws InterruptedException, IOException {

		launchBrowser();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");

	}

	@Test(priority = 2)
	public void SC_033_TC_002() throws InterruptedException {

		NTBSJPM.LeadRating("Hot");
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);
		NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
		Thread.sleep(500);
		NTBSJPM.Product(TestDataFromExcel.Product);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(2000);
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		// NTBSJPM.NTBignoreandCreate();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(500);
		lopm.ClickOnAddresstab();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
	}

	@Test(priority = 3)
	public void SC_033_TC_003() throws InterruptedException {
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.SoleOwner("No");
		Thread.sleep(1000);
		CLDLPM.CustomerRelationship("And");
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");

		/*
		 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		 * Thread.sleep(2000);
		 */

		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			System.out.println("EmployeeType is Employed");
		}

	}

	@Test(priority = 4)
	public void SC_033_TC_004() throws InterruptedException {

	
		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void SC_033_TC_005() throws InterruptedException 

	{
		Thread.sleep(2000);
		CLDLPM.ClickOnAddress();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
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

	@Test(priority = 6)
	public void SC_033_TC_006() throws InterruptedException {

		Thread.sleep(1000);
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		NTBSJPM.CaseDedupeOnDocsLead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");

		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");

	}

	@Test(priority = 7)
	public void SC_033_TC_007() throws InterruptedException {
		CLDLPM.clickaddScndryLeadButton();
		
		NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
		NTBSJPM.EnterFirstName();
		NTBSJPM.EnterlastName();
		NTBSJPM.EntermiddleName();
		NTBSJPM.EnterMobile("66666");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(2000);
		NTBSJPM.chooseDedupe();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.bttnUpdateCreate();
		Thread.sleep(3000);
		System.out.print("Child ");
		Thread.sleep(2000);
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		// NTBSJPM.NTBignoreandCreate();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(500);
		lopm.ClickOnAddresstab();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		

		/*
		 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		 * Thread.sleep(2000);
		 */

		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			//CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			System.out.println("EmployeeType is Employed");
			CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
			CLDLPM.IDNumner();
			screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
			Thread.sleep(2000);
			Thread.sleep(2000);
			CLDLPM.ClickOnAddress();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.saveAndProceed();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			Thread.sleep(3000);

			/*
			 * try{driver.findElement(By.xpath("//button[@type = 'button'][1]")).click();
			 * System.out.println("case dedupe fired");}
			 *
			 *
			 * catch(NoSuchElementException e) { System.out.println("no case dedupe");
			 */
			NTBSJPM.CaseDedupeOnDocsLead();
			Thread.sleep(1000);
			CLDLPM.clickClosePopup();
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			CLDLPM.CreatedNewLeadEdit();
			Thread.sleep(1000);
			CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.saveAndProceed();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			NTBSJPM.CaseDedupeOnDocsLead();
			Thread.sleep(2000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			Thread.sleep(500);
			lopm.ClickOnUpdtButton();
			Thread.sleep(500);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.popupdate360("Yes");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.update360();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			scrolldown();
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.ProcessApplication();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.ProcessApplicationPopUpClose();
			Thread.sleep(3000);
			scrollToTop();
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			lopm.waitTillAccountOpen();
			screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
			}
	}

	@Test(priority = 8)
	public void SC_033_TC_008() throws InterruptedException {
		lopm.goToParentLead();
		Refresh();
		Thread.sleep(500);
		lopm.ClickOnUpdtButton();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.popupdate360("Yes");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.update360();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		scrolldown();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		FAIPM.ClickFillAccountInformation();
		FAIPM.RequestType(TestDataFromExcel.RequestTypef);
		FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
		FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
		FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
		FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		CRRSC.Finish();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		Thread.sleep(1000);

	}

	@Test(priority = 9)
	public void SC_033_TC_009() throws InterruptedException {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.ProcessApplication();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(3000);
		scrollToTop();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
		lopm.waitTillAccountOpen();
		screen.ScreenshotMethod("SC_033_Lead_ETB_ETBJointEmployed-");
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
