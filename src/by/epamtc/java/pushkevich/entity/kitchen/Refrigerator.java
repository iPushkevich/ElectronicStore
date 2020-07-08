package by.epamtc.java.pushkevich.entity.kitchen;

public class Refrigerator extends KitchenEquipment {
    private String freezerCapacity;
    private String overallCapacity;

    public Refrigerator(String powerConsumption, String weight, String height, String width, String freezerCapacity, String overallCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public Refrigerator() {
    }

    public String getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public String getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(String overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public String toString() {
        return "Refrigerator {" + super.toString() +
                "freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                '}';
    }
}
