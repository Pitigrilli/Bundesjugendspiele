/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author holler.nils
 */
public class testTauchen {
    public static void main(String[] args){ 
        modell.Schueler schueler = new modell.Schueler();   
        schueler.setName("Nils");
        schueler.setGeburtsjahr(2007);
        schueler.setGeschlecht('m');
        schueler.getDisziplinen().get(0).setLeistung(20);
        System.out.println(schueler.getDisziplinen().get(0).punktzahlberechnen());
    }
}
