package main.java.tasks.lesson5;

public class Just {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2));


        method();
    }

    public static void method() {

        String[] st = "Хавал мальчик 20-й свой обед".split("\\d");
        System.out.println(st.length);
        System.out.println(st[0]);
    }
}
