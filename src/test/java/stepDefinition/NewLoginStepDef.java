package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hooks.Baseclass;
import io.cucumber.java.en.*;

import pageObject.NewLoginPageObj;

import utilities.ExcelReader;

public class NewLoginStepDef extends Baseclass{
	
	WebDriver driver;
	//NewLoginPageObj lp;
	
//	 public NewLoginStepDef() {
//	    	this.driver = Baseclass.getDriver();
//		    }
	 
	 NewLoginPageObj
	 lp = new NewLoginPageObj(getDriver());
  @Given("User is on login page")
   public void user_is_on_login_page() {
    
		//lp = new NewLoginPageObj(driver);
	  System.out.println(" ****** User is in the Admin Page ****");
   }

  @When("User clicks on Login button with entering valid Username {string} and rownumber {int}")
  public void user_clicks_on_login_button_with_entering_valid_username_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
    
	 ExcelReader excelReader = new ExcelReader();
	 List<Map<String,String>> LoginData=
	 excelReader.getData("/Users/binoyvaliyaparambath/eclipse-workspace/Team19_SeleniumSurfers/Team19_SeleniumSurfers/src/test/resources/testData/SeleniumSurfersTestData 5.xlsx", SheetName);

	 String Username= LoginData.get(rowNumber).get("User");
	 String Password= LoginData.get(rowNumber).get("Password");

	 lp.setuser(Username);
	 lp.setpassword(Password);
	 lp.clickloginbtn(); 
	
 }

   @Then("User should land on home page")
   public void user_should_land_on_home_page() {
    
   lp.title_Verifivation();
  
}
   @When("User clicks on Login button with entering invalid Username {string} and rownumber {int}")
   public void user_clicks_on_login_button_with_entering_invalid_username_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
       
	 //  NewLoginPageObj lp1 = new NewLoginPageObj(driver);
	   lp = new NewLoginPageObj(getDriver());
	   
	   ExcelReader excelReader = new ExcelReader();
		 List<Map<String,String>> LoginData=
		 excelReader.getData("/Users/binoyvaliyaparambath/eclipse-workspace/Team19_SeleniumSurfers/Team19_SeleniumSurfers/src/test/resources/testData/SeleniumSurfersTestData 5.xlsx", SheetName);

		 String Username= LoginData.get(rowNumber).get("User");
		 String Password= LoginData.get(rowNumber).get("Password");

		 lp.setuser(Username);
		 lp.setpassword(Password);
		 //Thread.sleep(2000);
		 lp.clickloginbtn(); 
		 System.out.println(" *** Invald Values ****");
		 
   }

   @And("Admin enter value only in password and clicks login button")
   public void admin_enter_value_only_in_password_and_clicks_login_button(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
       
	   lp = new NewLoginPageObj(getDriver());
	   ExcelReader excelReader = new ExcelReader();
		 List<Map<String,String>> LoginData=
		 excelReader.getData("/Users/binoyvaliyaparambath/eclipse-workspace/Team19_SeleniumSurfers/Team19_SeleniumSurfers/src/test/resources/testData/SeleniumSurfersTestData 5.xlsx", SheetName);

		 String Username= LoginData.get(rowNumber).get("User");
		 String Password= LoginData.get(rowNumber).get("Password");

		// lp.setuser(Username);
		 lp.setpassword(Password);
		// Thread.sleep(2000);
		 lp.clickloginbtn(); 
   }

   @And("Admin enter value only in username and clicks login button")
   public void admin_enter_value_only_in_username_and_clicks_login_button(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
	   
	   lp = new NewLoginPageObj(getDriver());
	   ExcelReader excelReader = new ExcelReader();
		 List<Map<String,String>> LoginData=
		 excelReader.getData("/Users/binoyvaliyaparambath/eclipse-workspace/Team19_SeleniumSurfers/Team19_SeleniumSurfers/src/test/resources/testData/SeleniumSurfersTestData 5.xlsx", SheetName);

		 String Username= LoginData.get(rowNumber).get("User");
		 String Password= LoginData.get(rowNumber).get("Password");

		 lp.setuser(Username);
		 //lp.setpassword(Password);
		// Thread.sleep(2000);
		 lp.clickloginbtn();  
	   
   }

   @Then("Error message please check username\\/password")
   public void error_message_please_check_username_password() {
       
	  //lp.error_Message();
	   System.out.println("Error message appears");
   }
   
   @Then("Admin should see {string}")
   public void admin_should_see(String string) {
	   
   
        lp.admin_Page_Text();
   }

//   @And("Admin should see two text field")
//   public void admin_should_see_two_text_field() throws InterruptedException {
//      
//	   
//	   lp.two_Text_Field();
//   }

   @And("Admin should {string} in the first text field")
   public void admin_should_in_the_first_text_field(String string) {
	   
       lp.user_firstField();
   }

   @And("Admin should {string} in the second text field")
   public void admin_should_in_the_second_text_field(String string) {
      
  lp.password_secondField();
  
   }
   
	
}
