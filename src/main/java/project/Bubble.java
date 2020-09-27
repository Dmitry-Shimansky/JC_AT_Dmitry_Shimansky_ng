package main.java.project;

public class Bubble {

    private final double VOLUME = 0.3;
    private String gas = "CO2";

    public Bubble(String gas) {
        this.gas = gas;
        System.out.println(String.format("Add gas to bubbles: %s", gas));
    }

    public static void cramp() {
        System.out.println(" Cramp!");
    }

    public double getVOLUME() {
        return VOLUME;
    }
}

