package WhileLoop;
;
import java.util.Scanner;

// write a program that gets two numbers
// we should keep getting 2 numbers until user says stop
// we need to find the minimum and maximum of all the given numbers
public class DoWhile1 {
    public static void main(String[] args) {
        boolean response;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter 1st number");
            int num1 = in.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = in.nextInt();
            if (num1 > num2) {
                int max = num1;
                int min = num2;
                System.out.println("max is " + max + " min is " + min);
            } else {
                int max = num2;
                int min = num1;
                System.out.println("max is " + max + " min is " + min);
            }

            System.out.println("\nDo you want to continue?");
            response = in.nextBoolean();

        } while (response);


    }

}