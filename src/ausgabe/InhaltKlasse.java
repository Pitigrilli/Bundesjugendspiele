/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Klasse;
import modell.Schueler;

/**
 *
 * @author claus
 */
public class InhaltKlasse extends Inhalt {

    private static final Font SMALLBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);  // Überschrift
    private final Klasse aktuelleKlasse;

    public InhaltKlasse(Klasse k) {
        aktuelleKlasse = k;
    }

    @Override
    void addMetaData(Document document) {

    }

    @Override
    void addContent(Document document) throws DocumentException {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String yearInString = String.valueOf(year);

        Paragraph title = new Paragraph();
        title.setFont(SMALLBOLD);

        title.add("Bundesjugendspiele " + yearInString + "\n\n Schwimmen\n\nKlasse " + aktuelleKlasse.getName());
        title.setAlignment(Element.ALIGN_CENTER);

        document.add(title);

        PdfPTable tabelle = new PdfPTable(11);
        tabelle.setWidthPercentage(100);
        tabelle.setWidths(new int[]{6, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1});
        tabelle.setSpacingBefore(25);

        /////// KopfSchreiben
        PdfPCell nameSchueler = new PdfPCell(new Phrase("Name"));
        nameSchueler.setBackgroundColor(BaseColor.LIGHT_GRAY);
        tabelle.addCell(nameSchueler);
        tabelle.addCell(new GrayCell(new Phrase("G")));
        tabelle.addCell(new GrayCell(new Phrase("JG")));
        tabelle.addCell(new GrayCell(new Phrase("Rücken")));
        tabelle.addCell(new GrayCell(new Phrase("Freistil")));
        tabelle.addCell(new GrayCell(new Phrase("Tauch.")));
        tabelle.addCell(new GrayCell(new Phrase("R-Pkt.")));
        tabelle.addCell(new GrayCell(new Phrase("F-Pkt.")));
        tabelle.addCell(new GrayCell(new Phrase("T-Pkt")));
        tabelle.addCell(new GrayCell(new Phrase("Su.")));
        tabelle.addCell(new GrayCell(new Phrase("Ur.")));
        ///// Schülerdaten ausgeben
        for (Schueler s : aktuelleKlasse.getSchueler()) {
            tabelle.addCell(new PdfPCell(new Phrase(s.getName())));
            tabelle.addCell((new CenteredCell(new Phrase("" + s.getGeschlecht()))));
            tabelle.addCell(new CenteredCell(new Phrase("" + s.getGeburtsjahr())));
            tabelle.addCell(new CenteredCell(new Phrase(formatTime(s.getDisziplinen().get(2).getLeistungString()))));
            tabelle.addCell(new CenteredCell(new Phrase(formatTime(s.getDisziplinen().get(1).getLeistungString()))));
            tabelle.addCell(new CenteredCell(new Phrase(s.getDisziplinen().get(0).getLeistungString())));
            tabelle.addCell(new CenteredCell(new Phrase("" + s.getDisziplinen().get(2).getPunktzahl())));
            tabelle.addCell(new CenteredCell(new Phrase("" + s.getDisziplinen().get(1).getPunktzahl())));
            tabelle.addCell(new CenteredCell(new Phrase("" + s.getDisziplinen().get(0).getPunktzahl())));
            tabelle.addCell(new CenteredCell(new Phrase("" + s.getGesamtpunktzahl())));
            tabelle.addCell(new CenteredCell(new Phrase(s.getUrkunde())));
        }

        document.add(tabelle);

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
            Schueler s = aktuelleKlasse.getBestGirls().get(i);
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
            Schueler s = aktuelleKlasse.getBestBoys().get(i);
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

    private String formatTime(String value) {
        if (value != null) {
            Date dateValue = null;
            SimpleDateFormat sdfNewValue = new SimpleDateFormat("mm:ss");
            String valueToString;

            try {
                dateValue = new SimpleDateFormat("mm,ss", Locale.GERMAN).parse(value);
            } catch (ParseException ex) {
                Logger.getLogger(PrintPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
            valueToString = sdfNewValue.format(dateValue);
            value = valueToString;
        }
        return value;

    }
   

}

// Hilfsklassen um die Zellen kompakter oben schreiben zu können
class CenteredCell extends PdfPCell {

    CenteredCell(Phrase p) {
        super(p);
        this.setHorizontalAlignment(Element.ALIGN_CENTER);
    }
}

class GrayCell extends CenteredCell {

    GrayCell(Phrase p) {
        super(p);
        this.setBackgroundColor(BaseColor.LIGHT_GRAY);
    }

}
