package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewLoginPageObj {
	
	
	//public WebDriver driver;
	
	 private WebDriver driver;
	public NewLoginPageObj(WebDriver driver) {
		this.driver = driver;
	}
	  

//	public NewLoginPageObj(WebDriver driver) {
//
//		this.driver=driver;
//
//		PageFactory.initElements(driver, this);
//      }

	//@FindBy(id="username") public WebElement txtUsername;
	By txtUsername = By.id("username");
	//@FindBy(id="password") public WebElement txtPassword;
	By txtPassword = By.id("password");
	//@FindBy(xpath="//button[@type='submit']") public WebElement btnLogin;
	By btnLogin = By.xpath("//button[@type='submit']");
	
    //@FindBy(xpath="/html/body/app-root/app-header/mat-toolbar/span[1]") public WebElement titleCheck;
    By titleCheck  = By.xpath("/html/body/app-root/app-header/mat-toolbar/span[1]");
   By errorMessage = By.xpath("//mat-error[@id='errormessage']");
   By admin_Text = 	By.xpath("//p[text()='Please login to LMS application']");		
  By first_TextField = By.xpath("//mat-error[text()=' Please enter your user name ']");
  By second_TextField = By.xpath("//mat-error[text()=' Please enter your password ']");
  By userName = By.xpath("//input[@id='username']");
  By passWord = By.xpath("//input[@id='password']");
  
 //mat-error[text()=' Please enter your user name '] 
//mat-error[text()=' Please enter your password ']  
   
  
  public void setuser(String Username) {

		//txtUsername.sendKeys(Username);
		driver.findElement(txtUsername).sendKeys(Username);
}	

	public void setpassword(String Password) {
		
        // txtPassword.sendKeys(Password);	
		driver.findElement(txtPassword).sendKeys(Password);
}

	 public void clickloginbtn(){

		// btnLogin.click();
		 driver.findElement(btnLogin).click();
   }
	
	public void title_Verifivation() {
		
		WebElement title = driver.findElement(titleCheck);
		String actualTitle = title.getText() ;
		String expectedTitle= "LMS - Learning Management System";
		Assert.assertEquals(actualTitle, expectedTitle);
		System. out.println ("******Captured Title from the dashboard page: " +actualTitle);
      System.out.println("***Title Validation : DONE*****");
		
	}
	 public void error_Message() {
		 
		  WebElement errorMsg = driver.findElement(errorMessage);
			String actuaError = errorMsg.getText() ;
			String expectedError = "Invalid username and password Please try again";
			Assert.assertEquals(actuaError, expectedError);
			System. out.println ("****** Captured Error from the Home page: " +actuaError);
	      System.out.println("***Error Message Validation : DONE*****"); 
		 
		 
	 }
	 
	 public void admin_Page_Text() {
		           
		 WebElement text = driver.findElement(admin_Text);
			String actualText = text.getText() ;
			String expectedText = "Please login to LMS application";
			Assert.assertEquals(actualText, expectedText);
			System. out.println ("******Captured Title from the Admin page: " +actualText);
	      System.out.println("*** Admin page Text Validation : DONE*****");
		 
		 
	 }
	 
//	 public void two_Text_Field() throws InterruptedException {
//		 
//		 Thread.sleep(3000);
//		 
//		 WebElement textField1 = driver.findElement(first_TextField);
//			String actualtextField1 = textField1.getText() ;
//			String expectedtextField1 = " Please enter your user name ";
//			Assert.assertEquals(actualtextField1, expectedtextField1);
//			System. out.println ("******Captured First textField: " +actualtextField1);
//	      //System.out.println("*** Admin page Text Validation : DONE*****");
//			
//			 WebElement textField2 = driver.findElement(first_TextField);
//				String actualtextField2 = textField2.getText() ;
//				String expectedtextField2 = " Please enter your password ";
//				Assert.assertEquals(actualtextField2, expectedtextField2);
//				System. out.println ("******Captured Second textField: " +actualtextField2);
//	
//				System.out.println("*** Two text field Present : Validation DONE*****");
		 
	// }
	 
	 public void user_firstField() {
		                
		        driver.findElement(userName).clear();
		 WebElement userField = driver.findElement(userName);
			String actualUserField = userField.getText() ;
			//String expectedUserField = "User";
			//Assert.assertEquals(actualUserField, expectedUserField);
			System. out.println ("****** user present in the first text field: " +actualUserField);
		 
	 }
	 public void password_secondField() {
		 
		 driver.findElement(passWord).clear();
		 WebElement passwordField = driver.findElement(passWord);
			String actualPasswordField = passwordField.getText();
			//String expectedPasswordField = "Password";
		//	Assert.assertEquals(actualPasswordField, expectedPasswordField);
			System. out.println ("****** Password present in the second text field: " +actualPasswordField);
		 
		 
		 
	 }
}
