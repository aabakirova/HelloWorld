package Operators;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");

        //nextDouble reads the next double
        double first = input.nextDouble();
        double second = input.nextDouble();

        System.out.println("Enter operator: ");
        //next().charAt(0) reads the char input

        //declare new variable- char
        char operator = input.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            //operator does not match or user sends wrong char
            default:
                System.out.println("Error! Wrong Operator");
                return;
        }
    System.out.println(result);
    }
}
