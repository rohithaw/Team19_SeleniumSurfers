package stepDefinition;
import hooks.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BatchPage;
public class BatchSteps extends DriverFactory {
	
	
    public static BatchPage batchPage;
    
	
   
	  @Given("Admin is logged into the LMS portal and on the dashboard page")
	  public void admin_is_logged_into_the_lms_portal_and_on_the_dashboard_page() {
		  //batchPage = new BatchPage(driver);
		  batchPage = new BatchPage(getDriver());
	  }
// batch page 
	  @Given("Admin navigates to the {string} page from the navigation bar clicking {string}")
	  public void admin_navigates_to_the_page_from_the_navigation_bar_clicking(String string, String string2) {
		  batchPage.login("sdetorganizers@gmail.com", "UIHackathon@02");
			batchPage.navigateToBatchPage();
			// batchPage.verifyOnDashboardPage();
	  }
//header footer  validation
	  @Then("Admin should see {string} in the header and the total number of records in the footer")
	  public void admin_should_see_in_the_header_and_the_total_number_of_records_in_the_footer(String string) {
		  batchPage.checkHeaderText();
		  batchPage.isFooterDisplayed();
		  //System.out.println("headerfooter");
	  }
//datatable header
	  @Then("the data table should show headers {string}, {string}, {string}, {string}, {string}, {string}")
	  public void the_data_table_should_show_headers(String string, String string2, String string3, String string4, String string5, String string6) {
		  batchPage.datatableHeaderText();
	  }
//pagination
	  @Then("Admin should see pagination controls under the data table and the multipedelete button should be disabled")
	  public void admin_should_see_pagination_controls_under_the_data_table_and_the_multipedelete_button_should_be_disabled() {
		  batchPage.isPaginationDisplayed();
		  System.out.println("page");
		   batchPage.multipledeleteEnabled();
			System.out.println("multipledelete");
			
	  }
//checkbox,edit,delete
	  @Then("the checkbox edit ,delete icons for each row should be enabled")
	  public void the_checkbox_edit_delete_icons_for_each_row_should_be_enabled() {
		 batchPage.checkTableElements();
	  }
//newbatch popup
	  @When("Admin clicks on {string} button to open the Batch details popup with all necessary fields")
	  public void admin_clicks_on_button_to_open_the_batch_details_popup_with_all_necessary_fields(String string) {
		    batchPage.newbatchicon();
		    
	  }
	  @When("Admin attempts to enter {string}, {string}, {string}, {string}, and {string} in the popup")
	  public void admin_attempts_to_enter_and_in_the_popup(String string, String string2, String string3, String string4, String string5) {
		  batchPage. validatebatchpopup();
	  }

	  @Then("Admin should see valid inputs or error messages corresponding to each field in the popup")
	  public void admin_should_see_valid_inputs_or_error_messages_corresponding_to_each_field_in_the_popup() {
	  
	  }

	  @Then("if all mandatory fields are valid, Admin clicks {string}")
	  public void if_all_mandatory_fields_are_valid_admin_clicks(String string) {
	    
	  }

	  @Then("if \"\"Batch Name is required. This field should start...{string} contains {string},")
	  public void if_batch_name_is_required_this_field_should_start_contains(String string, String string2) {

	    batchPage.invalidnamefield();
	  }


      @Then("if \"\"Number of Classes is required.{string} contains {string},")
      public void if_number_of_classes_is_required_contains(String string, String string2) {
	  batchPage.invalidclassfield();
	  }

      @Then("if \"\"Program Name is required.{string} contains {string},")
      public void if_program_name_is_required_contains(String string, String string2) {

	    
	  }
      @Then("if \"\"Batch Description is required. This field should start...{string} contains {string},")
      public void if_batch_description_is_required_this_field_should_start_contains(String string, String string2) {
	   batchPage.invaliddescriptionfield();
	  }

      @Then("if \"\"Batch already exists with given Batch Name\"\" contains {string},")
      public void if_batch_already_exists_with_given_batch_name_contains(String string) {
	     batchPage.invalidbatchfield();
	  }

	  
      @Then("if \"\"status is required\"\" contains {string},")
      public void if_status_is_required_contains(String string) {
	      batchPage.invalidstatusfield();
	  }
      @Then("the outcome should be \"\"Successfully batch created\"\"")
      public void the_outcome_should_be_successfully_batch_created() {
		  batchPage.createbatch();
		  batchPage.search() ;
	  }
  
	  
	  
	 

//edit validation
      
      
      @When("Admin clicks the edit icon on a specific batch row and batch details popup appears")
      public void admin_clicks_the_edit_icon_on_a_specific_batch_row_and_batch_details_popup_appears() {
         batchPage.editBatch(null, null, 0, null);
        
      }

      @When("Admin clicks {string}  and the successfully batch updated is displayed")
      public void admin_clicks_and_the_successfully_batch_updated_is_displayed(String string) {
    	  batchPage.Save();
    	  batchPage.alertMsgPopup();
      }

      @When("Admin erase the mandatory field  error message appear")
      public void admin_erase_the_mandatory_field_error_message_appear() {
        batchPage.clearMandatoryField();
        batchPage.Save();
        batchPage.alertMsgPopup();
      }

      @Then("Admin tries erase description field which is optional error message appears")
      public void admin_tries_erase_description_field_which_is_optional_error_message_appears() {
          batchPage.clearOptionalField();
          batchPage.Save();
          batchPage.alertMsgPopup();
      }

      @When("Admin clicks the delete icon on a specific batch row alert with {string} and {string} appears and validating and clicks yes")
      public void admin_clicks_the_delete_icon_on_a_specific_batch_row_alert_with_and_appears_and_validating_and_clicks_yes(String string, String string2) {
            batchPage.delete();
            batchPage.isPopupDisplayedCorrectly();
           batchPage.yesdelete();
      }

      @Then("success message apears")
      public void success_message_apears() {
         batchPage.alertMsgPopup();
      }


	  
	  
//row delete no validation	  
	 @When("Admin clicks the delete icon on specific row alert with yes and no appears clicks {string}")
	  public void admin_clicks_the_delete_icon_on_specific_row_alert_with_yes_and_no_appears_clicks(String string) {
		 batchPage.delete();
		 batchPage.nodelete();
	  }
// batch still on list search check	 
	 @Then("batch should still be listed in the data table")
	 public void batch_should_still_be_listed_in_the_data_table() {
		 batchPage.searchAndCheckBatchPresence(null);
	  }

// single  delete
	 @When("Admin selects one batch row and clicks the delete icon under the {string} header")
	 public void admin_selects_one_batch_row_and_clicks_the_delete_icon_under_the_header(String string) {
		 batchPage.singleDeleteAction();
	      
	  }

	 @Then("selected batch row is deleted from the data table")
	 public void selected_batch_row_is_deleted_from_the_data_table() {
		 
		 batchPage.searchAndCheckBatchPresence(null);
	 
	 }
// checkbox more than 2 delete
	 @When("Admin selects multiple batch rows and clicks the delete icon under the {string} header")
	 public void admin_selects_multiple_batch_rows_and_clicks_the_delete_icon_under_the_header(String string) {
		 batchPage.multipleDeleteAction();
	  }
//multiple delte message 
	 @Then("selected batch rows are deleted from the data table")
	 public void selected_batch_rows_are_deleted_from_the_data_table() {
	     
	  }

	







}