package Homework;

import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=input.nextInt();
        //for loop in java formula is "for(first number in the range; end number in the range; increment)"
        for(int i=1; i <= 12; i++) //i++ is equivalent to i = i + 1
            System.out.println(n+" * "+i+" = "+n*i);
    }
}