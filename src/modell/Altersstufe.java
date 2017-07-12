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

    public void setGeburtsjahre(ArrayList<Integer> geburtsjahre) {
        this.geburtsjahre = geburtsjahre;
    }

    public Altersstufe(BJS bjs) {
        this.bjs = bjs;
        boolean existiert = false;
        geburtsjahre = new ArrayList<Integer>();
        ArrayList<Schueler> schueler = bjs.getAlleSchueler();

        for (int g : geburtsjahre) {
            for (Schueler s : schueler) {
                if (g == s.getGeburtsjahr()) {
                    existiert = true;
                }

                if (!existiert) {
                    geburtsjahre.add((s.getGeburtsjahr()));
                }

            }
        }
    }

    public ArrayList<Schueler> sortByAge(int geburtsjahr, char geschlecht) {
        ArrayList<Schueler> altersliste = new ArrayList<>();
        ArrayList<Schueler> schueler = bjs.getAlleSchueler();
        for (Schueler s : schueler) {
            if (s.getGeburtsjahr() == geburtsjahr && s.getGeschlecht() == geschlecht) {
                altersliste.add(s);
            }
        }
        Collections.sort(altersliste, (a, b) -> a.getGesamtpunktzahl() < b.getGesamtpunktzahl() ? 1 : a.getGesamtpunktzahl() == b.getGesamtpunktzahl() ? 0 : -1);
        return altersliste;
    }
}
