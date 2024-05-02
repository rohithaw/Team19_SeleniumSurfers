package pageObject;
import org.junit.Assert;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.DriverFactory;

public class BatchPage extends DriverFactory{
	
 public WebDriver driver;
 private WebDriverWait wait;
	 
	   
	//locators for login
	 By usernameField= By.xpath("//input[@id='username']");
	 By passwordField=By.xpath("//input[@id='password']");
	 By loginbutton= By.xpath("//button[@id='login']");
	 
	 
	 //manage page validation locators
	 By batchbutton =By.xpath("//button[@id='batch']");
	 By headerElement =By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-title[1]/div[1]");
     By FooterElement=By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[2]/div[1]");
     By pagination= By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/p-paginator[1]/div[1]"); 
	 By  multipleDeleteButton= 
			 By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-title[1]/div[2]/div[1]/button[1]");
	 
	 
	 //delete,edit,search,checkbox
	 By DeleteButton =By.xpath("//tbody/tr[1]/td[7]/div[1]/span[2]/button[1]");
	 By EditButton =By.xpath("//tbody/tr[1]/td[7]/div[1]/span[1]/button[1]/span[1]");
	 
	// By checkbox =By.xpath("//p-tableheadercheckbox/div[1]/div[2]");
	 //By checkbox=By.xpath = ("//div[@class='p-checkbox-box p-component']") public List<WebElement> CheckboxIcon ;
    By CheckboxIcon = By.xpath("//div[@class='p-checkbox-box p-component']");
	By searchinput = By.xpath("//input[@id='filterGlobal']");
    By rowlocator=By.xpath("//p-table//table/tbody/tr");
    // private By sort =By.xpath("//thead/tr[1]/th[2]/p-sorticon[1]/i[1]");
	 //locators for datatable header
	 By batchnameheader=By.xpath("//thead/tr[1]/th[2]");
	 By batchdescriptionheader=By.xpath("//thead/tr[1]/th[3]");
	 By batchdestatusheader=By.xpath("//thead/tr[1]/th[4]");
	 By batchclassesheader=By.xpath("//thead/tr[1]/th[5]");
	 By batchpgmnameheader=By.xpath("//thead/tr[1]/th[6]");
	 By batchdeeditdeleteheader=By.xpath("//thead/tr[1]/th[7]");
	 
	 //locators creation of batch popup input
	private By newbatchbutton=By.xpath("//button[@id='new']");
    private By batchname= By.xpath("//input[@id='batchName']");
    private By Description =By.xpath("//input[@id='batchDescription']")	;
	private By programdropdown=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/p-dropdown[1]/div[1]/div[2]");
	private By statusradioactive=By.xpath("//div[@class=\"p-radiobutton-box\"]");
	private By statusradioinactive=By.xpath("//div[@class=\"p-radiobutton p-component p-radiobutton-checked\"]");
	private By noofclasses=By.xpath("//input[@id='batchNoOfClasses']");
    private By batchsavebutton=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[3]/button[2]");
	private By batchcancelbutton=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[3]/button[1]");
	private By alertmsg =By.xpath("//div[@role='alert']");
	//error locators
	//By programNameError = By.xpath("//small[normalize-space()='Program Name is required.']");
    //By batchNameError = By.xpath("//small[normalize-space()='Batch Name is required.']");
    //By batchDescriptionError = By.xpath("//small[normalize-space()='Batch Description is required.']");
    //By statusError = By.xpath("//div[@class='p-field ng-star-inserted']//small[@id='text-danger']");
    //By noOfClassesError = By.id("text-danger");
 //locators for the error message field 
    
