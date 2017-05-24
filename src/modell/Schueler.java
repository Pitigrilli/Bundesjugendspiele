/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author zehe.jonas
 */
import java.util.ArrayList;
public class Schueler {

    private String name;
    private String klasse;

    private int geburtsjahr;
    private char geschlecht;
    private int gesamtpunktzahl;
    private char urkunde;
    
protected ArrayList <Disziplin> disziplinen = new ArrayList<> ();

    public Schueler() {
        disziplinen.add(new Tauchen(this));
        disziplinen.add(new Freistil(this));
        disziplinen.add(new Rueckenschwimmen(this));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getGesamtpunktzahl() {
        return gesamtpunktzahl;
    }

    public void setGesamtpunktzahl(int gesamtpunktzahl) {
        this.gesamtpunktzahl = gesamtpunktzahl;
    }

    public char getUrkunde() {
        return urkunde;
    }

    public void setUrkunde(char urkunde) {
        this.urkunde = urkunde;
    }

    public ArrayList<Disziplin> getDisziplinen() {
        return disziplinen;
    }
    
    
}
