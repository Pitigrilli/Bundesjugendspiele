/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import modell.Schueler;

/**
 *
 * @author holler.nils
 */
public class testTauchen {

    public static void main(String[] args) {
        ArrayList<modell.Schueler> schueler = new ArrayList<>();
        for (int i = 3; i < 20; i++) {
            modell.Schueler neuerSchueler = new modell.Schueler();
            neuerSchueler.setGeburtsjahr(2007);
            neuerSchueler.setGeschlecht('m');
            neuerSchueler.getDisziplinen().get(0).setLeistung(i);
            schueler.add(neuerSchueler);
        }

        for (Schueler schueler1 : schueler) {
            System.out.println(schueler1.getDisziplinen().get(0).punktzahlberechnen());
        }
    }
}
