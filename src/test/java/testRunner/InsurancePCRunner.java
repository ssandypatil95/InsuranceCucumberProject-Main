package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"stepDefinations","hooks"},
		monochrome = true, tags = "@tag1"	
		)

public class InsurancePCRunner {

}
