package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.DriverFactory;
import hooks.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.UserManagePage;
import pageObject.UserStudentstaffPage;


public class UserStudstaffStepDef extends DriverFactory{	


	// WebDriver driver;
		
	   public static UserStudentstaffPage userssp;
	    
	    private TestContext context;

	    public UserStudstaffStepDef(TestContext context) {
	        this.context = context;
	        this.userssp = context.getUserStudentstaffPage(); // Initialize UserPage using TestContext
	    } 
	 
	// public static UserStudentstaffPage userssp;
	 
// UserStudentstaffPage userssp=new UserStudentstaffPage(driver);
	
////	
//	 public UserStudstaffStepDef() {
//	    	
//		    this.driver = DriverFactory.getDriver();
//		      
//		  }
////	

@Given("Admin is logged into the LMS portal and on the User page")
public void admin_is_logged_into_the_lms_portal_and_on_the_user_page() throws InterruptedException {
     
	// userssp = new  UserStudentstaffPage(driver);
	 userssp.setusername("sdetorganizers@gmail.com");
	 userssp.setPassword("UIHackathon@02");
	 userssp.clicksubmit();	 
    
}

	@When("Admin is on Manage User Page")
   public void admin_is_on_manage_user_page() {
		
		userssp.clickuser();
    
}
//
  @Then("Admin clicks on Assign Student button")
   public void admin_clicks_on_assign_student_button() {
	
	  userssp.clickAssignStud();
	System.out.println("Admin able to see Assign Student popup");
    
}


@Then("Admin should see all the details are there in popup open for assign student")
public void admin_should_see_all_the_details_are_there_in_popup_open() {
	
	// userssp = new  UserStudentstaffPage(driver);
	//driver.findElement(assignStudent).click();;
    userssp.clickAssignpop();
   userssp.userfieldvalid();
	   
    
}


@When("Admin clicks on <Save> without any details")
public void admin_clicks_on_save_without_any_details() {
	
	userssp.clickAssigSave();
   
}

@Then("Admin gets error message alert")
public void admin_gets_error_message_alert() {
	userssp.getErrorEmailMsg();
	userssp.getErrorProgramNameMsg();
	userssp.getErrorBatchMsg();
	userssp.getErrorStatusMsg();
    
}

//@When("Admin clicks on <Save> without selecting Program Name")
//public void admin_clicks_on_save_without_selecting_program_name() {
//	//driver.findElement(assignStudent).click();
//	selectStudEmailID();
//	selectBatchName();
//	driver.findElement(activeButton).click();
//	driver.findElement(saveButton).click();
//    
//}
//@Then("Admin gets message alert <Program Name is required>")
//public void admin_gets_message_alert_program_name_is_required() {
//	getErrorProgramNameMsg();
//}

//@When("Admin clicks on <Save> without selecting Batch Name")
//public void admin_clicks_on_save_without_selecting_batch_name() {
//	driver.findElement(assignStudent).click();
//	selectStudEmailID();
//	selectProgramName();
//	driver.findElement(activeButton).click();
//	driver.findElement(saveButton).click();
//    
//}
//@Then("Admin gets error message alert <Batch Name is required>")
//public void admin_gets_error_message_alert_batch_name_is_required() {
//	getErrorBatchMsg();
//}
//
//@When("Admin clicks on <Save> without selecting Status")
//public void admin_clicks_on_save_without_selecting_status() {
//	driver.findElement(assignStudent).click();
//	selectStudEmailID();
//	selectProgramName();
//	selectBatchName();
//	driver.findElement(saveButton).click();
//    
//}
//
//@Then("Admin gets error message alert <Status is required>")
//public void admin_gets_error_message_alert_status_is_required() {
//	getErrorStatusMsg();
//}
//
@When("Admin clicks on <Save> with selecting Status as Inactive")
public void admin_clicks_on_save_with_selecting_status_as_inactive() {
	//driver.findElement(assignStudent).click();
	//userssp.selectStudEmailID();
	userssp.selectStaffEmailId();
	userssp.selectProgramName();
	//userssp.selectBatchName();
	userssp.clickInactive();
	userssp.clickAssigSave();
    
}
//
@Then("Admin gets a message alert {string}")
public void admin_gets_a_message_alert(String string) {
	

	userssp.failedMessage();
    
}

@When("Admin clicks on <Cancel> with selecting all the valid details")
public void admin_clicks_on_cancel_with_selecting_all_the_valid_details() {
	//driver.findElement(assignStudent).click();
	userssp.selectStaffEmailId();
	userssp.selectProgramName();
	//userssp.selectBatchName();
	userssp.clickActive();
	userssp.clickCancel();
    
}

@Then("Admin able to see assign student popup closed")
public void admin_able_to_see_assign_student_popup_closed() {
	   
	userssp.clickuser();
    
}

@When("Admin clicks on <Save> with selecting all the valid details")
public void admin_clicks_on_save_with_selecting_all_the_valid_details() {
	//driver.findElement(assignStudent).click();
	userssp.selectStaffEmailId();
	userssp.selectProgramName();
	//userssp.selectBatchName();
	userssp.clickActive();
	userssp.clickAssigSave();
    
}

@Then("Admin gets success message {string}")
public void admin_gets_success_message(String string) {
	userssp.sucessMessage(); 
    
}

@Given("Admin should see all the details are there in popup open for assign Staff")
public void admin_clicks_on_assign_staff_button() {
	
	userssp.clickAssignStaff();
	System.out.println("Admin able to see Assign Staff popup");
}



@Then("Admin should see all the details are there in assign staff popup open")
public void admin_should_see_all_the_details_are_there_in_assign_staff_popup_open() {
	//driver.findElement(assignStaff).click();
	userssp.clickAssignStaffpop();
	userssp.userfieldvalid();
		
    
}
//
//@Given("Admin is in Assign Staff details popup")
//public void admin_is_in_assign_staff_details_popup() {
//	driver.findElement(assignStaff).click();
//    
//}

@Then("Admin gets assign staff error message alert")
public void admin_gets_assign_staff_error_message_alert() {
	
	userssp.getStaffemailIdErrorMessage();
	userssp.getErrorProgramNameMsg();
	userssp.getErrorBatchMsg();
	userssp.getErrorStatusMsg();
    
}

@When("Admin clicks on <Save> without selecting staff Id")
public void admin_clicks_on_save_without_selecting_staff_id() {
	

	userssp.selectProgramName();
	userssp.selectBatchName();
	//driver.findElement(skill).click();
	userssp.clickActive();
	userssp.clickAssigSave();
	
	
    
}
//
//@Then("Admin gets message alert <Email Id is required>")
//public void admin_gets_message_alert_email_id_is_required() {
//	getStaffemailIdErrorMessage();
//    
//}
//
//@When("Admin clicks on <Save> without batch name")
//public void admin_clicks_on_save_without_batch_name() {
//	selectProgramName();
//	selectStaffEmailId(); 
//	driver.findElement(activeButton).click();
//	driver.findElement(saveButton).click();
//    
//}
//
//@When("Admin clicks on <Save> without selecting active status")
//public void admin_clicks_on_save_without_selecting_active_status() {
//	selectStaffEmailId(); 
//	selectProgramName();
//	getErrorBatchMsg();
//	driver.findElement(inactiveButton).click();
//	driver.findElement(saveButton).click();
//    
//}

@Then("Admin able to see assign staff popup closed")
public void admin_able_to_see_assign_staff_popup_closed() {
	
	userssp.clickuser();
    
}

@When("Admin clicks the delete icon on a specific batch row alert with {string} and {string} appears clicks yes for deletion in User")
public void admin_clicks_the_delete_icon_on_a_specific_batch_row_alert_with_and_appears_clicks_yes_for_deletion_in_user(String string, String string2) {
   
	
	
}

@Then("success message apears in User")
public void success_message_apears_in_user() {
   
	
	
}

@When("Admin clicks the delete icon on specific row alert with yes and no appears clicks {string}  in User")
public void admin_clicks_the_delete_icon_on_specific_row_alert_with_yes_and_no_appears_clicks_in_user(String string) {
	
	 userssp.usrdelete();
	 userssp.usrnodelete();
  
}

@Then("batch should still be listed in the data table in User")
public void batch_should_still_be_listed_in_the_data_table_in_user() {
	 userssp.searchAndCheckUserPresence(null);
}

@When("Admin selects one batch row and clicks the delete icon under the {string} header in User")
public void admin_selects_one_batch_row_and_clicks_the_delete_icon_under_the_header_in_user(String string) {
   
	// userssp.singleDeleteAction();
}

@Then("selected batch row is deleted from the data table in User")
public void selected_batch_row_is_deleted_from_the_data_table_in_user() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects multiple batch rows and clicks the delete icon under the {string} header in User")
public void admin_selects_multiple_batch_rows_and_clicks_the_delete_icon_under_the_header_in_user(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("selected batch rows are deleted from the data table in User")
public void selected_batch_rows_are_deleted_from_the_data_table_in_user() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}





}
