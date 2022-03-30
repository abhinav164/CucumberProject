package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinitions", dryRun =false ,
                     monochrome = true, strict =true,
     plugin= {"pretty", "html:HtmlReport","junit:JunitReports\\fb.xml","json:JsonReport\\fb1.json"})

public class TestRunner {
	@AfterClass
	public static void jvm() {
		JvmReport.jvm("C:\\Users\\nanaj\\eclipse-workspace\\Cucumber4\\JsonReport\\fb.json");

		

	}
	
}
