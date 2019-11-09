package IfStatements;

import java.util.Scanner;

public class NestedIfs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input next int:");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Positive");
            if (n % 2 == 0) {
                System.out.println("Even Number");
            }
            if (n > 20) {
                System.out.println("N is more than 20");
            }
        } else if (n > 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Neutral");
        }
    }
}
