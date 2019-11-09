package JavaLesson;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You cannot apply for a driver license!");
        }

        // ask a user what is there GPA
        // if GPA > 3.5 you get a good job
        // else you need n more points to get a good job

        System.out.println("What is your GPA?");
        double gpa = input.nextDouble();
        double more=(gpa-3.5);
        if (gpa >= 3.5)
        {
            System.out.println("You will get an excellent job");
        }
            else {System.out.println("You need " +more +" more points to get your dream job");
        }
        System.out.println("");
        }
        }


