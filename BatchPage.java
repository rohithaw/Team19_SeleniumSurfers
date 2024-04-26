package pageObject;


import org.junit.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;



public class BatchPage {
	
	public WebDriver driver;
	   private WebDriverWait wait;
	 // private Map<String, By> elements = new HashMap<>();
	 // private Map<String, By> elements;
	
	 By usernameField= By.xpath("//input[@id='username']");
	 By passwordField=By.xpath("//input[@id='password']");
	 By loginbutton= By.xpath("//button[@id='login']");
	 By batchbutton =By.xpath("//button[@id='batch']");
	 By headerElement =By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-title[1]/div[1]");
     By FooterElement=By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[2]/div[1]");
			 
	 By pagination= By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]"); 
	 By  multipleDeleteButton= 
			 By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-title[1]/div[2]/div[1]/button[1]");
	 By DeleteButton =By.xpath("//tbody/tr[1]/td[7]/div[1]/span[1]/button[1]");
	 By EditButton =By.xpath("//tbody/tr[1]/td[7]/div[1]/span[1]/button[1]/span[1]");
	By newbatchbutton=By.xpath("//button[@id='new']");
    By batchname= By.xpath("//input[@id='batchName']");
	
    By Description =By.xpath("//input[@id='batchDescription']")	;
	By programdropdown=By.xpath("//div[@role='button']");
	By statusradioactive=By.xpath("//div[@class=\"p-radiobutton-box\"]");
	By statusradioinactive=By.xpath("//div[@class=\"p-radiobutton p-component p-radiobutton-checked\"]");
	By noofclasses=By.xpath("//input[@id='batchNoOfClasses']");
	
    By batchsavebutton=By.xpath("");
	By batchcancelbutton=By.xpath("");
	By nameField = By.id("batchName");
	By numberOfClassesField = By.id("batchNoOfClasses");
	By descriptionField = By.id("batchDescription");
	By programDropdown = By.id("programName");
	By statusRadioActive = By.xpath("//body//app-root//div[@role='dialog']//div//div[2]//p-radiobutton[1]//div[1]//div[2]");
	By statusRadioInactive = By.xpath("//div[contains(text(),'INACTIVE')]//div[2]");
	By errorMessage = By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/small[1]");

	
	
	
	  public BatchPage (WebDriver driver) {
	       this.driver = driver;
	       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      // elements = new HashMap<>();
	       // initializeElements();
	      
	   }
	
	   public void login(String username, String password) {
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(loginbutton).click();
	    }

	    public void navigateToBatchPage() {
	        driver.findElement(batchbutton).click();
	    }

	    public void checkHeaderText() {
	    	String actualHeaderText = driver.findElement(headerElement).getText();
	    	
	        System.out.println("Debug: Header text found on page - " + actualHeaderText); 
	        Assert.assertEquals("Header text does not match", "Manage Batch", actualHeaderText);
	        
	    }
	    
	        
	    public boolean isFooterDisplayed() {
	        boolean isDisplayed = driver.findElement(FooterElement).isDisplayed();
	        System.out.println("Debug: Footer is displayed: " + isDisplayed); 
	        return isDisplayed;
	    }

	    public boolean isPaginationDisplayed() {
	    	boolean isDisplayed = driver.findElement(pagination).isDisplayed();
	    	System.out.println("Debug: pagination is displayed: " + isDisplayed);
	        return driver.findElement(pagination).isDisplayed();
	    }
	    
	   public void multipledeleteEnabled() {
	       boolean isButtonEnabled = driver.findElement(multipleDeleteButton).isEnabled();
	    
	       System.out.println("Is the delete button enabled? " + isButtonEnabled);
	       Assert.assertFalse("Multiple delete icon should be disabled", isButtonEnabled); 
	    }
	   public void deleteEnabled() {
	       boolean isButtonEnabled = driver.findElement(DeleteButton).isEnabled();
	    
	       System.out.println("Is the delete button enabled? " + isButtonEnabled);
	       Assert.assertFalse("delete icon should be disabled", isButtonEnabled);   
	   }
	   public void EditEnabled() {
	       boolean isButtonEnabled = driver.findElement(EditButton).isEnabled();
	    
	       System.out.println("Is the edit button enabled? " + isButtonEnabled);
	       Assert.assertFalse("edit icon should be disabled", isButtonEnabled);   
	   }
	    
	   public void newbatchicon() {	    
		  wait.until(ExpectedConditions.elementToBeClickable(newbatchbutton));
		    
		  driver.findElement(newbatchbutton).click();
	   }
	  
	   public void validatebatchpopup() {
		    // Validate text boxes are present and visible
		    try {
		        WebElement nameTextbox = driver.findElement(nameField);
		        System.out.println("Debug: 'Name' text box is present.");
		        Assert.assertTrue("Name text box is missing", nameTextbox.isDisplayed());
		    } catch (NoSuchElementException e) {
		        System.out.println("Error: 'Name' text box not found.");
		    }

		    try {
		        WebElement numberOfClassesTextbox = driver.findElement(numberOfClassesField);
		        System.out.println("Debug: 'Number of Classes' text box is present.");
		        Assert.assertTrue("Number of Classes text box is missing", numberOfClassesTextbox.isDisplayed());
		    } catch (NoSuchElementException e) {
		        System.out.println("Error: 'Number of Classes' text box not found.");
		    }

		    try {
		        WebElement descriptionTextbox = driver.findElement(descriptionField);
		        System.out.println("Debug: 'Description' text box is present.");
		        Assert.assertTrue("Description text box is missing", descriptionTextbox.isDisplayed());
		    } catch (NoSuchElementException e) {
		        System.out.println("Error: 'Description' text box not found.");
		    }

		    // Validating dropdown is present and visible
		    try {
		        WebElement programDropdownElement = driver.findElement(programDropdown);
		        System.out.println("Debug: 'Program Name' dropdown is present.");
		        Assert.assertTrue("Program Name dropdown is missing", programDropdownElement.isDisplayed());
		    } catch (NoSuchElementException e) {
		        System.out.println("Error: 'Program Name' dropdown not found.");
		    }

		        
		        // Validating Active radio button
		        try {
		            WebElement statusActiveRadioButton = driver.findElement(statusRadioActive);
		            System.out.println("Debug: 'Status: Active' radio button is present.");
		            Assert.assertTrue("Status Active radio button is missing", statusActiveRadioButton.isDisplayed());
		        } catch (NoSuchElementException e) {
		            System.out.println("Error: 'Status: Active' radio button not found.");
		        }

		        // Validating Inactive radio button
		        try {
		            WebElement statusInactiveRadioButton = driver.findElement(statusRadioInactive);
		            System.out.println("Debug: 'Status: Inactive' radio button is present.");
		            Assert.assertTrue("Status Inactive radio button is missing", statusInactiveRadioButton.isDisplayed());
		        } catch (NoSuchElementException e) {
		            System.out.println("Error: 'Status: Inactive' radio button not found.");
		        }
		    }

	   public void Alertmessage() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String alertMessage = alert.getText();
			System.out.println("Alert message: " + alertMessage);
			alert.accept(); 	
			
		}
	   
	   public String getErrorMessage() {
		   
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    try {
		       
		        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
		        return errorMessageElement.getText();
		    } catch (TimeoutException e) {
		        return null; 
		    }
		}

	   
	    
}