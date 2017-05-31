/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;

/**
 *
 * @author finckh.stefan
 */
public class Jahrgang {

    ArrayList<Klasse> klassen = new ArrayList<>();

    /**
     * Berechnet die durchschnittliche Gesamtpunktzahl des gesamten Jahrgangs.
     *
     * @return
     */
    public double durchschnittErrechnen() {
        double punktedurchschnitt = 0;
        int gesamtpunkte = 0;
        int teilnehmerzahl = 0;

        for (Klasse klasse : klassen) {
            for (Schueler schueler : klasse.schueler) {
                gesamtpunkte += schueler.getGesamtpunktzahl();
                teilnehmerzahl++;
            }
        }

        punktedurchschnitt = gesamtpunkte / teilnehmerzahl;

        return punktedurchschnitt;
    }

    public void klasseHinzufügen(Klasse k) {

        klassen.add(k);

    }
}
