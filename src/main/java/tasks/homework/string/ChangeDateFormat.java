package main.java.tasks.homework.string;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChangeDateFormat {

    //написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020" и выводит в консоль в формате "September, 7, 2020 22:00"

    public static void main(String args[]) {

        String date = "22.00 07.09.2020";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);

        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm ");

        System.out.println(dateTime.format(newFormatter));

    }
}
