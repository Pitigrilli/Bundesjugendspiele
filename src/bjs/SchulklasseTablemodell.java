/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import modell.Klasse;
import modell.Schueler;

/**
 *
 * @author claus
 */
public class SchulklasseTablemodell extends AbstractTableModel {

    private ArrayList<Schueler> schuelerListe;
    private Klasse aktuelleKlasse;

    public ArrayList<Schueler> getSchuelerListe() {
        return schuelerListe;
    }

    public void setSchuelerListe(ArrayList<Schueler> schuelerListe) {
        this.schuelerListe = schuelerListe;
    }

    public Klasse getKlasse() {
        return aktuelleKlasse;
    }

    public void setKlasse(Klasse k) {
        this.aktuelleKlasse = k;
    }

    public SchulklasseTablemodell(Klasse k) {
        this.aktuelleKlasse = k;
        schuelerListe = k.getSchueler();
    }

    private final String[] columnNames
            = {
                "Name",
                "G",
                "JG",
                "Rücken",
                "Freistil",
                "Tauchen",
                "R-Pkt.",
                "F-Pkt.",
                "T-Pkt.",
                "Summe",
                "Urkunde"
            };

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return schuelerListe.size();
    }

    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                return Integer.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        switch (column) {
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        Schueler s = schuelerListe.get(row);

        switch (column) {
            case 0:
                return s.getName();
            case 1:
                return s.getGeschlecht();
            case 2:
                return s.getGeburtsjahr();
            case 3:
                return s.getDisziplinen().get(2).getLeistungString();
            case 4:
                return s.getDisziplinen().get(1).getLeistungString();
            case 5:
                return s.getDisziplinen().get(0).getLeistungString();
            case 6:
                return s.getDisziplinen().get(2).getPunktzahl();
            case 7:
                return s.getDisziplinen().get(1).getPunktzahl();
            case 8:
                return s.getDisziplinen().get(0).getPunktzahl();
            case 9:
                return s.getGesamtpunktzahl();
            case 10:
                return s.getUrkunde();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        Schueler s = schuelerListe.get(row);

        switch (column) {
            case 3:
                s.getDisziplinen().get(2).setLeistungString((String) value);
                break;
            case 4:
                s.getDisziplinen().get(1).setLeistungString((String) value);
                break;
            case 5:
                s.getDisziplinen().get(0).setLeistungString((String) value );
                break;
        }

        fireTableCellUpdated(row, column);
    }

}
