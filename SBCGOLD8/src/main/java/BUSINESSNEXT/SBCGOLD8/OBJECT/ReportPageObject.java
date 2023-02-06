package BUSINESSNEXT.SBCGOLD8.OBJECT;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPageObject extends LoginPageObject{



public ReportPageObject (WebDriver driver)

{
	super(driver);

}


//*****************************************************-------------//

@FindBy(className="icon-reports")
public static WebElement clk_reportquicklink;

@FindBy(xpath="(//span[@title='Reports'])[2]")
public static WebElement clk_reportobject;


@FindBy(name="Grid_SearchTextBox")
public static WebElement clk_reportName;

@FindBy(xpath="//span[@class= 'mh2 cardGroupSection__title']")
public static WebElement clk_opendropdown;

@FindBy(xpath="//a[text() = 'Execute']")
public static WebElement clk_executeButton;


@FindBy(xpath="(//i[@class='icon-acid-arrow-down brand rotate180'])[2]")
public static WebElement clk_arrowDown;

@FindBy(xpath ="(//a[@data-autoid='Name_0'])[1]")
public static WebElement clk_openreport;

@FindBy(linkText="Activity Report - ( 8 )")
public static WebElement clk_activityreport;


@FindBy(linkText="Accounts and Contacts - ( 15 )")
public static WebElement clk_accountreport;


@FindBy(linkText="Lead Reports - ( 13 )")
public static WebElement clk_leadreports;


@FindBy(linkText="Customer Service - ( 34 )")
public static WebElement clk_casereports;


@FindBy(css="//a[@title='Branch Case Volume']")
public static WebElement rpt_branchcasevolume;





}
