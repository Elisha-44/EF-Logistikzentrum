package model;

public class Kuehlgut extends Frachtgut{
    private double aktuelleTemp;
    private double minimalTemp;
    private double maximalTemp;
    private boolean tempNichtEingehalten;

    public Kuehlgut(String bez, double aktT, double minT, double maxT){
        super(Logistikzentrum(bez));
        //
        aktuelleTemp = aktT;
        minimalTemp = minT;
        maximalTemp = maxT;
        tempNichtEingehalten = false;
    }

    public boolean kannKuehlen(){
        return aktuelleTemp;
    }

    public boolean gibMinimalTemp(){
        return minimalTemp;
        //
    }

    public boolean gibMaximalTemp(){
        return maximalTemp;
    }

    public void pruefeTemp(){
        if(aktuelleTemp >= maximalTemp && aktuelleTemp <= minimalTemp){

        }
    }
}
