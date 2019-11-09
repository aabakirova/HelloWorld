package Homework;

import java.util.Scanner;

public class FiveNumbersSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input natural numbers no: ");
        double num = sc.nextInt();
        int sum = 0;
        for (int count=0; count <= num; ++count) {
            sum+=count;
        }
        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The avg of 5 no is: " + sum/num);
    }
}
