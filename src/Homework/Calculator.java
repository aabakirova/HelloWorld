package Homework;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1=input.nextInt();

        System.out.println("Input second number: ");
        int num2=input.nextInt();

        int product=(num1*num2);
        System.out.println("Expected Output: ");
        System.out.println(num1+" * "+num2+" = "+product);
    }
}
