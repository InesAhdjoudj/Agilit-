package testRunners;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Animal;
import animal.Famille;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefAnimal {

private Animal bobby = new Animal("bobby", "France");
private Famille famille = new Famille("AHDJOUDJ", "34 rue truffaut");
	
	@Given("^un \"([^\"]*)\" et un \"([^\"]*)\"$")
	public void creationAnimal(String nom, String pays) {
		bobby = new Animal(nom, pays);
	    assertTrue((nom != null) && (pays != null));
	}

	@When("^Quand l utilisateur valide la creation de l animal$")
	public void validerCreationAnimal() {
	    assertTrue(bobby != null);
	}

	@Then("^Une instance de la classe animal est creee avec un \"([^\"]*)\" et un \"([^\"]*)\" \\.$")
	public void animalCréé(String nom, String pays) {
	    assertTrue(bobby.getNom()==nom && bobby.getPays()==pays);
	}
	
	@Given("^Le \"([^\"]*)\" vers lequel voyage l animal$")
	public void paysDeAnimal(String pays) {
		bobby.voyageVers(pays);
	    assertTrue(pays != null);
	}

	@When("^Quand le voyage vers \"([^\"]*)\" est valide$")
	public void quand_le_voyage_est_valide(String pays) {
		bobby.voyageVers(pays);
		assertTrue(bobby.getPays()!= null );
	}

	@Then("^le \"([^\"]*)\" de l animal est change$")
	public void le_de_l_animal_est_change(String pays) {
		assertTrue(bobby.getPays()== pays );
		
	}
	
	@When("^Quand le voyage vers null vide est valide$")
	public void quand_le_voyage_vers_null_vide(String pays) {
	   bobby.voyageVers(pays);
	}
	
	@Then("^le null est inchange\\.$")
	public void le_null_est_inchange(String pays) {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(bobby.getPays()!= pays);
	}

	@Given("^Je souhaite lier un animal a une famille$")
	public void je_souhaite_lier_un_animal_a_une_famille() {
		assertTrue(famille != null && bobby != null);
	}

	@When("^Quand la famille adopte un \"([^\"]*)\"$")
	public void quand_la_famille_adopte_un(String string) {
		assertTrue(famille.ajouterAnimal(bobby));
	}

	@Then("^L animal est ajoute a la liste d animaux de la famille$")
	public void l_animal_est_ajout_la_liste_d_animaux_de_la_famille() {
		assertTrue(famille.animalExiste(bobby));
	}

	@Given("^Je souhaite lier un animal existant a une famille$")
	public void je_souhaite_lier_un_animal_existant_a_une_famille() {
		assertTrue(bobby!= null && famille != null);
	}
	
	@When("^Quand la famille adopte un bobby$")
	public void quand_la_famille_adopte_un_bobby() {
		assertTrue(!famille.ajouterAnimal(bobby));
	}
	
	@Then("^L animal n est pas ajoute$")
	public void l_animal_n_est_pas_ajoute() {
		assertTrue(famille.animalExiste(bobby));

	}
}
