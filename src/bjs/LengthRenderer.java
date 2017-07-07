package bjs;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class LengthRenderer extends DefaultTableCellRenderer {

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



}
