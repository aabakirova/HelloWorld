package Homework;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input First Number");
        int a = input.nextInt();
        System.out.println("Second Number");
        int b = input.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println(a+"+"+b+"="+c);
        System.out.println(a+"-"+b+"="+d);
        System.out.println(a+"*"+b+"="+e);
        System.out.println(a+"/"+b+"="+f);
    }
}