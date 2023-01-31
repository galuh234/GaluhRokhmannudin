package Chapter2_elementary.exercise;

import java.util.Scanner;

public class exercise2_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: " );
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds / 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;


        long totalHours = totalMinutes / 60;


        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        // Display
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");

    }
}
