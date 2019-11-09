package WhileLoop;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        //write a program that prompts user the mark  (between 0-100 in int) of 5 student;
        // computes the average (in double); and prints the result rounded to 2 decimal places.
        //Your program needs to perform input validation
        //declare the mark number
            double num= 0;
            int x=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("How many students take the test? ");//25
            //number of students
            int n= sc.nextInt();
            while(x <= n){
                System.out.println("Enter mark of " + x+"st student" );
                num += sc.nextDouble();

                x++;
            }
            double avg =((num/n)*100)/100;
            System.out.println("Average: " + avg);
        }
    }






