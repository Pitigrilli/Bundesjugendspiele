package modell;

import java.io.Serializable;

/**
 *
 * @author holler.nils
 */
public class Tauchen extends Disziplin implements Serializable {

    public Tauchen(Schueler s) {
        super(s);
    }
    
    @Override
    public void setLeistung(String wert){
        leistung = ((int) wert.charAt(1))*60 + ((int) wert.charAt(3))+((int) wert.charAt(4))*60;
    }
    @Override
    public int punktzahlberechnen() {
        char geschlecht = schueler.getGeschlecht();
        int alter;
        alter = schueler.getAlter();
        switch (geschlecht) {
            case 'm':
                switch (alter) {
                    case 10:
                        if (leistung < 4) {
                            return 0;
                        } else if (leistung >= 4 && leistung < 18) {
                            return leistung - 3;
                        } else {
                            return 15;
                        }
                    case 11:
                        if (leistung < 4) {
                            return 0;
                        } else if (leistung >= 4 && leistung < 18) {
                            return leistung - 3;
                        } else {
                            return 15;
                        }
                    case 12:
                        if (leistung < 8) {
                            return 0;
                        } else if (leistung >= 8 && leistung < 22) {
                            return leistung - 7;
                        } else {
                            return 15;
                        }
                    case 13:
                        if (leistung < 10) {
                            return 0;
                        } else if (leistung >= 10 && leistung < 24) {
                            return leistung - 9;
                        } else {
                            return 15;
                        }
                    case 14:
                        if (leistung < 11) {
                            return 0;
                        } else if (leistung >= 11 && leistung < 25) {
                            return leistung - 10;
                        } else {
                            return 15;
                        }
                    case 15:
                        if (leistung < 12) {
                            return 0;
                        } else if (leistung >= 12 && leistung < 26) {
                            return leistung - 11;
                        } else {
                            return 15;
                        }
                }
                break;
            case 'w':
                switch (alter) {
                    case 10:
                        if (leistung < 4) {
                            return 0;
                        } else if (leistung >= 4 && leistung < 18) {
                            return leistung - 3;
                        } else {
                            return 15;
                        }
                    case 11:
                        if (leistung < 4) {
                            return 0;
                        } else if (leistung >= 4 && leistung < 18) {
                            return leistung - 3;
                        } else {
                            return 15;
                        }
                    case 12:
                        if (leistung < 6) {
                            return 0;
                        } else if (leistung >= 6 && leistung < 20) {
                            return leistung - 5;
                        } else {
                            return 15;
                        }
                    case 13:
                        if (leistung < 7) {
                            return 0;
                        } else if (leistung >= 7 && leistung < 21) {
                            return leistung - 6;
                        } else {
                            return 15;
                        }
                    case 14:
                        if (leistung < 8) {
                            return 0;
                        } else if (leistung >= 8 && leistung < 22) {
                            return leistung - 7;
                        } else {
                            return 15;
                        }
                    case 15:
                        if (leistung < 8) {
                            return 0;
                        } else if (leistung >= 8 && leistung < 22) {
                            return leistung - 7;
                        } else {
                            return 15;
                        }
                }
                break;
        }
        return 0;//fraglich
    }
}
