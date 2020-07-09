package by.epamtc.java.pushkevich.repository;

import by.epamtc.java.pushkevich.entity.portable.TabletPC;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TabletPCFileRepository implements FileRepository {
    private List<TabletPC> tabletPCs = new ArrayList<>();
    private List<String> infoFromFile;

    {
        try {
            infoFromFile = DeviceFactory.getDevicesFromFile("TabletPC");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void addAllDevicesFromFile() {
        if (infoFromFile != null) {
            for (int i = 0; i < infoFromFile.size(); i++) {
                TabletPC tabletPC = new TabletPC();
                String[] parameters = infoFromFile.get(i).split(", ");

                tabletPC.setBatteryCapacity(parameters[0].substring(parameters[0].indexOf("=") + 1));
                tabletPC.setDisplayInches(parameters[1].substring(parameters[1].indexOf("=") + 1));
                tabletPC.setMemoryRom(parameters[2].substring(parameters[2].indexOf("=") + 1));
                tabletPC.setFlashMemoryCapacity(parameters[3].substring(parameters[3].indexOf("=") + 1));
                tabletPC.setColor(parameters[4].substring(parameters[4].indexOf("=") + 1));

                tabletPCs.add(tabletPC);
            }
        }
    }

    public List<TabletPC> getDevicesWithParams(String paramName, String paramValue) {
        List<TabletPC> tabletPCsWithParameters = new ArrayList<>();

        for (TabletPC tabletPC : tabletPCs) {
            if (paramName.equals("BATTERY_CAPACITY") && tabletPC.getBatteryCapacity().equals(paramValue)) {
                tabletPCsWithParameters.add(tabletPC);
            }

            if (paramName.equals("DISPLAY_INCHES") && tabletPC.getDisplayInches().equals(paramValue)) {
                tabletPCsWithParameters.add(tabletPC);
            }

            if (paramName.equals("MEMORY_ROM") && tabletPC.getMemoryRom().equals(paramValue)) {
                tabletPCsWithParameters.add(tabletPC);
            }

            if (paramName.equals("FLASH_MEMORY_CAPACITY") && tabletPC.getFlashMemoryCapacity().equals(paramValue)) {
                tabletPCsWithParameters.add(tabletPC);
            }

            if (paramName.equals("COLOR") && tabletPC.getColor().equals(paramValue)) {
                tabletPCsWithParameters.add(tabletPC);
            }
        }

        return tabletPCsWithParameters;
    }
}
