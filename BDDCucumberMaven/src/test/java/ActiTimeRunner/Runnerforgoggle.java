package ActiTimeRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 

	@CucumberOptions(
			 features = {"src/test/resources/features/GoggleSearch.feature"},//feature file or folder name
				        glue = {"stepDefinations"},//step definition package name
				        dryRun=true,
				       plugin = {"html:target/cucumber-html-report"},// reporting
				        monochrome = true
			)
	public  class Runnerforgoggle extends AbstractTestNGCucumberTests{

	}





