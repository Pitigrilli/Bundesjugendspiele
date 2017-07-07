package modell;

import java.io.Serializable;

/**
 *
 * @author weir.clair
 */
public class Rueckenschwimmen extends Disziplin implements Serializable {

    public Rueckenschwimmen(Schueler s) {
        super(s);
    }

    @Override
    public void setLeistung(String wert) {
        System.out.println(wert);
        leistung = (Integer.parseInt(wert.substring(0, 1))) * 60 + (Integer.parseInt(wert.substring(2, 4)));
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
                        if (leistung > 109) {
                            punktzahlNeu = 0;
                        } else if (leistung > 104) {
                            punktzahlNeu = 1;
                        } else if (leistung > 99) {
                            punktzahlNeu = 2;
                        } else if (leistung > 94) {
                            punktzahlNeu = 3;
                        } else if (leistung > 89) {
                            punktzahlNeu = 4;
                        } else if (leistung > 84) {
                            punktzahlNeu = 5;
                        } else if (leistung > 79) {
                            punktzahlNeu = 6;
                        } else if (leistung > 75) {
                            punktzahlNeu = 7;
                        } else if (leistung > 71) {
                            punktzahlNeu = 8;
                        } else if (leistung > 68) {
                            punktzahlNeu = 9;
                        } else if (leistung > 65) {
                            punktzahlNeu = 10;
                        } else if (leistung > 62) {
                            punktzahlNeu = 11;
                        } else if (leistung > 60) {
                            punktzahlNeu = 12;
                        } else if (leistung > 58) {
                            punktzahlNeu = 13;
                        } else if (leistung > 56) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 11:
                        if (leistung > 104) {
                            punktzahlNeu = 0;
                        } else if (leistung > 99) {
                            punktzahlNeu = 1;
                        } else if (leistung > 94) {
                            punktzahlNeu = 2;
                        } else if (leistung > 89) {
                            punktzahlNeu = 3;
                        } else if (leistung > 84) {
                            punktzahlNeu = 4;
                        } else if (leistung > 79) {
                            punktzahlNeu = 5;
                        } else if (leistung > 75) {
                            punktzahlNeu = 6;
                        } else if (leistung > 71) {
                            punktzahlNeu = 7;
                        } else if (leistung > 68) {
                            punktzahlNeu = 8;
                        } else if (leistung > 65) {
                            punktzahlNeu = 9;
                        } else if (leistung > 62) {
                            punktzahlNeu = 10;
                        } else if (leistung > 60) {
                            punktzahlNeu = 11;
                        } else if (leistung > 58) {
                            punktzahlNeu = 12;
                        } else if (leistung > 56) {
                            punktzahlNeu = 13;
                        } else if (leistung > 54) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 12:
                        if (leistung > 89) {
                            punktzahlNeu = 0;
                        } else if (leistung > 84) {
                            punktzahlNeu = 1;
                        } else if (leistung > 79) {
                            punktzahlNeu = 2;
                        } else if (leistung > 75) {
                            punktzahlNeu = 3;
                        } else if (leistung > 71) {
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

                    case 13:
                    case 14:
                        if (leistung > 87) {
                            punktzahlNeu = 0;
                        } else if (leistung > 82) {
                            punktzahlNeu = 1;
                        } else if (leistung > 77) {
                            punktzahlNeu = 2;
                        } else if (leistung > 73) {
                            punktzahlNeu = 3;
                        } else if (leistung > 69) {
                            punktzahlNeu = 4;
                        } else if (leistung > 66) {
                            punktzahlNeu = 5;
                        } else if (leistung > 63) {
                            punktzahlNeu = 6;
                        } else if (leistung > 60) {
                            punktzahlNeu = 7;
                        } else if (leistung > 57) {
                            punktzahlNeu = 8;
                        } else if (leistung > 55) {
                            punktzahlNeu = 9;
                        } else if (leistung > 53) {
                            punktzahlNeu = 10;
                        } else if (leistung > 51) {
                            punktzahlNeu = 11;
                        } else if (leistung > 49) {
                            punktzahlNeu = 12;
                        } else if (leistung > 47) {
                            punktzahlNeu = 13;
                        } else if (leistung > 45) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;
                    case 15:
                        if (leistung > 82) {
                            punktzahlNeu = 0;
                        } else if (leistung > 77) {
                            punktzahlNeu = 1;
                        } else if (leistung > 72) {
                            punktzahlNeu = 2;
                        } else if (leistung > 68) {
                            punktzahlNeu = 3;
                        } else if (leistung > 64) {
                            punktzahlNeu = 4;
                        } else if (leistung > 61) {
                            punktzahlNeu = 5;
                        } else if (leistung > 58) {
                            punktzahlNeu = 6;
                        } else if (leistung > 55) {
                            punktzahlNeu = 7;
                        } else if (leistung > 53) {
                            punktzahlNeu = 8;
                        } else if (leistung > 51) {
                            punktzahlNeu = 9;
                        } else if (leistung > 49) {
                            punktzahlNeu = 10;
                        } else if (leistung > 47) {
                            punktzahlNeu = 11;
                        } else if (leistung > 46) {
                            punktzahlNeu = 12;
                        } else if (leistung > 45) {
                            punktzahlNeu = 13;
                        } else if (leistung > 44) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                }
                break;

            case 'w':
                switch (alter) {
                    case 10:
                        if (leistung > 109) {
                            punktzahlNeu = 0;
                        } else if (leistung > 104) {
                            punktzahlNeu = 1;
                        } else if (leistung > 99) {
                            punktzahlNeu = 2;
                        } else if (leistung > 94) {
                            punktzahlNeu = 3;
                        } else if (leistung > 89) {
                            punktzahlNeu = 4;
                        } else if (leistung > 84) {
                            punktzahlNeu = 5;
                        } else if (leistung > 79) {
                            punktzahlNeu = 6;
                        } else if (leistung > 75) {
                            punktzahlNeu = 7;
                        } else if (leistung > 71) {
                            punktzahlNeu = 8;
                        } else if (leistung > 68) {
                            punktzahlNeu = 9;
                        } else if (leistung > 65) {
                            punktzahlNeu = 10;
                        } else if (leistung > 62) {
                            punktzahlNeu = 11;
                        } else if (leistung > 60) {
                            punktzahlNeu = 12;
                        } else if (leistung > 58) {
                            punktzahlNeu = 13;
                        } else if (leistung > 56) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 11:
                        if (leistung > 104) {
                            punktzahlNeu = 0;
                        } else if (leistung > 99) {
                            punktzahlNeu = 1;
                        } else if (leistung > 94) {
                            punktzahlNeu = 2;
                        } else if (leistung > 89) {
                            punktzahlNeu = 3;
                        } else if (leistung > 84) {
                            punktzahlNeu = 4;
                        } else if (leistung > 79) {
                            punktzahlNeu = 5;
                        } else if (leistung > 75) {
                            punktzahlNeu = 6;
                        } else if (leistung > 71) {
                            punktzahlNeu = 7;
                        } else if (leistung > 68) {
                            punktzahlNeu = 8;
                        } else if (leistung > 65) {
                            punktzahlNeu = 9;
                        } else if (leistung > 62) {
                            punktzahlNeu = 10;
                        } else if (leistung > 60) {
                            punktzahlNeu = 11;
                        } else if (leistung > 58) {
                            punktzahlNeu = 12;
                        } else if (leistung > 56) {
                            punktzahlNeu = 13;
                        } else if (leistung > 54) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 12:
                        if (leistung > 99) {
                            punktzahlNeu = 0;
                        } else if (leistung > 94) {
                            punktzahlNeu = 1;
                        } else if (leistung > 89) {
                            punktzahlNeu = 2;
                        } else if (leistung > 84) {
                            punktzahlNeu = 3;
                        } else if (leistung > 79) {
                            punktzahlNeu = 4;
                        } else if (leistung > 75) {
                            punktzahlNeu = 5;
                        } else if (leistung > 71) {
                            punktzahlNeu = 6;
                        } else if (leistung > 68) {
                            punktzahlNeu = 7;
                        } else if (leistung > 65) {
                            punktzahlNeu = 8;
                        } else if (leistung > 62) {
                            punktzahlNeu = 9;
                        } else if (leistung > 60) {
                            punktzahlNeu = 10;
                        } else if (leistung > 58) {
                            punktzahlNeu = 11;
                        } else if (leistung > 56) {
                            punktzahlNeu = 12;
                        } else if (leistung > 54) {
                            punktzahlNeu = 13;
                        } else if (leistung > 52) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;

                    case 13:
                    case 14:
                        if (leistung > 94) {
                            punktzahlNeu = 0;
                        } else if (leistung > 89) {
                            punktzahlNeu = 1;
                        } else if (leistung > 84) {
                            punktzahlNeu = 2;
                        } else if (leistung > 79) {
                            punktzahlNeu = 3;
                        } else if (leistung > 75) {
                            punktzahlNeu = 4;
                        } else if (leistung > 71) {
                            punktzahlNeu = 5;
                        } else if (leistung > 68) {
                            punktzahlNeu = 6;
                        } else if (leistung > 65) {
                            punktzahlNeu = 7;
                        } else if (leistung > 62) {
                            punktzahlNeu = 8;
                        } else if (leistung > 60) {
                            punktzahlNeu = 9;
                        } else if (leistung > 58) {
                            punktzahlNeu = 10;
                        } else if (leistung > 56) {
                            punktzahlNeu = 11;
                        } else if (leistung > 54) {
                            punktzahlNeu = 12;
                        } else if (leistung > 52) {
                            punktzahlNeu = 13;
                        } else if (leistung > 50) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                        break;
                    case 15:
                        if (leistung > 86) {
                            punktzahlNeu = 0;
                        } else if (leistung > 81) {
                            punktzahlNeu = 1;
                        } else if (leistung > 76) {
                            punktzahlNeu = 2;
                        } else if (leistung > 72) {
                            punktzahlNeu = 3;
                        } else if (leistung > 66) {
                            punktzahlNeu = 4;
                        } else if (leistung > 65) {
                            punktzahlNeu = 5;
                        } else if (leistung > 62) {
                            punktzahlNeu = 6;
                        } else if (leistung > 59) {
                            punktzahlNeu = 7;
                        } else if (leistung > 57) {
                            punktzahlNeu = 8;
                        } else if (leistung > 55) {
                            punktzahlNeu = 9;
                        } else if (leistung > 53) {
                            punktzahlNeu = 10;
                        } else if (leistung > 51) {
                            punktzahlNeu = 11;
                        } else if (leistung > 50) {
                            punktzahlNeu = 12;
                        } else if (leistung > 49) {
                            punktzahlNeu = 13;
                        } else if (leistung > 48) {
                            punktzahlNeu = 14;
                        } else {
                            punktzahlNeu = 15;
                        }
                }

        }

        return punktzahlNeu;
    }

}
