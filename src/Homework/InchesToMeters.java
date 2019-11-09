package Homework;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args){
        Scanner metric = new Scanner(System.in);
        // 1 inch = 0.0254 meter
        System.out.println("Enter value in inches ");
        double i=metric.nextDouble();
        double m=i*0.0254;
        System.out.println(i+" inch is "+m+" meters");
    }
}
