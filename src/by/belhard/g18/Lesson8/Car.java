package by.belhard.g18.Lesson8;

import static java.lang.System.out;

public class Car {

    private String title;
    private  WheelType wheels;
    private FuelTupe fuel;

    public Car(String title, WheelType wheels, FuelTupe fuel) {
        this.title = title;
        this.wheels = wheels;
        this.fuel = fuel;
        out.println();
    }
}
