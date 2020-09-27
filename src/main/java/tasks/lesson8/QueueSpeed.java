package main.java.tasks.lesson8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueSpeed {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        Set<String> myList = new HashSet<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            myList.add("elem" + i);
        }
        for (String elem : myList) {
            myList.remove(elem);
        }

        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            queue.add("elem" + i);
        }
        for (String elem : queue) {
            queue.remove();
        }
        System.out.println(System.currentTimeMillis() - start2);
    }
}
