package modell;

import java.util.ArrayList;

/**
 *
 * @author finckh.stefan
 */
public class Jahrgang {

    private final ArrayList<Klasse> klassen;

    public Jahrgang() {
        this.klassen = new ArrayList<>();
    }

    /**
     * @return the klassen
     */
    public ArrayList<Klasse> getKlassen() {
        return klassen;
    }

    /**
     * Berechnet die durchschnittliche Gesamtpunktzahl des gesamten Jahrgangs.
     *
     * @return
     */
    public double durchschnittErrechnen() {

        int gesamtpunkte = 0;
        int teilnehmerzahl = 0;

        for (Klasse klasse : getKlassen()) {
            for (Schueler schueler : klasse.getSchueler()) {
                gesamtpunkte += schueler.getGesamtpunktzahl();
                teilnehmerzahl++;
            }
        }

        double punktedurchschnitt;
        punktedurchschnitt = gesamtpunkte / teilnehmerzahl;

        return punktedurchschnitt;
    }

    public void klasseHinzufügen(Klasse k) {

        getKlassen().add(k);

    }
}
