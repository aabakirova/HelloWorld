package Operators;

import java.util.Scanner;

public class ArithmeticOperatorWithIfConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number ");
        int n1 = input.nextInt();
        System.out.println("Enter 2nd number ");
        int n2 = input.nextInt();
        System.out.println("Enter operation: - ; + ; * ; / ; avg ; x - for max ; n - for min ");
        char operator = input.next().charAt(0);
        //if (operator != '+' ||operator != '-'||operator != '*'||operator != '/'||operator != 'a'||operator != 'x'||operator != 'n' ) {
           // System.err.println("Operation is not valid. Please try again.");
            //System.exit(1);
        //}
        if (operator == '+') {
            System.out.println("Sum of two integers: "+(n1+n2));
        }
        else if (operator == '-') {
            System.out.println("Difference of two integers: "+(n1-n2));
        }
        else if (operator == '*') {
            System.out.println("Product of two integers: " + (n1 * n2));
        }
        else if (operator == '/') {
            System.out.println("Product of two integers: " + (double)(n1 / n2));
        }
        else if (operator == 'a') {
            System.out.println("Average of two integers: " + (double)((n1+n2)/2));
        }
        else if (operator == 'd') {
            System.out.println("Distance of two integers: " + (n1-n2));
        }
        else if (operator == 'x') {
            System.out.println("Max integers: " + (Math.max(n1, n2)));
        }
        else if (operator == 'n') {
            System.out.println("Min integers: " + (Math.min(n1, n2)));
        }
    }
}
