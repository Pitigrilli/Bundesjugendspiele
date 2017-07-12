/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.util.ArrayList;
import modell.BJS;
import modell.Schueler;

/**
 *
 * @author weir.clair
 */
public class InhaltJahrgangsstufe extends Inhalt {

    BJS bjs;
    private static final Font SMALLBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);

    public InhaltJahrgangsstufe(BJS b) {
        bjs = b;
    }

    @Override
    void addMetaData(Document document) {

    }

    @Override
    void addContent(Document document) throws DocumentException {
        for(int j=0; j<bjs.getJahrgangliste().size();j++){
        ArrayList<Schueler> bestGirls =    bjs.getJahrgangliste().get(j).getBestGirls();
        ArrayList<Schueler> bestBoys =    bjs.getJahrgangliste().get(j).getBestBoys();
        Paragraph title = new Paragraph();
        title.setFont(SMALLBOLD);
        

        title.add("Jahrgangsstufe " + bjs.getJahrgangliste().get(j).getName());
        title.setAlignment(Element.ALIGN_CENTER);

        document.add(title);    

        
        PdfPTable tabelleBeste = new PdfPTable(2);
        tabelleBeste.setWidthPercentage(100);
        //tabelleBeste.setWidths(new int[]{6, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1});
        tabelleBeste.setSpacingBefore(25);
        
        PdfPCell cell11 = new PdfPCell(new Phrase("Mädchen: "+bestGirls.size()));
        cell11.setBorder(Rectangle.NO_BORDER);
        tabelleBeste.addCell(cell11);
        PdfPCell cell12 = new PdfPCell(new Phrase("Jungen: "+bestBoys.size()));
        cell12.setBorder(Rectangle.NO_BORDER);
        tabelleBeste.addCell(cell12);

        
        PdfPTable tableGirls = new PdfPTable(4);
        tableGirls.setWidths(new int[]{1, 6,1, 1});

        
        for (int i = 0; i < 10; i++) {
            Schueler s = bestGirls.get(i);
            PdfPCell cellNr = new PdfPCell(new Phrase((i+1)+".")); 
            cellNr.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellName = new PdfPCell(new Phrase(s.getName())); 
            cellName.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellKlasse = new PdfPCell(new Phrase(s.getKlasse())); 
            cellKlasse.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellPunkte = new PdfPCell(new Phrase(""+s.getGesamtpunktzahl())); 
            cellPunkte.setBorder(Rectangle.NO_BORDER);
            tableGirls.addCell(cellNr);
            tableGirls.addCell(cellName);
            tableGirls.addCell(cellKlasse);
            tableGirls.addCell(cellPunkte);
        }
        tabelleBeste.addCell(tableGirls);
        
        PdfPTable tableBoys = new PdfPTable(4);
        tableBoys.setWidths(new int[]{1, 6,1, 1});

        
        for (int i = 0; i < 10; i++) {
            Schueler s = bestBoys.get(i);
            PdfPCell cellNr = new PdfPCell(new Phrase((i+1)+".")); 
            cellNr.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellName = new PdfPCell(new Phrase(s.getName())); 
            cellName.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellKlasse = new PdfPCell(new Phrase(s.getKlasse())); 
            cellKlasse.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellPunkte = new PdfPCell(new Phrase(""+s.getGesamtpunktzahl())); 
            cellPunkte.setBorder(Rectangle.NO_BORDER);
            tableBoys.addCell(cellNr);
            tableBoys.addCell(cellName);
            tableBoys.addCell(cellKlasse);
            tableBoys.addCell(cellPunkte);
        }
        tabelleBeste.addCell(tableBoys);
        
        
        document.add(tabelleBeste);
        
        
        document.add( Chunk.NEWLINE );
         
        

        

        
        
        }

    }

}
