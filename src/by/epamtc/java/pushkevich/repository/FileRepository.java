package by.epamtc.java.pushkevich.repository;

import java.util.List;

public interface FileRepository {
    void addAllDevicesFromFile();
    List getDevicesWithParams(String parameterName, String parameterValue);
}
