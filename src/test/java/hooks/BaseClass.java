package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseClass {
	

	    @Before
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        DriverFactory.initialiseBrowser("chrome");
	    }

	    @After
	    public void tearDown() {
	    	DriverFactory.closeDriver();
	    }
	}