package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество минут: ");
        int minute = s.nextInt();
        System.out.println("Введите количество секунд: ");
        long second = s.nextLong();

        System.out.println(getDurationString(minute,second));


        System.out.println("Введите количество секунд: ");
        int secondOnly = s.nextInt();
        String converstionTime2  = getDurationString(secondOnly);
        System.out.println(converstionTime2);



    }

    public static String getDurationString(int minutes, long seconds) {

        String error =  "Invalid value";
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int ostatokMinutes = minutes % 60;

            String hoursTime = hours + "h ";
            if(hours < 10) {
                hoursTime = "0" + hoursTime;
            }

            String minutesTime = ostatokMinutes + "m ";
            if(ostatokMinutes< 10) {
                minutesTime = "0" + minutesTime;
            }

            String secondsTime = seconds + "s";
            if(seconds < 10) {
                secondsTime = "0" + secondsTime;
            }

            return hoursTime + minutesTime + secondsTime;
        } else {
            return error;
        }
    }

    public static String getDurationString(int seconds) {
        String error =  "Invalid value";
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int ostatokSeconds = seconds % 60;
            return getDurationString(minutes, ostatokSeconds);
        } else {
            return error;
        }
    }

}





