package stepDefinitions;

import static org.junit.Assert.assertTrue;

import animal.Animal;
import animal.Famille;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class StepDefUs03LierFamilleAnimal {
	private Famille famille = new Famille("AHDJOUDJ", "34 rue truffaut");
	private Animal bobby = new Animal("bobby","france");
	@Given("Je souhaite lier un animal a une famille")
	public void je_souhaite_lier_un_animal_a_une_famille() {
		assertTrue(famille != null && bobby != null);
	}

	@When("Quand la famille adopte un {string}")
	public void quand_la_famille_adopte_un(String string) {
		assertTrue(famille.ajouterAnimal(bobby));
	}

	@Then("L animal est ajoute a la liste d animaux de la famille")
	public void l_animal_est_ajout_la_liste_d_animaux_de_la_famille() {
		assertTrue(famille.animalExiste(bobby));
	}

	@Given("Je souhaite lier un animal existant a une famille")
	public void je_souhaite_lier_un_animal_existant_a_une_famille() {
		assertTrue(bobby!= null && famille != null);
	}
	
	@When("Quand la famille adopte un bobby")
	public void quand_la_famille_adopte_un_bobby() {
		assertTrue(!famille.ajouterAnimal(bobby));
	}
	
	@Then("L animal n est pas ajoute car il existe")
	public void l_animal_n_est_pas_ajoute() {
		assertTrue(famille.animalExiste(bobby));

	}



}
