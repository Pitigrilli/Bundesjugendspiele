/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author finckh.stefan
 */
public class testSpeicherung {

    public static void main(String[] args) {
        helper.Speicherung speicherung = new helper.Speicherung();
        ArrayList<modell.Schueler> schuelerliste = speicherung.gibListe();
        for (modell.Schueler schueler : schuelerliste) {
            System.out.println(schueler.toString());

        }

    }
}
