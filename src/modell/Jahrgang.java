package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author finckh.stefan
 */
public class Jahrgang implements Serializable, Comparable {

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
    
    public ArrayList<Schueler> getSchuelerliste(){
        ArrayList<Schueler> schuelerliste = new ArrayList<>();
        for(Klasse k : klassen){
            for(Schueler s : k.getSchueler()){
                schuelerliste.add(s);
            }
        }
        return schuelerliste;
    }
    
    public ArrayList<Schueler> getBestGirls(){
        ArrayList<Schueler> bestGirls = new ArrayList<>();
        ArrayList<Schueler> schueler = getSchuelerliste();
        for(Schueler s: schueler)
            if(s.getGeschlecht()=='w')
                bestGirls.add(s);
        Collections.sort(bestGirls, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return bestGirls;
    }
    
    public ArrayList<Schueler> getBestBoys(){
        ArrayList<Schueler> bestBoys = new ArrayList<>();
        ArrayList<Schueler> schueler = getSchuelerliste();
        for(Schueler s: schueler)
            if(s.getGeschlecht()=='m')
                bestBoys.add(s);
        Collections.sort(bestBoys, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return bestBoys;
    }
    
    public ArrayList<Schueler> getBestPupils(){
        ArrayList<Schueler> bestPupils = new ArrayList<>();
        ArrayList<Schueler> schueler = getSchuelerliste();
        for(Schueler s: schueler)
            bestPupils.add(s);
        Collections.sort(bestPupils, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return bestPupils;
    }
    
    @Override
    public int compareTo(Object o) {
        Jahrgang j = (Jahrgang) o;
        Integer nameInt = new Integer(name);
        Integer andereInt = new Integer(j.getName());
        return nameInt.compareTo(andereInt);
    }
}
