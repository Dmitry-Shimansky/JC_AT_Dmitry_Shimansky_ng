package main.java.project.vessel;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Stocktaking {
    //Создать класс Stocktaking, который записывает информацию о этих VesselBox обьектах в файл.

    public static void Inventory(ArrayList<VesselBox<Bottle>> boxes) {
        folderCreator("/Users/DmitryShimansky/Desktop/Stocktaking");
        fileCreator("/Users/DmitryShimansky/Desktop/Stocktaking/Stocktaking", boxes);
        try {
            fileReader("/Users/DmitryShimansky/Desktop/Stocktaking/Stocktaking");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void folderCreator(String folder) {

        File newDir = new File(folder);

        System.out.println("Folder has been created: " + newDir.mkdir() + folder);
    }

    private static void fileCreator(String fileAndFolder, ArrayList<VesselBox<Bottle>> boxes) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAndFolder))) {
            oos.writeObject(boxes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader(String fileAndFolder) throws ClassNotFoundException {

        ArrayList<VesselBox<Bottle>> newBoxes;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAndFolder))) {

            newBoxes = ((ArrayList<VesselBox<Bottle>>) ois.readObject());
            System.out.println("Имеем ящиком: " + newBoxes.size());

            newBoxes.forEach(bottleVesselBox -> {
                System.out.println("Я коробка и у меня " + bottleVesselBox.getItemsCount() + " бутылок");
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
