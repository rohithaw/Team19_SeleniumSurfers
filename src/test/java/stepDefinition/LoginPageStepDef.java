package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hooks.DriverFactory;
import hooks.TestContext;
import io.cucumber.java.en.*;
import pageObject.LoginPage;
import pageObject.UserManagePage;
import utilities.ExcelReader;

public class LoginPageStepDef extends DriverFactory{
	
	WebDriver driver;
	LoginPage lp;
	
	
	private TestContext context;

    public LoginPageStepDef(TestContext context) {
        this.context = context;
        this.lp = context.getLoginPage(); 
    }
//	 public LoginPageStepDef() {
//	    	
//		    this.driver = DriverFactory.getDriver();
//		      
//		  }
	
	 @Given("User is on login page")
	 public void user_is_on_login_page() {
		 
		//lp = new  LoginPage(driver);
	     
	 }

	 @When("User clicks on Login button with entering valid Username {string} and rownumber {int}")
	 public void user_clicks_on_login_button_with_entering_valid_username_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		 
		 ExcelReader excelReader = new ExcelReader();
		 List<Map<String,String>> LoginData=
		 excelReader.getData("/Users/ark/eclipse-workspace/Team19_SeleniumSurfers_LMSHackathon/src/test/resources/testData/SeleniumSurfersTestData.xlsx", SheetName);

		 String Username= LoginData.get(rowNumber).get("User");
		 String Password= LoginData.get(rowNumber).get("Password");

		 lp.setuser(Username);
		 lp.setpassword(Password);
		 lp.clickloginbtn(); 
	    
	 }

	 
	 @Then("User click submit and display {string}")
	 public void user_click_submit_and_display(String string) {
	    
		//lp.Usrerrpop();
	 }
	 
	 @When("Admin should user and password in the text field and {string} symbol")
	 public void admin_should_user_and_password_in_the_text_field_and_symbol(String string) {
		 
		 lp.usertxtastrikchk();
		 lp.pwdtxtastrikchk();
	    
	 }

	 @Then("Admin should see login button")
	 public void admin_should_see_login_button() {
		 
		 lp.logindisplayed();
	    
	 }
	 
	 @Then("Admin should see logo on the leftside and Admin should see  LMS - Learning Management System with company name below")
	 public void admin_should_see_logo_on_the_leftside_and_admin_should_see_lms_learning_management_system_with_company_name_below() throws InterruptedException {
		 
		 lp.LMS_TitleAlignmentlp();
		 lp.ChckLogo();
	     
	 }

	 @Then("Admin should see {string}")
	 public void admin_should_see(String string) {
		 
		 lp.chkloginTitle();
	     
	 }
	 
	 @Then("Admin should see user and Password in gray color")
	 public void admin_should_see_user_and_password_in_gray_color() {
		 
		 lp.colorfield();
	    
	 }


}
