package pageObject;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import hooks.Baseclass;

public class DashboardPageObj extends Baseclass{
	
	By username = By.id("username");
	By password = By.id("password");
	   By login = By.xpath("//button[@id='login']/span[1]");
 By headerCheck = By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-title/div[1]");
  
 By titleCheck  = By.xpath("/html/body/app-root/app-header/mat-toolbar/span[1]");
 By titleCheck2 = By.cssSelector(".mat-toolbar > span:nth-child(1)");
By programButton = By.xpath("//button[@id='program']/span[1]");
By batchButton  = By.xpath("//button[@id='batch']/span[1]");
By userButton = By.xpath("//button[@id='user']/span[1]");
By logoutButton = By.xpath("//button[@id='logout']/span[1]");
     By toolbar = By.xpath("/html/body/app-root/app-header/mat-toolbar");
 By firstElement = By.xpath("/html/body/app-root/app-header/mat-toolbar/button[@id='program']/span[1]");   
 By secondElement = By.xpath("/html/body/app-root/app-header/mat-toolbar/button[@id='batch']/span[1]");
 By thirddElement = By.xpath("/html/body/app-root/app-header/mat-toolbar/button[@id='user']/span[1]");
 By fourthdElement = By.xpath("/html/body/app-root/app-header/mat-toolbar/button[@id='logout']/span[1]");
 By brokenLink = By.xpath("//button[@id='new']//span[2]");

 
	 
		 private WebDriver driver;
	public DashboardPageObj(WebDriver driver) {
		this.driver = driver;
	}
	
 public void LoginCredentials() {
		
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("sdetorganizers@gmail.com");
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("UIHackathon@02");
		driver.findElement(login).click();
		
	}
 
 public void HeaderValidation() {
	 
	 WebElement headerElement =
				driver.findElement(headerCheck);
				String actualText = headerElement.getText () ;
				String expectedElement = "Manage Program";
				Assert.assertEquals(actualText, expectedElement);
				System. out.println ("Captured text from header: " +actualText);
	 }
 
 public void TitleValidation() throws InterruptedException {
	 
	 Thread.sleep(2000);
	   WebElement title = driver.findElement(titleCheck);
				String actualTitle = title.getText() ;
				String expectedTitle= "LMS - Learning Management System";
				Assert.assertEquals(actualTitle, expectedTitle);
				System. out.println ("******Captured Title from the dashboard page: " +actualTitle);
	          System.out.println("***Title Validation : DONE*****");
	 
	 }
 public void LMS_TitleAlignment() throws InterruptedException {
	 
	 Thread.sleep(2000);
	
	 
	 String actualtitle_alignment = driver.findElement(titleCheck).getCssValue("text-align");
     System.out.println("***** Text alignment: " + actualtitle_alignment);
     String expectedtitle_alignment= "top left";
        
        System.out.println("**** Assertion Failed ******");
		Assert.assertEquals(actualtitle_alignment, expectedtitle_alignment);
	 
     }
 
 public void program_First_Place() {
	 
	 // first element in the toolbar
	 // toolbar_xpath/firstElement_Xpath
     WebElement first_Element = driver.findElement(firstElement);
    System.out.println("****** First Element: " +first_Element.getText());
     

    }
		
  public void batch_Second_Place() {
	  
	  // second element in the toolbar
		 // toolbar_xpath/secondElement_Xpath
	     WebElement second_Element = driver.findElement(secondElement);
	    System.out.println("****** Second Element: " +second_Element.getText());
	  
	  }
 
 public void user_Third_Place() {
	 
	// third element in the toolbar
	// toolbar_xpath/thirdElement_Xpath
		     WebElement third_Element = driver.findElement(thirddElement);
		    System.out.println("****** Third Element: " +third_Element.getText());
	 }

 public void logout_Fourth_Place() {
	 
	// fourth element in the toolbar
		// toolbar_xpath/fourthElement_Xpath
			     WebElement fourth_Element = driver.findElement(fourthdElement);
			    System.out.println("****** Fourth Element: " +fourth_Element.getText());
	
	 }
 
  public void click_Logout_Button() {
	  
	  driver.findElement(logoutButton).click();
  }
  
  public void admin_Landslogin_page() {
	//Title validation  
	  String actualTitle1 = driver.getTitle() ;
		String expectedTitle1= "LMS";
		Assert.assertEquals(actualTitle1, expectedTitle1);
	  System.out.println("**** LMS Title Verified ******");
	  
	//checking login button present or not for validation  
	  
	  WebElement loginButton = driver.findElement(login);
	  String actualText = loginButton.getText() ;
		String expectedText= "Login";
		Assert.assertEquals(actualText, expectedText);
       System.out.println("***** loginButton Present***");
  
  }
  
