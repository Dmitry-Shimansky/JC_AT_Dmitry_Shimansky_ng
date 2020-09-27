package main.java.tasks.homework.string;

public class ArrayOfNumbers {

    // Task: найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль

    public static void main(String[] args) {
        arrayOfNumbers();
    }

    private static String text = "After ten, eleven (11), twelve (12), thirteen (13), fourteen (14), fifteen (15), sixteen (16), seventeen (17), eighteen (18), nineteen (19), and twenty (20) follow.";

    private static void arrayOfNumbers() {

        String[] st = text.split("[^-?0-9]+");

        for (String i: st) {
            System.out.println(i);
        }
    }
}
