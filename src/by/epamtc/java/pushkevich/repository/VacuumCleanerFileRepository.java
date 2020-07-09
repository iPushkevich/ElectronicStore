package by.epamtc.java.pushkevich.repository;

import by.epamtc.java.pushkevich.entity.home.VacuumCleaner;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class VacuumCleanerFileRepository implements FileRepository {
    private List<VacuumCleaner> vacuumCleaners = new ArrayList<>();
    private List<String> infoFromFile;

    {
        try {
            infoFromFile = DeviceFactory.getDevicesFromFile("VacuumCleaner ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void addAllDevicesFromFile() {
        if (infoFromFile != null) {
            for (int i = 0; i < infoFromFile.size(); i++) {
                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                String[] parameters = infoFromFile.get(i).split(", ");

                vacuumCleaner.setPowerConsumption(parameters[0].substring(parameters[0].indexOf("=") + 1));
                vacuumCleaner.setFilterType(parameters[1].substring(parameters[1].indexOf("=") + 1));
                vacuumCleaner.setBagType(parameters[2].substring(parameters[2].indexOf("=") + 1));
                vacuumCleaner.setWandType(parameters[3].substring(parameters[3].indexOf("=") + 1));
                vacuumCleaner.setMotorSpeedRegulation(parameters[4].substring(parameters[4].indexOf("=") + 1));
                vacuumCleaner.setCleaningWidth(parameters[5].substring(parameters[5].indexOf("=") + 1));

                vacuumCleaners.add(vacuumCleaner);
            }
        }
    }

    public List<VacuumCleaner> getDevicesWithParams(String paramName, String paramValue) {
        List<VacuumCleaner> vacuumCleanersWithParams = new ArrayList<>();

        for (VacuumCleaner vacuumCleaner : vacuumCleaners) {
            if (paramName.equals("POWER_CONSUMPTION") && vacuumCleaner.getPowerConsumption().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }

            if (paramName.equals("FILTER_TYPE") && vacuumCleaner.getFilterType().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }

            if (paramName.equals("BAG_TYPE") && vacuumCleaner.getBagType().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }

            if (paramName.equals("WAND_TYPE") && vacuumCleaner.getWandType().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }

            if (paramName.equals("MOTOR_SPEED_REGULATION") && vacuumCleaner.getMotorSpeedRegulation().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }

            if (paramName.equals("CLEANING_WIDTH") && vacuumCleaner.getCleaningWidth().equals(paramValue)) {
                this.vacuumCleaners.add(vacuumCleaner);
            }
        }

        return vacuumCleanersWithParams;
    }
}
