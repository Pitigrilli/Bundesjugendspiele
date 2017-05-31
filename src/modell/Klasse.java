package modell;

import java.util.ArrayList;

/**
 *
 * @author holler.nils
 */
public class Klasse {

    private final ArrayList<Schueler> schueler;

    public Klasse() {
        this.schueler = new ArrayList<>();
    }

    /**
     * @return the schueler
     */
    public ArrayList<Schueler> getSchueler() {
        return schueler;
    }

    public float punktedurchschnittBerechnen() {
        float punktedurchschnitt = 0;
        return punktedurchschnitt;
    }

    public void alleSchuelerConsoleAusgeben() {
        System.out.println(getSchueler().toString());
    }

    public void schuelerHinzufügen(Schueler s) {
        getSchueler().add(s);
    }
}
