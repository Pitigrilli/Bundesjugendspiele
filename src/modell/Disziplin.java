/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author jelinek.loris
 */
public abstract class Disziplin implements Serializable {

    protected int leistung;
    protected String leistungString;
    protected int punktzahl;
    protected Schueler schueler;

    public Disziplin(Schueler s) {
        schueler = s;
    }

    abstract public int punktzahlberechnen();

    public abstract void setLeistung(String wert);

//    public void setLeistung(int leistung) {
//        this.leistung = leistung;
//    }

    public void setLeistungString(String leistungString) {
        this.leistungString = leistungString;
        setLeistung(leistungString);
        punktzahl = punktzahlberechnen();
    }

    public int getLeistung() {
        return leistung;
    }

    public Schueler getSchueler() {
        return schueler;
    }

    public String getLeistungString() {
        return leistungString;
    }

    public int getPunktzahl() {
        return punktzahl;
    }

}
