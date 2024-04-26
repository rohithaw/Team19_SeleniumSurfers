package hooks;







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Hooks {
	WebDriver driver;

    @Before
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        Baseclass.initialiseBrowser("edge");
        
        
    }

    @After
    public void tearDown() {
        Baseclass.closeDriver();
    }
}
