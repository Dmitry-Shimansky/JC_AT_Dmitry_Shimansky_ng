package main.java.tasks.homework.cicletask;

import java.util.Random;

public class CicleTask {
    public static void main(String[] args) {
        cycleOne();
        cycleTwo();
        part();
    }

    static void cycleOne() {
        System.out.println("-Используя while вывести все числа от 0 до 20 в 1 строку через пробел");
        int i = 0;
        while (i < 21) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    static void cycleTwo() {
        System.out.println("-Используя for вывести каждое нечетное число от 3 до 19 включительно");
        int i = 20;
        for (i = 3; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    static void part() {
        System.out.println("-Создать пустой массив типа int и размера n = 7");
        System.out.println("-Заполнить его случайными элементами используя Random.nextInt");
        System.out.println("-Пройти по массиву и вывести все элементы");

        int[] array = new int[7];
        Random random = new Random();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Ввывести все элементы в обратном порядке");
        System.out.print("[");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Каждый элемент умножить на 5 и вывести результат");
        System.out.print("[");

        for (int i : array) {
            i *= 5;
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Каждый элемент возвести в квадрат и вывести результат");
        System.out.print("[");

        for (int i : array) {
            i = i * i;
            //Math.pow(i, 2);
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Найти минимальный элемент массива и вывести результат");

        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.print("Минимальный элемент: " + minValue);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Поменять местами первый и последний элементы и вывести результат");

        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;

        System.out.print("[");

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-Отсортировать элементы массива в порядке убывания");

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println(" ");
    }
}

