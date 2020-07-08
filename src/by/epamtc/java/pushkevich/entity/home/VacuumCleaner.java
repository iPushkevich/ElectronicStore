package by.epamtc.java.pushkevich.entity.home;

import by.epamtc.java.pushkevich.entity.ElectricalEquipment;

public class VacuumCleaner extends ElectricalEquipment {
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    public VacuumCleaner(String powerConsumption, String filterType, String bagType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner() {
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public String getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner {" + super.toString() +
                "filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }
}
