package by.epamtc.java.pushkevich.repository;

import by.epamtc.java.pushkevich.entity.kitchen.Refrigerator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RefrigeratorFileRepository implements FileRepository {
    private List<Refrigerator> refrigerators = new ArrayList<>();
    private List<String> infoFromFile;

    {
        try {
            infoFromFile = DeviceFactory.getDevicesFromFile("Refrigerator");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void addAllDevicesFromFile() {
        if (infoFromFile != null) {
            for (int i = 0; i < infoFromFile.size(); i++) {
                Refrigerator refrigerator = new Refrigerator();
                String[] parameters = infoFromFile.get(i).split(", ");

                refrigerator.setPowerConsumption(parameters[0].substring(parameters[0].indexOf("=") + 1));
                refrigerator.setWeight(parameters[1].substring(parameters[1].indexOf("=") + 1));
                refrigerator.setFreezerCapacity(parameters[2].substring(parameters[2].indexOf("=") + 1));
                refrigerator.setOverallCapacity(parameters[3].substring(parameters[3].indexOf("=") + 1));
                refrigerator.setHeight(parameters[4].substring(parameters[4].indexOf("=") + 1));
                refrigerator.setWidth(parameters[5].substring(parameters[5].indexOf("=") + 1));

                refrigerators.add(refrigerator);
            }
        }
    }

    public List<Refrigerator> getDevicesWithParams(String paramName, String paramValue) {
        List<Refrigerator> refrigeratorsWithParams = new ArrayList<>();

        for (Refrigerator refrigerator : refrigerators) {
            if (paramName.equals("POWER_CONSUMPTION") && refrigerator.getPowerConsumption().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }

            if (paramName.equals("WEIGHT") && refrigerator.getWeight().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }

            if (paramName.equals("FREEZER_CAPACITY") && refrigerator.getFreezerCapacity().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }

            if (paramName.equals("OVERALL_CAPACITY") && refrigerator.getOverallCapacity().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }

            if (paramName.equals("HEIGHT") && refrigerator.getHeight().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }

            if (paramName.equals("WIDTH") && refrigerator.getWidth().equals(paramValue)) {
                refrigerators.add(refrigerator);
            }
        }

        return refrigeratorsWithParams;
    }

}
