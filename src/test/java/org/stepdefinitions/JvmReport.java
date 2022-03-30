package org.stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.json.Json;

import io.github.bonigarcia.wdm.config.Config;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvm(String json) {
		File f=new File("C:\\Users\\nanaj\\eclipse-workspace\\Cucumber4\\AllReports\\JvmReport");
		Configuration c=new Configuration(f, "social application");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("platform", "windows");
		List<String> l=new ArrayList<String>();
		l.add(json);
		
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
		



	}

}
