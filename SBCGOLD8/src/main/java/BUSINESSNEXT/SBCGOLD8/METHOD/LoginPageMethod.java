package BUSINESSNEXT.SBCGOLD8.METHOD;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;




public abstract class LoginPageMethod extends BrowserStart
{
 public void EnterUserName(String username)
 {


	LoginPageObject.txt_userName.clear();
	LoginPageObject.txt_userName.sendKeys(username);
	Reporter.log("Enter UserName");

 }


 public void EnterPassword(String Password)
 {
	 LoginPageObject.txt_password.clear();
	 LoginPageObject.txt_password.sendKeys(Password);
	 Reporter.log("Enter Password");
 }
 public void LoginButtonClick()
 {
	 LoginPageObject.btn_loginButton.click();
 }

 public void LogoutButtonClick()
 {
	 LoginPageObject.clk_ProfileImage_header.click();
	 LoginPageObject.clk_logoutButton.click();

 }

 public void paging(String pagenumber)
 {

	 LoginPageObject.clk_pagingdropdownlist.click();
	 Select sel=new Select(LoginPageObject.clk_pagingdropdownlist);
 	//sel.selectByValue(Product);
 	sel.selectByVisibleText(pagenumber);

 }

}
