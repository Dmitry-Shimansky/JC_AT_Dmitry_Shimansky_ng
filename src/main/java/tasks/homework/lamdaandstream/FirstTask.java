package main.java.tasks.homework.lamdaandstream;

import java.util.Arrays;
import java.util.List;

public class FirstTask {
    //для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        System.out.println(list.stream().filter(i -> i % 2 == 0).mapToDouble(i -> i*2.54).sum());
    }
}
