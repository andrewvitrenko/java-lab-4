import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SportEquipment[] sportEquipments = Main.getEquipment();

        SportEquipment[] sortedByName = Main.sortByName(sportEquipments);
        String[] names = Arrays.stream(sortedByName).map(item -> item.name).toArray(String[]::new);
        System.out.println("names - " + Arrays.toString(names));

        SportEquipment[] sortedByDate = Main.sortByDateDelivered(sportEquipments);
        String[] dates = Arrays.stream(sortedByDate).map(item -> item.dateDelivered).toArray(String[]::new);
        System.out.println("dates - " + Arrays.toString(dates));
    }

    public static SportEquipment[] sortByName(SportEquipment[] source) {
        SportEquipment[] copy = source.clone();
        Arrays.sort(copy, new SortByName());

        return copy;
    }

    public static SportEquipment[] sortByDateDelivered(SportEquipment[] source) {
        SportEquipment[] copy = source.clone();
        Arrays.sort(copy, new SortByDate());

        return copy;
    }

    private static SportEquipment[] getEquipment() {
        SportEquipmentType[] types = SportEquipmentType.values();

        SportEquipment[] equipment = new SportEquipment[types.length];

        for (int i = 0; i < equipment.length; i++) {
            String name = "equipment " + types[i];
            double cost = Math.random() * 500;
            int amount = (int) (Math.random() * 50);
            double maxWeight = Math.random() * 1000;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            equipment[i] = new SportEquipment(name, cost, amount, types[i], maxWeight);
        }

        return equipment;
    }
}