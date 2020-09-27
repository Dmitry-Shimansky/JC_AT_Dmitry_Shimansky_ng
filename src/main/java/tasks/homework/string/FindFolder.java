package main.java.tasks.homework.string;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.Path.*;

public class FindFolder {

   //Вывести список файлов и папок выбранного места на диске.

    public static void main(String[] args) {

        Path path = Paths.get("/Users/DmitryShimansky/Desktop/JC_AT_Dmitry_Shimansky");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(path))
        {
            for (Path elem : files)
                System.out.println(elem);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        ArrayList<File> fileList = new ArrayList<>();
//        searchFiles(new File("/Users/DmitryShimansky/Desktop/JC_AT_Dmitry_Shimansky"),fileList);
////        for (File file: fileList) {
////            System.out.println(file.getAbsoluteFile());
////        }
    }

//    public static void searchFiles(File rootFile, List<File> fileList) {
//        if (rootFile.isDirectory()) {
//            System.out.println("searching at: " + rootFile.getAbsolutePath());
//            File[] directoryFiles = rootFile.listFiles();
//            if (directoryFiles != null) {
//                for (File file: directoryFiles) {
//                    if (file.isDirectory()) {
//                        searchFiles(file,fileList);
//                    }
//                }
//            }
//        }
//    }
}
