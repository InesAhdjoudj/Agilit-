package animal;

/**
 * D�crivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Animal
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
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
     * Un exemple de m�thode - remplacez ce commentaire par le v�tre
     *
     * @param  y   le param�tre de la m�thode
     * @return     la somme de x et de y
     */
    public String voyageVers(String nouveauPays)
    {
        // Ins�rez votre code ici
        this.pays = nouveauPays;
        return this.pays;
    }
}
