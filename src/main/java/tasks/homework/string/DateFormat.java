package main.java.tasks.homework.string;

import java.util.Date;

public class DateFormat {
//    написать метод, который выводит в коноль текущую дату и время в формате ниже:
//    Сейчас на дворе:
//    19 сентября, 2020, 3 часа 13 минут

    public static void main(String[] args) {

        Date dateNow = new Date();
        //SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM, yyyy 'и время' hh:mm:ss");
        //System.out.println("Сейчас на дворе: " + formatForDateNow.format(dateNow));
        System.out.println(dateNow);
        System.out.println("");

        System.out.printf("%s %te %<tB, %<tY, %<TH часа %<TM минут", "Сейчас на дворе:\n", dateNow);

        System.out.println("");
    }
}
