/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;


/**
 *
 * @author rawski.daniel
 */
public class PrintPDF {

    private final File file;
    Document document;
    Inhalt inhalt;



    public PrintPDF(String filename) {
        
        file = new File(filename);
        document = new Document();
        document.setPageSize(PageSize.A4);
        document.setMargins(20f, 20f, 20f, 20f);
    }
    
    public void setInhalt(Inhalt i){
        inhalt = i;
    }

    public File drucken() {
        try {
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            inhalt.addMetaData(document);
            inhalt.addContent(document);
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
        }
        return file;
    }

    
}
