/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author claus
 */
public class LeistungEditor extends DefaultCellEditor {
    LeistungEditor(JTextField tf){
        super(tf);
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column)
    {
        // empty the cell on edit start
        delegate.setValue( (editorComponent instanceof JTextField)? null : value);
        return editorComponent;
    }
    
}