    By namefielderror=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[1]/small[1]");
	By descriptionerror=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/small[1]");
	By programerror=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/small[1]");
	By statuserror=By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/small[1]");
	By noofclasseserror=By.xpath("//*[@id=\"text-danger\"]");
    By Batchexistfielderror = By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[1]");
	By nameField = By.id("batchName");
	By numberOfClassesField = By.id("batchNoOfClasses");
	By descriptionField = By.id("batchDescription");
	By programDropdown = By.id("programName");
	By statusRadioActive = By.xpath("//body//app-root//div[@role='dialog']//div//div[2]//p-radiobutton[1]//div[1]//div[2]");
	By statusRadioInactive = By.xpath("//div[contains(text(),'INACTIVE')]//div[2]");
	By errorMessage = By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/small[1]");
    By clearbatchDescErr= By.xpath("//*[text()=\"This field should start with an alphabet and min 2 character.\"]");
	//delete validation
	By yeslabel= By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[2]/span[2]");
	By Nolabel= By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[1]/span[2]");
	By yesbutton =
	  By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[2]");
	By nobutton=
	  By.xpath("//body/app-root[1]/app-batch[1]/p-confirmdialog[1]/div[1]/div[1]/div[3]/button[1]");
	
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
	    public void datatableHeaderText() {
	        
	        String header1 = normalizeHeader(driver.findElement(batchnameheader).getText());
	        String header2 = normalizeHeader(driver.findElement(batchdescriptionheader).getText());
	        String header3 = normalizeHeader(driver.findElement(batchdestatusheader).getText());
	        String header4 = normalizeHeader(driver.findElement(batchclassesheader).getText());
	        String header5 = normalizeHeader(driver.findElement(batchpgmnameheader).getText());
	        String header6 = normalizeHeader(driver.findElement(batchdeeditdeleteheader).getText());

	        
	        String actualHeaderText = header1 + " " + header2 + " " + header3 + " " + header4 + " " + header5 + " " + header6;
            String expectedHeaderText = normalizeHeader("Batch name Batch Description Batch Status No. of classes Program Name Edit/Delete");
            Assert.assertEquals("Datatable header text does not match", expectedHeaderText, actualHeaderText);
	    }

	    private String normalizeHeader(String headerText) {
	        
	        headerText = headerText.replace("/", " / ").replaceAll("\\s+", " ").trim();
	        
	        return headerText.replace(".", "").toLowerCase().trim();
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
	   
	   
	
	    
	   public void checkTableElements() {
		    
		    List<WebElement> rows = driver.findElements(rowlocator);
            for (WebElement row : rows) {
		       
		        WebElement checkbox = row.findElement(CheckboxIcon);
		        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed() + " and enabled: " + checkbox.isEnabled());
		        
		        WebElement editButton = row.findElement(EditButton);
		        System.out.println("Edit button is displayed: " + editButton.isDisplayed() + " and enabled: " + editButton.isEnabled());

		        
		        WebElement deleteButton = row.findElement(DeleteButton);
		        System.out.println("Delete button is displayed: " + deleteButton.isDisplayed() + " and enabled: " + deleteButton.isEnabled());
		    }
		}
	   
	   public void newbatchicon() {	    
			  wait.until(ExpectedConditions.elementToBeClickable(newbatchbutton));
			    
			  driver.findElement(newbatchbutton).click();
		   }
		  
	   
	
