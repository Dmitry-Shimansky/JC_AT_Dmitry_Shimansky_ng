package main.java.tasks.lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "смыла", "раму");
        //System.out.println(list.stream().filter("мама"::equals).count()); //x->x.equals("mama") "мама", "мыла", "раму", "мама", "смыла", "раму"

        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter(x->x.equals("мама")).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).toArray());
        System.out.println(list.stream().filter((s)->s.contains("м")).collect(Collectors.toList()));

        System.out.println(list.stream().anyMatch(x -> x.equals("мама")));
        System.out.println(list.stream().allMatch((s) -> s.contains("м")));
        System.out.println(list.stream().map((s) -> s + "м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(s1 -> Arrays.stream(s1.split("м"))).filter(s2->!s2.equals("")));
    }
}
