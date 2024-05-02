package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import hooks.DriverFactory;
import hooks.TestContext;
import io.cucumber.java.en.*;
import pageObject.UserManagePage;
import utilities.ExcelReader;

public class UserManageStepDef extends DriverFactory {
	
//	static WebDriver driver;
//    public static UserManagePage usermp;
	
	
   public static UserManagePage usermp;
    
    private TestContext context;

    public UserManageStepDef(TestContext context) {
        this.context = context;
        this.usermp = context.getUserManagePage(); // Initialize UserPage using TestContext
    }  
//	WebDriver driver;
//	UserManagePage usermp=new UserManagePage(driver);
	
//  
    
   // public UserManageStepDef() {
    	
	  //  this.driver = DriverFactory.getDriver();
	      
	 // }
	
	@Given("Logged on the LMS portal as admin")
	public void logged_on_the_lms_portal_as_admin() throws InterruptedException {
		
		//usermp = new  UserManagePage(driver);
    	
	   
	}

	@When("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
		usermp.usernameField.sendKeys("sdetorganizers@gmail.com");
		usermp.passwordField.sendKeys("UIHackathon@02");
		usermp.loginbutton.click();
		
	   
	}

	@Then("Admin clicks User button from navigation bar")
	public void admin_clicks_user_button_from_navigation_bar() throws InterruptedException {
		
		Thread.sleep(1000);
		usermp.userbutton.click();
	    
	}
	
	@Then("Admin should see {string} in the header and the total number of records in the footer")
	public void admin_should_see_in_the_header_and_the_total_number_of_records_in_the_footer(String string) {
		
		
		usermp.checkHeaderText();
		usermp.isFooterDisplayed();
		
		
	}

	@Then("Admin should see pagination controls under the data table")
	public void admin_should_see_pagination_controls_under_the_data_table() {
	   
		usermp.isPaginationDisplayed();
		
	}

	@Then("the delete button should be disabled")
	public void the_delete_button_should_be_disabled() {
	   
		usermp.multipledeleteEnabled();
		
	}

	@Then("the edit and delete icons for each row should be enabled")
	public void the_edit_and_delete_icons_for_each_row_should_be_enabled() {
	   
		usermp.EditEnabled();
		usermp.deleteEnabled();
		
	}
	
	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
	   
		usermp.datatableheader();
	}

	@Then("Admin should be able to see the + A New User , + Assign Student , + Assign Staff button")
	public void admin_should_be_able_to_see_the_a_new_user_assign_student_assign_staff_button() {
		
		usermp.NewUserBtn();
		usermp.NewAssignStuBtn();
		usermp.NewAssignStaffBtn();
	   
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		
		usermp.hasCheckBox();
		//Assert.assertTrue(flag);
		//Loggerload.info("Each row in the data table should have a checkbox");
	  
	}
	
	@Then("Admin should be able to see the search text box above the data table")
	public void admin_should_be_able_to_see_the_search_text_box_above_the_data_table() {
		
		usermp.searchtxt();
	   
	}

	@Then("Admin should see user displayed with the entered name")
	public void admin_should_see_user_displayed_with_the_entered_name() {
		
		usermp.searchtxtdisplayed();	    
	}

	@Then("Admin enter keyword not present zero enteries must be displayed")
	public void admin_enter_keyword_not_present_zero_enteries_must_be_displayed() {
		
	
	   
	}

	
	@Given("Admin click +A New User button")
	public void admin_click_a_new_user_button() {
		
		usermp.ClickNewUser();
	    
	}

	@When("New pop up with user details appears")
	public void new_pop_up_with_user_details_appears() {
		
		usermp.userpopwindow();
		
		
	   
	}

	@Then("check all the fields in the pop up page with user details")
	public void check_all_the_fields_in_the_pop_up_page_with_user_details() {
		
	
		usermp.popupfielddisplay();
	}
	
	@Then("Fill in all the Valid values")
	public void fill_in_all_the_valid_values() {
		
		//usermp.EnterUserDetails();
	   
	}

	@Then("Click Submit and Validate {string}")
	public void click_submit_and_validate(String Message) {
	
		usermp.NewuserSubmit();
	    usermp.alrtmsgpopup();
	  
	}

	@Then("Admin should view newly added user in the data table in Manage user page")
	public void admin_should_view_newly_added_user_in_the_data_table_in_manage_user_page() {
		
		usermp.searchtxt();
		usermp.searchtxtdisplayed();
	   
	}
	
	@Then("Fill in all Valid Values as per {string} and rownumber {int}")
	public void fill_in_all_valid_values_as_per_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	   
		 ExcelReader excelReader = new ExcelReader();
		 List<Map<String,String>> UserData=
		 excelReader.getData("/Users/ark/eclipse-workspace/Team19_SeleniumSurfers_LMSHackathon/src/test/resources/testData/SeleniumSurfersTestData.xlsx", SheetName);

		 String fname= UserData.get(rowNumber).get("First name");
		 String mname= UserData.get(rowNumber).get("Middle name");
		 String lname= UserData.get(rowNumber).get("Last name");
		 String Loc= UserData.get(rowNumber).get("Location");
		 String phno= UserData.get(rowNumber).get("Phone no");
		 String linkurl= UserData.get(rowNumber).get("Linkedin Url");
		 String email= UserData.get(rowNumber).get("Email Address");
		 String ug= UserData.get(rowNumber).get("Under Graduate");
		 String pg= UserData.get(rowNumber).get("Post Graduate");
		 String timezone= UserData.get(rowNumber).get("Time Zone");
		 String usrcmt= UserData.get(rowNumber).get("User Comments");
		 

		 usermp.NewUserdetails(fname, mname, lname, Loc, phno, linkurl, email, ug, pg, timezone, usrcmt);
		
		
	}

	@When("Admin clicks on submit button without entering data")
	public void admin_clicks_on_submit_button_without_entering_data() {
		
		usermp.EnterUserDetails();
		usermp.NewuserSubmit();
		//AddFirstname.sendKeys("");	
	   
	}

	@Then("user willnot be created and Admin gets error message")
	public void user_willnot_be_created_and_admin_gets_error_message() {
		
		
		usermp.firstnamefielderror();
		usermp.middlenamefielderror();
		usermp.lastnamefielderror();
		usermp.locfieldeserror();
		usermp.phnofielderror();
		usermp.linkurlfielderror();
		usermp.emailfielderror();
		usermp.usrcmtsfielderror();
		usermp.ugfielderror();
		usermp.pgfieldeserror();
		usermp.timezonefielderror();
	
		
	   
	}
	@When("Admin clicks Cancel Icon on User Details form")
	public void admin_clicks_cancel_icon_on_user_details_form() {
	   
		usermp.clickcancel();
		
	}

	@Then("User Details popup window should be closed without saving")
	public void user_details_popup_window_should_be_closed_without_saving() {
		
		usermp.ClickNewUser();
		System.out.println("User Details Page displayed");
	   
	}




}
