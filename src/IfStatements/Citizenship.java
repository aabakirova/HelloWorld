package IfStatements;

import java.util.Scanner;

public class Citizenship {
    public static void main(String[] args) {
        //user is eligible for citizenship
        //must have a green card
        //must have lived for 5 years
        //must pass the test
        Scanner sc = new Scanner(System.in);
        System.out.println("Resident? Please enter true or false");
        boolean greenCardHolder = sc.nextBoolean();

        System.out.println("How long have you lived in US");
        int yearsInUs = sc.nextInt();

        System.out.println("Did you pass the exam");
        boolean examPassed = sc.nextBoolean();

        if (greenCardHolder) {
            if (yearsInUs >= 5) {
                if (examPassed) {
                    System.out.println("You are eligible to get a Citizenship");
                } else {
                    System.out.println("You are not eligible. You failed the exam. try again");
                    System.exit(0);
                }
            } else {
                System.out.println("You are not eligible. You haven't lived enough in US. You need " + (5 - yearsInUs) + " years");
                System.exit(0);
            }
        } else {
            System.out.println("You are not eligible. Not a Green Card holder");

        }

    }
}

