/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author finckh.stefan
 */
public class Import {
    ArrayList<String> lines = new ArrayList<>();
    ArrayList<Schueler> schuelerliste = new ArrayList<>();
    
    
  
    
    public void readLines(){
        String csvFile = "SJ2017.csv";
        BufferedReader br;
        
        
        try{
            br = new BufferedReader(new FileReader(csvFile));
            if(Character.isDigit(br.readLine().charAt(0))){
                
                    
                    
                
                    
                
            }
            
            
        }
        catch(Exception e){
            
        }
    }
    
    public void parseLines(){
        
    }
    
    public ArrayList<Schueler> gibListe(){
        
        return schuelerliste;
        
    }
    
    public static void main(String[] args){
        
        Import test = new Import();
        test.readLines();
    }
}
