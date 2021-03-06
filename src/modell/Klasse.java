package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author holler.nils
 */
public class Klasse implements Serializable, Comparable {
    private String name;
    private final ArrayList<Schueler> schueler;

    public Klasse(String name) {
        this.schueler = new ArrayList<>();
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Klasse k = (Klasse) o;
        return this.name.compareTo(k.getName());
    }

    /**
     * @return the Schueler
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
    
    public ArrayList<Schueler> getBestGirls(){
        ArrayList<Schueler> bestGirls = new ArrayList<>();
        for(Schueler s: schueler)
            if(s.getGeschlecht()=='w')
                bestGirls.add(s);
        Collections.sort(bestGirls, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return bestGirls;
    }
    
    public ArrayList<Schueler> getBestBoys(){
        ArrayList<Schueler> bestBoys = new ArrayList<>();
        for(Schueler s: schueler)
            if(s.getGeschlecht()=='m')
                bestBoys.add(s);
        Collections.sort(bestBoys, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return bestBoys;
    }
}



