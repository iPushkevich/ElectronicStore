package by.epamtc.java.pushkevich.entity;

public abstract class ElectricalEquipment {
    private String powerConsumption;

    public ElectricalEquipment(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    protected ElectricalEquipment() {
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "powerConsumption='" + powerConsumption +"', ";
    }
}
