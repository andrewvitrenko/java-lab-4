import java.util.UUID;

enum SportEquipmentType {
    DUMB_BELL,
    BALL,
    MACHINE,
}

public class SportEquipment {
    /**
     * Price paid for equipment
     */
    double cost;
    /**
     * Number of items provided
     */
    int amount;
    SportEquipmentType type;
    /**
     * Max weight for one item
    */
    double maxWeight;
    String name;
    /**
     * Unique id, uuid v4
    */
    String id;

    SportEquipment(String name, double cost, int amount, SportEquipmentType type, double maxWeight) {
        this.amount = amount;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.maxWeight = maxWeight;
        this.id = UUID.randomUUID().toString();
    }

    public String toString() {
        return this.id + " " + this.name;
    }
}
