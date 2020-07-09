package by.epamtc.java.pushkevich.entity.portable;

import by.epamtc.java.pushkevich.entity.PortablePC;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(OS, laptop.OS) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(CPU, laptop.CPU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OS, systemMemory, CPU);
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


