package IfStatements;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        /* *
         * System.out.println("Your name?");
         * Scanner input = new Scanner(System.in);
         * String name = input.nextLine();
         * System.out.println("Enter your age?");
         * int age = input.nextInt();
         * if (age >= 18) {
         *     System.out.println(name+" you can vote");
         * }
         *     System.out.println("I am outside of any if statement, I run regardless");
         * System.out.println("What time it is right now?");
         * int time = input.nextInt();
         * if (time >= 0 && time <= 11) {
         *     System.out.println("Good morning " + name + " !");
         *     time++;
         *     System.out.println("The next hour will be " + time);
         * }
         * */
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it user?");
        int hour = input.nextInt();
        System.out.println("p or a?");
        char daytime = input.next().charAt(0);

        if (hour > 0 && hour <= 11 && daytime == 'a') {
            System.out.println("Good Morning");
        }
        if (hour > 0 && hour <= 6 && daytime == 'p') {
            System.out.println("Good Evening");
        }
        if (hour >= 6 && hour <= 11 && daytime == 'p') {
            System.out.println("Good Night my Friends");
        }
    }
}
