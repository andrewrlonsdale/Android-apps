package example.codeclan.com.tddintro;

/**
 * Created by Andrew on 16/01/2017.
 */

public class Robot {
    private String name;
    private Double batteryPercentage;
    private String colour;


    public Robot(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.batteryPercentage = 100.0;
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public double checkBattery() {
        return this.batteryPercentage;
    }

    public String makeDrink(String name) {
        this.batteryPercentage -= 10.0;
        return "I am making a " + name;
    }

    public void doWashing() {
        this.batteryPercentage -= 30.0;
    }

    public String doDusting() {
        this.batteryPercentage -= 20.0;
        return "I am dusting";
    }

    public void chargeBattery() {
        this.batteryPercentage = 100.00;
    }
}