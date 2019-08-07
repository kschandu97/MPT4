package RecipeStepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Formfeature",glue="RecipeStepDefinition",plugin="pretty")
public class TestRunner {

}
