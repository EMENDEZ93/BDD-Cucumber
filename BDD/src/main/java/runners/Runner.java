package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles", glue="stepDefinitions", plugin = "html:reports/cucumber-report" )
public class Runner {

}
