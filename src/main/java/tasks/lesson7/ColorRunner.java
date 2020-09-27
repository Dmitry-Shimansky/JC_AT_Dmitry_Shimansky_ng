package main.java.tasks.lesson7;

public class ColorRunner {
    public static void main(String[] args) {
        Color c1 = new Color("red", 1);
        Color c2 = new Color("red", 1);

        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
