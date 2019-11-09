package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it weekday?");
        boolean weekday = input.nextBoolean();
        System.out.println("Is it vacation?");
        boolean vacation = input.nextBoolean();
        if (!weekday || vacation) {
            System.out.println("sleepIn= " + true);
        } else {
            System.out.println("sleepIn= " + false);
        }
    }
}
