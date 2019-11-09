package Homework;

import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        float num=scanner.nextFloat();
            if (num<0) {System.out.println("Number is negative");}
            else if (num==0) {System.out.println("Number is neutral");}
            else {System.out.println("Number is positive");
                System.out.println("Number is positive 2");}
    }
}
