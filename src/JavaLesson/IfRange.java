package JavaLesson;

import java.util.Scanner;
public class IfRange
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=input.nextInt();
        if (n>=0 && n <= 10){
        System.out.println("Your number is between 0-10");
        }
        System.err.println("Error: I don't know what to do with your number");
        //else {
            //System.out.println("Your number is out of range");
        //}
    }
}