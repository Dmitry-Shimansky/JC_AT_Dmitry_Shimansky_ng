package main.java.tasks.lesson7;

public class ColorCont {

    public static final Color RED = new Color("Red", 1);
    public static final Color BLUE = new Color("blue", 2);
    public static final Color GREEN = new Color("green", 3);
    public static final Color YELLOW = new Color("yellow", 4);
    public static final Color PURPLE = new Color("purple", 5);

    static private void ifColor(String color) {
        String aColor = color;

        if (RED.getColor() == aColor) {
            System.out.println(RED);
        } else if (BLUE.getColor() == aColor) {
            System.out.println(BLUE);
        } else if (GREEN.getColor() == aColor) {
            System.out.println(GREEN);
        } else if (YELLOW.getColor() == aColor) {
            System.out.println(YELLOW);
        } else if (PURPLE.getColor() == aColor) {
            System.out.println(PURPLE);
        } else {
            return;
        }
    }
}
