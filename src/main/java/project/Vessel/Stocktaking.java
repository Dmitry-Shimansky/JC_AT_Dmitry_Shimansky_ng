package main.java.project.vessel;

import java.io.*;
import java.lang.reflect.Field;

public class Stocktaking {
    //Создать класс Stocktaking, который записывает информацию о этих VesselBox обьектах в файл.

    public Stocktaking(Warehouse warehouse) {
        folderCreator("/Users/DmitryShimansky/Desktop/Stocktaking");
        fileCreator("/Users/DmitryShimansky/Desktop/Stocktaking/Stocktaking", warehouse);
        try {
            fileReader("/Users/DmitryShimansky/Desktop/Stocktaking/Stocktaking");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void folderCreator(String folder) {

        File newDir = new File(folder);

//        boolean created = newDir.mkdir();

            System.out.println("Folder has been created: " + newDir.mkdir() + folder);

    }

    private void fileCreator(String fileAndFolder, Warehouse warehouse) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAndFolder))) {
            oos.writeObject(warehouse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileReader(String fileAndFolder) throws ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAndFolder))) {

            Warehouse warehouse = (Warehouse) ois.readObject();
            System.out.println("Тип объекта: " + warehouse.getClass());

            Field[] fields = Warehouse.class.getDeclaredFields();

            for (Field field : fields) {
                System.out.println(field.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
