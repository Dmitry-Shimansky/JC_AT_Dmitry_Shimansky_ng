package main.java.tasks.lesson7.enums;

public class EnumColorRunner {
    public static void main(String[] args) {
        ifColor("red");
    }

    static private void ifColor (String color) {

        switch (Colors.valueOf(color)) {
            case RED:
                System.out.println(Colors.RED);
                break;
            case BLUE:
                System.out.println(Colors.BLUE);
                break;
            case GREEN:
                System.out.println(Colors.GREEN);
                break;
            case YELLOW:
                System.out.println(Colors.YELLOW);
                break;
            case PURPLE:
                System.out.println(Colors.PURPLE);
                break;
        }
    }
}
