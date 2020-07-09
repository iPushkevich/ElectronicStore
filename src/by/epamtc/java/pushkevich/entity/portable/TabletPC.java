package by.epamtc.java.pushkevich.entity.portable;

import by.epamtc.java.pushkevich.entity.PortablePC;

import java.util.Objects;

public class TabletPC extends PortablePC {
    private String flashMemoryCapacity;
    private String color;

    public TabletPC(String batteryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        super(batteryCapacity, displayInches, memoryRom);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC() {
    }

    public String getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(String flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC {" + super.toString() +
                "flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
