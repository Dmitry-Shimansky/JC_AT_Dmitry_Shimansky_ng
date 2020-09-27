package main.java.tasks.homework.string;

public class Duplicate {

    // Task: найти и вывести в консоль все дубликаты слов в строке текста, коллекции и потоки не использовать

    public static void main(String[] args) {
        method();
    }

    static String text = "Класс String очень часто используется программистами, поэтому его следует изучить очень хорошо. Следует помнить, что объекты класса String являются неизменяемыми";

    private static void method() {

        int count;

        //Converts the string into lowercase
        text = text.toLowerCase();

        //Split the string into words using built-in function
        String words[] = text.split(" ");

        System.out.println("Duplicate words in a given string : ");

        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
