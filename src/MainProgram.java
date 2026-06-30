import control.Logistikzentrum;

/**
 * Übungsprojekt.
 * Ressource zur Dokumentation:
 * https://docs.google.com/document/d/16xr-05QQ52qxDZ_cvKFc1Uz28cJrnGzRGMkzJe730XE/
 */

public class MainProgram {

    public static void main(String[] args) {
        Logistikzentrum lz = new Logistikzentrum("Käthes Hin-und-Her-Logistik");
        lz.verarbeiteWarteschlange();
    }
}
