package main.java.tasks.lesson9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerPerson {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

//        System.out.println(people.stream().filter(person ->));
//        int count = 0
//        if (people.sex == Person.Sex.WOMEN){
//            if ()
//        }
//        people.stream().sorted((o1,o2) -> {
//            if(o1.sex != o2.sex) {
//                return o1.sex.compareTo(o2.sex);
//            }
//            return o1.age - o2.age;
//        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());

        System.out.println(people.stream().min(Comparator.comparing(p -> p.age)).get().name);

        System.out.println(people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)));

        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
    }
}
