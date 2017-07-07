/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausgabe;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

/**
 *
 * @author claus
 */
public abstract class Inhalt {
    abstract void addMetaData(Document document);
    abstract void addContent(Document document) throws DocumentException;
}
