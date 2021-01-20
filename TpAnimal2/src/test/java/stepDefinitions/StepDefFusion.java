package stepDefinitions;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Animal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import design_pattern.AnimalAdapter;
import design_pattern.GeantDecorator;
import design_pattern.NainDecorator;
import personnage.Personnage;

public class StepDefFusion {
	private AnimalAdapter adapter;
	private Animal bobby;
	private GeantDecorator geant;
	private Personnage perso;
	private NainDecorator nain;
	
	@Given("un {string} et un {string}")
	public void on_donne_un(String string, String string2) {
		bobby = new Animal(string, string2);
		adapter = new AnimalAdapter(bobby);
		assertTrue((string != ""));
	}

	@When("Quand l utilisateur souhaite cr?er un personnage animal")
	public void quand_l_utilisateur_souhaite_cr_er_un_personnage_animal() {
		assertTrue(adapter != null);
	}

	@Then("Une instance de la classe personnage animal est creee avec le {string}")
	public void une_instance_de_la_classe_personnage_animal_est_creee_avec_le(String string) {
		assertTrue(adapter.getNom()==string);
	}
	
	@Given("On inflige des degats a un personne geant")
	public void On_a_un_personnage_de_type_geant() {
		perso = new Personnage("Romain");
        geant = new GeantDecorator(perso);
	}

	@When("Quand le geant subit des {int}")
	public void quand_le_geant_subit_des(Integer int1) {
		geant.subir(int1);
	}

	@Then("Je diminue ses points de vie en prenant en compte sa resistance et les {int}")
	public void je_diminue_ses_points_de_vie_en_prenant_en_compte_sa_resistance(Integer int1) {
		int vie = (geant.getPointDeVie() - (int)(int1 - (int1*0.5)));
		assertEquals(vie, geant.getPointDeVie());
	}

	@Given("On a un personnage de type nain")
	public void on_a_un_personnage_de_type_nain() {
		perso = new Personnage("Romain");
		nain = new NainDecorator(perso);
	}

	@When("Quand le nain subit des {int}")
	public void quand_le_nain_subit_des(Integer int1) {
		nain.subir(int1);
	}

	@Then("Je diminue ses points de vie en prenant en compte sa faiblesse et les {int}")
	public void je_diminue_ses_points_de_vie_en_prenant_en_compte_sa_faiblesse_et_les(Integer int1) {
		int vie = (nain.getPointDeVie() - (int)(int1 + (int1*0.5)));
		assertEquals(vie, nain.getPointDeVie());
	}
}
