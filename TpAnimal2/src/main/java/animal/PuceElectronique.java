package animal;


/**
 * D�crivez votre classe Puce ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class PuceElectronique
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
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
     * Un exemple de m�thode - remplacez ce commentaire par le v�tre
     *
     * @param  y   le param�tre de la m�thode
     * @return     la somme de x et de y
     */
    public String afficherNomAnimal()
    {
        // Ins�rez votre code ici
        return "L'animal s'appel " + this.unAnimal.getNom();
    }
}
