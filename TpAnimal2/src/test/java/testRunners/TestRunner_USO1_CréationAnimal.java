package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/US01.feature", glue="stepDefinitions/StepDefUs01CreationAnimal.java")

public class TestRunner_USO1_CréationAnimal {

}
