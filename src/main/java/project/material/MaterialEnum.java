package main.java.project.material;

enum MaterialEnum {

    GLASS(0.017,"green",2200),
    PLASTIC(0.2,"white",1800),
    METAL(58,"silver",7800);

    MaterialEnum(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    private double thermalConductivity;
    private String color;
    private double density;
}