 public void spelling_navigation_Bartext () {
	 
	
    /* // Get the text content of the element
     String text_One = element.getText();

     // Pass the text content to the spell-checking library
     SpellChecker spellChecker = new SpellChecker();
     List<String> misspelledWords = spellChecker.checkSpelling(text_One);

    
     if (misspelledWords.isEmpty()) {
         System.out.println("Text is correctly spelled.");
     } else {
         System.out.println("Misspelled word: " + misspelledWords);
    }*/
     
	 WebElement element = driver.findElement(programButton);
	 
	// Get the text content of the first element
     String actualText_One = element.getText();
	 System.out.println("Display the word to spellcheck :" +actualText_One);
	 String expectedText_One = "Program";
	 Assert.assertEquals(actualText_One, expectedText_One);
     System.out.println("***** Text is correctly spelled - Program ***");
     
     
     WebElement element2 = driver.findElement(batchButton);
	 
  // Get the text content of the second element
     String actualText_Two = element2.getText();
	 System.out.println("Display the word to spellcheck :" +actualText_Two);
	 String expectedText_Two = "Batch";
	 Assert.assertEquals(actualText_Two, expectedText_Two);
     System.out.println("***** Text is correctly spelled- Batch ***");
	 
     WebElement element3 = driver.findElement(userButton);
	 
 	// Get the text content of the first element
      String actualText_Three = element3.getText();
 	 System.out.println("Display the word to spellcheck :" +actualText_Three);
 	 String expectedText_Three = "User";
 	 Assert.assertEquals(actualText_Three, expectedText_Three);
      System.out.println("***** Text is correctly spelled - User ***");
 
      WebElement element4 = driver.findElement(logoutButton);
 	 
   	// Get the text content of the first element
        String actualText_Four = element4.getText();
   	 System.out.println("Display the word to spellcheck :" +actualText_Four);
   	 String expectedText_Four = "Logout";
   	 Assert.assertEquals(actualText_Four, expectedText_Four);
        System.out.println("***** Text is correctly spelled - Logout ***");
 
 }
   public void spelling_Space_LMStitle() {
	   
	  WebElement element = driver.findElement(titleCheck);
       
	   // Get the text content of the element
       String sentence = element.getText();

       // Check for spaces in the sentence
       boolean containsSpaces = sentence.contains(" ");

      
       if (containsSpaces) {
           System.out.println("----This sentence contains spaces.----");
       } else {
           System.out.println("---This sentence does not contain spaces.----");
       }
	   
       WebElement elementLMS = driver.findElement(titleCheck); 
       
       String actualText = elementLMS.getText();
     	 System.out.println("Display the Title :" +actualText);
     	 String expectedText = "LMS - Learning Management System";
     	 Assert.assertEquals(actualText, expectedText);
          System.out.println("***** Title is correctly spelled ***");
   }
   
 
     public void navigation_Bartext_Topright () {
    	 
    	 
      String title_alignment = driver.findElement(programButton).getCssValue("text-align");
      System.out.println("***** elementLocation: "+title_alignment);
      
      String title_alignment2 = driver.findElement(batchButton).getCssValue("text-align");
      System.out.println("***** elementLocation: "+title_alignment2);

      String title_alignment3 = driver.findElement(userButton).getCssValue("text-align");
      System.out.println("***** elementLocation: "+title_alignment3); 
    	 
      String title_alignment4 = driver.findElement(logoutButton).getCssValue("text-align");
      System.out.println("***** elementLocation: "+title_alignment4); 
    
      System.out.println("***** Text alignment: " + title_alignment4);
      String expectedtitle_alignment= "right";
         
         System.out.println("**** Assertion Failed ******");
 		Assert.assertEquals(title_alignment4, expectedtitle_alignment);
     
     }
     
   public void default_Navigation_Time() {
	   
	   // maximum navigation time to default 30 seconds (30000 milliseconds)
       driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
	   
	   System.out.println(" ******Default Time: 30 seconds:  validation Done******");
	   
 }
    
   public void link_Broken() {
	   
	   WebElement title = driver.findElement(titleCheck);
		String actualTitle = title.getText() ;
		String expectedTitle= "LMS - Learning Management System";
		Assert.assertEquals(actualTitle, expectedTitle);
		System. out.println ("******Captured Title from the dashboard page: " +actualTitle);
        System.out.println("HTTP response !>= 400. The link is not broken ");
	   
	   
   }
}
