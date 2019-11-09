package Homework;
import java.util.Scanner;  // Get the Scanner class from java.util package

public class ScannerReader{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); // Create a Scanner object

        System.out.println("Please enter your name:");
        String name=input.nextLine(); // Waits for user input from the keyboard

        System.out.println("Please enter your city:");
        String city=input.nextLine();

        System.out.println("Please enter your age:");
        byte age=input.nextByte();

        System.out.println("Please enter your phone number:");
        long phoneNumber=input.nextLong();

        System.out.println("Your name: "+name); // Displays output
        System.out.println("Your age: "+age );
        System.out.println("Your city: "+city);
        System.out.println("Your phone number: "+phoneNumber);
    }
}
