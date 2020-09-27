package main.java.tasks.lesson8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<Integer,String>();

        String[] st = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < st.length; i++) {
            words.put(i,st[i]);
        }

        System.out.println(words.keySet());
        System.out.println(words.values());
        System.out.println(words.entrySet());

        //Map<int,String>=Set<Map.Entry<int,String>>

        for (Map.Entry<Integer,String> elem: words.entrySet()){
            System.out.println(elem.getKey() + " " + elem.getValue());
        }

    }
}
