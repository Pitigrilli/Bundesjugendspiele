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
    private String vorname;
    private int geburtsjahr;
    private char geschlecht;
    private int gesamtpunktzahl;
    private char urkunde;
ArrayList <String> Disziplin = new ArrayList<String> ();
    public void Disziplin(){

        Disziplin.add("Tauchen");
        Disziplin.add("Freistil");
        Disziplin.add("Rücken");
    }

    public Schueler() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
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
}
