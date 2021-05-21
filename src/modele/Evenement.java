package modele;
public class Evenement implements Comparable <Evenement> {
    private Date date;
    private String nom;
    private String lieu;
    private static int nombreDobjets ; // les champs entiers sont initialisés par défaut à 0
    // on peut quand même faire l'initialisation ici avec la déclaration
    public Evenement (){
        nombreDobjets ++;
    }

    public Evenement (Date parDate, String parNom , String parLieu) {
        date = parDate;
        nom = parNom;
        lieu = parLieu ;
        nombreDobjets ++;
    }



    // 3) Accesseurs et modifieurs

    public Date getDate ()  {
        return date;
    }

    public String getNom () {
        return nom;
    }

    public static int getNombreDobjets () { // accesseur sur un champ static
        return nombreDobjets;
    }

    public void setLieu (String parLieu) {
        lieu = parLieu;
    }


    public int compareTo (Evenement parEvt) {
        // retourne -1 si this précède parEvt, 1 si parEvt précède this
        // la comparaison est faite sur les dates puis sur le nom de l'événement
        int precede = this.date.compareTo(parEvt.date);
        if (precede == 0)
            // les dates sont égales on compare les noms des événements par ordre alphabétique
            return  (this.nom+this.lieu).compareTo (parEvt.nom+parEvt.lieu);
        else return precede;
    }

    public String toString () {
        return /*date + " - " +*/ nom + " - " + lieu ;
    }
} // classe Evenement