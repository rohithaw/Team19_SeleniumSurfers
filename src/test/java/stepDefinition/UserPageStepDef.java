package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class UserPageStepDef {
	
	public WebDriver driver;
	
	
	@Given("Logged on the LMS portal as admin")
	public void logged_on_the_lms_portal_as_admin() {
		
		System.setProperty("webdriver.chrome.driver","/Users/ark/Downloads/chromedriver");
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(opt);
	    driver.get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/");
    	driver.manage().window().maximize();

    	driver.findElement(By.id("username")).clear();
    	driver.findElement(By.id("username")).sendKeys("sdetorganizers@gmail.com");
    	
    	driver.findElement(By.id("password")).clear();
    	driver.findElement(By.id("password")).sendKeys("UIHackathon@02");
    
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@When("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
		
		String title= driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(false, null);
		
	  
	}

	@Then("Admin clicks User button from navigation bar")
	public void admin_clicks_user_button_from_navigation_bar() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='user']")).click();
	  
	}
	
	@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete() {
	   
		WebElement ColumnID=driver.findElement(By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]"));
		String actualtext= ColumnID.getText();
		System.out.println(actualtext);
		
	}

	@Then("Delete button on top left as Disabled")
	public void delete_button_on_top_left_as_disabled() {
	   
		
		
	}


}
