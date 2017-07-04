package bjs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableCellRenderer;


class DateRenderer extends DefaultTableCellRenderer {

private static final long serialVersionUID = 1L;
private Date dateValue;
private SimpleDateFormat sdfNewValue = new SimpleDateFormat("mm:ss");
private String valueToString = "";

@Override
public void setValue(Object value) {
    if ((value != null)) {
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