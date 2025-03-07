package com.notification.util;

public class SleepUtil {

    public static void sleepLow() {
        try {
            int seconds = generateSeconds();
            Thread.sleep(seconds * 2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepMedium() {
        try {
            int seconds = generateSeconds();
            Thread.sleep(seconds * 900L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepHigh() {
        try {
            int seconds = generateSeconds();
            Thread.sleep(seconds * 300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static int generateSeconds(){
        return (int) (Math.random() * 10);
    }
}
