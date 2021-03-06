package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

import java.io.*;
import java.util.ArrayList;

public class Stocktaking {
    //Создать класс Stocktaking, который записывает информацию о этих VesselBox обьектах в файл.
    //Создать private конструкор

    public static void InventoryBottles (ArrayList<VesselBox<Vessel>> boxes) {
        folderCreator("/Users/DmitryShimansky/Desktop/Stocktaking");
        fileCreatorBottle("/Users/DmitryShimansky/Desktop/Stocktaking/Bottles", boxes);
        try {
            fileReaderBottle("/Users/DmitryShimansky/Desktop/Stocktaking/Bottles");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

//    public static void InventoryCups(ArrayList<VesselBox<Cup>> boxes) {
//        folderCreator("/Users/DmitryShimansky/Desktop/Stocktaking");
//        fileCreatorCup("/Users/DmitryShimansky/Desktop/Stocktaking/Cups", boxes);
//        try {
//            fileReaderCup("/Users/DmitryShimansky/Desktop/Stocktaking/Cups");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    private static void folderCreator(String folder) {

        File newDir = new File(folder);

        System.out.println("Folder has been created: " + newDir.mkdir() + folder);
    }

    private static void fileCreatorBottle(String fileAndFolder, ArrayList<VesselBox<Vessel>> boxes) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAndFolder))) {
            oos.writeObject(boxes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    private static void fileCreatorCup(String fileAndFolder, ArrayList<VesselBox<Cup>> boxes) {
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAndFolder))) {
//            oos.writeObject(boxes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private static void fileReaderBottle(String fileAndFolder) throws ClassNotFoundException {

        ArrayList<VesselBox<Vessel>> newBoxes;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAndFolder))) {

            newBoxes = ((ArrayList<VesselBox<Vessel>>) ois.readObject());
            System.out.println("Имеем ящиков с бутылками: " + newBoxes.size());

            newBoxes.forEach(bottleVesselBox -> {
                System.out.println("Я коробка с бутылками и у меня " + bottleVesselBox.getItemsCount() + " бутылок");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private static void fileReaderCup(String fileAndFolder) throws ClassNotFoundException {
//
//        ArrayList<VesselBox<Cup>> newBoxes;
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAndFolder))) {
//
//            newBoxes = ((ArrayList<VesselBox<Cup>>) ois.readObject());
//            System.out.println("Имеем ящиков с кружками: " + newBoxes.size());
//
//            newBoxes.forEach(cupVesselBox -> {
//                System.out.println("Я коробка с кружками и у меня " + cupVesselBox.getItemsCount() + " кружек");
//            });
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
