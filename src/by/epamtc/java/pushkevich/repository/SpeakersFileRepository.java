package by.epamtc.java.pushkevich.repository;

import by.epamtc.java.pushkevich.entity.home.Speakers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SpeakersFileRepository implements FileRepository {
    private List<Speakers> speakers = new ArrayList<>();
    private List<String> infoFromFile;

    {
        try {
            infoFromFile = DeviceFactory.getDevicesFromFile("Speakers");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void addAllDevicesFromFile(){
        if (infoFromFile != null) {
            for (int i = 0; i < infoFromFile.size(); i++) {
                Speakers speaker = new Speakers();
                String[] parameters = infoFromFile.get(i).split(", ");

                speaker.setPowerConsumption(parameters[0].substring(parameters[0].indexOf("=") + 1));
                speaker.setNumberOfSpeakers(parameters[1].substring(parameters[1].indexOf("=") + 1));
                speaker.setFrequencyRange(parameters[2].substring(parameters[2].indexOf("=") + 1));
                speaker.setCordLength(parameters[3].substring(parameters[3].indexOf("=") + 1));

                speakers.add(speaker);
            }
        }
    }

    public List<Speakers> getDevicesWithParams(String paramName, String paramValue) {
        List<Speakers> speakersWithParameters = new ArrayList<>();

        for (Speakers speaker : speakers) {
            if (paramName.equals("POWER_CONSUMPTION") && speaker.getPowerConsumption().equals(paramValue)){
                speakersWithParameters.add(speaker);
            }

            if (paramName.equals("NUMBER_OF_SPEAKERS") && speaker.getNumberOfSpeakers().equals(paramValue)){
                speakersWithParameters.add(speaker);
            }

            if (paramName.equals("FREQUENCY_RANGE") && speaker.getFrequencyRange().equals(paramValue)){
                speakersWithParameters.add(speaker);
            }

            if (paramName.equals("CORD_LENGTH") && speaker.getCordLength().equals(paramValue)){
                speakersWithParameters.add(speaker);
            }
        }

        return speakersWithParameters;
    }

}
