package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = 	"C:\\Users\\vinay\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\functionalTests\\End2End_Test.feature"
		,glue = {"stepDefinitions"}
		)
public class TestRunner {
	

}
