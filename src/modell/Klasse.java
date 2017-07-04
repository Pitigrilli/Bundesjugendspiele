package modell;

import java.util.ArrayList;

/**
 *
 * @author holler.nils
 */
public class Klasse {
    private String name;
    private final ArrayList<Schueler> schueler;

    public Klasse(String name) {
        this.schueler = new ArrayList<>();
        this.name = name;
    }

    /**
     * @return the schueler
     */
    public ArrayList<Schueler> getSchueler() {
        return schueler;
    }

    public float punktedurchschnittBerechnen() {
        int klassegesamtpunktzahl = 0;
        for (Schueler s : schueler) {
            klassegesamtpunktzahl += s.getGesamtpunktzahl();
        }
        float punktedurchschnitt = klassegesamtpunktzahl/(schueler.size()); 
        return punktedurchschnitt;
    }

    public void alleSchuelerConsoleAusgeben() {
        System.out.println(getSchueler().toString());
    }

    public void schuelerHinzufügen(Schueler s) {
        getSchueler().add(s);
    }
    
    public String getName(){
        return name;
    }
}
