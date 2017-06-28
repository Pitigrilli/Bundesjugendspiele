/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author finckh.stefan
 */
public class Import {

    ArrayList<String> lines = new ArrayList<>();
    ArrayList<modell.Schueler> schuelerliste = new ArrayList<>();
    File csvFile;

    public void setcsvFile(File csvFile) {
        this.csvFile = csvFile;

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
