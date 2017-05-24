/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author finckh.stefan
 */
public class Import {
    ArrayList<String> lines = new ArrayList<>();
    ArrayList<modell.Schueler> schuelerliste = new ArrayList<>();
    File csvFile;
    
    
    public Import(File csvFile){
        this.csvFile = csvFile;
        
        
        
    }
    
    public void readLines(){
        BufferedReader br;
        
        
        try{
            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            
            String line = null;
            while ((line = br.readLine()) != null) {
            lines.add(line);
        }
            
        }
        catch(Exception e){
            
        }
    }
    
    public void parseLines(){
        for(String listenteil : lines)  {
            String[] teile = listenteil.split(";");
            modell.Schueler schueler = new modell.Schueler();
            if(teile[2].equals("männlich")){
                schueler.setGeschlecht('m');
            }
            else{
                schueler.setGeschlecht('w');
            }
            int geburtsjahr = Integer.parseInt(teile[3]);
            schueler.setGeburtsjahr(geburtsjahr);
            
            schueler.setKlasse(teile[0]);
            schueler.setName(teile[1]);
            
            schuelerliste.add(schueler);
            
        }
        
    }
    
    public ArrayList<modell.Schueler> gibListe(){
        readLines();
        parseLines();
        return schuelerliste;
    }
}
