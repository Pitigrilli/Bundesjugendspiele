package modell;

import java.io.Serializable;
import modell.Schueler;

public class Freistil extends Disziplin implements Serializable {

    public Freistil(Schueler s) {

        super(s);

    }

    @Override
    public void setLeistung(String wert){
        System.out.println(wert);
        leistung = (Integer.parseInt(wert.substring(0,1)))*60 + (Integer.parseInt(wert.substring(2,4)));
        punktzahl = punktzahlberechnen();
    }
    
    @Override
    public int punktzahlberechnen() {
        int punktzahlNeu = 0;
        char geschlecht = schueler.getGeschlecht();
        int alter = schueler.getAlter();
        switch (geschlecht) {
            case 'm':
                switch (alter) {
                    case 10:
                        if (leistung > 100) {
                            punktzahlNeu = 0;
                        } else if (leistung > 95) {
                            punktzahlNeu = 1;
                        } else if (leistung > 90) {
                            punktzahlNeu = 2;
                        } else if (leistung > 85) {
                            punktzahlNeu = 3;
                        } else if (leistung > 80) {
                            punktzahlNeu = 4;
                        } else if (leistung > 76) {
                            punktzahlNeu = 5;
                        } else if (leistung > 72) {
                            punktzahlNeu = 6;
                        } else if (leistung > 69) {
                            punktzahlNeu = 7;
                        } else if (leistung > 66) {
                            punktzahlNeu = 8;
                        } else if (leistung > 63) {
                            punktzahlNeu = 9;
                        } else if (leistung > 61) {
                            punktzahlNeu = 10;
                        } else if (leistung > 59) {
                            punktzahlNeu = 11;
                        } else if (leistung > 57) {
                            punktzahlNeu = 12;
                        } else if (leistung > 55) {
                            punktzahlNeu = 13;
                        } else if (leistung > 53) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 11:
                        if (leistung > 95) {
                            punktzahlNeu = 0;
                        } else if (leistung > 90) {
                            punktzahlNeu = 1;
                        } else if (leistung > 85) {
                            punktzahlNeu = 2;
                        } else if (leistung > 80) {
                            punktzahlNeu = 3;
                        } else if (leistung > 76) {
                            punktzahlNeu = 4;
                        } else if (leistung > 72) {
                            punktzahlNeu = 5;
                        } else if (leistung > 69) {
                            punktzahlNeu = 6;
                        } else if (leistung > 66) {
                            punktzahlNeu = 7;
                        } else if (leistung > 63) {
                            punktzahlNeu = 8;
                        } else if (leistung > 61) {
                            punktzahlNeu = 9;
                        } else if (leistung > 59) {
                            punktzahlNeu = 10;
                        } else if (leistung > 57) {
                            punktzahlNeu = 11;
                        } else if (leistung > 55) {
                            punktzahlNeu = 12;
                        } else if (leistung > 53) {
                            punktzahlNeu = 13;
                        } else if (leistung > 51) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 12:
                        if (leistung > 86) {
                            punktzahlNeu = 0;
                        } else if (leistung > 81) {
                            punktzahlNeu = 1;
                        } else if (leistung > 76) {
                            punktzahlNeu = 2;
                        } else if (leistung > 71) {
                            punktzahlNeu = 3;
                        } else if (leistung > 67) {
                            punktzahlNeu = 4;
                        } else if (leistung > 63) {
                            punktzahlNeu = 5;
                        } else if (leistung > 60) {
                            punktzahlNeu = 6;
                        } else if (leistung > 57) {
                            punktzahlNeu = 7;
                        } else if (leistung > 54) {
                            punktzahlNeu = 8;
                        } else if (leistung > 52) {
                            punktzahlNeu = 9;
                        } else if (leistung > 50) {
                            punktzahlNeu = 10;
                        } else if (leistung > 48) {
                            punktzahlNeu = 11;
                        } else if (leistung > 46) {
                            punktzahlNeu = 12;
                        } else if (leistung > 44) {
                            punktzahlNeu = 13;
                        } else if (leistung > 42) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 13:
                    case 14:
                        if (leistung > 84) {
                            punktzahlNeu = 0;
                        } else if (leistung > 79) {
                            punktzahlNeu = 1;
                        } else if (leistung > 74) {
                            punktzahlNeu = 2;
                        } else if (leistung > 69) {
                            punktzahlNeu = 3;
                        } else if (leistung > 65) {
                            punktzahlNeu = 4;
                        } else if (leistung > 61) {
                            punktzahlNeu = 5;
                        } else if (leistung > 58) {
                            punktzahlNeu = 6;
                        } else if (leistung > 55) {
                            punktzahlNeu = 7;
                        } else if (leistung > 52) {
                            punktzahlNeu = 8;
                        } else if (leistung > 50) {
                            punktzahlNeu = 9;
                        } else if (leistung > 48) {
                            punktzahlNeu = 10;
                        } else if (leistung > 46) {
                            punktzahlNeu = 11;
                        } else if (leistung > 44) {
                            punktzahlNeu = 12;
                        } else if (leistung > 42) {
                            punktzahlNeu = 13;
                        } else if (leistung > 40) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;
                    case 15:
                        if (leistung > 73) {
                            punktzahlNeu = 0;
                        } else if (leistung > 66) {
                            punktzahlNeu = 1;
                        } else if (leistung > 63) {
                            punktzahlNeu = 2;
                        } else if (leistung > 59) {
                            punktzahlNeu = 3;
                        } else if (leistung > 55) {
                            punktzahlNeu = 4;
                        } else if (leistung > 53) {
                            punktzahlNeu = 5;
                        } else if (leistung > 49) {
                            punktzahlNeu = 6;
                        } else if (leistung > 46) {
                            punktzahlNeu = 7;
                        } else if (leistung > 44) {
                            punktzahlNeu = 8;
                        } else if (leistung > 42) {
                            punktzahlNeu = 9;
                        } else if (leistung > 40) {
                            punktzahlNeu = 10;
                        } else if (leistung > 38) {
                            punktzahlNeu = 11;
                        } else if (leistung > 37) {
                            punktzahlNeu = 12;
                        } else if (leistung > 36) {
                            punktzahlNeu = 13;
                        } else if (leistung > 35) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                }
                break;

            case 'w':
                switch (alter) {
                    case 10:
                        if (leistung > 100) {
                            punktzahlNeu = 0;
                        } else if (leistung > 95) {
                            punktzahlNeu = 1;
                        } else if (leistung > 90) {
                            punktzahlNeu = 2;
                        } else if (leistung > 85) {
                            punktzahlNeu = 3;
                        } else if (leistung > 80) {
                            punktzahlNeu = 4;
                        } else if (leistung > 76) {
                            punktzahlNeu = 5;
                        } else if (leistung > 72) {
                            punktzahlNeu = 6;
                        } else if (leistung > 69) {
                            punktzahlNeu = 7;
                        } else if (leistung > 66) {
                            punktzahlNeu = 8;
                        } else if (leistung > 63) {
                            punktzahlNeu = 9;
                        } else if (leistung > 61) {
                            punktzahlNeu = 10;
                        } else if (leistung > 59) {
                            punktzahlNeu = 11;
                        } else if (leistung > 57) {
                            punktzahlNeu = 12;
                        } else if (leistung > 55) {
                            punktzahlNeu = 13;
                        } else if (leistung > 53) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 11:
                        if (leistung > 95) {
                            punktzahlNeu = 0;
                        } else if (leistung > 90) {
                            punktzahlNeu = 1;
                        } else if (leistung > 85) {
                            punktzahlNeu = 2;
                        } else if (leistung > 80) {
                            punktzahlNeu = 3;
                        } else if (leistung > 76) {
                            punktzahlNeu = 4;
                        } else if (leistung > 72) {
                            punktzahlNeu = 5;
                        } else if (leistung > 69) {
                            punktzahlNeu = 6;
                        } else if (leistung > 66) {
                            punktzahlNeu = 7;
                        } else if (leistung > 63) {
                            punktzahlNeu = 8;
                        } else if (leistung > 61) {
                            punktzahlNeu = 9;
                        } else if (leistung > 59) {
                            punktzahlNeu = 10;
                        } else if (leistung > 57) {
                            punktzahlNeu = 11;
                        } else if (leistung > 55) {
                            punktzahlNeu = 12;
                        } else if (leistung > 53) {
                            punktzahlNeu = 13;
                        } else if (leistung > 51) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 12:
                        if (leistung > 93) {
                            punktzahlNeu = 0;
                        } else if (leistung > 88) {
                            punktzahlNeu = 1;
                        } else if (leistung > 83) {
                            punktzahlNeu = 2;
                        } else if (leistung > 78) {
                            punktzahlNeu = 3;
                        } else if (leistung > 74) {
                            punktzahlNeu = 4;
                        } else if (leistung > 70) {
                            punktzahlNeu = 5;
                        } else if (leistung > 67) {
                            punktzahlNeu = 6;
                        } else if (leistung > 64) {
                            punktzahlNeu = 7;
                        } else if (leistung > 61) {
                            punktzahlNeu = 8;
                        } else if (leistung > 59) {
                            punktzahlNeu = 9;
                        } else if (leistung > 57) {
                            punktzahlNeu = 10;
                        } else if (leistung > 55) {
                            punktzahlNeu = 11;
                        } else if (leistung > 53) {
                            punktzahlNeu = 12;
                        } else if (leistung > 51) {
                            punktzahlNeu = 13;
                        } else if (leistung > 49) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 13:
                    case 14:
                        if (leistung > 89) {
                            punktzahlNeu = 0;
                        } else if (leistung > 86) {
                            punktzahlNeu = 1;
                        } else if (leistung > 81) {
                            punktzahlNeu = 2;
                        } else if (leistung > 76) {
                            punktzahlNeu = 3;
                        } else if (leistung > 72) {
                            punktzahlNeu = 4;
                        } else if (leistung > 68) {
                            punktzahlNeu = 5;
                        } else if (leistung > 65) {
                            punktzahlNeu = 6;
                        } else if (leistung > 62) {
                            punktzahlNeu = 7;
                        } else if (leistung > 59) {
                            punktzahlNeu = 8;
                        } else if (leistung > 57) {
                            punktzahlNeu = 9;
                        } else if (leistung > 55) {
                            punktzahlNeu = 10;
                        } else if (leistung > 53) {
                            punktzahlNeu = 11;
                        } else if (leistung > 51) {
                            punktzahlNeu = 12;
                        } else if (leistung > 49) {
                            punktzahlNeu = 13;
                        } else if (leistung > 47) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;
                    case 15:
                        if (leistung > 80) {
                            punktzahlNeu = 0;
                        } else if (leistung > 75) {
                            punktzahlNeu = 1;
                        } else if (leistung > 70) {
                            punktzahlNeu = 2;
                        } else if (leistung > 66) {
                            punktzahlNeu = 3;
                        } else if (leistung > 62) {
                            punktzahlNeu = 4;
                        } else if (leistung > 59) {
                            punktzahlNeu = 5;
                        } else if (leistung > 56) {
                            punktzahlNeu = 6;
                        } else if (leistung > 53) {
                            punktzahlNeu = 7;
                        } else if (leistung > 51) {
                            punktzahlNeu = 8;
                        } else if (leistung > 49) {
                            punktzahlNeu = 9;
                        } else if (leistung > 47) {
                            punktzahlNeu = 10;
                        } else if (leistung > 45) {
                            punktzahlNeu = 11;
                        } else if (leistung > 44) {
                            punktzahlNeu = 12;
                        } else if (leistung > 43) {
                            punktzahlNeu = 13;
                        } else if (leistung > 42) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                }

        }

        return punktzahlNeu;
    }


}
