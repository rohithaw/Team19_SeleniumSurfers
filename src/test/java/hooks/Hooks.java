package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



	public class Hooks {

	    @Before
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        BaseClass.initialiseBrowser("chrome");
	    }

	    @After
	    public void tearDown() {
	        BaseClass.closeDriver();
	    }
	}

