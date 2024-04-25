package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UserPage_Validation_Page {
	
	
	private WebDriver driver;
	
	
	//By Locators
	
	// @FindBy(xpath = "//a[@href='User']") public WebElement UserNavigation;
	@FindBy(xpath = "//span[text()=' LMS - Learning Management System ']") public  WebElement NavigationPageText;
	
	@FindBy(id="username")
	  @CacheLookup
	  WebElement txtUsername;
	
	
	@FindBy(id="password")
	  @CacheLookup
	  WebElement txtPassword;
	
	 @FindBy(xpath="//button[@type='submit']")
	  @CacheLookup
	  WebElement btnLogin;

}
