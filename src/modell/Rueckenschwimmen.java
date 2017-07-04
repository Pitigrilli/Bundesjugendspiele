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
    public void setLeistung(String wert){
        System.out.println(wert);
        leistung = (Integer.parseInt(wert.substring(0,1)))*60 + (Integer.parseInt(wert.substring(2,4)));
        punktzahl = punktzahlberechnen();
    }
     public int punktzahlberechnen() {
        char geschlecht = schueler.getGeschlecht();
        int geburtsjahr = schueler.getGeburtsjahr();
        switch (geschlecht) {
            case 'm': {
                switch (geburtsjahr) {
                    case 2007:
                        if (leistung > 109) {
                            return 0;
                        }

                        if (leistung > 104) {
                            punktzahl = (-leistung + (109 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 99) {
                            punktzahl = (-leistung + (104 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 94) {
                            punktzahl = (-leistung + (99 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 89) {
                            punktzahl = (-leistung + (94 + 4 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 84) {
                            punktzahl = (-leistung + (89 + 5 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 79) {
                            punktzahl = (-leistung + (84 + 6 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 75) {
                            punktzahl = (-leistung + (79 + 7 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 71) {
                            punktzahl = (-leistung + (75 + 8 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 68) {
                            punktzahl = (-leistung + (71 + 9 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 65) {
                            punktzahl = (-leistung + (68 + 10 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 62) {
                            punktzahl = (-leistung + (65 + 11 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 60) {
                            punktzahl = (-leistung + (62 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 58) {
                            punktzahl = (-leistung + (60 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 56) {
                            punktzahl = (-leistung + (58 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2006:
                        if (leistung > 104) {
                            return 0;
                        }

                        if (leistung > 99) {
                            punktzahl = (-leistung + (104 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 94) {
                            punktzahl = (-leistung + (99 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 89) {
                            punktzahl = (-leistung + (94 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 84) {
                            punktzahl = (-leistung + (89 + 4 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 79) {
                            punktzahl = (-leistung + (84 + 5 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 75) {
                            punktzahl = (-leistung + (79 + 6 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 71) {
                            punktzahl = (-leistung + (75 + 7 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 68) {
                            punktzahl = (-leistung + (71 + 8 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 65) {
                            punktzahl = (-leistung + (68 + 9 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 62) {
                            punktzahl = (-leistung + (65 + 10 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 60) {
                            punktzahl = (-leistung + (62 + 11 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 58) {
                            punktzahl = (-leistung + (60 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 56) {
                            punktzahl = (-leistung + (58 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 54) {
                            punktzahl = (-leistung + (56 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2005:
                        if (leistung > 86) {
                            return 0;
                        }

                        if (leistung > 81) {
                            punktzahl = (-leistung + (86 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 76) {
                            punktzahl = (-leistung + (81 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 71) {
                            punktzahl = (-leistung + (76 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 67) {
                            punktzahl = (-leistung + (71 + 4 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 63) {
                            punktzahl = (-leistung + (67 + 5 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 60) {
                            punktzahl = (-leistung + (63 + 6 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 57) {
                            punktzahl = (-leistung + (60 + 7 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 54) {
                            punktzahl = (-leistung + (57 + 8 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 52) {
                            punktzahl = (-leistung + (54 + 9 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 50) {
                            punktzahl = (-leistung + (52 + 10 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 48) {
                            punktzahl = (-leistung + (50 + 11 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 46) {
                            punktzahl = (-leistung + (48 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 44) {
                            punktzahl = (-leistung + (46 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 42) {
                            punktzahl = (-leistung + (44 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2004:
                        if (leistung > 84) {
                            return 0;
                        }
                }
                if (leistung > 79) {
                    punktzahl = (-leistung + (84 + 1 * 5)) / 5;
                    return punktzahl;
                } else if (leistung > 74) {
                    punktzahl = (-leistung + (79 + 2 * 5)) / 5;
                    return punktzahl;
                } else if (leistung > 69) {
                    punktzahl = (-leistung + (74 + 3 * 5)) / 5;
                    return punktzahl;
                } else if (leistung > 65) {
                    punktzahl = (-leistung + (69 + 4 * 4)) / 4;
                    return punktzahl;
                } else if (leistung > 61) {
                    punktzahl = (-leistung + (65 + 5 * 4)) / 4;
                    return punktzahl;
                } else if (leistung > 58) {
                    punktzahl = (-leistung + (61 + 6 * 4)) / 4;
                    return punktzahl;
                } else if (leistung > 55) {
                    punktzahl = (-leistung + (58 + 7 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 52) {
                    punktzahl = (-leistung + (55 + 8 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 50) {
                    punktzahl = (-leistung + (52 + 9 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 48) {
                    punktzahl = (-leistung + (50 + 10 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 46) {
                    punktzahl = (-leistung + (48 + 11 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 44) {
                    punktzahl = (-leistung + (46 + 12 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 42) {
                    punktzahl = (-leistung + (44 + 13 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 40) {
                    punktzahl = (-leistung + (42 + 14 * 2)) / 2;
                    return punktzahl;
                } else {
                    return 15;

                }
            }
            case 'w': {
                switch (geburtsjahr) {
                    case 2007:
                        if (leistung > 100) {
                            return 0;
                        }

                        if (leistung > 95) {
                            punktzahl = (-leistung + (100 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 90) {
                            punktzahl = (-leistung + (95 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 85) {
                            punktzahl = (-leistung + (90 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 80) {
                            punktzahl = (-leistung + (85 + 4 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 76) {
                            punktzahl = (-leistung + (80 + 5 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 72) {
                            punktzahl = (-leistung + (76 + 6 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 69) {
                            punktzahl = (-leistung + (72 + 7 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 66) {
                            punktzahl = (-leistung + (69 + 8 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 63) {
                            punktzahl = (-leistung + (66 + 9 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 61) {
                            punktzahl = (-leistung + (63 + 10 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 59) {
                            punktzahl = (-leistung + (61 + 11 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 57) {
                            punktzahl = (-leistung + (59 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 55) {
                            punktzahl = (-leistung + (57 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 53) {
                            punktzahl = (-leistung + (55 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2006:
                        if (leistung > 95) {
                            return 0;
                        }

                        if (leistung > 90) {
                            punktzahl = (-leistung + (95 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 85) {
                            punktzahl = (-leistung + (90 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 80) {
                            punktzahl = (-leistung + (85 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 76) {
                            punktzahl = (-leistung + (80 + 4 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 72) {
                            punktzahl = (-leistung + (76 + 5 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 72) {
                            punktzahl = (-leistung + (69 + 6 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 66) {
                            punktzahl = (-leistung + (69 + 7 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 63) {
                            punktzahl = (-leistung + (66 + 8 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 61) {
                            punktzahl = (-leistung + (63 + 9 * 3)) / 2;
                            return punktzahl;
                        } else if (leistung > 59) {
                            punktzahl = (-leistung + (61 + 10 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 57) {
                            punktzahl = (-leistung + (59 + 11 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 55) {
                            punktzahl = (-leistung + (57 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 53) {
                            punktzahl = (-leistung + (55 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 51) {
                            punktzahl = (-leistung + (53 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2005:
                        if (leistung > 93) {
                            return 0;
                        }

                        if (leistung > 88) {
                            punktzahl = (-leistung + (93 + 1 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 83) {
                            punktzahl = (-leistung + (88 + 2 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 78) {
                            punktzahl = (-leistung + (83 + 3 * 5)) / 5;
                            return punktzahl;
                        } else if (leistung > 74) {
                            punktzahl = (-leistung + (78 + 4 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 70) {
                            punktzahl = (-leistung + (74 + 5 * 4)) / 4;
                            return punktzahl;
                        } else if (leistung > 67) {
                            punktzahl = (-leistung + (70 + 6 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 64) {
                            punktzahl = (-leistung + (67 + 7 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 61) {
                            punktzahl = (-leistung + (64 + 8 * 3)) / 3;
                            return punktzahl;
                        } else if (leistung > 59) {
                            punktzahl = (-leistung + (61 + 9 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 57) {
                            punktzahl = (-leistung + (59 + 10 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 55) {
                            punktzahl = (-leistung + (57 + 11 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 53) {
                            punktzahl = (-leistung + (55 + 12 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 51) {
                            punktzahl = (-leistung + (53 + 13 * 2)) / 2;
                            return punktzahl;
                        } else if (leistung > 49) {
                            punktzahl = (-leistung + (51 + 14 * 2)) / 2;
                            return punktzahl;
                        } else {
                            return 15;

                        }

                    case 2004:
                        if (leistung > 89) {
                            return 0;
                        }
                }
                if (leistung > 86) {
                    punktzahl = (-leistung + (89 + 1 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 81) {
                    punktzahl = (-leistung + (86 + 2 * 5)) / 5;
                    return punktzahl;
                } else if (leistung > 76) {
                    punktzahl = (-leistung + (81 + 3 * 5)) / 5;
                    return punktzahl;
                } else if (leistung > 72) {
                    punktzahl = (-leistung + (76 + 4 * 4)) / 4;
                    return punktzahl;
                } else if (leistung > 68) {
                    punktzahl = (-leistung + (72 + 5 * 4)) / 4;
                    return punktzahl;
                } else if (leistung > 65) {
                    punktzahl = (-leistung + (68 + 6 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 62) {
                    punktzahl = (-leistung + (65 + 7 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 59) {
                    punktzahl = (-leistung + (62 + 8 * 3)) / 3;
                    return punktzahl;
                } else if (leistung > 57) {
                    punktzahl = (-leistung + (59 + 9 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 55) {
                    punktzahl = (-leistung + (57 + 10 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 53) {
                    punktzahl = (-leistung + (55 + 11 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 51) {
                    punktzahl = (-leistung + (53 + 12 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 49) {
                    punktzahl = (-leistung + (51 + 13 * 2)) / 2;
                    return punktzahl;
                } else if (leistung > 47) {
                    punktzahl = (-leistung + (49 + 14 * 2)) / 2;
                    return punktzahl;
                } else {
                    return 15;

                }

            }
        }
        return punktzahl;
    }


   
}

