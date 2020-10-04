package main.java.tasks.lesson9;

import java.util.Arrays;
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
    }
}
