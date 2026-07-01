package model;

public class Kuehlgut extends Frachtgut{
    private double aktuelleTemp;
    private double minimalTemp;
    private double maximalTemp;
    private boolean tempNichtEingehalten;

    public Kuehlgut(String bez, double aktT, double minT, double maxT){
        super(bez);
        aktuelleTemp = aktT;
        minimalTemp = minT;
        maximalTemp = maxT;
        tempNichtEingehalten = false;
    }

    public double gibAktuelleTemperatur(){
        return aktuelleTemp;
    }

    public double gibMinimalTemp(){
        return minimalTemp;
    }

    public double gibMaximaleTemp(){
        return maximalTemp;
    }

    public void pruefeTemp(){
        if(aktuelleTemp >= maximalTemp && aktuelleTemp <= minimalTemp){
            tempNichtEingehalten = true;
        }
    }

    public boolean gibObTempEingehaltenWurde(){
        return tempNichtEingehalten;
    }

    public boolean istKuehlgut(){
        return true;
    }

    public String gibInfo(){
        return "Es handelt sich um ein Kuehlgut mit der Bezeichnung " + bezeichnung;
    }
}
