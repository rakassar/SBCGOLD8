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

public class ListnersClassAnotation extends BrowserStart implements ITestListener{


       @Override
	    public void onFinish(ITestContext Result)
	    {

	    }

	    @Override
	    public void onStart(ITestContext Result)
	    {

	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	    {

	    }

	    // When Test case get failed, this method is called.
	    @Override
	    public void onTestFailure(ITestResult Result)
	    {
	    System.out.println("The name of the testcase failed is :"+Result.getName());

	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


        Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_");


	    try {
	    	//FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+System.currentTimeMillis()+FileName+".png"));

	    	FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+FileName+".png"));
		}

	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }

	    // When Test case get Skipped, this method is called.
	    @Override
	    public void onTestSkipped(ITestResult Result)
	    {
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());

	    }

	    // When Test case get Started, this method is called.
	    @Override
	    public void onTestStart(ITestResult Result)
	    {
	    System.out.println(Result.getName()+" test case started");
	    }

	    // When Test case get passed, this method is called.
	    @Override
	    public void onTestSuccess(ITestResult Result)
	    {


	    System.out.println("The name of the testcase passed is :"+Result.getName());

	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_");

	     try {
	    	   //FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+System.currentTimeMillis()+FileName+".png"));

		    	FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+FileName+".png"));
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }


}