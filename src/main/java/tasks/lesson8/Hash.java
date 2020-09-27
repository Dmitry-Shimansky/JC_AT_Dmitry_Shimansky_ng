package main.java.tasks.lesson8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash {
    public static void main(String[] args) {

        Set<String> myList = new HashSet<String>();
        Set<String> myList2 = new TreeSet<String>();

//        String[] st = "мама мыла раму мыла".split(" ");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            myList.add("elem" + i);
        }

        System.out.println(System.currentTimeMillis() - start);

        for (int i = 0; i < 1000000; i++) {
            myList2.add("elem" + i);
        }

        System.out.println(System.currentTimeMillis() - start);


//
//        for (String elem: st) {
//            myList.add(elem);
//        }
//
//        for (String elem: myList){
//            System.out.println(elem);
//        }

    }
}
