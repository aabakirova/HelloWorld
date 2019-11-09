package Homework;

import java.util.Scanner;

public class MyCalc {

    public static void main(String[] args) {
        float num1;
        float num2;
        char operator;

        Scanner Object = new Scanner(System.in);

        System.out.println("enter 1st number: ");
        num1 = Object.nextFloat();
        System.out.println("enter 2nd number: ");
        num2 = Object.nextFloat();
        System.out.println("What operation? ");
        operator = Object.next().charAt(0);
        Object.close();
        if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        }
    }
}


 /*  ALTERNATIVE VERSION

    private static void multiply(float num1, float num2) {
        float m = num1 * num2;
        System.out.println(m + " = " + num1 + " * " + num2);
    }

    private static void divide(float num1, float num2) {
        float d = num1 / num2;
        System.out.println(d + " = " + num1 + " / " + num2);
    }

    private static void sum(float num1, float num2) {
        float s = num1 + num2;
        System.out.println(s + " = " + num1 + " + " + num2);
    }

    private static void sub(float num1, float num2) {
        float sb = num1 + num2;
        System.out.println(sb + " = " + num1 + " + " + num2);
    }

     */