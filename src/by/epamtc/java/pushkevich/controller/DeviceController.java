package by.epamtc.java.pushkevich.controller;

import by.epamtc.java.pushkevich.repository.*;

import java.util.List;

public class DeviceController {
    private static FileRepository repository;

    public static List getDevices(String deviceName, String deviceParameter, String parameterValue){
        List devices;

        if (deviceName.equals("Laptop")){
            repository = new LaptopFileRepository();
        }

        if (deviceName.equals("Oven")){
            repository = new OvenFileRepository();
        }

        if (deviceName.equals("Refrigerator")){
            repository = new RefrigeratorFileRepository();
        }

        if (deviceName.equals("VacuumCleaner")){
            repository = new VacuumCleanerFileRepository();
        }

        if (deviceName.equals("TabletPC")){
            repository = new TabletPCFileRepository();
        }

        if (deviceName.equals("Speakers")){
            repository = new SpeakersFileRepository();
        }

        repository.addAllDevicesFromFile();
        devices = repository.getDevicesWithParams(deviceParameter, parameterValue);

        return devices;
    }
}
