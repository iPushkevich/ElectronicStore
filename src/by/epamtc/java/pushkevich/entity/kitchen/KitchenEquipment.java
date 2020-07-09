package by.epamtc.java.pushkevich.entity.kitchen;

import by.epamtc.java.pushkevich.entity.ElectricalEquipment;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KitchenEquipment)) return false;
        if (!super.equals(o)) return false;
        KitchenEquipment that = (KitchenEquipment) o;
        return Objects.equals(weight, that.weight) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, height, width);
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
