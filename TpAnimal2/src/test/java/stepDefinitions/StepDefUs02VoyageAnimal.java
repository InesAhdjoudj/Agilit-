package stepDefinitions;


import static org.junit.Assert.assertTrue;

import animal.Animal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


class StepDefUs02VoyageAnimal {
	private Animal bobby = new Animal("bobby","france");
	

	@Given("^Le (.*) vers lequel voyage l animal$")
	public void paysDeAnimal(String pays) {
	    assertTrue(pays != null);
	}

	@When("^Quand le voyage vers (.*) est valide$")
	public void quand_le_voyage_est_valide(String pays) {
		bobby.voyageVers(pays);
		assertTrue(bobby.getPays()!= null );
	}

	@Then("^le (.*) de l animal est change$")
	public void le_de_l_animal_est_change(String pays) {
		assertTrue(bobby.getPays()!= pays );
		
	}


	@Given("^Le (.*) vers lequel voyage l animal$")
	public void le_pays_vers_lequel_voyage_l_animal(String pays) {
		assertTrue(pays == null);
	}
	
	@When("^Quand le voyage vers (.*) vide est valide$")
	public void quand_le_voyage_vers_null_vide(String pays) {
	   bobby.voyageVers(pays);
	}
	
	@Then("^le (.*) est inchange.$")
	public void le_null_est_inchange(String pays) {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(bobby.getPays()!= pays);
	}



}