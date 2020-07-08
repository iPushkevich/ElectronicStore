package by.epamtc.java.pushkevich.repository;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeviceFactory {
    private static final String PATH = "appliance_db";
    private static List<String> devicesFromFile = new ArrayList<>();

    public static List<String> getDevicesFromFile(String objectName) {
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
            return new ArrayList<>();
        }
    }

}
