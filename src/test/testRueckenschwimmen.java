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
 * @author kamolz.philipp
 */
public class testRueckenschwimmen {

    public static void main(String[] args) {
        ArrayList<modell.Schueler> schueler = new ArrayList<>();
        for (int i = 120; i < 0; i--) {
            modell.Schueler neuerSchueler = new modell.Schueler();
            neuerSchueler.setGeburtsjahr(2007);
            neuerSchueler.setGeschlecht('m');
            neuerSchueler.getDisziplinen().get(2).setLeistung(i);
            schueler.add(neuerSchueler);
        }

        for (Schueler schueler1 : schueler) {
            System.out.println(schueler1.getDisziplinen().get(2).punktzahlberechnen());
        }
    }
}
