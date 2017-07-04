/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ausgabe;
import com.itextpdf.text.BaseColor;
import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
 

import modell.Klasse;


/**
 *
 * @author rawski.daniel
 */
public class PrintPDF {
     private File file;

    Document document;
    private static Font tableFontRot = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.BOLD, BaseColor.RED); // Schrift in Tabelle 
    private static Font tableFontGruen = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.BOLD, BaseColor.GREEN); // Schrift in Tabelle 
    private static Font tableFontBlau = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.BOLD, BaseColor.BLUE); // Schrift in Tabelle 
    private static Font tableFont = new Font(Font.FontFamily.TIMES_ROMAN, 8,
            Font.BOLD); // Schrift in Tabelle 
    private static Font tableHeadFont = new Font(Font.FontFamily.TIMES_ROMAN, 10,
            Font.BOLD); // Klassenbezeichner
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);  // Überschrift
    private String name;
public void Drucken(String name){     

        try {
            erstellen(name);
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            addMetaData(document);
            addContent(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
        
    
    

    private void erstellen(String n) {
        
        String filename = n +".pdf";
        file = new File(filename);
        document = new Document();
        document.setPageSize(PageSize.A4.rotate());
        document.setMargins(20f, 20f, 20f, 20f);

    }
    Klasse aktuelleKlasse;
    PrintPDF(Klasse K){
        aktuelleKlasse = K;
    }

    private void addMetaData(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addContent(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public void druckeKlasse(Klasse k,String name){    //druckt den übergebenen Jahrgang erwartet einen Jahrgang und einen String für PDF 

        try {
            
            erstellen(name);
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            addMetaData(document);
            ausgewaehlteKlasseDrucken(document,k);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ausgewaehlteKlasseDrucken(Document document, Klasse k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
    
    
    
    
}
