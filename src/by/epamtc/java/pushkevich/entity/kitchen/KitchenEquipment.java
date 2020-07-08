package by.epamtc.java.pushkevich.entity.kitchen;

import by.epamtc.java.pushkevich.entity.ElectricalEquipment;

public abstract class KitchenEquipment extends ElectricalEquipment {
    private String weight;
    private String height;
    private String width;

    KitchenEquipment(String powerConsumption, String weight, String height, String width) {
        super(powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    KitchenEquipment() {
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                " " ;
    }
}
