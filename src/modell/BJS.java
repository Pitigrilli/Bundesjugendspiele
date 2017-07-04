/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author behl.claus
 */
public class BJS implements Serializable {

    ArrayList<modell.Schueler> alleSchueler = new ArrayList<>();;
    ArrayList<Jahrgang> jahrgangliste = new ArrayList<>();
    ArrayList<Klasse> alleKlassen = new ArrayList<>();

    public Klasse getKlasse(int i) {
        return alleKlassen.get(i);
    }

    public ArrayList<Schueler> getAlleSchueler() {
        return alleSchueler;
    }

    public ArrayList<Jahrgang> getJahrgangliste() {
        return jahrgangliste;
    }

    public ArrayList<Klasse> getAlleKlassen() {
        return alleKlassen;
    }

    public void setAlleSchueler(ArrayList<Schueler> alleSchueler) {
        this.alleSchueler = alleSchueler;
    }

    public void setJahrgangliste(ArrayList<Jahrgang> jahrgangliste) {
        this.jahrgangliste = jahrgangliste;
    }

    public void setAlleKlassen(ArrayList<Klasse> alleKlassen) {
        this.alleKlassen = alleKlassen;
    }
    
    
    

}
