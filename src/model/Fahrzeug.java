package model;

public class Fahrzeug {

    private String bezeichnung;
    private boolean kuehl;
    private boolean sicher;
    private Frachtgut frachtgut;

    public Fahrzeug(String bez, boolean kuehl, boolean sicher){
        this.bezeichnung = bez;
        this.kuehl = kuehl;
        this.sicher = sicher;
        this.frachtgut = null;
    }

    public boolean kannKuehlen(){
        return this.kuehl;
    }

    public boolean istSicher(){
        return this.sicher;
    }

    public Frachtgut gibFrachtgut(){
        return this.frachtgut;
    }

    public void setzeFrachgut(Frachtgut gut){
       if(gut != null){
           this.frachtgut=gut;

       }
    }

    /**
     * Es wird ein neuer String erstellt.
     * Dieser enthält die Bezeichnung des Fahrzeug-Objekts und teilt mit,
     * ob das Fahrzeug-Objekt kühlen kann und ob es sicher ist.
     * @return Gesammlte Informationen zum Fahrzeug
     */
    public String gibInfo(){
        return bezeichnung + " - kann kühlen: " + kuehl + " - ist sicher: " + sicher;
    }
}
