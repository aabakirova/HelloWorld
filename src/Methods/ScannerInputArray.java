package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputArray {
    /*Write a program called SumProductMinMax5 that prompts
    user for five integers. The program shall read the inputs
    assigned; compute the sum, product, minimum and maximum of
    the five integers; and print the results. Use
    five int variables:number1,number2, ...,number5 to
    store the inputs
    */

    public static void main(String[] args) {
        /*Instead of putting number
        of Scanner lines like this:
        System.out.println("num1");
        int num2 = input.nextInt();
        System.out.println("num1");
        int num3 = input.nextInt();
        System.out.println("num1");
        int num4 = input.nextInt();
        System.out.println("num1");
        int num5 = input.nextInt();
        we can put the following way:
        */
        Scanner array = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = array.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter all the elements of the array:");
        for (int i = 0; i < length; i++) {
            myArray[i] = array.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
    }
}
