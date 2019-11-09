package IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String female, lastName, firstName, married;
        int age;
        System.out.println("What's your gender?");
        String gender = input.next();
        System.out.println("What's your first name?");
        firstName = input.next();
        System.out.println("What's your last name?");
        lastName = input.next();
        System.out.println("What's your age?");
        age = input.nextInt();
        if(gender.equals("f") && (age >= 20)) {
            System.out.println("Are you married?");
            married=input.next();
            if(married.equals("yes")){
                System.out.println("Mrs."+firstName+" "+lastName);
            } else {
                System.out.println("Miss."+firstName+lastName);
            }

        } else if(gender.equals("m") && (age>=20)) {
            System.out.println("Are you married?");
            married=input.next();
            if(married.equals("yes")){
                System.out.println("Mr"+firstName+" "+lastName);
            }
        } else {
            System.out.println(firstName+" "+lastName);
        }
    }
}
