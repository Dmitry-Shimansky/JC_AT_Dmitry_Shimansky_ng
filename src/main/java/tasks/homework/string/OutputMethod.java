package main.java.tasks.homework.string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class OutputMethod {
    public static void main(String[] args) {

        System.out.print("Введите числовой номер месяца желаемый - 1: ");
        Scanner scanner = new Scanner(System.in);
        Method(scanner);
        scanner.close();
    }

    private static void Method(Scanner scanner) {

        if (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            System.out.println("Спасибо! Вы ввели число " + data);
            Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.MONTH, data - 1);
            calendar.add(Calendar.MONTH, 1);

            SimpleDateFormat spec = new SimpleDateFormat("MMMM");

            System.out.print("Следующий месяц: ");
            System.out.println(spec.format(calendar.getTime()));
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
