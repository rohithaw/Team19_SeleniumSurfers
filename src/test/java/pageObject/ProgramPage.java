package pageObject;

	import org.junit.Assert;
	import java.util.Map;

	import java.time.Duration;
	import java.util.HashMap;
import java.util.List;

	import java.util.NoSuchElementException;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.netty.handler.timeout.TimeoutException;



	public class ProgramPage {
		
		public WebDriver driver;
		   private WebDriverWait wait;
		 // private Map<String, By> elements = new HashMap<>();
		 // private Map<String, By> elements;
		   
		 By usernameField= By.xpath("//input[@id='username']");
		 By passwordField=By.xpath("//input[@id='password']");
		 By loginbutton= By.xpath("//button[@id='login']");
		 By programbutton =By.xpath("//*[@id=\"program\"]/span[1]");
		 By headerElement =By.xpath("//body/app-root/app-program/div/mat-card/mat-card-title/div[1]");
	     By FooterElement=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[2]/div");
	     
		 By pagination= By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator/div"); 
		 By  multipleDeleteButton= By.xpath("//body/app-root/app-program/div/mat-card/mat-card-title/div[2]/div[1]/button");
		 By EditButton =By.xpath("//*[@id=\"editProgram\"]/span[1]");
		
		 By DeleteButton =By.xpath("//*[@id=\"deleteProgram\"]/span[1]");
		
		By sorticon=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]/p-sorticon/i");
		By checkbox=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]");
		By searchbar=By.xpath("//*[@id=\"filterGlobal\"]");
		By newprogrambutton=By.xpath("//*[@id=\"new\"]");
		By NameLabel=By.xpath("//body/app-root/app-program/p-dialog/div/div/div[2]/div[1]/label");
		By DescriptionLabel=By.xpath("//body/app-root/app-program/p-dialog/div/div/div[2]/div[2]/label");
		By nameTextBox=By.xpath("//*[@id=\"programName\"]");
		By DescriptionTExtBox=By.xpath("//*[@id=\"programDescription\"]");
		By statusradioactive=By.xpath("//*[@id=\"category\"]/div/div[2]");
		By statusradioInactive=By.xpath("//body/app-root[1]/app-program[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/div[3]/p-radiobutton[1]/div[1]/div[2]");
		By cancel=By.xpath("//body/app-root/app-program/p-dialog/div/div/div[3]/button[1]");
		By save=By.xpath("//*[@id=\"saveProgram\"]");
		By rowlocator=By.xpath("//body/app-root[1]/app-program[1]/div[1]/mat-card[1]");
		By closebutton=By.xpath("//body/app-root/app-program/p-dialog/div/div/div[1]/div/button/span");
		//Edit Program
		By editbutton=By.xpath("//*[@id=\"editProgram\"]/span[1]");
		By editPgmName=By.xpath("//*[@id=\"programName\"]");
		By editPgmDes=By.xpath("//*[@id=\"programDescription\"]");
		By editActive=By.xpath("//*[@id=\"category\"]/div/div[2]/span");
		By editSave=By.xpath("//*[@id=\"saveProgram\"]/span[2]");
		By editcancel=By.xpath("/html/body/app-root/app-program/p-dialog/div/div/div[3]/button[1]/span[2]");
		//Delete Program
		By Delete=By.xpath("//*[@id=\"deleteProgram\"]/span[1]");
		By ConfirmNo=By.xpath("//body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[1]");
		By ConfirmYes=By.xpath("//body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[2]/span[2]");
		By Deleteclose=By.xpath("/html/body/app-root/app-program/p-confirmdialog/div/div/div[1]/div/button/span");
		By errormsg=By.xpath("");
		By success=By.xpath("");
		/*By errorMessage = By.xpath("//body/app-root[1]/app-batch[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[3]/small[1]");*/
		//sorting
		By sortprgName=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]");
		By sortprgDesc=By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]");
		By sortStatus=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[4]");
		//pagination
		By pagi=By.xpath("//body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/p-paginator");
		
		  public ProgramPage (WebDriver driver) {
		       this.driver = driver;
		       this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		      // elements = new HashMap<>();
		       // initializeElements();
		      
		   }
		  
		
		   public void login(String username, String password) {
		        driver.findElement(usernameField).sendKeys(username);
		        driver.findElement(passwordField).sendKeys(password);
		        driver.findElement(loginbutton).click();
		    }

		    public void navigateToProgramPage() {
		        driver.findElement(programbutton).click();
		    }

		    public void checkHeaderText() {
		    	String actualHeaderText = driver.findElement(headerElement).getText();
		    	
		        System.out.println("Debug: Header text found on page - " + actualHeaderText); 
		        Assert.assertEquals("Header text does not match", "Manage Program", actualHeaderText);
		        
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
		 /* public void deleteEnabled() {
			 
		       boolean isButtonEnabled = driver.findElement(DeleteButton).isEnabled();
		    
		       System.out.println("Is the delete button enabled? " + isButtonEnabled);
		       Assert.assertTrue("delete icon should be disabled", isButtonEnabled);   
		   }
		   public void EditEnabled() {
		       boolean isButtonEnabled = driver.findElement(EditButton).isEnabled();
		    
		       System.out.println("Is the edit button enabled? " + isButtonEnabled);
		       Assert.assertTrue("edit icon should be disabled", isButtonEnabled);   
		   }*/
		   public void checkTableElements() {
			   List<WebElement> rows=driver.findElements(rowlocator);
			   for (WebElement row:rows) {
				   WebElement checkboxIcon=row.findElement(checkbox);
				   System.out.println("Checkboxes is displayed:"+checkboxIcon.isDisplayed()+" and enabled:"+checkboxIcon.isEnabled());
				   WebElement editIcon=row.findElement(EditButton);
				   System.out.println("editIcons is displayed:"+editIcon.isDisplayed()+" and enabled:"+checkboxIcon.isEnabled());
				   WebElement deleteIcon=row.findElement(DeleteButton);
				   System.out.println("DeleteIcons is displayed:"+deleteIcon.isDisplayed()+" and enabled:"+checkboxIcon.isEnabled());

				   
			   }
		   }
		    
		   public void newprogramicon() {	    
			  wait.until(ExpectedConditions.elementToBeClickable(newprogrambutton));
			    
			  driver.findElement(newprogrambutton).click();
		   }
		   public boolean sortingicon() {
			   boolean isDisplayed = driver.findElement(sorticon).isDisplayed();
		        System.out.println(" SortICON is displayed: " + isDisplayed); 
		        return isDisplayed;
		   }
		   public boolean checkbox() {
			   boolean isDisplayed = driver.findElement(checkbox).isDisplayed();
		        System.out.println("CheckBox is displayed: " + isDisplayed); 
		        return isDisplayed;
		   }   
		   public boolean searchbar() {
		   boolean isDisplayed = driver.findElement(searchbar).isDisplayed();
	        System.out.println("SearchBar is displayed: " + isDisplayed); 
	        return isDisplayed;
	   }
		  
		   public void searchtxt()
			{
				boolean Searchbox=driver.findElement(searchbar).isDisplayed();
				if(Searchbox)
				{
					System.out.println("Searchtxt Field is Displayed");
				}
				
				else
				{
					System.out.println("Searchtxt Field is Not Displayed");
				}
			}
			
			public void searchtxtdisplayed() {
				
				driver.findElement(searchbar).sendKeys("Team19"+Keys.ENTER);
				//String Value = SearchtxtValue.getText();     ////*[contains(text(),'GenAI')
				//Assert.assertEquals("Search Match", "Selenium Surefers testing", Value);	
				
			}
		    public void validateprogrampopup() {
			    // Validate text boxes are present and visible
			    try {
			        WebElement nameTextbox = driver.findElement(NameLabel);
			        System.out.println("Debug: 'Name' text box is present.");
			        Assert.assertTrue("Name text box is missing", nameTextbox.isDisplayed());
			    } catch (NoSuchElementException e) {
			        System.out.println("Error: 'Name' text box not found.");
			    }
		    

			    try {
			        WebElement descriptionTextbox = driver.findElement(DescriptionLabel);
                    System.out.println("Debug: 'Description' text box is present.");
			        Assert.assertTrue("Description text box is missing", descriptionTextbox.isDisplayed());
			    } catch (NoSuchElementException e) {
			        System.out.println("Error: 'Description' text box not found.");
			    }
			        
			        // Validating Active radio button
			        try {
			            WebElement statusActiveRadioButton = driver.findElement(statusradioactive);
			            System.out.println("Debug: 'Status: Active' radio button is present.");
			            Assert.assertTrue("Status Active radio button is missing", statusActiveRadioButton.isDisplayed());
			        } catch (NoSuchElementException e) {
			            System.out.println("Error: 'Status: Active' radio button not found.");
			        }

			        // Validating Inactive radio button
			        try {
			            WebElement statusInactiveRadioButton = driver.findElement(statusradioInactive);
			            System.out.println("Debug: 'Status: Inactive' radio button is present.");
			            Assert.assertTrue("Status Inactive radio button is missing", statusInactiveRadioButton.isDisplayed());
			           } catch (NoSuchElementException e) {
			            System.out.println("Error: 'Status: Inactive' radio button not found.");
			        }
			        driver.findElement(closebutton).click();
			    }
		    public void addprogramtable(String prgm_name,String prgm_descrp) throws InterruptedException
		    {
		    	driver.findElement(newprogrambutton).click();
				driver.findElement(nameTextBox).sendKeys(prgm_name);		
				driver.findElement(DescriptionTExtBox).sendKeys(prgm_descrp);		
				driver.findElement(statusradioactive).click();
				//Thread.sleep(3000);
				driver.findElement(save).click();;		
				
					Thread.sleep(3000);
					}
	   
		    public void addprogram() throws InterruptedException {
		    	driver.findElement(newprogrambutton).click();
				driver.findElement(nameTextBox).sendKeys("Team19");		
				driver.findElement(DescriptionTExtBox).sendKeys("Future course");		
				driver.findElement(statusradioactive).click();
				Thread.sleep(3000);
				driver.findElement(save).click();;		
				
					//Thread.sleep(3000);
					}
		   
		    public void EditProgramDetails (String ProgName,String ProgDescrp) throws InterruptedException {
		    	
		    	driver.findElement(editbutton).click();
		    	//driver.findElement(editPgmName).clear();
		    	//driver.findElement(editPgmName).sendKeys(ProgName);	
		    	driver.findElement(editPgmDes).clear();
		    	driver.findElement(editPgmDes).sendKeys(ProgDescrp);
		    	driver.findElement(editActive).click();
		    	//Thread.sleep(3000);
				driver.findElement(editSave).click();
				//Thread.sleep(3000);
			
			//String msg=driver.switchTo().alert().getText();
			//System.out.println(msg);
				

			
		    }	

		    public void Editprogram() throws InterruptedException {
		    	
			driver.findElement(editbutton).click();
			driver.findElement(editPgmName).clear();
			driver.findElement(editPgmName).sendKeys("Playwright");	
			driver.findElement(editPgmDes).clear();
			driver.findElement(editPgmDes).sendKeys("Future course");		
			driver.findElement(editActive).click();
		//	Thread.sleep(3000);
			driver.findElement(editSave).click();
			//Thread.sleep(3000);
		//String msg=driver.switchTo().alert().getText();
		//System.out.println(msg);
		    }
		    public void deleteYes() {
		    	driver.findElement(Delete).click();	
		    	driver.findElement(ConfirmYes).click();
		    }
		    public void deleteNo() {
		    	driver.findElement(Delete).click();
		    	driver.findElement(ConfirmNo).click();
		    }
		    
		    public void multipledelete() {
		    	List<WebElement>rows=driver.findElements(rowlocator);
		    	boolean ischeckboxselected=false;
		    	for(WebElement row:rows) {
		    		WebElement checboxIcon=row.findElement(checkbox);
		    	checboxIcon.click();
		    	ischeckboxselected=true;
		    	}
		    	if(ischeckboxselected) {
		    		
		    		WebElement deletebutton= new WebDriverWait(driver,Duration.ofSeconds(10))
		    									.until(ExpectedConditions.elementToBeClickable(multipleDeleteButton));
		    		deletebutton.click();
		    		WebElement yesButton= new WebDriverWait(driver, Duration.ofSeconds(10))
		    								.until(ExpectedConditions.elementToBeClickable(ConfirmYes));
		    		yesButton.click();
		    		System.out.println("Multiple delete performed & Confirmed");
		    	}
		    	else {
		    		System.out.println("No Checkboxes selected");
		    	}
		    		
		    	}
		    
		    		   /*public void singleDelete() {
		    	List<WebElement> rows=driver.findElements(rowlocator);
		    	if(!rows.isEmpty()) {
		    		WebElement firstcheckbox=rows.get(0).findElement(checkbox);
		    		if(firstcheckbox.isEnabled()&&firstcheckbox.isDisplayed()) {
		    			firstcheckbox.click();
		    		}
		    		else {
		    			System.out.println("Checkbox is not clickable");
		    			return;
		    		}
		    		//delete first row
		    		WebElement firstdeletebutton=rows.get(0).findElement(Delete);
		    		if firstdeletebutton.isEnabled()&&firstdeletebutton.isDisplayed()){
		    			
		    		}*/
		    public void sortprogname() {
		    	WebElement sortIcon= new WebDriverWait(driver,Duration.ofSeconds(5))
		    							.until(ExpectedConditions.elementToBeClickable(sortprgName));
		    	sortIcon.click();
		    	//driver.findElement(sortprgName).click();
		    }
		    public void sortprogdescrp() {
		    	driver.findElement(sortprgDesc).click();
		    }
		    public void sortstatus() {
		    	driver.findElement(sortStatus).click();
		    }
		    
		    public void paginate() {
		    	List<WebElement> elements = driver.findElements(pagi);
		    	int s=elements.size();
		    	driver.findElement(pagi).click();
		    	System.out.println("pagination="+s);
		    	/*for (int i = 0; i < elements.size(); i++) {
		    	    String title = elements.get(i).getAttribute("title");
		    	    if (title.equals("Next Page")) {
		    	        elements.get(i).click();
		    	        break;
		    	    }
		    	}*/
		    }

		    
		   public void Alertmessage() {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				String alertMessage = alert.getText();
				System.out.println("Alert message: " + alertMessage);
				alert.accept(); 	
				
			}
		   
		  /* public String getErrorMessage() {
			   
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    try {
			       
			        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
			        return errorMessageElement.getText();
			    } catch (TimeoutException e) {
			        return null; 
			    }
			}*/

		   
		    
	}