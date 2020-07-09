package by.epamtc.java.pushkevich.entity.kitchen;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(freezerCapacity, that.freezerCapacity) &&
                Objects.equals(overallCapacity, that.overallCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator {" + super.toString() +
                "freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                '}';
    }
}
