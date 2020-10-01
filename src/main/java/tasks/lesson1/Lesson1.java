package main.java.tasks.lesson1;

import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        foo4();
    }
    static void foo() {
        int i = 23;
        while (i < 28) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
                //return;
                //continue;
            }
            System.out.println("i is: " + i++);
        }
        System.out.println("number is : " + i);
    }
    static void foo2(){
        int[][] array = {{1,2,3},{1,2},{1,2,4},{1,2,7,8},{1,2}};

        for (int[] inter: array) {
            for (int e: inter) {
                System.out.print(e);
            }
            System.out.println();
        }
        /*
        for (int i = 0; i < array.length; i++){
            int[] inter = array[i];
            for (int e = 0; e < inter.length; e++) {
                System.out.print(inter[e]);
            }
            System.out.println();
        }*/
    }
    static void foo3(){
        int[] array = {1,2,3,4,5,6};
        for (int i: array) {
            System.out.println("element is: " + i);
        }
    }
    static void foo4(){
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int avg = 0;
        for (int i : array) {
            System.out.println("value is: " + i);
            avg += i;
        }
        System.out.println("Average value is: " + avg/ array.length);
    }

}
