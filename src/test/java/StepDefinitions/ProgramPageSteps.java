package StepDefinitions;

import org.openqa.selenium.WebDriver;

import hooks.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ProgramPage;

public class ProgramPageSteps {
	static WebDriver driver;
    public static ProgramPage programpage;
	

	  //this.batchPage = new BatchPage(driver);
	  
	  
	  public ProgramPageSteps() {
		    ProgramPageSteps.driver = Baseclass.getDriver();
	  }
	  @Given("Admin is logged into the LMS portal")
	  public void admin_is_logged_into_the_lms_portal() {
	programpage = new  ProgramPage(driver);

    }

	  @When("Admin navigates to the Program page giving {string} and {string}")
	  public void admin_navigates_to_the_program_page_giving_and(String string, String string2) {
	programpage.login("sdetorganizers@gmail.com", "UIHackathon@02");
	  }
	  
	  
	  @Then("click Program")
	  public void click_program() {

	  
	programpage.navigateToProgramPage();
    }

@Then("Admin should see {string} in the header and the total number of records in the footer")
public void admin_should_see_in_the_header_and_the_total_number_of_records_in_the_footer(String string) {
	programpage.checkHeaderText();
	
	programpage.isFooterDisplayed();
	
	
	System.out.println("headerfooter");

    }

@Then("Admin should see pagination controls under the data table")
public void admin_should_see_pagination_controls_under_the_data_table() {
	programpage.isPaginationDisplayed();
	System.out.println("Programpage");
    }

@Then("the delete button should be disabled")
public void the_delete_button_should_be_disabled() {
	programpage.multipledeleteEnabled();
	System.out.println("multipledelete");
	
    }

@Then("the edit and delete icons for each row should be enabled")
public void the_edit_and_delete_icons_for_each_row_should_be_enabled() {
	programpage.checkTableElements();;
	//programpage.EditEnabled();
	System.out.println("delete and edit Enabled & validated");
    }
@Then("the sorticon check box and searchbox should be validated")
public void the_sorticon_check_box_and_searchbox_should_be_validated() {
   programpage.sortingicon();
   programpage.checkbox();
   programpage.searchbar();   
   System.out.println("Check box,searchbox,sorticon Validated");
}
@Then("Add New program")
public void add_new_program() throws InterruptedException {
	programpage.newprogramicon();
	
	programpage.validateprogrampopup();
	programpage.addprogram();
	//programpage.Alertmessage();
    }
//----------------------------Edit---------------------------------------------------------------
@Given("Admin is in Program Page")
public void admin_is_in_program_pae() {
    programpage.navigateToProgramPage();;
}

@When("Admin clicks Edit button")
public void admin_clicks_edit_button() throws InterruptedException {
	 programpage.Editprogram();
}

@When("Admin updates with data")
public void admin_updates_with_data() {
    
}

@Then("Admin should see Updated message.")
public void admin_should_see_updated_message() {
  
}
//----------------------------------Delete-------------------------------------------------
@When("Admin clicks the delete icon on a specific program row alert with {string} and {string} appears clicks yes for deletion")
public void admin_clicks_the_delete_icon_on_a_specific_program_row_alert_with_and_appears_clicks_yes_for_deletion(String string, String string2) throws InterruptedException {
	programpage.searchtxtdisplayed();
	programpage.deleteYes(); 
	Thread.sleep(2000);
}

@Then("success message apears")
public void success_message_apears() {
    }

@When("Admin clicks the delete icon on specific program row alert with yes and no appears clicks {string}")
public void admin_clicks_the_delete_icon_on_specific_program_row_alert_with_yes_and_no_appears_clicks(String string) {
	programpage.searchtxtdisplayed();
	programpage.deleteNo();   
    }

@Then("program should still be listed in the data table")
public void program_should_still_be_listed_in_the_data_table() {
    }

@When("Admin selects one program row and clicks the delete icon under the {string} header")
public void admin_selects_one_program_row_and_clicks_the_delete_icon_under_the_header(String string) {
    }

@Then("selected program row is deleted from the data table")
public void selected_program_row_is_deleted_from_the_data_table() {
    }

@When("Admin selects multiple program rows and clicks the delete icon under the {string} header")
public void admin_selects_multiple_program_rows_and_clicks_the_delete_icon_under_the_header(String string) {
    }

@Then("selected program rows are deleted from the data table")
public void selected_program_rows_are_deleted_from_the_data_table() {
    }


}