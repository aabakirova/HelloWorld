package IfStatements;

import java.util.Scanner;

public class StudentGrade {
    /* *
    program that determines a student's grade.
    The program will read three types of scores(quiz, mid-term, and final scores)
    and determine the grade based on the following rules:
   -if the average score >=90% =>grade=A
   -if the average score >= 70% and <90% => grade=B
   -if the average score>=50% and <70% =>grade=C
   -if the average score<50% =>grade=F

   //See the example output below:
   //
   //Quiz score: 80
   //
   //Mid-term score: 68
   //
   //Final score: 90
   //
   //Your grade is B.
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //I have 3 inputs from a student
        //quiz grade
        System.out.println("Enter quiz score:");
        int quizScore = input.nextInt();
        if (quizScore < 0 || quizScore > 100){
            System.err.println("Entered score is invalid");
            System.out.println(0);
        }

        //mid-term
        System.out.println("Enter mid-term score:");
        int midTermScore = input.nextInt();

        //final
        System.out.println("Enter mid-term score:");
        int finalScore = input.nextInt();

        //avg=(quiz+mid-term+final)/3
        int avg = (quizScore + midTermScore + finalScore) / 3;

        //if avg >= 90 then grade = A
        if (avg >= 90 && avg <= 100) {
            System.out.println("A");
        }
        //if else avg >= 70 then grade = B
        else if (avg >= 70 && avg < 90) {
            System.out.println("B");
        }
        //if else avg >=50 then grade = C
        else if (avg >= 50 && avg < 70) {
            System.out.println("C");
            //if else avg < 50 then grade = F
        } else if (avg < 50 && avg > 0) {
            System.out.println("F");
        } else {
            System.out.println("Average scores must be between 0 and 100");
        }
    }
}

