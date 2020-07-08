package by.epamtc.java.pushkevich;
import by.epamtc.java.pushkevich.entity.kitchen.Oven;
import by.epamtc.java.pushkevich.entity.portable.Laptop;
import by.epamtc.java.pushkevich.controller.*;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Laptop > laptops = DeviceController.getDevices("Laptop", "SYSTEM_MEMORY", "1500");

        for (Laptop  l : laptops){
            System.out.println(l);
        }

    }
}


