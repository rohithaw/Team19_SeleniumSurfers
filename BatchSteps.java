package stepDefinition;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



import hooks.Baseclass;

import pageObject.BatchPage;



public class BatchSteps {
	static WebDriver driver;
    public static BatchPage batchPage;
	

	  //this.batchPage = new BatchPage(driver);
	  
	  
	  public BatchSteps() {
		    this.driver = Baseclass.getDriver();
		      
		  }
	
	@Given("Admin is logged into the LMS portal and on the dashboard page")
	public void admin_is_logged_into_the_lms_portal_and_on_the_dashboard_page() 
	{
		  batchPage = new  BatchPage(driver);
		
		
	}

	@Given("Admin navigates to the {string} page from the navigation bar clicking {string}")
	public void admin_navigates_to_the_page_from_the_navigation_bar_clicking(String string, String string2) throws InterruptedException 
	{
	  

	
		
	
		batchPage.login("sdetorganizers@gmail.com", "UIHackathon@02");
		batchPage.navigateToBatchPage();
		
	}

	@Then("Admin should see {string} in the header and the total number of records in the footer")
	public void admin_should_see_in_the_header_and_the_total_number_of_records_in_the_footer(String string) throws InterruptedException
	{
		batchPage.checkHeaderText();
	
		batchPage.isFooterDisplayed();
		
		
		System.out.println("headerfooter");
 
	}

	@Then("Admin should see pagination controls under the data table")
	public void admin_should_see_pagination_controls_under_the_data_table() {
		batchPage.isPaginationDisplayed();
		System.out.println("page");
	}

	@Then("the delete button should be disabled")
	public void the_delete_button_should_be_disabled() 
	
	{
		batchPage.multipledeleteEnabled();
		System.out.println("multipledelete");
	}

	

	@Then("the edit and delete icons for each row should be enabled")
	public void the_edit_and_delete_icons_for_each_row_should_be_enabled() 
	
	{
       
	} 
		
	    		
	



@When("Admin clicks {string} button and A new pop up with Batch details appears with all necessary fields")
public void admin_clicks_button_and_a_new_pop_up_with_batch_details_appears_with_all_necessary_fields(String string) throws InterruptedException {
	
	
	batchPage.newbatchicon();
	
	  batchPage.validatebatchpopup();
}

@When("Admin fills in all the fields with valid values except for the optional {string} and clicks {string}")
public void admin_fills_in_all_the_fields_with_valid_values_except_for_the_optional_and_clicks(String string, String string2) {
   
}

@Then("The newly added batch should be present in the Manage Batch page data table")
public void the_newly_added_batch_should_be_present_in_the_manage_batch_page_data_table() {
  
}


	
}
	
	
	
