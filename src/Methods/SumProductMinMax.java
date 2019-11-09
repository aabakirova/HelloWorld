package Methods;
import java.util.Scanner;

public class SumProductMinMax {
    /*
    Write a program calledSumProductMinMax3that prompts user for three integers. The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results.
For examples,
Enter 1st integer: 8
Enter 2nd integer: 2 //enterYourData()
Enter 3rd integer: 9
The sum is: 19//sum(a,b,c);
The product is: 144//product(a,b,c);
The min is: 2//min(a,b,c)
The max is: 9//min(a,b,c)
Use static methods to find sum, product, min and max
     */
    // we can declare public variable outside the main method and those are accessible from everywhere
    public static int num1, num2, num3;
    public static int sum, product, min, max;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        num1 = input.nextInt();

        System.out.println("Enter 2nd number");
        num2 = input.nextInt();

        System.out.println("Enter 3d number");
        num3 = input.nextInt();
        sum();
        product();
        min();
        max();
    }

    public static void sum() {
        sum = (num1 + num2 + num3);
        System.out.println("the sum is " + sum);
    }

    public static void product() {
        product = (num1 * num2 * num3);
        System.out.println("the product is " + product);
    }

    public static void max() {
        max = num1;
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("the max is " + max);
    }

    public static void min() {
        min = num1;
        if (num1 < min) {
            min = num1;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("the min is " + min);
    }

}



