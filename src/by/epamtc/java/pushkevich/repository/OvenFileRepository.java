package by.epamtc.java.pushkevich.repository;
import by.epamtc.java.pushkevich.entity.kitchen.Oven;
import java.util.ArrayList;
import java.util.List;

public class OvenFileRepository implements FileRepository{
    private List<Oven> ovens = new ArrayList<>();
    private List<String> infoFromFile = DeviceFactory.getDevicesFromFile("Oven");


    public void addAllDevicesFromFile(){

        for (int i=0; i<infoFromFile.size(); i++){
            Oven oven = new Oven();
            String [] parameters = infoFromFile.get(i).split(", ");

            oven.setPowerConsumption(parameters[0].substring(parameters[0].indexOf("=") + 1));
            oven.setWeight(parameters[1].substring(parameters[1].indexOf("=") + 1));
            oven.setCapacity(parameters[2].substring(parameters[2].indexOf("=") + 1));
            oven.setDepth(parameters[3].substring(parameters[3].indexOf("=") + 1));
            oven.setHeight(parameters[4].substring(parameters[4].indexOf("=") + 1));
            oven.setWidth(parameters[5].substring(parameters[5].indexOf("=") + 1));

            ovens.add(oven);
        }


    }

    public List<Oven> getDevicesWithParams(String paramName, String paramValue) {
        List<Oven> ovensWithParams = new ArrayList<>();

        for (Oven oven : ovens) {
            if (paramName.equals("POWER_CONSUMPTION") && oven.getPowerConsumption().equals(paramValue)){
                ovensWithParams.add(oven);
            }

            if (paramName.equals("WEIGHT") && oven.getWeight().equals(paramValue)){
                ovensWithParams.add(oven);
            }

            if (paramName.equals("CAPACITY") && oven.getCapacity().equals(paramValue)){
                ovensWithParams.add(oven);
            }

            if (paramName.equals("DEPTH") && oven.getDepth().equals(paramValue)){
                ovensWithParams.add(oven);
            }

            if (paramName.equals("HEIGHT") && oven.getHeight().equals(paramValue)){
                ovensWithParams.add(oven);
            }

            if (paramName.equals("WIDTH") && oven.getWidth().equals(paramValue)){
                ovensWithParams.add(oven);
            }
        }
        return ovensWithParams;
    }
}
