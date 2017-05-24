/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author weir.clair
 */
public class Rueckenschwimmen extends Disziplin {

    public Rueckenschwimmen(Schueler s) {
        super(s);
    }

    public int punktzahlberechnen() {

        char geschlecht = schueler.getGeschlecht();
        int geburtsjahr = schueler.getGeburtsjahr();
        switch (geschlecht) {
            case 'm':
                switch (geburtsjahr) {
                    case 2007:
                        punktzahl = zehnAlter();
                    case 2006:
                        punktzahl = elfAlter();
                    case 2005:
                        for (int i = 89; i <= 79; i -= 5) {
                            if (leistung > i) {
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 75; i <= 71; i -= 4) {
                            if (leistung > i) {
                                punktzahl = 3;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 68; i <= 59; i -= 3) {
                            if (leistung > i) {
                                punktzahl = 5;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 57; i <= 47; i -= 2) {
                            if (leistung > i) {
                                punktzahl = 9;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                            if (leistung <= 47) {
                                punktzahl = 15;
                                return punktzahl;
                            }
                        }
                    case 2004:
                        for (int i = 87; i <= 77; i -= 5) {
                            if (leistung > i) {
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 73; i <= 69; i -= 4) {
                            if (leistung > i) {
                                punktzahl = 3;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 66; i <= 57; i -= 3) {
                            if (leistung > i) {
                                punktzahl = 5;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                        }
                        for (int i = 55; i <= 45; i -= 2) {
                            if (leistung > i) {
                                punktzahl = 9;
                                return punktzahl;
                            } else {
                                punktzahl++;
                            }
                            if (leistung <= 45) {
                                punktzahl = 15;
                                return punktzahl;
                            }
                        }

                    case 'w':
                        switch (geburtsjahr) {
                            case 2007:
                                punktzahl = zehnAlter();
                            case 2006:
                                punktzahl = elfAlter();
                            case 2005:
                                for (int i = 87; i <= 77; i -= 5) {
                                    if (leistung > i) {
                                        return punktzahl;
                                    } else {
                                        punktzahl++;
                                    }
                                }
                                for (int i = 73; i <= 69; i -= 4) {
                                    if (leistung > i) {
                                        punktzahl = 3;
                                        return punktzahl;
                                    } else {
                                        punktzahl++;
                                    }
                                }
                                for (int i = 66; i <= 57; i -= 3) {
                                    if (leistung > i) {
                                        punktzahl = 5;
                                        return punktzahl;
                                    } else {
                                        punktzahl++;
                                    }
                                }
                                for (int i = 55; i <= 45; i -= 2) {
                                    if (leistung > i) {
                                        punktzahl = 9;
                                        return punktzahl;
                                    } else {
                                        punktzahl++;
                                    }
                                    if (leistung <= 45) {
                                        punktzahl = 15;
                                        return punktzahl;
                                    }
                                }

                        }

                        return punktzahl;
                }
                return punktzahl;
        }return punktzahl;
    }

    

     public int zehnAlter() {
        for (int i = 109; i <= 79; i -= 5) {
            if (leistung > i) {
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 75; i <= 71; i -= 4) {
            if (leistung > i) {
                punktzahl = 7;
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 68; i <= 62; i -= 3) {
            if (leistung > i) {
                punktzahl = 9;
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 60; i <= 56; i -= 2) {
            if (leistung > i) {
                punktzahl = 12;
                return punktzahl;
            } else {
                punktzahl++;
            }
            if (leistung <= 56) {
                punktzahl = 15;
                return punktzahl;
            }
        }
        return punktzahl;
    }

    public int elfAlter() {
        for (int i = 104; i <= 79; i -= 5) {
            if (leistung > i) {
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 75; i <= 71; i -= 4) {
            if (leistung > i) {
                punktzahl = 6;
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 68; i <= 62; i -= 3) {
            if (leistung > i) {
                punktzahl = 8;
                return punktzahl;
            } else {
                punktzahl++;
            }
        }
        for (int i = 60; i <= 54; i -= 2) {
            if (leistung > i) {
                punktzahl = 11;
                return punktzahl;
            } else {
                punktzahl++;
            }
            if (leistung <= 54) {
                punktzahl = 15;
                return punktzahl;
            }
        }
        return punktzahl;
    }

}
