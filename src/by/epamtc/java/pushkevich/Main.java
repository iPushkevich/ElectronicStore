package by.epamtc.java.pushkevich;
import by.epamtc.java.pushkevich.entity.home.Speakers;
import by.epamtc.java.pushkevich.entity.kitchen.Oven;
import by.epamtc.java.pushkevich.entity.portable.Laptop;
import by.epamtc.java.pushkevich.controller.*;



import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Speakers> laptops = DeviceController.getDevices("Speakers", "NUMBER_OF_SPEAKERS", "3");

        System.out.println(laptops);


    }
}


