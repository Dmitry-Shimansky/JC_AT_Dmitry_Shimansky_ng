package main.java.tasks.lesson2;

public class Demo {
    public static void main(String[] args) {

        String type = Man.ANIMAL_TYPE;

        Man myMan = new Man(23);
        int x = myMan.getAge();
        myMan.setAge(25);

        Man yongOne = new Man();
        yongOne.age = 15;

        Man oldOne = new Man();
        oldOne.age = 85;

        System.out.println("Yong person age: " + yongOne.age);
        System.out.println("Yong person age: " + oldOne.age);

    }
}
