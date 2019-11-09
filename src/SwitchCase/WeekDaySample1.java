package SwitchCase;

import java.util.Scanner;

public class WeekDaySample1 {
    public static void main(String[] args) {
        System.out.println("Enter day number between 1-7:");
        Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();
        String weekDay;
        /* * switch is a java statement. It allows a number of possible execution paths
        *
        *
        *
        * */
        switch (day) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            //operator does not match or user sends wrong char
            default:
                System.err.println("Error.The input is out of scope!");
                return;
        }
        System.out.println(weekDay);
    }
}
