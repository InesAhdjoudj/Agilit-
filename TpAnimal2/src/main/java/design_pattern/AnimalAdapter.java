package design_pattern;

import animal.Animal;
import personnage.Personnage;

public class AnimalAdapter extends Personnage {
	private Animal animal;

	public AnimalAdapter(Animal animal) {
		super(animal.getNom());
		this.animal = animal;
	}
	public String getPays(){
        return this.animal.getPays();
    }
	public String voyageVers(String nouveauPays)
    {
        if (nouveauPays!= null) 
        	this.animal.setPays(nouveauPays);
        return this.animal.getPays();
        
    }
	
}
