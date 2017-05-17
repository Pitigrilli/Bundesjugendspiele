/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;
import java.util.ArrayList;
/**
 *
 * @author holler.nils
 */
public class Klasse {
    ArrayList<Schueler> schueler = new ArrayList<>();
    public float punktedurchschnittBerechnen(){
        float punktedurchschnitt = 0;
        return    punktedurchschnitt;
    }
    public void alleSchuelerAusgeben(){
        System.out.println(schueler.toString());
    }
    public void schuelerHinzufügen(Schueler s){
        schueler.add(s);
    }
}
