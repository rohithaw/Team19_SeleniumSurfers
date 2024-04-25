//package context;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class testContextSetup {
//	
//	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
//	WebDriver driver;
//	
//	public void setDriver(WebDriver driver) {
//		String browser = PropertiesFile.readPropertiesFile("browser");
//		System.out.println("The browser value from properties file is: "+ browser);
//		
//		if (browser.equalsIgnoreCase("Chrome")){
//			ChromeOptions co = new ChromeOptions();
//			WebDriverManager.chromedriver().setup();
//			
//			co.addArguments("--headless");
//			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//			driver = new ChromeDriver(co);
//			threadLocalDriver.set(driver);
//		}
//
//		else if(browser.equalsIgnoreCase("Edge")){
//			EdgeOptions eo = new EdgeOptions();
//			WebDriverManager.edgedriver().setup();
//			
//			eo.addArguments("--headless");
//			driver = new EdgeDriver(eo);
//			threadLocalDriver.set(driver);
//		}
//
//		else if(browser.equalsIgnoreCase("FireFox")) {
//			
//			FirefoxOptions fo = new FirefoxOptions();
//			WebDriverManager.firefoxdriver().setup();
//			
//			fo.addArguments("--headless");
//			driver = new FirefoxDriver(fo);
//			threadLocalDriver.set(driver);
//		}
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		this.driver = driver;
//	}
//	
//	public WebDriver getDriver() {
//		return threadLocalDriver.get();
//	}
//
//}
