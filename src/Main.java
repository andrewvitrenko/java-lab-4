import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SportEquipment[] sportEquipments = Main.getEquipment();

        SportEquipment[] sortedByName = Main.sortByName(sportEquipments);
        System.out.println("names - " + Arrays.toString(sortedByName));

        SportEquipment[] sortedById = Main.sortById(sportEquipments);
        System.out.println("ids - " + Arrays.toString(sortedById));
    }

    public static SportEquipment[] sortByName(SportEquipment[] source) {
        SportEquipment[] copy = source.clone();
        Arrays.sort(copy, new SortByName());

        return copy;
    }

    public static SportEquipment[] sortById(SportEquipment[] source) {
        SportEquipment[] copy = source.clone();
        Arrays.sort(copy, new SortById());

        return copy;
    }

    /**
     * Generates demo data for lab
     */
    private static SportEquipment[] getEquipment() {
        SportEquipmentType[] types = SportEquipmentType.values();

        SportEquipment[] equipment = new SportEquipment[types.length];

        for (int i = 0; i < equipment.length; i++) {
            String name = "equipment " + types[i];
            double cost = Math.random() * 500;
            int amount = (int) (Math.random() * 50);
            double maxWeight = Math.random() * 1000;

            equipment[i] = new SportEquipment(name, cost, amount, types[i], maxWeight);
        }

        return equipment;
    }
}