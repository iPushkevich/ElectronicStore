package by.epamtc.java.pushkevich.entity.home;

import by.epamtc.java.pushkevich.entity.ElectricalEquipment;

public class Speakers extends ElectricalEquipment {
    private String numberOfSpeakers;
    private String frequencyRange;
    private String cordLength;

    public Speakers(String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers() {
    }

    public String getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(String numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getCordLength() {
        return cordLength;
    }

    public void setCordLength(String cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{ " + super.toString() +
                "numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                "} ";
    }
}
