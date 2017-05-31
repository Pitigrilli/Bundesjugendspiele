package modell;

/**
 *
 * @author zehe.jonas
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Schueler implements Serializable {

    private String name;
    private String klasse;
    private int geburtsjahr;
    private char geschlecht;
    protected ArrayList<Disziplin> disziplinen;

    public Schueler() {
        disziplinen = new ArrayList<>();
        disziplinen.add(new Tauchen(this));
        disziplinen.add(new Freistil(this));
        disziplinen.add(new Rueckenschwimmen(this));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    
    public int getAlter(){
        int aktuellesJahr = (new GregorianCalendar().get(Calendar.YEAR));
        return aktuellesJahr - geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getGesamtpunktzahl() {
        int gesamtpunktzahl = 0;
        for (Disziplin d : disziplinen) {
            gesamtpunktzahl += d.punktzahlberechnen();
        }
        return gesamtpunktzahl;
    }

    public char getUrkunde() {
        char urkunde;
        urkunde = ' ';
        return urkunde;
    }

    public ArrayList<Disziplin> getDisziplinen() {
        return disziplinen;
    }

}
