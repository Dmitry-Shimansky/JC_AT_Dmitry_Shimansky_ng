package main.java.tasks.homework.lamdaandstream;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTask {

    //- создать класс Person, с полями name, surname, age.
    // Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
    // Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21,
    // выводит их имена и возраст в консоль, сортирует по фамилии,
    // а потом по имени(использовать thenComparing у объекта Comparator),
    // берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

    public static void main(String[] args) {

        List<Person> collect = Stream.generate(ThirdTask::personGenerator)
                .limit(100)
                .filter(person -> person.age < 21)
                .sorted(Comparator.comparing((Person person) -> person.surname).
                        thenComparing((Person person) -> person.name))
                .peek(person -> System.out.println(person.name + " " + person.age)).limit(4).collect(Collectors.toList());

        System.out.println(collect);
    }

    private static Person personGenerator() {

        return new Person(getRandomString(),getRandomString(),new Random().nextInt(15)+15);
    }

    private static String getRandomString() {
        byte[] array = new byte[new Random().nextInt(10)]; // length is bounded by 10
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}
