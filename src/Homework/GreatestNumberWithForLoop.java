package Homework;

import java.util.Scanner;

public class GreatestNumberWithForLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n1 = scan.nextInt();
        System.out.print("Enter 2nd number:");
        int n2 = scan.nextInt();
        int max = Math.max(n1, n2);
        System.out.println("The greatest: " + max);
    }
}