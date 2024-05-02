package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty","html:target/Cucumber-Reports/Team19-SeleniumSurfers.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"json:target/Cucumber-Reports/Team19-SeleniumSurfers.json" , 
				"junit:target/Cucumber-Reports/Team19-SeleniumSurfers.xml",},
				
				
		features={"src/test/resources/features"},
		glue={"stepDefinition","hooks"},
		dryRun=false,
		monochrome=true,
		publish=true
			
		
		)


public class Runner {

}
