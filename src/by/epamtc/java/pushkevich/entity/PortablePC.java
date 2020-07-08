package by.epamtc.java.pushkevich.entity;

public abstract class PortablePC {
    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;

    public PortablePC(String batteryCapacity, String displayInches, String memoryRom) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
    }

    public PortablePC() {
    }


    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    @Override
    public String toString() {
        return "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                '}';
    }
}
