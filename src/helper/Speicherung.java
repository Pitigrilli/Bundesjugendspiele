/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author finckh.stefan
 */
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Speicherung {

    String filename = "storage.txt";
    ArrayList<modell.Schueler> list;
    ArrayList<modell.Schueler> listeAusDatei;

    public void listeInDateiSchreiben(ArrayList<modell.Schueler> schuelerliste) {
        FileOutputStream fos;
        ObjectOutputStream out;
        list = schuelerliste;

        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(list);
            out.close();
            System.out.println("Objekte gespeichert");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void listeAusDateiLesen() {
        FileInputStream fis;
        ObjectInputStream in;

        try {

            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            listeAusDatei = (ArrayList<modell.Schueler>) in.readObject();
            in.close();
            System.out.println("Objekte wiederhergestellt");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<modell.Schueler> gibListe() {
        listeAusDateiLesen();
        return listeAusDatei;
    }

}
