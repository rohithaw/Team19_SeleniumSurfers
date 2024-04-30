package stepDefinition;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;*/

import hooks.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DashboardPageObj;

public class DashboardStepDef extends Baseclass{
	
	//WebDriver driver;
	 DashboardPageObj 
	 dashboard = new DashboardPageObj(getDriver());
	 
	@Given("Admin starts from Home Page")
	public void admin_starts_from_home_page() {
	    
	  // dashboard = new DashboardPageObj(getDriver()) ;
		System.out.println("User is on the home page");
		
	}

	@When("Admin enters valid credentials and click login button")
	public void admin_enters_valid_credentials_and_click_login_button() {
		
		dashboard.LoginCredentials();

	    }

	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
		
		dashboard.HeaderValidation();
		
	}
	
	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() throws InterruptedException {
	    
	dashboard.TitleValidation();
	
	}
	
	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() throws InterruptedException {
		
		
		dashboard.LMS_TitleAlignment();
	}

	
	@Then("Admin should see program in the 1st place")
	public void admin_should_see_program_in_the_1st_place() {
	    
		dashboard.program_First_Place();
	}

	@And("Admin should see batch in the 2nd place")
	public void admin_should_see_batch_in_the_2nd_place() {
	    
		dashboard.batch_Second_Place();
	}

	@And("Admin should see user in the  3rd place")
	public void admin_should_see_user_in_the_3rd_place() {
	    
		dashboard.user_Third_Place();
	    
	}

	@And("Admin should see logout in the 4th place")
	public void admin_should_see_logout_in_the_4th_place() {
	    
		dashboard.logout_Fourth_Place();
	}

	@And("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
	    
		dashboard.click_Logout_Button();
		
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
	   
		dashboard.admin_Landslogin_page();
	}
	
	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
	    
   dashboard.spelling_navigation_Bartext();
		
		}
	
	@And("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
	    
      dashboard.spelling_Space_LMStitle();
	}

	@And("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	    
     dashboard.navigation_Bartext_Topright();
	
	}
	
	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
	    
		dashboard.default_Navigation_Time();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
	    
        dashboard.link_Broken();
	}
}
