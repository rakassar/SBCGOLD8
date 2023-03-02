package BUSINESSNEXT.SBCGOLD8.COMMON;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

 

public class ListnersClassAnotation extends BrowserStart implements ITestListener{
	
	
	
	   ExtentTest test;
	   //Extent
	   ExtentReports report = TestExtentReports.reportConfig();
	   //Thread Setting for sync the execution result report in parallel
	   ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();

    
      @Override
      public void onTestStart(ITestResult Result)
        {
    	  System.out.println(Result.getName()+" test case started"); 
          test=report.createTest(Result.getMethod().getMethodName());
          extentTest.set(test);//unique therad ID generate to validate error pass or fail
          
        
        }
   
         public void onFinish(ITestContext context) 
         {
          // not implemented
         report.flush();
         
          }
   
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	    {

	    }

	    // When Test case get failed, this method is called.
	    @Override
	    public void onTestFailure(ITestResult Result)
	    {
	    	extentTest.get().fail(Result.getThrowable());
	    }

	    // When Test case get Skipped, this method is called.
	    @Override
	    public void onTestSkipped(ITestResult Result)
	    {
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());

	    }

	    // When Test case get passed, this method is called.
	    @Override
	    public void onTestSuccess(ITestResult Result)
	    {

        test.log(Status.PASS,"Test Passed");
		}
	    }


