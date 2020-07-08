package by.epamtc.java.pushkevich.repository;
import by.epamtc.java.pushkevich.entity.portable.Laptop;
import java.util.ArrayList;
import java.util.List;

public class LaptopFileRepository implements FileRepository {
    private List<Laptop> laptops = new ArrayList<>();
    private List<String> infoFromFile = DeviceFactory.getDevicesFromFile("Laptop");


    public void addAllDevicesFromFile() {

        for (int i = 0; i < infoFromFile.size(); i++) {
            Laptop laptop = new Laptop();
            String[] parameters = infoFromFile.get(i).split(", ");

            laptop.setBatteryCapacity(parameters[0].substring(parameters[0].indexOf("=") + 1));
            laptop.setOS(parameters[1].substring(parameters[1].indexOf("=") + 1));
            laptop.setMemoryRom(parameters[2].substring(parameters[2].indexOf("=") + 1));
            laptop.setSystemMemory(parameters[3].substring(parameters[3].indexOf("=") + 1));
            laptop.setCPU(parameters[4].substring(parameters[4].indexOf("=") + 1));
            laptop.setDisplayInches(parameters[5].substring(parameters[5].indexOf("=") + 1));

            laptops.add(laptop);
        }


    }

    public List<Laptop> getDevicesWithParams(String paramName, String paramValue) {
        List<Laptop> laptopsWithParams = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (paramName.equals("BATTERY_CAPACITY") && laptop.getBatteryCapacity().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }

            if (paramName.equals("OS") && laptop.getOS().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }

            if (paramName.equals("MEMORY_ROM") && laptop.getMemoryRom().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }

            if (paramName.equals("SYSTEM_MEMORY") && laptop.getSystemMemory().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }

            if (paramName.equals("CPU") && laptop.getCPU().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }

            if (paramName.equals("DISPLAY_INCHES") && laptop.getDisplayInches().equals(paramValue)) {
                laptopsWithParams.add(laptop);
            }
        }
        return laptopsWithParams;
    }

}
