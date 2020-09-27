package main.java.project;

import main.java.project.staff.Water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;
    double riseTemperature = 0;

    public SparklingWater(double riseTemperature) {
        this.riseTemperature = riseTemperature;
        isOpened();
    }

    private void isOpened() {
        checkIsOpened();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Starting method setOpened");
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        System.out.println("Pumped bubbles into water");
    }

    public void setOpened() {
        if (!isOpened) {
            isOpened = true;
            System.out.println(String.format("Open a bottle: %s", isOpened));
        }
    }

    public void checkIsOpened() {
        Thread thread = new Thread(() -> {
            while (!isOpened) {
                System.out.println("Bottle is closed...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            degas();
        });
        thread.start();
    }

    private void degas() {
        int bubbleSpeed = 10 + 5 * getTemperature();
        double bubbleSpent = 0;
        int spentTime = 0;

        while (bubbleSpent <= bubbles.length) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bubbleSpent += bubbleSpeed + (riseTemperature % 60 * 5);
            spentTime++;

            Bubble.cramp();
            System.out.println("Пузырьков вышло: " + bubbleSpent);
            System.out.println("Пузырьков осталось: " + (bubbles.length - bubbleSpent));
            System.out.println("Время: " + spentTime + " сек");
        }
        System.out.println("");
        System.out.println("No more bubbles in the water !");
    }


//        if (temperature == 0) {
//            for (int i = 0; i < volume * 1000; i++) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.print(i + 1);
//                new Bubble("CO2").cramp();
//            }
//        } else {
//            int bubbleSpeed = 10 + temperature * 5;
//            double bubbleCount = volume * 1000;
//            double bubbleSpent = 0;
//            int spentTime = 0;
//
//            while (bubbleSpent <= bubbleCount) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                bubbleSpent += bubbleSpeed + (riseTemperature % 60 * 5);
//                spentTime++;
//
//
//                System.out.println("Пузырьков вышло: " + bubbleSpent);
//                System.out.println("Пузырьков осталось: " + (bubbleCount - bubbleSpent));
//                System.out.println("Время: " + spentTime + " сек");
//            }
//        }
//        System.out.println("");
//        System.out.println("No more bubbles in the water !");

}
