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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import modell.BJS;

public class Speicherung {
    BJS bjs;

    String filename = "storage.txt";
    ArrayList<modell.Schueler> list;
    ArrayList<modell.Schueler> listeAusDatei;
    
    public Speicherung(BJS bjs){
        this.bjs=bjs;
    }
    
    public void bjsInDateiSchreiben() {
        
        FileOutputStream fos;
        ObjectOutputStream out;


        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(bjs);
            out.close();
            System.out.println("Objekte gespeichert");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

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

    public BJS listeAusDateiLesen() {
        BJS bjs=new BJS();
        FileInputStream fis;
        ObjectInputStream in;

        try {

            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            
            @SuppressWarnings("unchecked")
            Object obj =  in.readObject();
            bjs = (BJS) obj;
 
            in.close();
            System.out.println("Objekte wiederhergestellt");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return bjs;
    }

    public ArrayList<modell.Schueler> gibListe() {
        listeAusDateiLesen();
        return listeAusDatei;
    }

}
