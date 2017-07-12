package ausgabe;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import modell.BJS;
import modell.Schueler;
import modell.Altersstufe;

/**
 *
 * @author weir.clair
 */
public class InhaltAltersstufe extends Inhalt {

    BJS bjs;
    Altersstufe as;
    private static final Font SMALLBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);

    public InhaltAltersstufe(BJS b) {
        bjs = b;
        as = new Altersstufe(bjs);
        System.out.println("Geburtsjahre:");
        for(Integer inte: as.getGeburtsjahre())
        System.out.println(""+inte);
    }

    @Override
    void addMetaData(Document document) {

    }

    @Override
    void addContent(Document document) throws DocumentException {
        for(Integer integer : as.getGeburtsjahre()){
        Paragraph title = new Paragraph();
        title.setFont(SMALLBOLD);
        

        title.add("Geburtsjahr " + integer);
        title.setAlignment(Element.ALIGN_CENTER);

        document.add(title);    

        PdfPTable tabelleJahrgang = new PdfPTable(3);
        tabelleJahrgang.setWidthPercentage(100);
        tabelleJahrgang.setWidths(new int[]{1, 6, 2});
        tabelleJahrgang.setSpacingBefore(25);

        PdfPCell Nr = new PdfPCell(new Phrase("Nr"));
        tabelleJahrgang.addCell(Nr);
        PdfPCell Name = new PdfPCell(new Phrase("Name"));
        tabelleJahrgang.addCell(Name);
        PdfPCell Pkt = new PdfPCell(new Phrase("Pkt"));
        tabelleJahrgang.addCell(Pkt);
        
        PdfPTable tabelleBeste = new PdfPTable(2);
        tabelleBeste.setWidthPercentage(100);
        //tabelleBeste.setWidths(new int[]{6, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1});
        tabelleBeste.setSpacingBefore(25);
        
        PdfPCell cell11 = new PdfPCell(new Phrase("Mädchen:"));
        cell11.setBorder(Rectangle.NO_BORDER);
        tabelleBeste.addCell(cell11);
        PdfPCell cell12 = new PdfPCell(new Phrase("Jungen:"));
        cell12.setBorder(Rectangle.NO_BORDER);
        tabelleBeste.addCell(cell12);

        
        PdfPTable tableGirls = new PdfPTable(3);
        tableGirls.setWidths(new int[]{1, 6, 1});

        
        for (int i = 0; i < 5; i++) {
            Schueler s = as.sortByAge(integer, 'w').get(i);
            PdfPCell cellNr = new PdfPCell(new Phrase((i+1)+".")); 
            cellNr.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellName = new PdfPCell(new Phrase(s.getName())); 
            cellName.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellPunkte = new PdfPCell(new Phrase(""+s.getGesamtpunktzahl())); 
            cellPunkte.setBorder(Rectangle.NO_BORDER);
            tableGirls.addCell(cellNr);
            tableGirls.addCell(cellName);
            tableGirls.addCell(cellPunkte);
        }
        tabelleBeste.addCell(tableGirls);
        
        PdfPTable tableBoys = new PdfPTable(3);
        tableBoys.setWidths(new int[]{1, 6, 1});

        
        for (int i = 0; i < 5; i++) {
            Schueler s = as.sortByAge(integer, 'm').get(i);
            PdfPCell cellNr = new PdfPCell(new Phrase((i+1)+".")); 
            cellNr.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellName = new PdfPCell(new Phrase(s.getName())); 
            cellName.setBorder(Rectangle.NO_BORDER);
            PdfPCell cellPunkte = new PdfPCell(new Phrase(""+s.getGesamtpunktzahl())); 
            cellPunkte.setBorder(Rectangle.NO_BORDER);
            tableBoys.addCell(cellNr);
            tableBoys.addCell(cellName);
            tableBoys.addCell(cellPunkte);
        }
        tabelleBeste.addCell(tableBoys);
        
        document.add(tabelleBeste);
        
        

        
        
        }

    }

}
