package hooks;

import org.openqa.selenium.WebDriver;

import pageObject.BatchPage;
import pageObject.DashboardPageObj;
import pageObject.LoginPage;
import pageObject.ProgramPage;
import pageObject.UserManagePage;
import pageObject.UserStudentstaffPage;

	public class TestContext {

		protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
		WebDriver driver;
		 BatchPage batchPage;
		 UserManagePage usermp;
		 ProgramPage programpage;
		 LoginPage lp;
		 DashboardPageObj dashboard;
		 // UserStudentstaffPage userssp;
		 
		public TestContext() {
	        this.batchPage = new BatchPage(DriverFactory.getDriver());
	        this.usermp = new UserManagePage(DriverFactory.getDriver());
	        this.lp = new LoginPage(DriverFactory.getDriver());
	        this.programpage = new ProgramPage(DriverFactory.getDriver());
	        this.dashboard = new DashboardPageObj(DriverFactory.getDriver());
	        // this.userssp = new UserStudentstaffPage(DriverFactory.getDriver());
	    }
		
		public WebDriver getDriver() {
			return threadLocalDriver.get();
		}
		
		public LoginPage getLoginPage() {
			return this.lp;
		}

	    public BatchPage getBatchPage() {
	        return this.batchPage;
	       
	    }
	    
	    public UserManagePage getUserManagePage() {
	        return this.usermp;
	       
	    }
	    
	    public ProgramPage getProgramPage() {
	        return this.programpage;
	    }
	    
	    public DashboardPageObj getDashboardPageObj() {
	        return this.dashboard;
	       
	    }
	    
	    // public UserStudentstaffPage getUserStudentstaffPage() {
	    //     return this.userssp;
	    // }
	    
	}
