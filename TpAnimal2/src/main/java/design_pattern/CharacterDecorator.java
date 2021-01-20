package design_pattern;

import personnage.Arme;

public class CharacterDecorator implements CharacterFictif {
	private CharacterFictif characterFictif;
    
    public CharacterDecorator(CharacterFictif c)
    {
        this.characterFictif = c;
        
        
    }
    
	public String getNom() {
		return this.characterFictif.getNom();
	}

	public int getPointDeVie() {
		return this.characterFictif.getPointDeVie();
	}

	public void soigner(int pdv) {
		this.characterFictif.soigner(pdv);
	}

	public void subir(int pdv) {
		this.characterFictif.subir(pdv);
	}

	public void combattre(CharacterFictif personnage) {
		this.characterFictif.combattre(personnage);
	}

	public Arme getArme() {
		return this.characterFictif.getArme();
	}

	public void setArme(String arme, int degats) {
		this.characterFictif.setArme(arme, degats);
	}

	public void setArme(Arme arme) {
		this.characterFictif.setArme(arme);
	}

	public void changerArme(String nouvelleArme, int degats) {
		this.characterFictif.changerArme(nouvelleArme, degats);
	}

}
