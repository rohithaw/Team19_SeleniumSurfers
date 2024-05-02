package pageObject;

import org.junit.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class UserManagePage {
	
	public WebDriver driver;
	//Actions action;
	private WebDriverWait wait;
	
	
	//Login Locators
	
	@FindBy(xpath = "//input[@id='username']") public WebElement usernameField;
	@FindBy(xpath = "//input[@id='password']") public WebElement passwordField;
	@FindBy(xpath = "//button[@id='login']") public WebElement loginbutton;
	@FindBy(xpath = "//button[@id='user']") public WebElement userbutton;
	
	// By usernameField= By.xpath("//input[@id='username']");
	// By passwordField=By.xpath("//input[@id='password']");
	// By loginbutton= By.xpath("//button[@id='login']");
	// By userbutton = By.xpath("//button[@id='user']");
	 
	 //Manage Page Validation Locators
	 
	@FindBy(xpath = "//div[text()=' Manage User']") public WebElement headerElement;
	@FindBy(xpath = "//div[@class='p-datatable-footer ng-star-inserted']") public WebElement FooterElement;
	@FindBy(xpath = "//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']") public WebElement Pagination ;
	@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple']") public WebElement PaginationNext ;
	@FindBy(xpath = "//button(@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']") public WebElement PaginationLast  ;
	@FindBy(xpath = "//button[@class='p-paginator-prev p-paginator-element p-link p-disabled p-ripple']") public WebElement PaginationPrev  ;
	@FindBy(xpath = "//button[@class='p-paginator-first p-paginator-element p-link p-disabled p-ripple ng-star-inserted']") public WebElement PaginationFirst  ;
	@FindBy(xpath = "//*[@id='filterGlobal']") public WebElement Searchtxt ;
	@FindBy(xpath = "//*[contains(text(),'Surfers')]") public WebElement SearchtxtValue ;
	@FindBy(xpath = "//button[@label='Assign Staff']") public WebElement AssignStaffBtn ;
	@FindBy(xpath = "//button[@label='Assign Student']") public WebElement AssignStudentBtn ;
	@FindBy(xpath = "//button[@label='Add New User']") public WebElement AddNewUserBtn ;
	
	
	//Column Data Tables Validation
	
	@FindBy(xpath = "//th[text()='ID ']") public WebElement ColID ;
	@FindBy(xpath = "//th[text()='Name ']") public WebElement ColName  ;
	@FindBy(xpath = "//th[text()='Location ']") public WebElement ColLoc  ;
	@FindBy(xpath = "//th[text()='Phone Number ']") public WebElement ColPhono  ;
	@FindBy(xpath = "//th[text()=' Edit / Delete']") public WebElement ColEditDel  ;
	@FindBy(xpath = "//div[@class='p-checkbox-box p-component']") public List<WebElement> CheckboxIcon ;
	
	
	//Edit and Delete Button (Single & Multiple)
	
	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']") public WebElement MultiDel  ;
	@FindBy(xpath = "//div[@class='p-checkbox-box p-component']") public WebElement ChckBox ;
	@FindBy(xpath = "//span[1][@class='p-button-icon pi pi-trash']") public List<WebElement> SingDel;
	@FindBy(xpath = "//div[@class='p-checkbox-box']") public WebElement MultiChckBox ;
	@FindBy(xpath = "//span[1][@class='p-button-icon pi pi-pencil']") public List<WebElement> Editbtn ;
	
	//User Add New Locators
	
	 @FindBy(xpath = "//button[@label='Add New User']") public WebElement NewUser ;
	 @FindBy(xpath = "//span[text()='User Details']") public WebElement userdetailpopup ;
	 @FindBy(xpath = "//input[@data-placeholder='First name']") public WebElement AddFirstname;
	 @FindBy(xpath = "//input[@data-placeholder='Middle name']") public WebElement AddMiddlename;
	 @FindBy(xpath = "//input[@data-placeholder='Last name']") public WebElement AddLastname;
	 @FindBy(xpath = "//input[@data-placeholder='Location']") public WebElement AddLocation;
	 @FindBy(xpath = "//input[@data-placeholder='Phone no']") public WebElement AddPhoneNumber;
	 @FindBy(xpath = "//input[@data-placeholder='LinkedIn Url']") public WebElement AddLinkdinURL;
	 @FindBy(xpath = "//input[@data-placeholder='Email address']") public WebElement AddEmailAddress;
	 @FindBy(xpath = "//input[@data-placeholder='Under Graduate']") public WebElement AddUndergraduate;
	 @FindBy(xpath = "//input[@data-placeholder='Post Graduate']") public WebElement AddPostgraduate;
	 @FindBy(xpath = "//input[@data-placeholder='Time Zone']") public WebElement AddTimezone;
     @FindBy(xpath = "//input[@data-placeholder='User Comments']") public WebElement AddUserComments;
	 @FindBy(xpath = "//span[text()='Select Role']") public WebElement UserRoleDropdown;
	 @FindBy(xpath = "//span[text()='R03']") public WebElement customoption;
	 @FindBy(xpath = "//span[text()='Select Role Status']") public WebElement UserRoleStatusDropdown;
	 @FindBy(xpath = "//span[text()='Active']") public WebElement customoption1;
	 @FindBy(xpath = "//span[text()='Select Visa Status']") public WebElement UserVisaStatusDropdown;
	 @FindBy(xpath = "//span[text()='H4-EAD']") public WebElement customoption2;
	 @FindBy(xpath = "//span[text()='Submit']") public WebElement SubmitBtn;
	 @FindBy(xpath = "//div[@role='alert']") public WebElement alrtmsg;
	 @FindBy(xpath = "//mat-error[text()='First name is ']") public WebElement firstnamedlg;
	 @FindBy(xpath = "//mat-error[text()='Middle name is ']") public WebElement middlenamedlg;
	 @FindBy(xpath = "//mat-error[text()='Last name is ']") public WebElement lastnamedlg;
	 @FindBy(xpath = "//mat-error[text()='Location is ']") public WebElement locdlg;
	 @FindBy(xpath = "//mat-error[text()='Phone number is ']") public WebElement phnodlg;
	 @FindBy(xpath = "//mat-error[text()='LinkedIn Url is ']") public WebElement linkurldlg;
	 @FindBy(xpath = "//mat-error[text()='Email address is ']") public WebElement emaildlg;
	 @FindBy(xpath = "//mat-error[text()='Under Graduate is ']") public WebElement ugdlg;
	 @FindBy(xpath = "//mat-error[text()='Post Graduate is ']") public WebElement pgdlg;
	 @FindBy(xpath = "//mat-error[text()='Time Zone is ']") public WebElement timezonedlg;
	 @FindBy(xpath = "//mat-error[text()='User Comments is ']") public WebElement usrcmtdlg;
	 @FindBy(xpath = "//span[text()='Cancel']") public WebElement usrcancel;

	
	
	 public UserManagePage (WebDriver driver) {
		 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	      
	   }
	 
	 public void clickcancel() {
		 
		 usrcancel.click();
	 }
	 
	 public void checkHeaderText() {
		 
	    	String actualHeaderText = headerElement.getText();   	
	        System.out.println("Debug: Header text found on page - " + actualHeaderText); 
	        Assert.assertEquals("Header text does not match", "Manage User", actualHeaderText);
	        
	    }
	 
	 public boolean isFooterDisplayed() {
		 
	        boolean footertxt = FooterElement.isDisplayed();
	        System.out.println("Debug: Footer is displayed: " + footertxt); 
	        return footertxt;
	 }
	 
	 public boolean isPaginationDisplayed() {
		 
	    	boolean isDisplayed = Pagination.isDisplayed();
	    	System.out.println("Debug: pagination is displayed: " + isDisplayed);
	        return isDisplayed;
	    }
	 
	  public void multipledeleteEnabled() {
		  
	       boolean isButtonEnabled = MultiDel.isEnabled();
	    
	       System.out.println("Is the delete button enabled? " + isButtonEnabled);
	       Assert.assertFalse("Multiple delete icon should be disabled", isButtonEnabled); 
       }
	  
	  public void deleteEnabled() {
		  boolean flagD = SingDel.stream().anyMatch(c -> c.isEnabled());
			int j = SingDel.size();
			System.out.println(j);
			System.out.println(flagD);
			System.out.println("Delete Icon is present in datatable"); 
	   }

	  
	  public void EditEnabled() {
	      
		  boolean flag = Editbtn.stream().anyMatch(c -> c.isEnabled());
			int i = Editbtn.size();
			System.out.println(i);
			System.out.println(flag);
			System.out.println("Edit Icon is present in datatable");
	     //  Assert.assertFalse("edit icon should be disabled", isButtonEnabled);   
	   }
	  
	  public void datatableheader()
	  {
		  String IDtext= ColID.getText();
		  System.out.println(IDtext);
		  String Nametext= ColName.getText();
		  System.out.println(Nametext);
		  String Loctext= ColLoc.getText();
		  System.out.println(Loctext);
		  String PhNotext= ColPhono.getText();
		  System.out.println(PhNotext);
		  String EditDeltext= ColEditDel.getText();
		  System.out.println(EditDeltext);
		  
	  }
	  
	  
	  public void NewUserBtn()
	  {
		  boolean User=AddNewUserBtn.isDisplayed();
			if(User)
			{
				System.out.println("NewUser Button is Displayed");
			}
			
			else
			{
				System.out.println("NewUser Button is Not Displayed");
			}
	  }
	  
	  public void NewAssignStuBtn()
	  {
		  boolean AssignStudent=AssignStudentBtn.isDisplayed();
			if(AssignStudent)
			{
				System.out.println("AssignStudent Button is Displayed");
			}
			
			else
			{
				System.out.println("AssignStudent Button is Not Displayed");
			}
	  }
	  
	  public void NewAssignStaffBtn() {
		  
	 
	  boolean AssignStaff=AssignStaffBtn.isDisplayed();
		if(AssignStaff)
		{
			System.out.println("AssignStaff Button is Displayed");
		}
		
		else
		{
			System.out.println("AssignStaff Button is Not Displayed");
		}
		
	  }
	  
	  
	  public void selectCheckBox() {
			for (int i = 0; i < CheckboxIcon.size(); i++) {
				CheckboxIcon.get(i).click();
				break;
			}
		}

		public void selectmultipleCheckBox() {
			
	
			for (int i = 0; i < CheckboxIcon.size(); i++) {
				while (i < 2) {
					CheckboxIcon.get(i).click();
				}
			}
		}
		
		public List<WebElement> hasCheckBox() {
	     	return CheckboxIcon;
		}
		
		public void searchtxt()
		{
			boolean Searchtxt1=Searchtxt.isDisplayed();
			if(Searchtxt1)
			{
				System.out.println("Searchtxt Field is Displayed");
			}
			
			else
			{
				System.out.println("Searchtxt Field is Not Displayed");
			}
		}
		
		public void searchtxtdisplayed() {
			
			Searchtxt.sendKeys("Selenium");
			String Value = SearchtxtValue.getText();
			Assert.assertEquals("Search Match", "Selenium Surefers testing", Value);	
			
		}
		
		public void ClickNewUser() {
			NewUser.click();
		}
		
		 public void userpopwindow() {
			 userdetailpopup.isDisplayed();
			 System.out.println("User details pop up window displayed");
			 }
		 
		 public void popupfielddisplay() {
			 
			 if(AddFirstname.isDisplayed()) {
			 System.out.println("Admin can see FirstName Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see FirstName Textbox");
			 }

		     if(AddMiddlename.isDisplayed()) {
			 System.out.println("Admin can see AddMiddlename Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddMiddlename Textbox");
			 }

			 if(AddLastname.isDisplayed()) {
			 System.out.println("Admin can see AddLastname Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddLastname Textbox");
			 }
			
			 if(AddLocation.isDisplayed()) {
			 System.out.println("Admin can see AddLocation Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddLocation Textbox");
			 }
			
			 if(AddPhoneNumber.isDisplayed()) {
			 System.out.println("Admin can see AddPhoneNumber Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddPhoneNumber Textbox");
			 }
			
			 if(AddLinkdinURL.isDisplayed()) {
			 System.out.println("Admin can see AddLinkdinURL Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddLinkdinURL Textbox");
			 }
			
			if(AddEmailAddress.isDisplayed()) {
			 System.out.println("Admin can see AddEmailAddress Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddEmailAddress Textbox");
			 }
			
			if(AddUndergraduate.isDisplayed()) {
			 System.out.println("Admin can see AddUndergraduate Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddUndergraduate Textbox");
			 }
			
			 if(AddPostgraduate.isDisplayed()) {
			 System.out.println("Admin can see AddPostgraduate Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddPostgraduate Textbox");
			 }
			
			 if(AddTimezone.isDisplayed()) {
			 System.out.println("Admin can see AddTimezone Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddTimezone Textbox");
			 }

			 if(AddUserComments.isDisplayed()) {
			 System.out.println("Admin can see AddUserComments Textbox");
			 }
			 else {
			 System.out.println("Admin cannot see AddUserComments Textbox");
			 }

		 }
		 
		 public void urroledropdownselect() {
			 
			 UserRoleDropdown.click();
		//action.moveToElement(UserRoleDropdown).click().build().perform();
	    customoption.click();
	    
		 }
		 
		 private void urrolestatusdropdownselect() {
			 UserRoleStatusDropdown.click();
			 //action.moveToElement(UserRoleDropdown).click().build().perform();
			 customoption1.click();
		 }
		 
		 private void urvisastatusdropdownselect() {
			 UserVisaStatusDropdown.click();
			// action.moveToElement(UserRoleDropdown).click().build().perform();
			customoption2.click();
		 }
		 
		 public void NewUserdetails(String Firstname,String Middlename,String Lastname,String Location,String Phoneno,String Linkedinurl,String Email,String Undergraduate,String postgraduate,String Timezone,String Usercommts)
		 {
			 AddFirstname.sendKeys(Firstname);
			 AddMiddlename.sendKeys(Middlename);
			 AddLastname.sendKeys(Lastname);
			 AddLocation.sendKeys(Location);
			 AddPhoneNumber.sendKeys(Phoneno);
			 AddLinkdinURL.sendKeys(Linkedinurl);
			 AddEmailAddress.sendKeys(Email);
			 AddUndergraduate.sendKeys(Undergraduate);
			 AddPostgraduate.sendKeys(postgraduate);
			 AddTimezone.sendKeys(Timezone);
			 AddUserComments.sendKeys(Usercommts);
			 urroledropdownselect();
			 urrolestatusdropdownselect();
			 urvisastatusdropdownselect();
			 
		 }
		 
		 public void EnterUserDetails() {
			
			 AddFirstname.sendKeys("");
			 AddMiddlename.sendKeys("");
			 AddLastname.sendKeys("");
			 AddLocation.sendKeys("");
			 AddPhoneNumber.sendKeys("");
			 AddLinkdinURL.sendKeys("");
			 AddEmailAddress.sendKeys("");
			 AddUndergraduate.sendKeys("");
			 AddPostgraduate.sendKeys("");
			 AddTimezone.sendKeys("");
			 AddUserComments.sendKeys(" ");
			
			 }
			 
		 public void NewuserSubmit() {
			 
			 SubmitBtn.click();
			 
		 }
	
	 public void alrtmsgpopup() {

		 String text=alrtmsg.getText();
		 System.out.println(text);
		 
		 } 
	 
	 public String firstnamefielderror() {
		 
		 if(firstnamedlg.isDisplayed()) {
			 System.out.println("Admin can see FirstName is required");
			 }
			 else {
			 System.out.println("Admin cannot see FirstName is required");
			 }
		 return firstnamedlg.getText();
	   }
     public  String  middlenamefielderror() {
    	 return middlenamedlg.getText();
     }
	   
     public String lastnamefielderror() {
    	 return lastnamedlg.getText();
     }
     public String locfieldeserror() {
    	 return locdlg.getText();
     }
     public String phnofielderror() {
    	 return phnodlg.getText();
     }
     
     public String linkurlfielderror() {
		   return linkurldlg.getText();
	   }
   public  String  emailfielderror() {
  	 return emaildlg.getText();
   }
	   
   public String ugfielderror() {
  	 return ugdlg.getText();
   }
   public String pgfieldeserror() {
  	 return pgdlg.getText();
   }
   public String timezonefielderror() {
  	 return timezonedlg.getText();
   }
   
   public String usrcmtsfielderror() {
	  	 return usrcmtdlg.getText();
	   }
	 
 }

