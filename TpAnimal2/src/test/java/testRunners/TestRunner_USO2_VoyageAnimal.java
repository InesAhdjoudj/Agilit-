package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/US02.feature", glue="stepDefinitions/StepDefUs02VoyageAnimal.java")

public class TestRunner_USO2_VoyageAnimal {

}
