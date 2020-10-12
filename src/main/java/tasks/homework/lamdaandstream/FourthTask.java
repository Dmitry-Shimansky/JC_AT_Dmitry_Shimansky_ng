package main.java.tasks.homework.lamdaandstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourthTask {

    //- построчно прочитать файл и создать стрим из его строк,
    // пропустив первые 4 строки собрать коллекцию в отдну строку,
    // разделить на по <br>, оставить только те, что начинаются с "Date log:",
    // в каждой строке оставить только первые 20 символов, к каждой в конец дописать значение текущей даты

    public static void main(String[] args) throws IOException {

        Arrays.stream(
                Files.lines(Paths.get("/Users/DmitryShimansky/Desktop/FourTask"))
                        .skip(4)
                        .collect(Collectors.joining()).split("<br>"))
                .filter(s -> s.startsWith("Date log:"))
                .peek(s -> s.substring(0,20).
                        concat(LocalDate.now().toString()));
    }
}
