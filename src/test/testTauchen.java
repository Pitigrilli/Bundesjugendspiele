/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import modell.Schueler;

/**
 *
 * @author holler.nils
 */
public class testTauchen {

    public static void main(String[] args) {
        ArrayList<modell.Schueler> schueler = new ArrayList<>();
        modell.Schueler neuerSchueler = new modell.Schueler('m', "Nils", "10b", 2000);
        neuerSchueler.getDisziplinen().get(0).setLeistung("1,21");
        schueler.add(neuerSchueler);
        System.out.println(neuerSchueler.getDisziplinen().get(0).punktzahlberechnen());

            
        }
}
