package by.epamtc.java.pushkevich.entity.kitchen;

import java.util.Objects;

public class Oven extends KitchenEquipment{
    private String capacity;
    private String depth;

    public Oven(String powerConsumption, String weight, String height, String width, String capacity, String depth) {
        super(powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

    public Oven() {
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return Objects.equals(capacity, oven.capacity) &&
                Objects.equals(depth, oven.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity, depth);
    }

    @Override
    public String toString() {
        return "Oven {" + super.toString() +
                "capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                "} ";
    }
}
