/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author jelinek.loris
 */
public abstract class Disziplin {

    private int leistung;
    private int punktzahl;
    private Schueler schueler;
    
    public Disziplin(Schueler s){
        schueler = s;
    }
    

    abstract public int punktzahlberechnen(int Meter);

    public void setLeistung(int wert) {
        leistung = wert;
    }
}
