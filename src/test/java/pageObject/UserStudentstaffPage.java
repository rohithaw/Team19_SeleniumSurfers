package pageObject;

import java.sql.Driver;
import java.util.List;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStudentstaffPage {
	
	 WebDriver driver;
	 private WebDriverWait wait;
	 
	
	
	 By usernameField= By.xpath("//input[@id='username']");
	 By passwordField=By.xpath("//input[@id='password']");
	 By loginbutton= By.xpath("//button[@id='login']");

	//User page
	public static By user = By.cssSelector("#user > span.mat-button-wrapper");
	
	//Assign Student
		 public static By assignStudent = By.xpath("//button[@label='Assign Student']");
		 public static By assignPopUp = By.xpath("//span[1][text()='Assign Student']");
		 public static By userRole = By.xpath("//input[@name='roleId']");
		 public static By selectEmailId = By.xpath("//span[text()='Select Email Id']");
		 public static By programName = By.xpath("//*[@id='programName']/div/div[2]");
		 public static By batchName = By.xpath("//*[@id='batchName']");
		 public static By activeButton = By.xpath("//div[contains(text(),'Active')]//div[2]");
		 public static By inactiveButton = By.xpath("//div[contains(text(),'Inactive')]//div[2]");
		 public static By saveButton = By.xpath("//span[text()='Save']");
		 public static By cancelButton = By.xpath("//span[text()='Cancel']");
		 public static By assignCloseButton = By.xpath("//*[@class ='p-dialog-header-close-icon ng-tns-c132-8 pi pi-times']");
		 
		 public static By emailMsg = By.xpath("//div[normalize-space()='Email Id is required.']");

		 public static	By progNaMsg = By.xpath("//div[normalize-space()='Program Name is required.']");

		 public static	By batNaMsg = By.xpath("//div[normalize-space()='Batch Name is required.']");

		 public static	By statusReq = By.xpath("//div[normalize-space()='Status is required.']");

		 public static	By failedMsg = By.xpath("//div[@class='p-toast-summary ng-tns-c90-79']");
		 
		 
		//Assign Staff  Save,Cancel,Active ,Inactive  X-path is same as Assign Student
		 public static By  assignStaff = By.xpath("//*[text() ='Assign Staff']");
		 public static By assignStaffPopUp = By.xpath("//div[text()='Assign User']");
		 public static By  staffEmailId = By.xpath("//*[@id='userId']/div/span");
		 public static By  assStaffProgName = By.xpath("//*[@id='programName']/div/span");
		 public static By assStaffBatchName = By.xpath("//*[@id='batchName']/div/div[2]/div");
		 By UserDeleteButton =By.xpath("//tbody/tr[1]/td[7]/div[1]/span[2]/button[1]");
		 
		 
		//Delete User and Delete Multiple User
		public static By delete =By.xpath("//*[@class='p-button-icon pi pi-trash']");
	    public static By checkBox =By.xpath("//*[@class='p-checkbox-box']");
	    public static By totaluser = By.xpath("//*[@class ='p-datatable-footer ng-star-inserted']");
	    public static By yesButton = By.xpath("//*[@class ='p-datatable-footer ng-star-inserted']");
	    public static By Nobutton = By.xpath("//*[@class ='p-datatable-footer ng-star-inserted']");
	    public static By closeButton = By.xpath("//*[@class ='p-datatable-footer ng-star-inserted']");
	    
	    By usernobutton=
	    		  By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[1]");
	    By useryesbutton =
	    		  By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[2]");
		By searchinput = By.xpath("//input[@id='filterGlobal']");
	    
	  
	    
	    
	    public UserStudentstaffPage (WebDriver driver) {
	    	
	    	this.driver=driver;

			PageFactory.initElements(driver, this);
			

		   }
	    
	    public void setusername(String username) {
	    	
	    	driver.findElement(usernameField).sendKeys(username);	
	    	
	    }
	    
 public void setPassword(String password) {
	    	
	    	driver.findElement(passwordField).sendKeys(password);	
	    	
	    }
 
     public void clicksubmit() {
 	
 	driver.findElement(loginbutton).click();;	
 	
 }
     
     public void clickuser() {
    	 	
    	 	driver.findElement(user).click();;	
    	 	
    	 }
     
     public void clickAssignStud() {
 	 	
 	 	driver.findElement(assignStudent).click();;	
 	 	
 	 }
     
     public void clickAssignStaff() {
 	 	
 	 	driver.findElement(assignStaff).click();;	
 	 	
 	 }
     public void clickAssignpop() {
  	 	
  	 	driver.findElement(assignPopUp).isDisplayed();	
  	 	
  	 }
     
     public void clickAssignStaffpop() {
   	 	
   	 	driver.findElement(assignStaffPopUp).isDisplayed();	
   	 	
   	 }
     
     public void clickAssigSave() {
   	 	
   	 	driver.findElement(saveButton).click();;	
   	 	
   	 }
     
     public void clickInactive() {
    	 	
    	 	driver.findElement(inactiveButton).click();;	
    	 	
    	 }
     
     public void clickActive() {
 	 	
 	 	driver.findElement(activeButton).click();;	
 	 	
 	 }
     public void clickCancel() {
  	 	
  	 	driver.findElement(cancelButton).click();;	
  	 	
  	 }
	   	
	    public void getErrorEmailMsg() {

			String errorMsg= "User Email Id is required.";
			String actualMsg= driver.findElement(emailMsg).getText();
			System.out.println(actualMsg);
			Assert.assertEquals(errorMsg, actualMsg);

	    }
	    
	    public void getStaffemailIdErrorMessage() {

			String errorMsg= "Email Id is required.";
			String actualMsg= driver.findElement(emailMsg).getText();
			System.out.println(actualMsg);
			Assert.assertEquals(errorMsg, actualMsg);

	    }

		public void getErrorProgramNameMsg() {
        
			String errorMsg= "Program Name is required.";
            String actualMsg= driver.findElement(progNaMsg).getText();
			System.out.println(actualMsg);
			Assert.assertEquals(errorMsg, actualMsg);

	    }

		public void getErrorBatchMsg() {

			String errorMsg= "Batch Name is required.";
			String actualMsg= driver.findElement(batNaMsg).getText();
			System.out.println(actualMsg);
			Assert.assertEquals(errorMsg, actualMsg);

	    }

		public void getErrorStatusMsg() {

			String errorMsg= "Status is required.";
			String actualMsg= driver.findElement(statusReq).getText();
            System.out.println(actualMsg);
			Assert.assertEquals(errorMsg, actualMsg);

	    }
		public void selectStudEmailID() {

			driver.findElement(selectEmailId).click();
			
			
			 
		}
//		
//		public void selectProgramName() {
//
//			driver.findElement(programName).click();
//			 WebElement dropdownElement = driver.findElement(By.id("Java12"));
//			 Select dropdown = new Select(dropdownElement);
//			 dropdown.selectByVisibleText("Java12");
			 
			 
			 public void selectProgramName() {
			        WebElement dropdownElement = driver.findElement(programName);
			        dropdownElement.click();  // Open the dropdown

			        try {
			            Thread.sleep(2000); // Wait for 2 seconds for the dropdown to fully open
			        } catch (InterruptedException e) {
			            Thread.currentThread().interrupt();
			        }

			  WebElement customoption = driver.findElement(By.xpath("//li[@role='option']"));
			  customoption.click();
		}
		
		public void selectBatchName() {

			driver.findElement(batchName).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/input")).sendKeys("batch");
			driver.findElement(By.xpath("/html/body/div/div[2]/ul/p-multiselectitem[1]/li/div/div")).isSelected();
			 
		}
		public void selectStaffEmailId() {

			 driver.findElement(staffEmailId).click();
			 driver.findElement(By.xpath("//li[@role=\"option\"]")).click();
			 
						 
		}
			 
		
		
		public void failedMessage() {
			// WebDriverWait wait = new WebDriverWait(driver, 10);
		      //  wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert = driver.switchTo().alert();
			 String alertMessage = alert.getText();
		        System.out.println("Alert Message: " + alertMessage);
			
		}
		
		public void sucessMessage() {
			
			Alert successMessage = driver.switchTo().alert(); ;
			String message = successMessage .getText();
	        System.out.println("Success Message: " + message);
			
		}	
		
//		public void singleDeleteAction() {
//		    List<WebElement> rows = driver.findElements(rowlocator);
//		    if (!rows.isEmpty()) {
//		        //first row checkbox
//		        WebElement firstCheckbox = rows.get(0).findElement(CheckboxIcon);
//		        if(firstCheckbox.isEnabled() && firstCheckbox.isDisplayed()) {
//		            firstCheckbox.click();
//		        } else {
//		            System.out.println("Checkbox is not clickable");
//		            return; 
//		        }
//
//		      //delete of first row
//		        WebElement firstDeleteButton = rows.get(0).findElement(DeleteButton);
//		        if(firstDeleteButton.isEnabled() && firstDeleteButton.isDisplayed()) {
//		            firstDeleteButton.click();
//		        } else {
//		            System.out.println("Delete button is not clickable");
//		            return; 
//		        }
//
//		      // yes popup
//		        WebElement yesButton = driver.findElement(yesbutton);
//		        if(yesButton.isEnabled() && yesButton.isDisplayed()) {
//		            yesButton.click();
//		            System.out.println("Single delete performed and confirmed.");
//		        } else {
//		            System.out.println("Confirmation button is not clickable");
//		        }
//		    } else {
//		        System.out.println("No rows found");
//		    }
//		}
//		
//		public void multipleDeleteAction() {
//		    // Finds all rows.
//		    List<WebElement> rows = driver.findElements(rowlocator);
//		    
//		
//		    boolean isAnyCheckboxSelected = false;
//
//		  
//		    for (WebElement row : rows) {
//		        WebElement checkbox = row.findElement(CheckboxIcon);
//		        checkbox.click();
//		        isAnyCheckboxSelected = true;
//		    }
//
//		    if (isAnyCheckboxSelected) {
//		        // Wait for the delete button to become clickable after checkboxes are selected.
//		        WebElement deleteButton = new  WebDriverWait(driver, Duration.ofSeconds(10))
//		                                  .until(ExpectedConditions.elementToBeClickable(multipleDeleteButton));
//		        
//		        deleteButton.click();
//
//		        // Confirm the delete action in the popup.
//		        WebElement yesButton = new   WebDriverWait(driver, Duration.ofSeconds(10))
//		                               .until(ExpectedConditions.elementToBeClickable(yesbutton));
//		        yesButton.click();
//
//		        System.out.println("Multiple delete performed and confirmed.");
//		    } else {
//		        System.out.println("No checkboxes were selected.");
//		    }
//		}
		public void userfieldvalid() {
			
			
		Boolean userRole = driver.findElement(UserStudentstaffPage.userRole).isDisplayed();
		Assert.assertEquals(true, userRole);
		Boolean selectEmailId = driver.findElement(UserStudentstaffPage.selectEmailId).isDisplayed();
		Assert.assertEquals(true, selectEmailId);
		Boolean programName = driver.findElement(UserStudentstaffPage.programName).isDisplayed();
		Assert.assertEquals(true, programName);
		Boolean batchName = driver.findElement(UserStudentstaffPage.batchName).isDisplayed();
		Assert.assertEquals(true, batchName);
		Boolean activeButton = driver.findElement(UserStudentstaffPage.activeButton).isDisplayed();
		Assert.assertEquals(true, activeButton);
		Boolean inactiveButton = driver.findElement(UserStudentstaffPage.inactiveButton).isDisplayed();
		Assert.assertEquals(true, inactiveButton);
		Boolean saveButton = driver.findElement(UserStudentstaffPage.saveButton).isDisplayed();
		Assert.assertEquals(true, saveButton);
		Boolean cancelButton = driver.findElement(UserStudentstaffPage.cancelButton).isDisplayed();
		Assert.assertEquals(true, cancelButton);
		Boolean assignCloseButton = driver.findElement(UserStudentstaffPage.assignCloseButton).isDisplayed();
		Assert.assertEquals(true, assignCloseButton);
		}
		
		  public void usrdelete() {
          	driver.findElement(UserDeleteButton).click();
          }
		  
		  public void usrnodelete(){
          	driver.findElement(usernobutton).click();
          }
          public void usryesdelete(){
          	driver.findElement(useryesbutton).click();
          }
          
          public boolean searchAndCheckUserPresence(String UsrName) {
              
              WebElement searchBox = driver.findElement(searchinput);
              searchBox.clear();
              searchBox.sendKeys("Sel");

              
             // searchBox.sendKeys(Keys.RETURN);  
              
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]")));

              // Check if the batch is present in the search results
              List<WebElement> UserNames = driver.findElements(By.xpath("//table[@id='UserTable']//tr/td[1]")); // Checking the first column for batch names
              for (WebElement nameElement : UserNames) {
                  if (nameElement.getText().trim().equals(UserNames)) {
                      return true;
                  }
              }
              return false;
          }
		
		

}
		
