package test;

import java.util.ArrayList;
import modell.Schueler;

/**
 *
 * @author kamolz.philipp
 */
public class testRueckenschwimmen {

    public static void main(String[] args) {
        ArrayList<modell.Schueler> schuelerliste = new ArrayList<>();
        for (int i = 50; i <120; i++) {
            modell.Schueler neuerSchueler = new modell.Schueler('m',"hans, dampf","06f",2008);
            neuerSchueler.setGeburtsjahr(2007);
            neuerSchueler.setGeschlecht('m');
            neuerSchueler.getDisziplinen().get(2).setLeistung("1:56");
            schuelerliste.add(neuerSchueler);
        }

        for (Schueler schueler1 : schuelerliste) {
            System.out.println(schueler1.getGeschlecht()+"\t"+
                    schueler1.getGeburtsjahr()+"\t"+
                    schueler1.getDisziplinen().get(2).getLeistung()+
                    "\t"+schueler1.getDisziplinen().get(2).punktzahlberechnen());
        }
    }
}
