package model;

public class Frachtgut {

    protected String bezeichnung;

    public Frachtgut(String bez){
        this.bezeichnung = bez;
    }

    public boolean istGefahrgut(){
        return false;
    }

    public boolean istKuehlgut(){
        return false;
    }

    public String gibInfo(){
        return this.bezeichnung;
    }
}
