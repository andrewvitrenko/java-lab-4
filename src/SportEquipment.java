import java.text.SimpleDateFormat;
import java.util.Date;

enum SportEquipmentType {
    DUMB_BELL,
    BALL,
    MACHINE,
}

public class SportEquipment {
    public static final String DATE_FORMAT = "yyy-MM-dd 'at' hh:mm:ss";

    double cost;
    String dateDelivered;
    int amount;
    SportEquipmentType type;
    double maxWeight;
    String name;
    SportEquipment(String name, double cost, int amount, SportEquipmentType type, double maxWeight) {
        this.amount = amount;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.maxWeight = maxWeight;

        SimpleDateFormat formatter = new SimpleDateFormat(SportEquipment.DATE_FORMAT);
        Date date = new Date();
        this.dateDelivered = formatter.format(date);
    }
}
