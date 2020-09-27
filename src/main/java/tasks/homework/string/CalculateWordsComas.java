package main.java.tasks.homework.string;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateWordsComas {

    //Прочитать текстовый файл, подсчитать в тексте количество знаков препинания и слов и вывести результат в консоль.

    public static void main(String[] args) throws IOException {

        String input = readTextFile("/Users/DmitryShimansky/Desktop/JC_AT_Dmitry_Shimansky/AGL");
        System.out.println(input);

        separatorCounter(input);

        wordsCounter(input);

    }

    private static String readTextFile(String fileName) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        return content;
    }

    private static void separatorCounter(String input) {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");

        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Кол-во знаков припенания: " + count);
    }

    private static void wordsCounter(String input) {
        String[] words = input.split("[^А-Яа-я]");

        System.out.println("Кол-во слов: " + words.length);


        for (String elem : words) {
            System.out.println(elem);
        }

        Matcher word = Pattern.compile("[^А-Яа-я]").matcher(input);
        int counter = 0;
        while (word.find()) {
            counter++;
        }
        System.out.println("Кол-во слов: " + counter);
    }
}
