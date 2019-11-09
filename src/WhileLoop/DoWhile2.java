package WhileLoop;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min;
        int max;
        int first;
        int second;
        String response;
        boolean isDone;
        do {
            System.out.println("Please enter your 2 number: " );
            first  = input.nextInt();
            second = input.nextInt();
            if (first > second) {
                max = first;
                min = second;
            }else {
                max = second;
                min = first;
            }
            System.out.println("Maximum digits is:  "+max);
            System.out.println("Minimum digits is : "+min);
            System.out.println("Are you done? ");
            input.nextLine();
            response = input.nextLine();
            if (response.equals("yes")){
                isDone =false;
            }else {
                isDone = true;
            }
        }while (isDone);
    }
}
