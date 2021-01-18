package stepDefinitions;


import static org.junit.Assert.assertTrue;

import animal.Animal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


class StepDefUs01CreationAnimal {
	private Animal bobby = new Animal("bobby","france");
	
	@Given("^un (.*) et un (.*) $")
	public void creationAnimal(String nom, String pays) {
	    assertTrue((nom != null) && (pays != null));
	}

	@When("^Quand l utilisateur valide la creation de l animal$")
	public void validerCreationAnimal() {
	    assertTrue(bobby != null);
	}

	@Then("^Une instance de la classe animal est creee avec un (.*) et un (.*) . $")
	public void animalCréé(String nom, String pays) {
	    assertTrue(bobby.getNom()==nom && bobby.getPays()==pays);
	}

}
