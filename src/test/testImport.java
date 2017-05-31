/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.io.File;

/**
 *
 * @author finckh.stefan
 */
public class testImport {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            helper.Import test = new helper.Import(chooser.getSelectedFile());
            ArrayList<modell.Schueler> schuelerliste = test.gibListe();

            helper.Speicherung speicherung = new helper.Speicherung();
            speicherung.listeInDateiSchreiben(schuelerliste);

        }

    }
}
