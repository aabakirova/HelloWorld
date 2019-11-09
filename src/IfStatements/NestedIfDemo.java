package IfStatements;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n1 = input.nextInt();
        // So IF statement is used when we want a certain block of our java
        // code to be executed based upon a certain condition.
        // if can be followed by else
        // else is used when the same condition is false.
        // the syntax of IF statement starts with a key word 'if' followed by
        // our condition wrapped in parenthesis followed by if statement body
        // wrapped in curly braces
        // if statement can exist without else, else is always followed by if
        // task is to find the given number is even or odd
        if(n1%2==0) {
            if (n1>10){
                System.out.println("number is even and more than 10");
            } else System.out.println("number is even and less than 10");
        } else System.out.println("number is odd");
        }

    }

        // task is to find out if the number is even is it more than 10
        // if number is more than 10 output "even and more than 10"
        // if the number is less than 10 output "even and less than 10"
        // otherwise if the number not even "the number is odd"