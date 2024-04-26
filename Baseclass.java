package hooks;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
     static WebDriver driver ;
    
    public static void initialiseBrowser(String browserName) {
        if (driver == null) { 
            switch (browserName.toLowerCase()) {
                case "chrome":
                	WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                	WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                	WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Browser \"" + browserName + "\" is not supported.");   
                    
                    
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/login");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    
	public static void closeDriver() {
		 if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
}}

