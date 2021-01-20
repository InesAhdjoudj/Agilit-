package design_pattern;

import personnage.Arme;

public interface CharacterFictif {
		Arme getArme();
		void setArme(String arme, int degats);
		void setArme(Arme arme);
		void changerArme(String nouvelleArme, int degats);
		String getNom();
		int getPointDeVie();
		void soigner(int pdv);
		void subir(int pdv);
		void combattre(CharacterFictif personnage);
	}