	   public void validatebatchpopup() {
		    // Validating text boxes are present and visible
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

	  
		            public void delete() {
		            	driver.findElement(DeleteButton).click();
		            }
		            
		            public void editclick() {
		            	driver.findElement(EditButton).click();
		            }
		            
		            public void nodelete(){
		            	driver.findElement(nobutton).click();
		            }
		            public void yesdelete(){
		            	driver.findElement(yesbutton).click();
		            }
		            
		            
		            public boolean isPopupDisplayedCorrectly() {
		                try {
		                 
		                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		                    
		                
		                    WebElement yesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(yeslabel));
		                    System.out.println("Yes Button is displayed: " + yesButton.isDisplayed());

		                
		                    WebElement noButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Nolabel));
		                    System.out.println("No Button is displayed: " + noButton.isDisplayed());

		                    
		                    return yesButton.isDisplayed() && noButton.isDisplayed();
		                } catch (Exception e) {
		                  
		                    System.out.println("Error verifying popup buttons: " + e.getMessage());
		                    return false;
		                }
		            }

		            public boolean searchAndCheckBatchPresence(String batchName) {
		                
		                WebElement searchBox = driver.findElement(searchinput);
		                searchBox.clear();
		                searchBox.sendKeys("B01");

		                
		               // searchBox.sendKeys(Keys.RETURN);  
		                
		                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-batch[1]/div[1]/mat-card[1]")));

		                // Check if the batch is present in the search results
		                List<WebElement> batchNames = driver.findElements(By.xpath("//table[@id='batchTable']//tr/td[1]")); // Checking the first column for batch names
		                for (WebElement nameElement : batchNames) {
		                    if (nameElement.getText().trim().equals(batchName)) {
		                        return true;
		                    }
		                }
		                return false;
		            }

		  
	   public void alertMsgPopup() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            WebElement alrtmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
	            String text = alrtmsg.getText();
	            System.out.println(text);
	        } catch (Exception e) {
	            System.out.println("Alert message not found: " + e.getMessage());
	        }
	    }
    	 
	   
	   public void singleDeleteAction() {
		    List<WebElement> rows = driver.findElements(rowlocator);
		    if (!rows.isEmpty()) {
		        //first row checkbox
		        WebElement firstCheckbox = rows.get(0).findElement(CheckboxIcon);
		        if(firstCheckbox.isEnabled() && firstCheckbox.isDisplayed()) {
		            firstCheckbox.click();
		        } else {
		            System.out.println("Checkbox is not clickable");
		            return; 
		        }

		      //delete of first row
		        WebElement firstDeleteButton = rows.get(0).findElement(DeleteButton);
		        if(firstDeleteButton.isEnabled() && firstDeleteButton.isDisplayed()) {
		            firstDeleteButton.click();
		        } else {
		            System.out.println("Delete button is not clickable");
		            return; 
		        }

		      // yes popup
		        WebElement yesButton = driver.findElement(yesbutton);
		        if(yesButton.isEnabled() && yesButton.isDisplayed()) {
		            yesButton.click();
		            System.out.println("Single delete performed and confirmed.");
		        } else {
		            System.out.println("Confirmation button is not clickable");
		        }
		    } else {
		        System.out.println("No rows found");
		    }
		}
    	    
    	    

      /* public void multipleDeleteAction() {
    	   
    	   
    	        List<WebElement> rows = driver.findElements(rowlocator);
    	        for (WebElement row : rows) {
    	            WebElement checkbox = row.findElement(CheckboxIcon);
    	            checkbox.click();
    	        }

    	        driver.findElement 
    	        (multipleDeleteButton).click();

    	        //yes popup
    	         driver.findElement(yesbutton).click(); 
    	        
    	        System.out.println("Multiple delete performed and confirmed.");
    	    }*/

	 
	   public void multipleDeleteAction() {
		    // Finds all rows.
		    List<WebElement> rows = driver.findElements(rowlocator);
		    
		
		    boolean isAnyCheckboxSelected = false;

		  
		    for (WebElement row : rows) {
		        WebElement checkbox = row.findElement(CheckboxIcon);
		        checkbox.click();
		        isAnyCheckboxSelected = true;
		    }

		    if (isAnyCheckboxSelected) {
		        // Wait for the delete button to become clickable after checkboxes are selected.
		        WebElement deleteButton = new  WebDriverWait(driver, Duration.ofSeconds(10))
		                                  .until(ExpectedConditions.elementToBeClickable(multipleDeleteButton));
		        
		        deleteButton.click();

		        // Confirm the delete action in the popup.
		        WebElement yesButton = new   WebDriverWait(driver, Duration.ofSeconds(10))
		                               .until(ExpectedConditions.elementToBeClickable(yesbutton));
		        yesButton.click();

		        System.out.println("Multiple delete performed and confirmed.");
		    } else {
		        System.out.println("No checkboxes were selected.");
		    }
		}


	   public void createbatch() {
	        enterText(batchname, "B2014");
	        enterText(Description, "SDET");
	        
	        programdropdown();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        selectStatus();
	        enterText(noofclasses, "10");
	        clickSave();  
	        alertMsgPopup();
	    }
	   
	   public void search() {
			driver.findElement(searchinput).sendKeys("B2014");
			
		}
	   public String namefielderror() {
		   return driver.findElement(namefielderror).getText();
	   }
	   public String batchexistfielderror() {
		   return driver.findElement(Batchexistfielderror).getText();
	   }
       public  String  statuserror() {
    	   return driver.findElement(statuserror).getText();
       }
	   
       public String programfielderror() {
    	   return driver.findElement(programerror).getText();
       }
       public String noofclasseserror() {
    	   
    	   return driver.findElement(noofclasseserror).getText();
       }
     public String Batcheditserror() {
    	   
    	   return driver.findElement(clearbatchDescErr).getText();
       }
     
       public String descriptionerror() {
    	  return driver.findElement(descriptionerror).getText();
       }
      /* public By alertMsgPopupLocator() {
    	    return By.xpath("//div[@role='alert']");
    	}
       public void handleAlertMessage() {
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    try {
    	        WebElement alertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(alertMsgPopupLocator()));
    	        String text = alertMessage.getText();
    	        System.out.println("");  
    	    } catch (Exception e) {
    	        System.out.println("Alert message not found: " + e.getMessage());
    	    }
    	}*/


 // Helper methods
	    private void enterText(By locator, String text) {
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	        element.clear();
	        element.sendKeys(text);
	        System.out.println("Entered " + text);
	    }
	   /* private void programdropdown() {
	        WebElement dropdownElement = driver.findElement(programdropdown);
	        dropdownElement.click();
	        Actions action = new Actions(driver);
	        action.moveToElement(dropdownElement).perform();
	        WebElement customoption = driver.findElement(By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/p-dropdown[1]/div[1]/div[3]/div[1]/ul[1]/p-dropdownitem[36]/li[1]/span[1]"));
	        customoption.click();
	        System.out.println("program name");
	    }*/
	    
	    private void programdropdown() {
	        WebElement dropdownElement = driver.findElement(programdropdown);
	        dropdownElement.click();  // Open the dropdown

	        try {
	            Thread.sleep(2000); // Wait for 2 seconds for the dropdown to fully open
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }

	        WebElement customoption = driver.findElement(By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/p-dropdown[1]/div[1]/div[3]/div[1]/ul[1]/p-dropdownitem[2]/li[1]/span[1]"));
	        customoption.click();
	        System.out.println("Program selected");
	    }

        private void selectStatus() {
        	
            ensureDropdownIsClosed();
	        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(statusradioactive));
	        radioButton.click();
	        System.out.println("Status set to active");
	    }
        
       
	    private void ensureDropdownIsClosed() {
	    	WebElement dropdown = driver.findElement(programdropdown);
	        if (dropdown.getAttribute("aria-expanded").equals("true")) {
	            dropdown.click(); 
	        }
			
		}



		private void clickSave() {
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(batchsavebutton));
	        button.click();
	        System.out.println("Clicked save button");
	    }
		public void Save() {
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(batchsavebutton));
	        button.click();
	        System.out.println("Clicked save button");
		}
		
		
		   public void invalidnamefield() {
		       // enterText(batchname, "");
		        
		        enterText(Description, "SDET");
		        
		        programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        selectStatus();
		        enterText(noofclasses, "10");
		        clickSave();  
		       // alertMsgPopup();
		        //Assert.assertEquals("Expected error message", namefielderror());
		       System.out.println("batch nameField Error: " +  namefielderror());
		    }
		   private void selectStatus1() {
	        	
	           // ensureDropdownIsClosed();
		        WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(statusradioactive));
		        radioButton.click();
		        System.out.println("Status set to active");
		    }
		   public void invalidpgmnamefield() {
		        enterText(batchname, "B05");
		        enterText(Description, "SDET");
		       
		        //programdropdown();
		        //wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        selectStatus1();
		        enterText(noofclasses, "10");
		        clickSave();  
		       // Assert.assertEquals("Expected error message", programfielderror());
		        //alertMsgPopup();
		        System.out.println("Program Field Error: " + programfielderror());
		    }
	    
		   public void invalidclassfield() {
		        enterText(batchname, "B05");
		        enterText(Description, "SDET");
		        
		        programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(programdropdown));
		        selectStatus();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(statusradioactive));
		        //enterText(noofclasses, "");
		        clickSave();  
		       // alertMsgPopup();
		       System.out.println("no of classes Field Error: " + noofclasseserror());
		       // Assert.assertEquals("Expected error message",noofclasseserror() );
		    }
		 
		  
		   public void invalidstatusfield() {
		        enterText(batchname, "B05");
		        enterText(Description, "SDET");
		        
		        programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(programdropdown));
		       // selectStatus();
		        enterText(noofclasses, "10");
		        clickSave();  
		        //alertMsgPopup();
		        System.out.println("status Field Error: " + statuserror());
		        //Assert.assertEquals("Expected error message",statuserror() );
		    }
		   
		   public void invaliddescriptionfield() {
		        enterText(batchname, "B05");
		       // enterText(Description, "SDET");
		        
		        programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(programdropdown));
		        selectStatus();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(statusradioactive));
		        enterText(noofclasses, "10");
		        clickSave();  
		        //alertMsgPopup();
		        System.out.println("DescriptionField Error: " + descriptionerror());
		       // Assert.assertEquals("Expected error message",descriptionerror() );
		    }
		   public void invalidbatchfield() {
		        enterText(batchname, "AI");
		       // enterText(Description, "SDET");
		        
		        programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(programdropdown));
		        selectStatus();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(statusradioactive));
		        enterText(noofclasses, "10");
		        clickSave();  
		        //alertMsgPopup();
		        System.out.println("Batch Name field Error: " + batchexistfielderror());
		    }
		  /* public void editBatchDetails(String batchName, String batchDescription) {
			    WebElement batchNameField = driver.findElement(By.id("batchName"));
			    batchNameField.clear();
			    batchNameField.sendKeys(batchName);

			    WebElement descriptionField = driver.findElement(By.id("Description"));
			    descriptionField.clear();
			    descriptionField.sendKeys(batchDescription);

			    WebElement saveButton = driver.findElement(By.id("saveButton"));
			    saveButton.click();
			}*/
		   public void editBatch( String description, int classes, String program) {
		       // enterText(batchname, batchName);
		        enterText(Description, "update");
		        //programdropdown();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		        //wait.until(ExpectedConditions.visibilityOfElementLocated(programdropdown));
		        //selectStatus1();
		        //wait.until(ExpectedConditions.visibilityOfElementLocated(statusradioactive));
		       // enterText(noofclasses, Integer.toString(classes));
		        //clickSave();
		    }
		   public void clearMandatoryField() {
			   
			   WebElement NoofclassesField = driver.findElement(noofclasses);
			   NoofclassesField.clear();
			   wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		        clickSave();
		        System.out.println("Mandatory field error message: " + noofclasseserror());
		    }
		   public void clearOptionalField() {
			   
		        WebElement descriptionField = driver.findElement(Description);
		        descriptionField.clear();
		       clickSave();
		        System.out.println("Optional field error message: " + descriptionerror());
		    }
		 
		   
		  	}
