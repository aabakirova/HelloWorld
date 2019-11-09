package Homework;
import java.util.Scanner;

public class ArithmeticOperators2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int num1 = input.nextInt();
        System.out.println("Input second integer: ");
        int num2 = input.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two integers: " +sum);

        int dif=num1-num2;
        System.out.println("Difference of two integers: "+dif);

        int prod=num1*num2;
        System.out.println("Product of two integers: "+prod);

        int avg=(num1+num2)/2;
        System.out.println("Average of two integers: "+(float)avg);

        int dist=num1-num2;
        System.out.println("Distance of two integers: "+dist);

        int max=Math.max(num1, num2);
        System.out.println("Max integer: "+max);

        int min=Math.min(num1, num2);
        System.out.println("Min integer: "+min);
    }
}
