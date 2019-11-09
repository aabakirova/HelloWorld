package SwitchCase;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something.
        // It must keep track of how many they get wrong, and print out a “score” at the end.Are you ready for a quiz?  N
        //Okay, here it comes!Q1) What is the capital of Alaska?
        //   1) Melbourne
        //   2) Anchorage
        //   3) Juneau

        //create scanner object
        Scanner input = new Scanner (System.in);
        int answer1;
        int answer2;
        int answer3;
        System.out.println("Are you ready for the quiz?");
        String response = input.nextLine();
        if(response=="yes") {
            System.out.println("Okay here it comes");
            System.out.println();
        }
        System.out.println("Q1: What is the capital of Alaska?" );
        System.out.println("\t1)Melbourne");
        System.out.println("\t2)Anchorage");
        System.out.println("\t3)Juneau");

        answer1=input.nextInt();
        int score=0;
        if (answer1==3){
            System.out.println("That's right!");
            score++;
        }else{
            System.out.println("Sorry, Juneau is the right answer! try again!");
        }
      System.out.println();
        //q2 Can you store the value “cat” in a variable of type int?
        //   1) yes
        //   2) no
        System.out.println("Q2: Can you store the value “cat” in a variable of type int?");
        System.out.println("\t1)yes");
        System.out.println("\t2)no");
        answer2=input.nextInt();
        if(answer2==2){
            System.out.println("That's right!");
            score++;
        }else{
            System.out.println("Sorry, \"cat\" is a string data type"); // \"cat\" is used to ignore the double quotes
        }
        //Q3) What is the result of 9+6/3?//   1) 5//   2) 11//   3) 15/3
        System.out.println("Q3: What is the result of 9+6/3?");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        answer3=input.nextInt();if(answer3==2){ System.out.println("That's right!");
        score++; }else{ System.out.println("Sorry, number2 is the right answer!"); }System.out.println("Congrats! Your score is " +score);

    }
}