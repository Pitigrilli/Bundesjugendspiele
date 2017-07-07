/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import modell.BJS;
import modell.Klasse;

/**
 *
 * @author claus
 */
public class InhaltAlleKlassen extends Inhalt {

    private static final Font SMALLBOLD = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);  // Überschrift
    private final BJS bjs;

    public InhaltAlleKlassen(BJS b) {
        bjs = b;
    }

    @Override
    void addMetaData(Document document) {

    }

    @Override
    void addContent(Document document) throws DocumentException {
        for (Klasse k : bjs.getAlleKlassen()) {
            InhaltKlasse i = new InhaltKlasse(k);
            i.addContent(document);
            document.newPage();
        }

    }

}
