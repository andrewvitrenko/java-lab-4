import java.util.Comparator;

/**
 * Sorts by id in descending order
 */
public class SortById implements Comparator<SportEquipment> {
    public int compare(SportEquipment a, SportEquipment b) {
        return b.id.compareTo(a.id);
    }
}
