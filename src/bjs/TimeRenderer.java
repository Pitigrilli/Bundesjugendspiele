package bjs;

import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class DateRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected,
            boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);

        if (isSelected) {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.red);
        } else if ((column == 3) || column == 4 || column == 5) {
            cell.setBackground(Color.YELLOW);
            cell.setForeground(Color.BLACK);
        }

        return cell;
    }

//private static final long serialVersionUID = 1L;
    private Date dateValue;
    private final SimpleDateFormat sdfNewValue = new SimpleDateFormat("mm:ss");
    private String valueToString = "";

    /// Formatiere Zeitwerte
    @Override
    public void setValue(Object value) {
        if ((value != null)) {//
            String stringFormat = value.toString();
            try {
                dateValue = new SimpleDateFormat("mm,ss", Locale.GERMAN).parse(stringFormat);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            valueToString = sdfNewValue.format(dateValue);
            value = valueToString;
        }
        super.setValue(value);
    }



}
