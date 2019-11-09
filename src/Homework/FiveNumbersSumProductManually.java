package Homework;

        import java.util.Scanner;

public class FiveNumbersSumProductManually {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input natural numbers: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double num4 = sc.nextInt();
        double num5 = sc.nextInt();
        int sum =(int)(num1+num2+num3+num4+num5);
        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The avg of 5 no is: " + sum / num1);
    }
}


