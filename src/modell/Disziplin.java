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
    public int punktzahl;
    protected Schueler schueler;
    protected int aktuellesJahr = (new GregorianCalendar().get(Calendar.YEAR));

    public Disziplin(Schueler s) {
        schueler = s;
    }

    abstract public int punktzahlberechnen();

    public void setLeistung(int wert) {
        leistung = wert;
    }

    public int getLeistung() {
        return leistung;
    }

    public Schueler getSchueler() {
        return schueler;
    }

}
