package modell;

/**
 *
 * @author zehe.jonas
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Schueler implements Serializable, Comparable {

    private String name;
    private String klasse;
    private int geburtsjahr;
    private char geschlecht;
    protected ArrayList<Disziplin> disziplinen;

    public Schueler(char geschlecht, String name, String klasse, int geburtsjahr) {
        this.geschlecht = geschlecht;
        this.geburtsjahr = geburtsjahr;
        this.klasse = klasse;
        this.name = name;
        disziplinen = new ArrayList<>();
        disziplinen.add(new Tauchen(this));
        disziplinen.add(new Freistil(this));
        disziplinen.add(new Rueckenschwimmen(this));
    }

    @Override
    public int compareTo(Object o) {
        Schueler s = (Schueler)o;
        return name.compareTo(s.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public String getKlasse() {
        return klasse;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }
    
    

    public int getAlter() {
        int aktuellesJahr = (new GregorianCalendar().get(Calendar.YEAR));
        return aktuellesJahr - geburtsjahr;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public int getGesamtpunktzahl() {
        int gesamtpunktzahl = 0;
        for (Disziplin d : disziplinen) {
            gesamtpunktzahl += d.getPunktzahl();
        }
        return gesamtpunktzahl;
    }

    public String getUrkunde() {
        String urkunde;
        if (getGesamtpunktzahl() >= 39) {
            urkunde = "E";
        } else if (getGesamtpunktzahl() >= 22) {
            urkunde = "S";
        } else {
            urkunde = "";
        }
        return urkunde;
    }

    public ArrayList<Disziplin> getDisziplinen() {
        return disziplinen;
    }

    public String toString() {
        String schueler = name + ", " + klasse + ", " + geburtsjahr + ", "
                + geschlecht + " Leistung Tauchen: " + disziplinen.get(0).getLeistung() +" T-Pkt.: "+disziplinen.get(0).getPunktzahl()
                + " Leistung Freistil: " + disziplinen.get(1).getLeistung() + " Leistung Rueckenschwimmen: "
                + disziplinen.get(2).getLeistung()+" R-Pkt.: "+disziplinen.get(2).getPunktzahl();
        return schueler;
    }
    

}
