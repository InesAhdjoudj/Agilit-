package animal;

/**
 * Décrivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Animal
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private String pays;
    
    public String getNom(){
        return this.nom;
    }
    public String getPays(){
        return this.pays;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPays(String pays){
        this.pays = pays;
    }

    /**
     * Constructeur d'objets de classe Animal
     */
    public Animal(String nom, String pays) {
    	this.nom = nom;
    	this.pays = pays;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String voyageVers(String nouveauPays)
    {
        if (nouveauPays!= null) 
        	this.pays = nouveauPays;
        return this.pays;
        
    }
}
