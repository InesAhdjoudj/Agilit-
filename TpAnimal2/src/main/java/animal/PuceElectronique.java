package animal;


/**
 * Décrivez votre classe Puce ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PuceElectronique
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Animal unAnimal;

    public void setAnimal(Animal unAnimal){
        this.unAnimal = unAnimal;
    }
    public Animal getAnimal(){
        return this.unAnimal;
    }
    /**
     * Constructeur d'objets de classe Puce
     */
    public PuceElectronique()
    {
        // initialisation des variables d'instance
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String afficherNomAnimal()
    {
        // Insérez votre code ici
        return "L'animal s'appel " + this.unAnimal.getNom();
    }
}
