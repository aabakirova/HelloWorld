package Methods;

import java.util.Scanner;

public class SumProductMinMax2 {

    public static int num1, num2, num3, num4, num5;
    public static int sum, product, max, min;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num1");
        num1 = input.nextInt();
        System.out.println("num2");
        num2 = input.nextInt();
        System.out.println("num3");
        num3 = input.nextInt();
        System.out.println("num4");
        num4 = input.nextInt();
        System.out.println("num5");
        num5 = input.nextInt();

        sumOfFive();
        productOfFive();
        maxOfFive();
        minOfFive();
    }

    public static void sumOfFive() {
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum is "+sum);
    }

    public static void productOfFive() {
        product = num1 * num2 * num3 * num4 * num5;
        System.out.println("The product is "+product);
    }

    public static void maxOfFive() {
        max = num1;
        if (num2 > max) {
            max = num2;
        } if (num3 > max) {
            max = num3;
        } if (num4 > max) {
            max = num4;
        } if (num5 > max) {
            max = num5;
        }
        System.out.println("The max is "+max);
    }

    public static void minOfFive() {
          min = num1;
        if (num2 < min) {
            min = num2;
        } if (num3 < min) {
            min = num3;
        } if (num4 < min) {
            min = num4;
        } if (num5 < min) {
            min = num5;
        }
        System.out.println("The min is "+min);
    }
}
