package Homework;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = s.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = s.nextInt();
        System.out.println("Enter 3d number");
        int n3 = s.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("The greatest: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The greatest: " + n2);
        } else {
            System.out.println("The greatest: " + n3);
        }
    }

}


