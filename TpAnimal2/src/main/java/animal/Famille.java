package animal;

import java.util.ArrayList;

public class Famille {
	private String nomFamille;
	private String adresse;
	private ArrayList<Animal> listeAnimaux;
	public String getNomFamille() {
		return nomFamille;
	}
	public void setNomFamille(String nomFamille) {
		this.nomFamille = nomFamille;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public ArrayList<Animal> getListeAnimaux() {
		return listeAnimaux;
	}
	public void setListeAnimaux(ArrayList<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}
	 
	public Famille(String nomFamille, String adresse) {
		this.nomFamille = nomFamille;
		this.adresse = adresse;
		this.listeAnimaux = new ArrayList<Animal>();
	}
	public boolean animalExiste(Animal animal) {
		for(Animal a : listeAnimaux) {
		   if (a.getNom()== animal.getNom() && a.getPays()==animal.getPays())
			return true;
		
		}
		return false;
	
	}
	public boolean ajouterAnimal(Animal animal) {
		if (!animalExiste(animal) ) {
			listeAnimaux.add(animal);
			return true;
		}
		return false;
	}
	
	
}

