package by.epamtc.java.pushkevich.repository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class DeviceFactory {
    private static final String PATH = "appliance_db";
    private static List<String> devicesFromFile = new ArrayList<>();

    static List<String> getDevicesFromFile(String objectName) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(PATH)))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String [] objectsAndParameters = line.split(" : ");

                if (objectsAndParameters[0].equals(objectName)){
                    devicesFromFile.add(objectsAndParameters[1]);
                }
            }

            return devicesFromFile;

        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

}
