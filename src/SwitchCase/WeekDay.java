package SwitchCase;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7");
        int num=input.nextInt();

        char monday=1;
        char tuesday=2;
        char wednesday=3;
        char thursday=4;
        char friday=5;
        char saturday=6;
        switch (num) {
        case 1:
            System.out.println("Weekday");
        case 2:
            System.out.println("Weekday");
        case 3:
            System.out.println("Weekday");
        case 4:
            System.out.println("Weekday");
        case 5:
            System.out.println("Weekday");
        }


    }
}

