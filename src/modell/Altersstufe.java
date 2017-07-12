/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author holler.nils
 */
public class Altersstufe {

    BJS bjs;
    ArrayList<Integer> geburtsjahre;

    public ArrayList<Integer> getGeburtsjahre() {
        return geburtsjahre;
    }

    public Altersstufe(BJS bjs) {
        this.bjs = bjs;

        geburtsjahre = new ArrayList<>();

        ArrayList<Schueler> schueler = bjs.getAlleSchueler();

        for (Schueler s : schueler) {
            if (!containsGeburtsjahr(s.getGeburtsjahr())) {
                geburtsjahre.add(new Integer(s.getGeburtsjahr()));
            }
        }
        geburtsjahre.sort(null);
    }

    public ArrayList<Schueler> sortByAge(int geburtsjahr, char geschlecht) {
        System.out.println("Geburtsjahr "+geburtsjahr+" Geschlecht: "+geschlecht);
        ArrayList<Schueler> altersliste = new ArrayList<>();
        ArrayList<Schueler> schueler = bjs.getAlleSchueler();
        for (Schueler s : schueler) {
            if ((s.getGeburtsjahr() == geburtsjahr) && (s.getGeschlecht() == geschlecht)) {
                altersliste.add(s);
            }
        }
        Collections.sort(altersliste, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? +1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        System.out.println("Anzahl Schüler: "+altersliste.size());
        return altersliste;
    }

    public boolean containsGeburtsjahr(int year) {
        boolean contains = false;
        for (int i = 0; i < geburtsjahre.size(); i++) {
            if (geburtsjahre.get(i) == year) {
                contains = true;
            }
        }
        return contains;
    }
}
