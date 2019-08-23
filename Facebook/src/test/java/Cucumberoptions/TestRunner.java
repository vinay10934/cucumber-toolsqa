package Cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vinay\\eclipse-workspace\\Facebook\\src\\test\\java\\features\\login.feature",
		glue = "stepDefinition"
		)

public class TestRunner {

}
