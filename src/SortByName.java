import java.util.Comparator;

public class SortByName implements Comparator<SportEquipment> {

    public int compare(SportEquipment a, SportEquipment b) {
        return a.name.compareTo(b.name);
    }
}
