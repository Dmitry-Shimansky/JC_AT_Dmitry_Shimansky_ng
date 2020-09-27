package main.java.tasks.homework.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolders {
    //Создать цепочку из 4-х вложенных папок, в самой глубокой создать 2 произвольных текстовых файла,
    // заполнить их 10 произвольными целыми числами.

    public static void main(String[] args) {

        folderCreater("/Users/DmitryShimansky/Desktop/NewFolder1");
        folderCreater("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2");
        folderCreater("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3");
        folderCreater("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3/NewFolder4");

        fileCreater("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3/NewFolder4/File_1.txt");
        fileCreater("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3/NewFolder4/File_2.txt");

        addInformation("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3/NewFolder4/File_1.txt");
        addInformation("/Users/DmitryShimansky/Desktop/NewFolder1/NewFolder2/NewFolder3/NewFolder4/File_2.txt");
    }

    private static void folderCreater(String folder) {

        File newDir = new File(folder);

        boolean created = newDir.mkdir();

        if (created) {
            System.out.println("Folder has been created");
        }
    }

    private static void fileCreater(String fileAndFolder) {

        File newFile = new File(fileAndFolder);

        boolean created = false;
        try {
            created = newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (created)
            System.out.println("File has been created");
    }

    private static void addInformation(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {

            String text = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
            writer.write(text);
            System.out.println("File has been rewritten");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}




