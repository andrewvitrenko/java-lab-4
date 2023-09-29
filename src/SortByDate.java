import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByDate implements Comparator<SportEquipment> {
    public int compare(SportEquipment a, SportEquipment b) {
        SimpleDateFormat formatter = new SimpleDateFormat(SportEquipment.DATE_FORMAT);
        try {
            Date dateA = formatter.parse(a.dateDelivered);
            Date dateB = formatter.parse(b.dateDelivered);
            return dateB.compareTo(dateA);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
