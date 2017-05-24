//autor Loris Jelinek, fruitdude187
package modell;

import modell.Schueler;

public class Freistil extends Disziplin {

    public Freistil(Schueler s) {

        super(s);

    }

    @Override

    public int punktzahlberechnen() {
        char geschlecht = schueler.getGeschlecht();
        int geburtsjahr = schueler.getGeburtsjahr();
        switch (geschlecht) {
            case 'm':{
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
                
            
                
                
             
                
            case  2006:
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

            case 2005:
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
            

            case 2004:
             if (leistung > 100) {
                            return 0; 
                        }
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

            
 
                    
               

                    

                  

             


    
