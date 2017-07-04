package modell;

import java.util.ArrayList;

/**
 *
 * @author finckh.stefan
 */
public class Jahrgang {

    private final ArrayList<Klasse> klassen;
    private int name;

    public Jahrgang(int name) {
        this.klassen = new ArrayList<>();
        this.name = name;
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
    public int getName(){
        return name;
    }
}
