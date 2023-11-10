import java.util.Comparator;

/**
 * Sorts by name in ascending order
 */
public class SortByName implements Comparator<SportEquipment> {
    public int compare(SportEquipment a, SportEquipment b) {
        return a.name.compareTo(b.name);
    }
}
