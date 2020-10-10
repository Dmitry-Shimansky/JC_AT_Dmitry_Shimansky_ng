package main.java.tasks.lesson10;

import java.util.stream.IntStream;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class Threadt {

    public static void main(String[] args) throws InterruptedException {

//        Thread t1 = new Thread(()->{
//            IntStream.range(0,100).forEach(i-> System.out.println("t1: " + i));
//            Thread.yield();
//        });
//
//        Thread t2 = new Thread(()->{
//            IntStream.range(0,100).forEach(i-> System.out.println("t2: " + i));
//
//        });
//
//        Thread t3 = new Thread(()->{
//            IntStream.range(0,100).forEach(i-> System.out.println("t3: " + i));
//
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();

//        heavyMethod();
//
//        for (int i = 0; i < 3; i++) {
//            new Thread(()->{heavyMethod();}).start();
//        }

        Thread t1 = new Thread(() -> {
            heavyMethod();
//            Thread.yield();
        });

        Thread t2 = new Thread(() -> {
            heavyMethod();
        });

        Thread t3 = new Thread(() -> {
            heavyMethod();
        });
//
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//
        t1.start();
        t2.start();
        t3.start();
//        System.out.println("Main is finished");

//        Object lock = new Object();
//
//        new Thread(() -> {
//            synchronized (lock) {
//                for (int i = 0; i < 3; i++) {
//                    try {
//                        Thread.currentThread().sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.printf("t1-%s ", i);
//                }
//            }
//        }).start();
//
//        Thread.sleep(1000);
//
//        synchronized (lock) {
//            for (int i = 0; i < 3; i++) {
//                Thread.currentThread().sleep(1000);
//                System.out.printf("m-%s ", i);
//            }
//        }
    }

    public static synchronized void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
