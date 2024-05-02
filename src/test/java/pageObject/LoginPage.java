package pageObject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.ExcelReader;

public class LoginPage {
	
	  public WebDriver driver;
	  

		public LoginPage (WebDriver driver) {

			this.driver=driver;

			PageFactory.initElements(driver, this);

		}

		@FindBy(id="username") public WebElement txtUsername;
		@FindBy(id="password") public WebElement txtPassword;
		@FindBy(xpath="//button[@type='submit']") public WebElement btnLogin;
		
		@FindBy (xpath="/html/body/app-root/app-login/div/div/img") WebElement Logo;
		@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement Header;
	
		@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement userpasslink;
		@FindBy (xpath="//*[@id=\"gbwa\"]/div/a") WebElement resetpasslink;
		@FindBy (xpath="/html/body") WebElement Screenshotmess;
		@FindBy (xpath="/html/body/div[3]") WebElement errormess;
        @FindBy (xpath="//*[@role='alert']") WebElement alertmsg;
        @FindBy (xpath = "//span[text()=\"User\"]") WebElement userFieldtxt;
        @FindBy (xpath = "//span[text()=\" *\"]") WebElement userastrik;
        @FindBy (xpath ="//span[text()=\"Password\"]") WebElement pwdFieldtxt;
      //  @FindBy (xpath = "//*[@id=\"mat-form-field-label-11\"]/span[2]") WebElement pwdastrik;
        @FindBy (xpath = "//p[text()=\"Please login to LMS application\"]") WebElement LoginTitle;
		
		public void setuser (String Username) {

			txtUsername.sendKeys(Username);	

		}	
		
		public void logindisplayed() {
			
			btnLogin.isDisplayed();
		}

		public void setpassword (String Password) {

			txtPassword.sendKeys(Password);	

		}

		 public void clickloginbtn (){

			 btnLogin.click();

		}
		 
		 public String open_loginpage()

		 {
		 	return driver.getTitle();
		 	
		 	
		 }
		 public String dashboard_Title()
		 {
		 	return driver.getTitle();
		 }
		 
		 public String errormess_capture() throws IOException
		 {
		 String mess=errormess.getText();
		 	
		 	
		 	//String mesg = msgs.getText();
		 	//Assert.assertEquals(mesg, msg);
		 	TakesScreenshot ts = (TakesScreenshot) Screenshotmess;
		 	File src = ts.getScreenshotAs(OutputType.FILE);
		 	File src1 = ((TakesScreenshot) Screenshotmess).getScreenshotAs(OutputType.FILE);
		 	Date dt = new Date();
		 	DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		 	File trg = new File(".\\Screenshots\\image.png");
		 	FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
		 	return mess;
		 }

		 public void valid_user_details(String user1) 
		 {
			 txtUsername.sendKeys(user1);
			 btnLogin.click();
		 	
		 	
		 	
		 }

		 public void valid_pass_details(String pass1) 
		 {
			 txtPassword.sendKeys(pass1);
			 btnLogin.click();
		 	
		 	 	
		 }
		 
		 public void Usrerrpop() {
			 
			 String InValidText = alertmsg.getText();
				System.out.println(InValidText);
				//Assert.assertEquals("Invalid Username and Password", alert);
			 
		 }
		 
		 public void usertxtastrikchk() {
			 
			 userFieldtxt.isDisplayed();
			 userastrik.isDisplayed();
		 }
		 
 public void pwdtxtastrikchk() {
			 
	         pwdFieldtxt.isDisplayed();
			 userastrik.isDisplayed();
		 }
 
 public void ChckLogo() {
	 
	 Boolean logoimg=Logo.isDisplayed();
	 System.out.println(logoimg);
	 String logotxt = Logo.getText();
	 System.out.println(logotxt);
 }
 
 public void LMS_TitleAlignmentlp() throws InterruptedException {
	 
	 Thread.sleep(2000);
	
	 
	 String actualtitle_alignment = Logo.getCssValue("text-align");
     System.out.println("***** Text alignment: " + actualtitle_alignment);
     String expectedtitle_alignment= "top left";
        
        System.out.println("**** Assertion Failed ******");
		Assert.assertEquals(actualtitle_alignment, expectedtitle_alignment);
	 
     }
 
 public void chkloginTitle() {
	 
	 String title= LoginTitle.getText();
	 System.out.println(title);
 }
 
   public void colorfield() {
	   
	 String usrcolor=txtUsername.getCssValue("color");
	 System.out.print(usrcolor);
//	 String usrbgcolor=txtUsername.getCssValue("background-color");
//	 System.out.print(usrbgcolor);
	 String pwdcolor=txtPassword.getCssValue("color");
	 System.out.print(pwdcolor);
   }
  
    
 }

