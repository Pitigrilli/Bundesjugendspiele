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
import modell.Altersstufe;

/**
 *
 * @author weir.clair
 */
public class InhaltAltersstufe extends Inhalt {

    BJS bjs;
    Altersstufe as;
    private static final Font HUGEBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static final Font SMALLBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);

    public InhaltAltersstufe(BJS b) {
        bjs = b;
        as = new Altersstufe(bjs);
    }

    @Override
    void addMetaData(Document document) {

    }

    @Override
    void addContent(Document document) throws DocumentException {
        Paragraph title = new Paragraph();
        title.setFont(HUGEBOLD);

        title.add("Bestenliste nach Geburtsjahren");
        title.setAlignment(Element.ALIGN_CENTER);

        document.add(title);
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);
        
        for (Integer integer : as.getGeburtsjahre()) {

            ArrayList<Schueler> bestGirls = as.sortByAge(integer, 'w');
            ArrayList<Schueler> bestBoys = as.sortByAge(integer, 'm');

            Paragraph subtitle = new Paragraph();
            subtitle.setFont(SMALLBOLD);
            subtitle.add("Geburtsjahr " + integer);
            document.add(subtitle);

            PdfPTable tabelleBeste = new PdfPTable(2);
            tabelleBeste.setWidthPercentage(100);
            tabelleBeste.setSpacingBefore(10);

            PdfPCell cell11 = new PdfPCell(new Phrase("Mädchen: " + bestGirls.size()));
            cell11.setBorder(Rectangle.NO_BORDER);
            tabelleBeste.addCell(cell11);
            PdfPCell cell12 = new PdfPCell(new Phrase("Jungen: " + bestBoys.size()));
            cell12.setBorder(Rectangle.NO_BORDER);
            tabelleBeste.addCell(cell12);

            PdfPTable tableGirls = new PdfPTable(4);
            tableGirls.setWidths(new int[]{1, 6,1, 1});

            for (int i = 0; i < 5; i++) {
                PdfPCell cellNr;
                PdfPCell cellName;
                PdfPCell cellKlasse;
                PdfPCell cellPunkte;
                if (bestGirls.size() > i) {
                    Schueler s = bestGirls.get(i);
                    cellNr = new PdfPCell(new Phrase((i + 1) + "."));
                    cellName = new PdfPCell(new Phrase(s.getName()));
                    cellKlasse = new PdfPCell(new Phrase(s.getKlasse()));
                    cellPunkte = new PdfPCell(new Phrase("" + s.getGesamtpunktzahl()));
                } else {
                    cellNr = new PdfPCell(new Phrase(""));
                    cellName = new PdfPCell(new Phrase(""));
                    cellKlasse = new PdfPCell(new Phrase(""));
                    cellPunkte = new PdfPCell(new Phrase(""));
                }
                cellNr.setBorder(Rectangle.NO_BORDER);
                cellName.setBorder(Rectangle.NO_BORDER);
                cellPunkte.setBorder(Rectangle.NO_BORDER);
                cellKlasse.setBorder(Rectangle.NO_BORDER);
                tableGirls.addCell(cellNr);
                tableGirls.addCell(cellName);
                tableGirls.addCell(cellKlasse);
                tableGirls.addCell(cellPunkte);
            }

            tabelleBeste.addCell(tableGirls);

            PdfPTable tableBoys = new PdfPTable(4);
            tableBoys.setWidths(new int[]{1, 6,1, 1});

            for (int i = 0; i < 5; i++) {
                PdfPCell cellNr;
                PdfPCell cellName;
                PdfPCell cellKlasse;
                PdfPCell cellPunkte;
                if (bestBoys.size() > i) {
                    Schueler s = bestBoys.get(i);
                    cellNr = new PdfPCell(new Phrase((i + 1) + "."));
                    cellName = new PdfPCell(new Phrase(s.getName()));
                    cellKlasse = new PdfPCell(new Phrase(s.getKlasse()));
                    cellPunkte = new PdfPCell(new Phrase("" + s.getGesamtpunktzahl()));
                } else {
                    cellNr = new PdfPCell(new Phrase(""));
                    cellName = new PdfPCell(new Phrase(""));
                    cellKlasse = new PdfPCell(new Phrase(""));
                    cellPunkte = new PdfPCell(new Phrase(""));
                }
                cellNr.setBorder(Rectangle.NO_BORDER);
                cellName.setBorder(Rectangle.NO_BORDER);
                cellPunkte.setBorder(Rectangle.NO_BORDER);
                cellKlasse.setBorder(Rectangle.NO_BORDER);
                tableBoys.addCell(cellNr);
                tableBoys.addCell(cellName);
                tableBoys.addCell(cellKlasse);
                tableBoys.addCell(cellPunkte);
            }
            tabelleBeste.addCell(tableBoys);

            document.add(tabelleBeste);
            document.add(Chunk.NEWLINE);
        }

    }

}
