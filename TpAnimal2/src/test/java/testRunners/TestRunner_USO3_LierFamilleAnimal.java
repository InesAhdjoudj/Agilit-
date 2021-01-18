package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/US03.feature", glue="stepDefinitions/StepDefUs03LierFamilleAnimal.java")

public class TestRunner_USO3_LierFamilleAnimal{

}
