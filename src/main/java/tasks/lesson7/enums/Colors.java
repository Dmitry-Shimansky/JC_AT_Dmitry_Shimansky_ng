package main.java.tasks.lesson7.enums;

public enum Colors {

    RED("red",1),
    BLUE("blue",2),
    GREEN("green",3),
    YELLOW("yellow",4),
    PURPLE("purple",5);

    String color;
    int hex;

    Colors(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }
}
