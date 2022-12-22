package BUSINESSNEXT.SBCGOLD8.COMMON;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

 

public class TestExtentReports 
{

//public ExtentReports report;

 

public static ExtentReports reportConfig()
{
String path=System.getProperty("user.dir")+"\\Report\\index.html";
ExtentSparkReporter reporter=new ExtentSparkReporter(path);
reporter.config().setReportName("Test Excecution Report");//setting report name
reporter.config().setDocumentTitle("Test Result");//setting report title

 

ExtentReports report = new ExtentReports();
report.attachReporter(reporter);
report.setSystemInfo("Tester","Rizwan Ahmad"); // we can define property like here I define tester name in report
return report;

}
}