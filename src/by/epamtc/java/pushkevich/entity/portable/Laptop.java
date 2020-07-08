package by.epamtc.java.pushkevich.entity.portable;

import by.epamtc.java.pushkevich.entity.PortablePC;

public class Laptop extends PortablePC {
    private String OS;
    private String systemMemory;
    private String CPU;

    public Laptop(String batteryCapacity, String displayInches, String memoryRom, String OS, String systemMemory, String CPU) {
        super(batteryCapacity, displayInches, memoryRom);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
    }

    public Laptop() {
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Laptop {" + super.toString() +
                "OS='" + OS + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}


