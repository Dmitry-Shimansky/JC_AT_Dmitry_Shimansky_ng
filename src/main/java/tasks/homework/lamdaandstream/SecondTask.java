package main.java.tasks.homework.lamdaandstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondTask {
//- сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue.
// Определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0,20).boxed().collect(Collectors.toList());

        System.out.println(list.stream().filter(i -> i % 3 == 0 && i % 5 == 0).collect(Collectors.toList()));
                                        //anyMatch
    }
}
