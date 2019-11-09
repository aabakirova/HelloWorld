package IfStatements;

import java.util.Scanner;

public class GenderGameTest {
    public static void main(String[] args) {
        Scanner scVariableThatHoldsKeyBoardInput = new Scanner(System.in);
        System.out.println("What is your gender? respond m or f");
        char gender = scVariableThatHoldsKeyBoardInput.next().charAt(0);
        System.out.println("What is your first name?");
        String fName = scVariableThatHoldsKeyBoardInput.next();
        System.out.println("What is your last name?");
        String lName = scVariableThatHoldsKeyBoardInput.next();
        System.out.println("What is your age?");
        int age = scVariableThatHoldsKeyBoardInput.nextInt();
        if (age < 20) {
            System.out.println("Then I shall call you " + fName + " " + lName);
            System.exit(0);
        } else if (gender == 'f') {
            System.out.println("Are you married? respond yes or no");
            char status = scVariableThatHoldsKeyBoardInput.next().charAt(0);
            if (status == 'y') {
                System.out.println("Then I shall call you Mrs." + lName);
            } else System.out.println("Then I shall call you Miss." + lName);

        } else if (gender == 'm') {
            System.out.println("Then I shall call you Mr." + lName);
        }
    }
}
