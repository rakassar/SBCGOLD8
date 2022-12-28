package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/
import BUSINESSNEXT.SBCGOLD8.OBJECT.LeadObjectPageObject;
//Opening reporting 
//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_029_Reports_BCVreport extends HomePageMethod
{

    //Object for methods class
	   Screenshot screen=new Screenshot();
    ReportPageMethod RPM = new ReportPageMethod();


    @Test(priority=1)
	public void SC_028_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
        screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
        LoginButtonClick();
        CheckRole();
        screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	RPM.clk_reportObject();
    	screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	RPM.trendingArrowDown();
    	RPM.clk_reportName("Bulk Account Opening Details");
    	screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	Thread.sleep(1000);
    	RPM.clk_reportName("case summary report");
    	screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	Thread.sleep(1000);
    	RPM.clk_reportName("lead summary report");
    	screen.ScreenshotMethod("SC_029_Reports_BCVreport-");
    	RPM.jumptoreportwindow();
    	RPM.clickOnExecute();
    	

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

     
