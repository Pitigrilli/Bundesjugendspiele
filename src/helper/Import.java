/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import javax.swing.JFileChooser;
import modell.BJS;
import modell.Jahrgang;
import modell.Klasse;
import modell.Schueler;

/**
 *
 * @author finckh.stefan
 */
public class Import {

    BJS bjs = new BJS();

    ArrayList<String> lines = new ArrayList<>();
    ArrayList<modell.Schueler> schuelerliste = new ArrayList<>();
    File csvFile;

    public void setcsvFile(File csvFile) {
        this.csvFile = csvFile;

    }

    public BJS gibBJS() {
        JFileChooser chooser = new JFileChooser();

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            setcsvFile(chooser.getSelectedFile());
            readLines();
            parseLines();
        }

        for (Schueler s : schuelerliste) {

            boolean existiert = false;
            for (Klasse k : bjs.getAlleKlassen()) {
                if (k.getName().equals(s.getKlasse())) {
                    existiert = true;
                }

            }
            if (!existiert) {
                bjs.getAlleKlassen().add(new Klasse(s.getKlasse()));
            }
            for (Klasse k : bjs.getAlleKlassen()) {
                if (k.getName().equals(s.getKlasse())) {
                    k.schuelerHinzufügen(s);
                }
            }

        }

        for (Klasse k : bjs.getAlleKlassen()) {
            
            boolean existiert = false;

            int jahrgang = Integer.parseInt(k.getName().substring(1, 2));
            
            
            for(modell.Jahrgang j : bjs.getJahrgangliste()){
                if(j.getName() == jahrgang){
                    existiert = true;
                }
            }
            
            if(!existiert){
                bjs.getJahrgangliste().add(new modell.Jahrgang(jahrgang));
            }
            
            for(modell.Jahrgang j : bjs.getJahrgangliste()){
                if(j.getName()==jahrgang){
                    j.klasseHinzufügen(k);
                }
            }
            
        }

        

        // Sortieren der Listen
        bjs.getAlleKlassen().sort(null);
        for (Klasse k : bjs.getAlleKlassen()) {
            k.getSchueler().sort(null);
        }
        Klasse k = (bjs.getAlleKlassen()).get(0);
        
        for (Schueler s: k.getSchueler()) {
            System.out.println(s);
        }
        bjs.getJahrgangliste().sort(null);
        
        ArrayList<Jahrgang> jgs = bjs.getJahrgangliste();
        for(Jahrgang j: jgs){
            j.getKlassen().sort(null);
        }
        
        bjs.setAlleSchueler(schuelerliste);
        
        return bjs;
    }

    public void readLines() {
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();

            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (Exception e) {

        }
    }

    public void parseLines() {
        for (String listenteil : lines) {
            String[] teile = listenteil.split(";");
            char geschlecht;
            int geburtsjahr;
            String klasse;
            String name;
            if (teile[2].equals("männlich")) {
                geschlecht = 'm';
            } else {
                geschlecht = 'w';
            }
            geburtsjahr = Integer.parseInt(teile[3]);

            klasse = teile[0];
            name = teile[1];

            schuelerliste.add(new modell.Schueler(geschlecht, name, klasse, geburtsjahr));

        }

    }

    public ArrayList<modell.Schueler> gibListe() {

        JFileChooser chooser = new JFileChooser();

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            setcsvFile(chooser.getSelectedFile());
            readLines();
            parseLines();
        }
        return schuelerliste;
    }
}
